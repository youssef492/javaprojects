package array;

public class maxelemnt {
    public static void main(String[] args) {
        int arr[][] ={
            {2,3,4,5,6},
            {5,8,6},
            {9}
        };
        int max = arr[0][0];
        for (int[] row : arr) {
          for (int element : row) {
            if(element>max){
                max=element ;
            }
          }  
        }System.out.println(max);
    }
}
