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
public class TestStringSplit {
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("________\n :");
        String inpute="1,2,3,4,5,6,7,8,9";     
        System.out.println(inpute);
        String []str=inpute.split(",");
        
      //int []inte=Integer.parseInt(inpute.split(","));
          
        
        System.out.println("----");
        for(String s:str){
            System.out.print(s+" ");
        }
        
        
    }
    
    
    
}
