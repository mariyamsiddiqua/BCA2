//Write a Java program to calculate the sum of all the array elements.
import java.util.Scanner;
public class Week4_q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int sum = 0;
        int a[] = new int [n];
        System.out.println("enter array elements:");
        for(int i=0; i<n; i++){
            System.out.println("enter element ");
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum is "+sum);
    }
}
