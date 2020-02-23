
package oop;


public class Test {
    public static void main(String[] args) {
        Teacher teacher1 =new Teacher("masum billah","male",172832937);
     
        
        teacher1.displayinfo();
        Teacher teacher2=new Teacher("ariful","male");
       
        teacher2.displayinfo();
        Teacher teacher3=new Teacher();
        
        
        teacher3.displayinfo();
    }
}
//this is called overlkoading constructor
//Teacher constructor er vitore parameter na thakle default constructor