
package oop;


public class Teacher {
    
    String name,gender;
    int phone;
    Teacher(){
    
        System.out.println("no answer");
    }
    Teacher(String name,String gender){
    this.name=name;
    this.gender=gender;
    
    }
    Teacher(String name,String gender,int phone){
    
    this.name=name;
    this.gender=gender;
    this.phone=phone;
    
    }
    void displayinfo(){
    
      System.out.println("Name= "+name);
        System.out.println("Gender= "+gender);
        System.out.println("PHONe="+phone);  
        System.out.println("\n\n");
    
    }
    
}
