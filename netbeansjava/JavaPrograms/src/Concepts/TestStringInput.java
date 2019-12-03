/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class TestStringInput {
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("________");
        int x;
        String s=sc.nextLine();
        x=sc.nextInt();
        System.out.println(s);
       // System.out.println(x);
        
//        System.out.printf("%01d\n",x);
//        System.out.printf("%5d\n",x);
        System.out.printf("%-3d",x);
        System.out.printf("%04d\n",x);
//        
        System.out.print(":::::");
//        
        
        
        
        
    }
    
    
    
}
