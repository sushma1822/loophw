import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] arg){

        int num, sum=0, remainder,temp;
        //input a number form user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        num = scanner.nextInt(); //call out variable by scanner

        temp=num;
        while(temp>0)          // use while loop
        {
            remainder=num%10;
            sum=sum*10+remainder;
            temp/=10;
        }        // use if else statement to check number is palindrome or not
        if(sum==num)
            System.out.println("  palindrome number is:"+num);
        else
            System.out.println(" is not a palindrome number:"+num);
    }
}
