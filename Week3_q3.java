//Write a Java program that takes a number as input and prints
//its multiplication table upto 10
import java.util.Scanner;
public class Week3_q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.println("multiplication table of "+n+" is:");
        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
