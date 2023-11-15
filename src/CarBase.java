import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarBase {

    public Map<String, Car> cars = new HashMap<>();

    public void carAdd(Car car) {
        cars.put(car.getNumber(), car);
        System.out.println(cars);

    }

    public void carRemove(String carNumber) {
        cars.remove(carNumber);
        System.out.println(cars);
    }
}

