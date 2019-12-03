/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtectedPack;

/**
 *
 * @author Abhishek
 */
public class Main1 {
    
    
    
    public static float main(String aargs) {
        System.out.println("Main  ");
               return 1;
    }
    
    
    public static int main(int aags) {
        System.out.println("Main  ");
               return 1;
    }
    
    
  //  static String s1;
    public static final synchronized void main(String[] args) {
        System.out.println("Main mathod ");
   int[] array =new int[2]; 
       
   String s="ab";
   
   String s1=null;
   
//s1=s1+"sdsd";
   
   s1.toString();
   char[] c={'a','b'};
        System.out.println(s1);
   
        for(char ch:c)
   {
   s1=s1+ch;
   }
    System.out.println(s1);
    if(s.equals(s1))
            System.out.println("success");
        else
            System.out.println("fails");
        
        
    }
    
}
