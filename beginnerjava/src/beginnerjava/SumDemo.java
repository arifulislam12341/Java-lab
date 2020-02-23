
package beginnerjava;
import java.util.Scanner;

public class SumDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int x=input.nextInt();
        int r;
        int sum=0;
        int temp=x;
        
        while(temp!=0){
    
    r=temp%10;
    sum=sum+r;
    temp=temp/10;
    
    
    }
        System.out.println("sum= "+sum);
    }
}
