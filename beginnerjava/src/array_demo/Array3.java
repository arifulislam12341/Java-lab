
package array_demo;

import java.util.Arrays;
import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] A=new int[2][3];
        int[][] B=new int[2][3];
        System.out.println("enter value for A matrix");
        
        for (int i=0;i<=2;i++){
        
        for(int j=0;j<=3;i++){
            A[i][j]=input.nextInt();
        
        
        }}
            System.out.println("  A ");
            for(int i=0;i<2;i++){
                for(int j=0;j<3;j++){
                
                    System.out.println("   "+A[i][j]);
                }
            
            }
        
        
        System.out.println("Enter value for B matrix");
                for (int i=0;i<=2;i++){
        
        for(int j=0;j<=3;i++){
            B[i][j]=input.nextInt();
        
        
        }}
            System.out.println("  B ");
            for(int i=0;i<2;i++){
                for(int j=0;j<3;j++){
                
                    System.out.println("   "+B[i][j]);
                }
            }
            
            }
        }

    