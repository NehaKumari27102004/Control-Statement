
import java.util.*;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.println("Please enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Please enter the second number:");
        int num2=sc.nextInt();

       /* if(num1>num2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        */

        int greaternumber= num1>num2 ? num1 : num2;
        System.out.println(greaternumber + " is a greater number");
    }
}

