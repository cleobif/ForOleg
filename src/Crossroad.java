import java.util.ArrayList;

public class Crossroad {
    //to add car | put/number/roadName
    //to delete car | delete/number/roadName

    private ArrayList<Car> rightRoad = new ArrayList<>();
    private ArrayList<Car> leftRoad = new ArrayList<>();

    private CarBase carBase;

    public void carAddToRoad(){
        carBase = new CarBase();
    }


    public void carAddToRheRoad(String command){
        String[] roadCommand = command.split("/");
        if(roadCommand[0].equals("put")){
        leftRoad.add(carBase.cars.get(roadCommand[1]));
            System.out.println(leftRoad);
            //
        }

    }
}
