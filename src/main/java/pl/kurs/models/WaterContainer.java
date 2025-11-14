package pl.kurs.models;

public class WaterContainer {
    private String name;
    private double maxCapacity;
    private double waterLevel;


    public WaterContainer(String name, double maxCapacity, double waterLevel) {
        if(maxCapacity <= 0) {
            throw new RuntimeException("Błędna pojemność!");
        }
        if (waterLevel < 0){
            throw new RuntimeException("Ilość wody nie powinna być mniejsza niż 0");
        }
        if (maxCapacity< waterLevel){
            throw new RuntimeException("W tym pojemniku nie zmieści się tyle wody");
        }
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.waterLevel = waterLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    @Override
    public String toString() {
        return "WaterContainer{" +
                "name='" + name + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", waterLevel=" + waterLevel +
                '}';
    }


}
