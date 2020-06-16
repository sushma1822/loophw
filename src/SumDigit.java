import java.util.Scanner;

public class SumDigit {
    public static void main(String[] arg){
        int n,p ,sum=0; //variable declaration
       Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a five numbers to calculator sum :");
      n = scanner.nextInt();
     // using while loop condition
        while(n>0) {
            p = n % 10;
            sum = sum + p;
            n = n / 10;
        }
         System.out.println("The Total sum of digit is:" +sum);



    }
}
