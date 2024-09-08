//Write a Java program to implement linear search.
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean flag = false;
        for(int i=0; i<n; i++){
            System.out.println("enter element");
            a[i] = sc.nextInt();
        }
        System.out.println("enter no to search");
        int s = sc.nextInt();
        for(int i=0; i<n; i++){
            if(s==a[i])
            {System.out.println("found");
            flag = true;
            break;}
        }
        if(flag == false)
        System.out.println("not found");
}
}
