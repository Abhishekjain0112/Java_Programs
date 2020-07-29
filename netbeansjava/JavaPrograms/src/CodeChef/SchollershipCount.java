/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class SchollershipCount {

    
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      
      int n=sc.nextInt();
      
      if(n<101 && n>50)
            System.out.println("50");
      else if(n>=1 && n<=50)
            System.out.println("100");
      else
            System.out.println("0");
    }
           
    
    
}
