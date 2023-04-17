package homework26;

import java.util.Scanner;

public class HomeWork26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Enter a non-negative number: ");
            try {
                n = Integer.parseInt(scanner.nextLine());
                int result = square(n);
                System.out.println("The square of " + n + " is " + result);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: please enter a number");
            } catch (NegativeNumberException e) {
                System.out.println("Invalid input: please enter a non-negative number");
            }
        }
    }
    public static int square(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Number should be non-negative");
        }
        return n * n;
    }
}


