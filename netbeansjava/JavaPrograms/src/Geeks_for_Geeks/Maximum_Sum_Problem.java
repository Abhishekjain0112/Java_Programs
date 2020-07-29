/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geeks_for_Geeks;

/**
 *Maximum_Sum_Problem : https://practice.geeksforgeeks.org/problems/maximum-sum-problem/0
 * @author Abhishek
 */

import java.util.*;
import java.lang.*;
import java.io.*;
 public class Maximum_Sum_Problem
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 
	 int t=sc.nextInt();
	 while(t-->0){
	  //Write your code here
	   
	   int n=sc.nextInt();
	  
	   int res=dive(n);
	  System.out.println(res);
	  
	 }	 }//main ends 

  public static int dive(int num){
      
      
      int sum=0;
      
      
     int num1=num/2;
     int num2=num/3;
     int num3=num/4;
     
     sum=num1+num2+num3;
     
      if(sum<=num)
        return num;
      else
      {sum=dive(num1)+dive(num2)+dive(num3);
      
          return sum;
      }
      
  }
     
     
     
 }