import java.util.Scanner;

public class MainCrossRoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        Crossroad road = new Crossroad();
        road.carAddToRheRoad(command);
        //
    }
}
