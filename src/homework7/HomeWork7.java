package homework7;

public class HomeWork7 {

    public static void main(String[] args) {

        System.out.println(square(10));

        printSymbol(10);

        printSymbol(10, "Q");

    }

    static int square (int number){
        return number * number * number;
    }

    static void printSymbol (int number){

        printSymbol(number, "*");

    }

    static void printSymbol (int number, String symbol){

        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }

        System.out.println();

    }

}
