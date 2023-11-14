public class CarController {
    //
    private CarBase carBase;

    public CarController() {
        carBase = new CarBase();
    }

    public String[] carControl(String command) {
        String[] currectComand = command.split("/");
        if (currectComand[0].equals("car") && currectComand[1].equals("add")) {
            Car car = new Car(0, currectComand[2], currectComand[3]);
            carBase.carAdd(car);
            return currectComand;
        } else if (currectComand[0].equals("car") && currectComand[1].equals("remove")) {
            carBase.carRemove(currectComand[2]);
            return currectComand;
        }
        return null;
    }

}
