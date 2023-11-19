import java.util.ArrayList;

public class TrafficLight {
    String[] lights = new String[]{"Red", "Yellow", "Green", "Yellow", "Red", "Yellow", "Green"};
    ArrayList<String> array = new ArrayList<>();

    public void lightsSwitch(String button) throws InterruptedException {
        ArrayList<String> arr = new ArrayList<>();
        while (button.equals("go")) {
            for (int i = 0; i < 7; i++) {
                arr.clear();
                arr.add(lights[i]);
                arr.add(lights[6 - i]);
                System.out.println(arr);
                Thread.sleep(1000);
            }
        }
    }
}
