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
            for (int i = counter; i < array.length; i++) {

                if (array[i] != null && array[i].getWaterLevel() > maxWaterContainer.getWaterLevel()) {
                    maxWaterContainer = array[i];
                }
            }
        }
        return maxWaterContainer;
    }


    public static WaterContainer findTheMostFilledContainer(WaterContainer[] array) {
        if (array == null) {
            return null;
        }

        WaterContainer mostFilledContainer = null;


        int counter = 0;
        do {
            mostFilledContainer = array[counter];
            counter++;

        } while (mostFilledContainer == null && counter < array.length);


        double mostFilledRatio = 0;
        int counter2 = 0;
        if (mostFilledContainer == null) {
            return null;
        }

        mostFilledRatio = mostFilledContainer.getWaterLevel() / mostFilledContainer.getMaxCapacity();


        for (int i = counter; i < array.length; i++) {
            if (array[i] != null) {
                double ratio = array[i].getWaterLevel() / array[i].getMaxCapacity();
                if (ratio > mostFilledRatio) {
                    mostFilledContainer = array[i];
                    mostFilledRatio = ratio;
                }
            }

        }


        return mostFilledContainer;
    }


    public static WaterContainer[] findAllEmptyContainers(WaterContainer[] array) {
        if (array == null) {
            return null;
        }

        int emptyContainersCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getWaterLevel() == 0) {
                emptyContainersCounter++;
            }
        }

        WaterContainer[] emptyContainers = new WaterContainer[emptyContainersCounter];
        int index = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getWaterLevel() == 0) {
                emptyContainers[index] = array[i];
                index++;
            }
        }


        return emptyContainers;
    }


}




