import java.util.Scanner;

public class MainTraffic {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String turnOnTraffocLight = scanner.next();
        // Just do it
        TrafficLight switchButton = new TrafficLight();
        switchButton.lightsSwitch(turnOnTraffocLight);
    }
}

