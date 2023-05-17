package function;
import java.util.Arrays;
public class equalsmethod {
    static boolean equals(int[] arr1, int[] arr2 , boolean equal1){
         equal1 = Arrays.equals(arr1, arr2);
        return equal1 ;
    }
    public static void main(String[] aStrings) {
        int x[] ={1,2,3,5,6,7};
        int y[] ={1,2,3,5,6,9};
      boolean n = equals(x, y, false);
      if(n==true){
        System.out.println("the two array is equals");
      }else{
        System.out.println("the two array is not equals");
      }
    }
}
