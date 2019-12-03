/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtectedPack;

import java.io.FileNotFoundException;

/**
 *
 * @author Abhishek
 */
public class D {
    
    void d()throws Exception{
        System.out.println("method");
    }
    
    public static void main(String[] args){  // throws Exception {
        
        D a=new D();
       String s=" "+"g   h",aa="a";
       StringBuffer sb=new StringBuffer("ew");
       StringBuilder sbb=new StringBuilder("sbb");
        System.out.println(s.trim()); 
       
       
        try{
        a.d();
        }
        catch(Exception e){
        
        }
        
        
       int a1a[]={11,002,4,8};
       
    System.out.println("TRY BLOCK");
 // throw new RuntimeException("hello catch");
     
   //   throw new Exception("hello catch");
     
      
    
    }
}
