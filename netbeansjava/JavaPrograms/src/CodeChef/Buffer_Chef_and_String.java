/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Buffer_Chef_and_String {

    
    public static void main(String[] args) throws Exception{
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));       // using java.io.*
         String tt = reader.readLine(); // it reads everything into string
        
       
        
        int t = Integer.parseInt(tt);
        
        while(t-->0){
        
        String s=reader.readLine();
        int l=s.length();
          if(l==1 || l==2){
          
              System.out.println("YES");
          }else
          {
          
             String s1=s.substring(1,l-1);
              if( (s1+s.charAt(0)).equals((s.charAt(l-1)+s1) )){
               System.out.println("YES");
              }else
                System.out.println("NO");  
              
          }  
        }
    
    }
        
    
    
    
    
    
}















