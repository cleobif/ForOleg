import java.util.ArrayList;

public class TrafficLight {
    private String[] lights = new String[]{"Red", "Yellow", "Green", "Yellow", "Red", "Yellow", "Green"};
    ArrayList<String> array = new ArrayList<>();

    public void lightsSwitch(String button) throws InterruptedException {
        while (button.equals("go")) {
            for (int i = 0; i < 7; i++) {
                array.clear();
                array.add(lights[i]);
                array.add(lights[6 - i]);
                Thread.sleep(1000);
            }
        }
    }
    public void currentLight(){
            System.out.println(array);
        }
    }

