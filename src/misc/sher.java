package misc;
import java.util.Scanner;


public class sher {
public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      for(int i = 0; i < t; i++){
          int a = in.nextInt();
          int b = in.nextInt();
           a= ((Double)Math.ceil(Math.sqrt(a))).intValue();
          Double c = Math.sqrt(b);
          
          if(c%1==0)
        	  b=c.intValue()+1;
          else
        	  b=((Double)Math.ceil(c)).intValue();
          
          System.out.println(b-a);
      }
}
}
