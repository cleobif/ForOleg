import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarBase {

    private Map<String, String> cars = new HashMap<>();

    public void carAdd(String carNumber, String carName) {
        cars.put(carNumber, carName);
        System.out.println(cars);

    }

    public void carRemove(String carNumber) {
        cars.remove(carNumber);
        System.out.println(cars);
    }
}

