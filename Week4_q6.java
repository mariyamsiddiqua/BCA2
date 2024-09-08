//Write a Java program to calculate the factorial of a number
import java.util.Scanner;
public class Week4_q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("factorial = "+fact);
    }
}
