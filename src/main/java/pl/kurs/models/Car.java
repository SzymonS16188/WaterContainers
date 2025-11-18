package pl.kurs.models;

public class Car {

    private String producer;
    private String model;
    private int year;

    public Car(String producer, String model, int year) {
        this.producer = producer;
        this.model = model;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }


}
