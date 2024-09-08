//Write a java program to print the following pattern.
//    1
//   121
//  12321
// 1234321
//123454321
import java.util.Scanner;
public class Week4_q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print(j+"");
            for(int m=i-1; m>0; m--)
                System.out.print(m+"");
            System.out.println(" ");
        }
    }
}