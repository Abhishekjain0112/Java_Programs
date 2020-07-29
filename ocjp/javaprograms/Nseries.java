/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Nseries {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,sum=0,sqr=1;
        int n=sc.nextInt();
        System.out.println("number =" +n);
        for(i=1;i<=n;i++)
        {
            sqr=1;
          for(j=1;j<=i;j++)
          {
          sqr=sqr*i;
             
          } 
           sum=sum+sqr;
          System.out.println(sum);
        }
        
        
    }
}
