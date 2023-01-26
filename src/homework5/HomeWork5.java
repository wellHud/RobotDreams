package homework5;

public class HomeWork5 {

    public static int findBiggest (int number1, int number2){
        if (number1 > number2){
            return number1;
        }
        return number2;
    }

    public static int findSmallest (int number1, int number2){
        if (number1 < number2){
            return number1;
        }
        return number2;
    }

    public static void isOddOrEven(int number){
        if (number%2 != 0){
            System.out.println("The number " + number + " is odd");
            return;
        }
        System.out.println("The number " + number + " is even");
    }


    public static void main(String[] args) {

        System.out.println(findBiggest(1, 3));
        System.out.println(findSmallest(1, 3));
        isOddOrEven(10);

    }

}

