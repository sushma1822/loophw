import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] arg){
        int num, sum=0, firstdigit, lastdigit;
         Scanner scanner = new Scanner(System.in); // input  a number from user
        System.out.println("Enter any numbers to find sum of first and last digit:");
          num = scanner.nextInt();
          lastdigit = num%10; //find last digit to sum
        firstdigit = num; //copy num to first digit
        while(num>=10) { // find the first digit by dividing num by 10 until first digit is left
            num = num / 10;
        }
        firstdigit =num; // find sum of first and last digit
        sum = firstdigit+lastdigit;
        System.out.println("sum of first and last = " +sum);
    }
}
