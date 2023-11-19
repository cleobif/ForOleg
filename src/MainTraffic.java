import java.util.ArrayList;
import java.util.Scanner;

public class MainTraffic {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String turnOnTrafficLight = scanner.next();
        TrafficLight switchButton = new TrafficLight();
        switchButton.lightsSwitch(turnOnTrafficLight);

    }
}



