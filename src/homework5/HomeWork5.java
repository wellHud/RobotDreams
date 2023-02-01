package homework5;

public class HomeWork5 {

    static void findBiggest (int number1, int number2){

        if (number1 > number2){
            System.out.println(number1);
        } else if (number1 < number2)
            System.out.println(number2);
        else
            System.out.println("Equals");

    }

    static void findSmallest (int number1, int number2){

        if (number1 < number2){
            System.out.println(number1);
        } else if (number1 > number2)
            System.out.println(number2);
        else
            System.out.println("Equals");

    }

    public static void isOddOrEven(int number){
        if (number%2 != 0){
            System.out.println("The number " + number + " is odd");
            return;
        }
        System.out.println("The number " + number + " is even");
    }


    public static void main(String[] args) {

        findBiggest(10, 3);
        findSmallest(20, 2);
        isOddOrEven(23);

    }

}

