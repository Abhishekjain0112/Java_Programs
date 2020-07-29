/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicePrograming;

/**
 *
 * @author Abhishek
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    
      Scanner sc = new Scanner(System.in);
        int dic=sc.nextInt();
    int sum,ramin,dig,ques,n;
     
        String q="";
        
        ramin=dic;
        
          n=ramin%2;
        System.out.println("start");
        while(n<2){
            System.out.println("loop");
        q=q+""+n;
        
         ramin=(int)ramin/2;
         n=ramin%2;   
         if(n==2)break;   
            
        }q=q+"1";
   
    StringBuffer sb=new StringBuffer(q);
        System.out.println(sb.reverse());
    
    }
}