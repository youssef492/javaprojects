package function;
import java.util.Scanner;
public class largestnumwithmethod {
    static int max(int a , int b , int c){
     if(a>b && a>c){
        return a ;
    }else if(b>a && b>c){
        return b ;
    }else{
        return c;
    }
  }  
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter three number please :");
        int n1 ,n2 ,n3 ;
        n1 =in.nextInt(); n2=in.nextInt(); n3=in.nextInt();
        System.out.println("the largest number is "+max(n1, n2, n3));
    }
}