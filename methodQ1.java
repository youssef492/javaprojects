package function;
public class methodQ1 {   
    
    public static int sum(int i1 , int i2){
        int sum =0 ;
        for (int i = i1; i <= i2; i++) {
            sum+=i;
             
        }  
   return sum ;
    }
    public static void main(String []args) {
        System.out.println("sum from 1 to 10 is "+sum(1, 10));
        System.out.println("sum from 20 to 30 is "+sum(20,30));
        System.out.println("sum from 35 to 45 is "+sum(35,40));
    }
}
