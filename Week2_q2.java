//Write a java program to multiply two floating numbers
import java.util.Scanner;

public class Week2_q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        float n1 = sc.nextFloat();
        System.out.println("enter number 2:");
        float n2 = sc.nextFloat();
        float product = n1*n2;
        System.out.println("the product of "+n1+" and "+n2+" is "+product);
    }
}
