//PROGRAM TO CHECK WHETHER A NUMBER IS PRIME OR NOT
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is not prime");
    }
}
