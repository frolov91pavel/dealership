
public class Main {

    public static void main(String[] args) {

        Manufacturer manufacturer = new Manufacturer();
        Dealership dealership = new Dealership(manufacturer);
        Buyer buyer = new Buyer();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (dealership) {
                    dealership.makeCar();
                    dealership.notify();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }
            System.out.println("Закупка машин завершена");
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized (dealership) {
                    buyer.buyCar(dealership);
                    try {
                        if (dealership.empty()) {
                            dealership.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Продажа машин завершена");
        }).start();
    }
}

