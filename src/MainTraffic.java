import java.util.Scanner;

public class MainTraffic {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String button = scanner.next();
        TrafficLight roadOneTrafficLight = new TrafficLight(0, 1);
        TrafficLight roadTwoTraficLight = new TrafficLight(2, -1);
        while (Thread.currentThread().isAlive()) {
            roadOneTrafficLight.switchLight();
            roadTwoTraficLight.switchLight();
            Thread.sleep(1000);

        }
    }
}



