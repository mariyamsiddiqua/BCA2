//Write a Java program to swap the first and last elements of an array
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter element");
            a[i] = sc.nextInt();
        }
        System.out.println("Array before swapping is");
        for(int element : a){
            System.out.print(element+"  ");
        }
        System.out.println();
        int temp = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = temp;
        System.out.println("Array after swapping is");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+"  ");
        }
    }
}
