//JAVA PROGRAM TO PRINT ALL PRIME NUMBERS BETWEEN 0-100
public class Q5 {
    public static void main(String[] args){
      for(int n=2; n<100; n++){
          boolean isPrime = true;
          //System.out.println(n);
          for(int i=2; i<=n/2; i++){
              //System.out.println(i);
              if(n%i==0){
                  isPrime = false;
                  break;}
          }
          if(isPrime)
              System.out.println(n);
      }  
    }}