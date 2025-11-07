import java.util.*;

public class EvenandOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to checked the given number is a ever and odd:");
        System.out.println("Please enter the number:");
        int num=sc.nextInt();
        String result= num % 2==0 ? "Even" : "Odd";
        System.out.println(result);
    }
}
