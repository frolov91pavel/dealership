import java.util.ArrayList;
import java.util.List;

public class Dealership {

    static Manufacturer manufacturer;
    static List<Car> carList = new ArrayList<>();

    public Dealership(Manufacturer manufacturer) {

        this.manufacturer = manufacturer;

    }

    public void makeCar() {

        System.out.println("Машина получена от производителя и доставлена в дилерский центр");
        carList.add(this.manufacturer.getCar());

    }

    public void buyCar() {
        if (carList.isEmpty()) {
            System.out.println("Машин в автосалоне нет.");
        } else {
            System.out.println("Продана первая понравившаяся машина c номером " + carList.get(0).number);
            carList.remove(0);
        }
    }

    public boolean empty() {
        return carList.isEmpty();
    }

}
