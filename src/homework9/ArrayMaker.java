package homework9;

import java.util.Random;

public class ArrayMaker {

    int[] createArrayWithRandomNumbers (int numberOfElements, int maxValue){
        int[] array = new int[numberOfElements];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue);
        }
        return array;
    }

    int[] sortFromSmallToBig(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    int[] sortFromBigToSmall(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }

        }
        return array;
    }

    void printOfArray (int[] array){
        for (int j : array) {
            System.out.print(j + "");
        }
        System.out.println();
    }
}
