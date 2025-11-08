import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Student's Score Report card.");
        System.out.println("Please enter the score of student.");
        float Score=sc.nextFloat();
        String result= Score > 80 ? "High" : (Score > 50 ) ? "Moderate" : "Low";
        System.out.println("The Student score is a " + result);
    }
}
