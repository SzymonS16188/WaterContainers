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

    //- znalezc zbiornik ktory jest najbardziej zapelniony (procentowo) - praca domowa
    //- znalezc wszystkie puste zbiorniki. - praca domowa

    public static WaterContainer findTheMostFilledContainerInPercentage(WaterContainer[] array) {
        if (array == null) {
            return null;
        }

        WaterContainer mostFilledContainer = null;
//        double mostFilledRatio = 0;

        int counter = 0;
        do {
            mostFilledContainer = array[counter];
            counter++;
//            mostFilledRatio = mostFilledContainer.getWaterLevel()/mostFilledContainer.getMaxCapacity();
        } while (mostFilledContainer == null && counter < array.length);


//        double mostFilledRatio = mostFilledContainer.getWaterLevel() / mostFilledContainer.getMaxCapacity();
        double mostFilledRatio = 0;
        int counter2 = 0;
        if (mostFilledContainer == null) {
            return null;
        } else {
            mostFilledRatio = mostFilledContainer.getWaterLevel() / mostFilledContainer.getMaxCapacity();
        }

        if (mostFilledContainer != null ) {
            for (int i = counter; i < array.length; i++) {
                if (array[i] != null){
                    double ratio = array[i].getWaterLevel() / array[i].getMaxCapacity();
                    if (ratio > mostFilledRatio) {
                        mostFilledContainer = array[i];
                        mostFilledRatio = ratio;
                    }
                }

//            for (WaterContainer wc : array) {
//                double ratio = wc.getWaterLevel() / wc.getMaxCapacity();
//                if (ratio > mostFilledRatio){
//                    mostFilledContainer = wc;
//                    mostFilledRatio = ratio;
//                }
            }
        }

        return mostFilledContainer;
    }


}




