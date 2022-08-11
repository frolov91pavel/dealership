import java.util.Random;

public class Manufacturer {
    public Car getCar() {
        int r = (int) ((Math.random() * ((999 - 100) + 1)) + 100);
        return new Car(r);
    }

}
