//Write a java program to add the two numbers
import java.util.Scanner;
public class Week2_q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        double n1 = sc.nextDouble();
        System.out.println("enter number 2:");
        double n2 = sc.nextDouble();
        double sum = n1+n2;
        System.out.println("the sum of "+n1+" and "+n2+" is "+sum);
    }
}