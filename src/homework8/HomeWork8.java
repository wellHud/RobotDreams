package homework8;

import java.util.Random;

public class HomeWork8 {

    public static void main(String[] args) {

        int[] array = createArrayWithRandomNumbers(10, 50);

        printArray(array);

        printMinNumber(array);
        printMaxNumber(array);
        printAverageNumber(array);
        printSumOfNumbers(array);
    }

    static int[] createArrayWithRandomNumbers (int numberOfElements, int maxValue){
        int[] array = new int[numberOfElements];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue);
        }
        return array;
    }

    static void printMinNumber(int[] array){
        int minNumber = Integer.MAX_VALUE;
        for (int number:array) {
            if (number < minNumber){
                minNumber = number;
            }
        }
        System.out.println("Min number: " + minNumber);
    }

    static void printMaxNumber(int[] array){
        int maxNumber = Integer.MIN_VALUE;
        for (int number:array) {
            if (number > maxNumber){
                maxNumber = number;
            }
        }
        System.out.println("Max number: " + maxNumber);
    }

    static void printAverageNumber(int[] array){
        int sum = 0;
        for (int number:array) {
            sum += number;
        }
        int average = sum / array.length;
        System.out.println("Average number: " + average);
    }

    static void printSumOfNumbers(int[] array){
        int sum = 0;
        for (int number:array) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
    }

    static void printArray (int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
