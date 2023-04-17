package homework25;

import java.util.Scanner;

public class HomeWork25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNumber = false;
        int num = 0;

        while (!isNumber) {
            try {
                System.out.print("Enter a number: ");
                num = scanner.nextInt();
                isNumber = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
        System.out.println("You entered: " + num);
        scanner.close();
    }
}
