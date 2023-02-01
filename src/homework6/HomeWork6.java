package homework6;

public class HomeWork6 {

    public static void printNumbersFromXToY (int numberFrom, int numberTo){

        if (numberTo < numberFrom){
            System.out.println("Error");
            return;
        }

        for (int i = numberFrom; i <= numberTo; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printEvenNumbersFromXToY (int numberFrom, int numberTo){

        if (numberTo < numberFrom){
            System.out.println("Error");
            return;
        }

        for (int i = numberFrom; i <= numberTo; i++) {
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printFactorialOfNumber(int number){

        if (number < 1){
            System.out.println("Error");
            return;
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }

    public static void printFiboToNumber (int number){

        if (number < 0){
            System.out.println("Error");
            return;
        }

        int a = 0;
        int b = 1;
        int c = a + b;
        while (a <= number){
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }

    }


    public static void main(String[] args) {

        printNumbersFromXToY(1,10);

        printEvenNumbersFromXToY(1, 100);

        printFactorialOfNumber(7);

        printFiboToNumber(100);

    }
}
