/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geeks_for_Geeks;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 
	 int t=sc.nextInt();
	 while(t-->0){
	  //Write your code here
	  
	  String str=sc.next();
	  
	  char ch[]=str.toCharArray();
	  
	  int st=0,end=0,num=0,max=Integer.MIN_VALUE;
	  
	  for(int i=0;i<ch.length;i++){
	      
	      //if(ch[i]>='0' && ch[i]<='9')
	     
	      if(Character.isDigit(ch[i]))
	      {
	          int j=i;
             while(Character.isDigit(ch[j])){
                 j++;
             }
             
             num=Integer.parseInt(str.substring(i,j+1)); 	 
             if(num>max)
              	 {max=num;}
              i=j;	          
	      }
	      
	  }System.out.println(max);
	  
	  
	  
	 }
	 
	 
	 
	 
	 
	 }
}
