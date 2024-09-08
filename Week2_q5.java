//Write a Java program to compute the distance between two points
import java.util.Scanner;
public class Week2_q5 {
public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("enter coordinates of point 1 (x1)");
    double x1 = sc.nextDouble();
    System.out.println("enter coordinates of point 1 (y1)");
    double y1 = sc.nextDouble();
    System.out.println("enter coordinates of point 2 (x2)");
    double x2 = sc.nextDouble();
    System.out.println("enter coordinates of point 2 (y2)");
    double y2 = sc.nextDouble();
    double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    System.out.printf("the distance between (%.2f,%.2f) and (%.2f,%.2f) is %.2f",x1,y1,x2,y2,distance);
}
}
