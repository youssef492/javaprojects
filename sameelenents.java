package array;
public class sameelenents {
    public static void main(String[] args) throws Exception {
        int arr1[]={1,2,3,4,5,6,7};
        int arr2[]={3,8,99,2,5,7,10};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.println("the numbers : "+arr1[i]);
                }
            }
        }     
    }
}   
