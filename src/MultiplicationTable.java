import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] arg){
        int num,p1,p2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int p = scanner.nextInt();
         p1 = scanner.nextInt();
         p2 = scanner.nextInt();
       System.out.println("do you want to continue y/n?:");
       char choice = scanner.next().charAt(0);

        int i = 1;
        do {
           System.out.println(p*i);
           System.out.println(+p1*i);
          System.out.println(p2*i);
           i++;
        }
        while(i<=10);
    }
}
