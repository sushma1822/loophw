import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] arg) {
        // variable declaration
        int number, countPositive = 0,
                countNegative = 0,
                countZero = 0;
        char choice;
        // input a number from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");   // s.out the statement
        number = scanner.nextInt();                // call variable by scanner
        System.out.println("do you want to continue y/n?");
        choice = scanner.next().charAt(0);
        do {          //  use do while loop
            // use if else statement to find which number of positive , negative and zero
            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        } while (choice == 'y' || choice == 'y');
        System.out.println("Positive numbers:" + countPositive);
        System.out.println("Negative numbers:" + countNegative);
        System.out.println("Zero numbers:" +countZero);
    }
}