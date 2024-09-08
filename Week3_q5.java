//Write a Java program to take a number, divide it by 2 and print
//the result until the number becomes less than 10
import java.util.Scanner;
public class Week3_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        double n = sc.nextDouble();
        while(n>=10){
            n = n/2;
            System.out.println("number is "+n);
        }
    }
}

