//WRITE A JAVA PROGRAM TO INSERT 10,20,30... IN AN ARRAY AND DISPLAY THEM
import java.util.Scanner;
public class Week4_q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter N: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = (i+1)*10;
        }
        for(int element : a){
            System.out.println(element);
        }
    }}
