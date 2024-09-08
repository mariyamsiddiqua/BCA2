//Write a java program to display a cube of a number
import java.util.Scanner;
public class Week2_q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find cube: ");
        int n = sc.nextInt();
        int cube = n*n*n;
        System.out.println("The cube of "+n+" is "+cube);
    }
}
