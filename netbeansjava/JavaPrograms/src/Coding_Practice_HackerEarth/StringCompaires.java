/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coding_Practice_HackerEarth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
/*
run:
3
aaaa aaaa
YES
abhi ibha
YES
jiya ayij
YES
BUILD

*/
// this program is to find out any of the 
public class StringCompaires {
 
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        int  n=sc.nextInt();
        while(n-->0){
            
        String s = sc.next();                 // Reading input from STDIN
        String name = sc.next();
     char ch[]=s.toCharArray();
     char ch2[]=name.toCharArray();
   HashSet<Character> hs1=new HashSet<>();
   HashSet<Character> hs2=new HashSet<>();
     
    for(char c: ch){
    hs1.add(c);
    }
    for(char c: ch2){
    hs2.add(c);
    } 
 
    
     if(hs1.size()==hs2.size())
     {
        int i=0;
        for( i=0;i<name.length();i++){
            
            if(s.contains((Character.toString(name.charAt(i))))){
                continue;
    }
            else{ break;}
        }        
   if(i==name.length())
     System.out.println("YES");
     else
      System.out.println("NO");    
}
    else
      System.out.println("NO");
 
}
    }
        
}
