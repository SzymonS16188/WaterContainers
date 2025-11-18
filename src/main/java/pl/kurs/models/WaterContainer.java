package pl.kurs.models;

public class WaterContainer {
    private final String name;
    private final double maxCapacity;
    private double waterLevel;


    public WaterContainer(String name, double maxCapacity, double waterLevel) {
        if(maxCapacity <= 0) {
            throw new RuntimeException("Błędna pojemność!");
        }
        if (waterLevel < 0){
            throw new RuntimeException("Ilość wody nie powinna być mniejsza niż 0");
        }
        if (maxCapacity < waterLevel){
            throw new RuntimeException("W tym pojemniku nie zmieści się tyle wody");
        }
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.waterLevel = waterLevel;
    }

    public String getName() {
        return name;
    }


    public double getMaxCapacity() {
        return maxCapacity;
    }


    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }


    public void addWater(double value){
        if (value <= 0){
            System.out.println("Wartość powinna być większa od 0.");
        } else if (value + waterLevel > maxCapacity){
            System.out.println("Nie można dolać tej ilośći wody do zbiornika.");
        } else {
            waterLevel += value;
        }
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
