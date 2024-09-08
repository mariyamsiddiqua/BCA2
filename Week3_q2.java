//Write a java program to find the largest number among the three numbers
import java.util.Scanner;
public class Week3_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number 1 ");
        int n1 = sc.nextInt();
        System.out.println("enter number 2 ");
        int n2 = sc.nextInt();
        System.out.println("enter number 3 ");
        int n3 = sc.nextInt();
        if(n1>n2)
        {
            if(n1>n3)
            System.out.println(n1+" is max");
            else
            System.out.println(n3+" is max");
        }
        else
        {
            if(n2>n3)
            System.out.println(n2+" is max");
            else
            System.out.println(n3+" is max");
        }
    }
}
