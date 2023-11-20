public class TrafficLight {
    private final String[] lights = new String[]{"Red", "Yellow", "Green"};

    private Integer currentIndex;
    private Integer direction;

    public TrafficLight(Integer startIndex, Integer direction) {
        this.direction = direction;
        currentIndex = startIndex;
    }

    public void switchLight() {
        currentIndex = (currentIndex + direction) % lights.length;
        if(currentIndex == 2 || currentIndex == 0){
            direction *= -1;
        }
    }

    public String getCurrentLight() {
        return lights[currentIndex];
    }
}

// члены класса какие бывают(поля, методы, конструкторы. гетеры сетеры, константы)
// модификаторы доступа
// области действия