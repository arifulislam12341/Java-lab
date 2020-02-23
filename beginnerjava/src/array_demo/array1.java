
package array_demo;


import java.util.Scanner;
public class array1{
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] number = new double[5];
        double sum=0;
        System.out.println("please enter 5 number");
        for(int i=0;i<5;i++){
        number[i]=input.nextDouble();
        }
        
        
        for(int i=0;i<5;i++){
        
        sum=sum+number[i];
        }
        System.out.println("Sum =  "+sum);
        
        
        
    }
    
    
    
    
    
}
