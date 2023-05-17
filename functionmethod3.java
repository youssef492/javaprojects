package function;
import java .util.Scanner;
 class functionmethod3 {
    // smallest number with method
 static int smallestnumber(int a ,int b ,int c){
      int minnumber=a ;
      if(minnumber>b)
        minnumber=b ;
        if(minnumber>c)
        minnumber=c ;
        return minnumber ;
    }
    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
      int x,y,z;
      System.out.println("enter numbers please: ");
      x =in.nextInt();
      y=in.nextInt();
      z=in.nextInt();   
      System.out.println(smallestnumber(x, y, z));
      System.out.println(smallestnumber(10,20,50));   
    }
}
