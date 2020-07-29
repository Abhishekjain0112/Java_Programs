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
public class Number_to_Bnary {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("  : ");
          String n=sc.next();
        System.out.println(Integer.parseInt(n,2));
        System.out.println(Integer.parseInt(n,8));
        System.out.println(Integer.parseInt(n,16));
        
        
    }
            
}
