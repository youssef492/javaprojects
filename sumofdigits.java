package function;
import java.util.Scanner;

public class sumofdigits {
    static int findsum(int number){
     int sum = 0 ;
     while(number!=0){
        sum = sum+ number%10;
        number= number/10 ;

     }
     return sum ;
    }
    public static void main(String[] strings) {
      int number= 523 ;
      System.out.println(findsum(number));
       
    }
}
