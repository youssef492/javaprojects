package excercises;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        int arr[] = new int[10];
        int i =0 ;
        for ( i=0 ; i < arr.length; i++) {
          System.out.println("enter numbers["+i+"] : " );
            arr[i] =in.nextInt(); 
         }  
          int max_element = arr[0] , min_element = arr[0] ;
          for (i = 0; i < arr.length; i++) {
            if(arr[i]>max_element){
              arr[i]=max_element;  
            }
            if(arr[i]<min_element){
                arr[i]=min_element;
            }
          }
          
        System.out.println("the max number: "+max_element);
        System.out.println("the min number: "+min_element);
}
}