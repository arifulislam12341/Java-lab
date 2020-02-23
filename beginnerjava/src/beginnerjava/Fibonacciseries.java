
package beginnerjava;

import java.util.Scanner;


public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
         System.out.println("Enter the number");
       int n=input.nextInt();
      
       int first=0;
       int second=1;
       int fibo;
       for(int i=0;i<+10;i++){
       
       fibo=first+second;
           System.out.println("fibo= "+fibo);
           first=second;
           second=fibo;
       
       
       }
       
    }
}
