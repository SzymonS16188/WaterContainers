package pl.kurs.services;

import pl.kurs.models.WaterContainer;

public class WaterContainerService {

    public static WaterContainer findWithTheBiggestWaterAmount(WaterContainer[] array) {
        if (array == null) {
            return null;
        }


        WaterContainer maxWaterContainer = null;
        int counter = 0;
        do {
            maxWaterContainer = array[counter];
            counter++;
        } while (maxWaterContainer == null && counter < array.length);



      if (maxWaterContainer != null) {
            for (int i = counter; i < array.length; i++){

                if (array[i] != null && array[i].getWaterLevel() > maxWaterContainer.getWaterLevel()) {
                    maxWaterContainer = array[i];
                }
            }
        }
        return maxWaterContainer;
    }


}




