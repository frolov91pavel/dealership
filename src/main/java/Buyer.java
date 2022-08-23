public class Buyer extends Thread {

    private final Dealership Dealership;
    private final static int NUMBER_BUYERS = 10;


    public Buyer(String name, Dealership carDealership) {
        super(name);
        this.Dealership = carDealership;

    }

    @Override
    public void run() {
        Dealership.buyCar();

    }


}