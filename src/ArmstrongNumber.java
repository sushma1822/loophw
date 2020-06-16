import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] arg){
        int num,copy_of_num,sum=0,rem;

        //Store input number in variable num
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
      num = scanner.nextInt();

      copy_of_num = num;
        // storing the sum in variable sum
        // using while loop
        while (num != 0)
        {
            rem = num % 10;
            sum = sum + (rem*rem*rem);
            num = num / 10;
        }
        //  using If else statement ot check the number is Armstrong or not
        if(copy_of_num == sum)
            System.out.println(" Armstrong Number is:"+copy_of_num);
        else
            System.out.println(" is not an Armstrong Number"+copy_of_num);

    }
    }

