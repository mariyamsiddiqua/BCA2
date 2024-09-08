//Write a java program to check whether the given number is odd or even
import java.util.Scanner;
public class Week3_q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        if(n%2==0)
        System.out.println(n+" is even");
        else
        System.out.println(n+" is odd");
    }}