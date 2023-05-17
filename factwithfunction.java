package function;
import java.util.Scanner;

public class factwithfunction {
  static int fact(int n ){
    if(n==1 || n==0)    // -----> base case
    return 1 ;       //   بتجمع من تحت لفوق return ال 
    else 
    return n*= fact(n-1) ;
  }
    public static void main(String[] args) {
     System.out.println("the factorial  = "+fact(5));
  }
    }

