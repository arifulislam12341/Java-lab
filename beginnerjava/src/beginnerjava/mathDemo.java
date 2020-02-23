
package beginnerjava;
import java.util.Scanner;
public class mathDemo {
    public static void main(String[]args){
    
    int x,y;
    Scanner input=new Scanner(System.in);
    System.out.println("enter any number");
    x=input.nextInt();
    y=input.nextInt();
    int max=Math.max(x,y);
   System.out.println(max);
   
  int min=Math.min(x,y);
  System.out.println(min);
  
  
    
    }
}
