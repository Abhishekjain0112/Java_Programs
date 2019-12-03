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
public class TestStringType2 {
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("________\n :");
   int n=sc.nextInt();
        int []arry=new int[n];
         String []str=new String[n];    
        for(int i=0;i<n;i++)
        {
           arry[i]=sc.nextInt();
           str[i]=sc.next();
        }
        
        System.out.println(" *****  ");
        for(int s:arry)
        {
            System.out.print(s+"  " );
        }
        
        
        System.out.println("\n *****  ");
        for(String s:str)
        {
            System.out.print(s+"  " );
        }
        
        
        
        
    }
    
    
    
}
