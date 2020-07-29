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
public class Codechef {
   
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
	
		String []strs = new String[n];
		for(int i=0;i<n;i++)
		{
		    strs[i]=sc.next();
		}
		
		
		for(int i=0;i<n;i++)
		{
		    String str= strs[i];
		    char x= str.charAt(0);
		
		    String left= str.substring(1)+x;
		    //System.out.println(left);
		
		    char y= str.charAt(str.length()-1);
		
		    String right= y+str.substring(0, str.length()-1);
		    //System.out.println(right);
		    if(left.equals(right))
		    {
		        System.out.println("YES");
		    }
		    else
		        System.out.println("NO");
		}
		
	}
}
