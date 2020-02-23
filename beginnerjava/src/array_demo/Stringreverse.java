
package array_demo;

import java.util.Scanner;
public class Stringreverse {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a word");
        String[] name=new String[5];
       
        
        for(int i=name.length()-1;i>=0;i--){
        
       name[i]= input.charAt(i);
        }
        System.out.println(""+name);
    }
}
