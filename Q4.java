//Write a Java program to find the maximum and minimum among array 
//elements
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter element");
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for(int i=1; i<n; i++){
            if(a[i]>max)
              max = a[i];
        }
        System.out.println("max is "+max);
        int min = a[0];
        for(int i=1; i<n; i++){
            if(a[i]<min)
              min = a[i];
        }
        System.out.println("min is "+min);
}
}
