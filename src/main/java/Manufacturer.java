public class Manufacturer extends Thread {
    private final Dealership carDealership;


    public Manufacturer(String name, Dealership carDealership) {
        super(name);
        this.carDealership = carDealership;

    }

    @Override
    public void run() {
        carDealership.produceCar();
    }
}