import java.util.Scanner;

public class PositiveInteger {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in); //input a number form user
       System.out.println(" Please Enter positive number:");
       int  n = scanner.nextInt();
       for (int i = 1; i <=10; i++) {    // use for loop

           if (n > 0) {

               System.out.println(n + "*" + i + " = " + (n * i));
           }
       }


    }
}
