import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] arg){
        int num;     // variable declaration
        int fact ;
        Scanner scanner = new Scanner(System.in); //  input a number from user
        System.out.println(" Please Enter any number");
        num = scanner.nextInt();
         fact = 1;
        for (int i = num; i >= 1; i--)// use for loop
        {
            fact=fact*i;

        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
