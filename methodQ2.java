package function;
public class methodQ2 {
     public static void main(String[] args) {
        System.out.println(max(5,6,7));
       }
    public static int max(int a ,int b ,int c){
       if(a>b){
        if(a>c){
            return a ;
        }else{
            return c ;
        }
       }else{
        if(b>c){
            return b ;
        }else{
            return c;
        }
       }
     
      
    }
}
