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
public class B {
    
    public static void main(String[] args) {
        
        A a=new A();
       a.getName_default();
    try{
       int aa[]={11,002,4,8};
       
    System.out.println("TRY BLOCK");
  //  throw new Exception("hello catch");
    }
    //  catch(Exception e){}
    
      finally{
        System.out.println("finally");
    } 
//    catch(Exception e){}
    
    System.out.println("MAIN METHOD");
    
    
    try{
       int ab[]={11,002,4,8};
       
    System.out.println("TRY BLOCK 2");
    
    }
    
      finally{
        System.out.println("finally 2 ");
    } 
//  
    
    
    }
}
