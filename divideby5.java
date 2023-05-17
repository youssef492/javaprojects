package function;
import java.util.Scanner;
public class divideby5 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);  // Not Optimal sol
      System.out.println("enter numbers of array");  
       int num = in.nextInt();
         int[] arr = new int[num];
        for (int i = 0; i < num ; i++) {
            arr[i] = in.nextInt();
            if(arr[i]%5 == 0){
                System.out.println(arr[i]+" is can divide by 5");
        } 
    } System.out.println(isItDivisibleBy5(arr));
}
    static long isItDivisibleBy5 (int[] arr){
        long sum = 0;
        for ( int i : arr ) sum += i % 5 == 0 ? i : 0 ;
        return sum ;
    }
}
    

