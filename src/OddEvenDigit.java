import java.util.Scanner;

public class OddEvenDigit {
    public static void main(String[] arg) {
        int evencount = 0;
        int oddcount = 0;
        int sumeven = 0;
        int sumodd = 0;
        // int store = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter any five digit number");
        int value = scanner.nextInt();

            while (value > 0) {
                int rem = value % 10;
                if (rem % 2 == 0) {
                    sumeven = sumeven + rem;
                    evencount++;
                    value = value / 10;
                } else {
                    sumodd = sumodd + rem;
                    oddcount++;
                    value = value / 10;
                }

            System.out.println("number of odd are:" + oddcount);
            System.out.println("sum of Entered odd number:" + sumodd);
            System.out.println("number of even are:" + evencount);
            System.out.println("sum of Enter even number:" + sumeven);
        }
    }
    }