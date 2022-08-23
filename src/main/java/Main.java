public class Main {
    private final static int BUYERS = 10;

    public static void main(String[] args) {
        final Dealership Dealership = new Dealership();
        for (int i = 1; i <= Car.getNumberCars(); i++) {
            new Buyer("Покупатель " + i, Dealership).start();
        }
        new Manufacturer("Производитель TOYTA", Dealership).start();

    }

}