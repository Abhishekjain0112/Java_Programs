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
public class JavaPrograms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of degits : ");
        int n=sc.nextInt();
        System.out.println("Enter the number of times multipication  : ");
        int k=sc.nextInt();
        
         int []num=new int[n];       
        System.out.println("Enter "+n+" numbers for production  :\n ");
     
        for(int i=0;i<n;i++)
        {
         num[i]=sc.nextInt();
        }
        int p=1; 
    for(int i=0;i<n;i++)
        {
        p=p*num[i];
        }
         
    
        System.out.println(p);
        
    int []dig=new int[k];
  
    String []st=new String[k];
    for(int i=0;i<k;i++)
    {
    st[i]=Integer.toString(i);
    }
    

    
    
    
    for(int i=0;i<p;i++)
    {
      for(int j=0;j<p;j++)
      {
      
      
      }
    }

    
    
    }
    int  search(int p, int dig[],int k,int indx,int end)
    {
        if(dig[indx]==0 && indx<k )
        {
                   dig[indx]=1;
           search(p,dig,k,indx+1,end);
           
           
        }
        
        if(dig[k-1]>=1)
        {
            System.out.println(dig);
              return 11;
        }
    
        return 0;
    }
    
    
    
    
}
