
package beginnerjava;

import java.util.Scanner;
public class Reversenum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=input.nextInt();
        int r;
        int temp=x;
        int sum=0;
        
        while(temp!=0){
        
        r=temp%10;
        sum=sum*10+r;
        temp=temp/10;
        
        
        }
        System.out.println("reverse number= "+sum);
        if(sum==x){
            System.out.println("number is palindrome");}
        else{System.out.println("number is not palindrome");}
               
        
        }
    }

