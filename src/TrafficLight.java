public class TrafficLight {
    String[] lights = new String[]{"Red", "Yellow", "Green"};
    String firstSignal;
    String secondSignal;

    public void lightsSwitch(String button) throws InterruptedException {
        while (button.equals("go")) {
            for (int i = 0; i < 3; i++) {
                firstSignal = lights[i];
                System.out.println("First - " + firstSignal);
                secondSignal = lights[2 - i];
                System.out.println("Second - " + secondSignal);
                Thread.sleep(10000);
                if(i == 2){
                    System.out.println("First - " + lights[1]);
                    System.out.println("Second - " + lights[1]);
                    Thread.sleep(10000);
                }
            }
        }
    }
}