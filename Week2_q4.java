//Write a Java program that takes three numbers as input to calculate
//and print the average of the numbers
import java.util.Scanner;
public class Week2_q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int n1 = sc.nextInt();
        System.out.println("enter number 2:");
        int n2 = sc.nextInt();
        System.out.println("enter number 3:");
        int n3 = sc.nextInt();
        double avg = (double)(n1+n2+n3)/3;
        System.out.printf("The average of %d, %d and %d is %.2f",n1,n2,n3,avg);
    }
}
