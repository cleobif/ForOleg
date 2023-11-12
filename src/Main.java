import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CarController carAddCommand = new CarController();
        for (int i = 0; i < 10; i++) {
            String carCommand = scanner.next();
            carAddCommand.carControl(carCommand);

        }
    }
}
