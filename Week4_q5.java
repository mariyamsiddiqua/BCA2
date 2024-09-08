//Write a Java program and compute the sum of the digits of an integer
import java.util.Scanner;
public class Week4_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println("sum is "+sum);
    }}
