public class Car {
    // lombok
    private Integer fine;
    private String number;
    private String model;

    public Car(Integer fine, String number, String model) {
        if(number == null || number.length() != 6){
            throw new RuntimeException();
        }
        this.fine = fine;
        this.number = number;
        this.model = model;
    }

    public Integer getFine() {
        return fine;
    }

    public void setFine(Integer fine) {
        this.fine = fine;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fine=" + fine +
                ", number='" + number + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

