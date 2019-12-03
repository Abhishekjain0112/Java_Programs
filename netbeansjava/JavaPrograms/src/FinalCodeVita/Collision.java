/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalCodeVita;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Collision {
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n,count=0;
	n=sc.nextInt();
        
	//int num[n][3],val[n];
	int num[][]=new int[n][3];
        int val[]=new int[n];
        for(int i=0;i<n;i++)
	{
	    for(int j=0;j<3;j++)
	    {
	       // cin>>num[i][j];
	   num[i][j]=sc.nextInt();
            
            }
	}
	for(int i=0;i<n;i++)
	{
	    //val[i]=sqrt(Math.pow(num[i][0],2)+Math.pow(num[i][1],2))/num[i][2];
              val[i]=(int)Math.sqrt(Math.pow(num[i][0],2)+Math.pow(num[i][1],2))/num[i][2];
	}
	
	for(int i=0;i<n-1;i++)
	{
	    for(int j=i+1;j<n;j++)
	    {
	        if(val[i]==val[j])
	        count++;
	
	    }
	    
	}
	       System.out.print(count);
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
