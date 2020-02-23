
package userinput;

import java.util.Scanner;




public class UserInput {

    
    public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
     int number;
     System.out.println("enter any number");
     number = input.nextInt();
     System.out.println("number= "+number);
     String name;
     System.out.println("enter your name");
     name=input.nextLine();
     System.out.println(name);
    }
    
}
