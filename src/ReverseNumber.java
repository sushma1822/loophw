import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] arg){
        int num=0;
        int reversenum =0;
       Scanner scanner = new Scanner(System.in);//  input a number from user
       System.out.println("please Enter digits:");
        num = scanner.nextInt();
       while(num !=0)        //using while loop here
       {
         reversenum = reversenum*10;
         reversenum = reversenum+num%10;
         num= num/10;

       }
        System.out.println("reverse of specified number is:" + reversenum);

    }
}
