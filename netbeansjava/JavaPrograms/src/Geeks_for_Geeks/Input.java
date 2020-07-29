/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geeks_for_Geeks;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Input {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        while(true){
        
            int n=sc.nextInt();
             System.out.print(n+" ");
             if(n==42)
                 break;
            
        }
    }
}
