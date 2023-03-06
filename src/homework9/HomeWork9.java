package homework9;

public class HomeWork9 {
    public static void main(String[] args) {

        ArrayMaker arrayMaker = new ArrayMaker();

        int[] array = arrayMaker.createArrayWithRandomNumbers(10, 10);

        arrayMaker.printOfArray(array);

        arrayMaker.sortFromSmallToBig(array);

        arrayMaker.printOfArray(array);

        arrayMaker.sortFromBigToSmall(array);

        arrayMaker.printOfArray(array);

    }

}
