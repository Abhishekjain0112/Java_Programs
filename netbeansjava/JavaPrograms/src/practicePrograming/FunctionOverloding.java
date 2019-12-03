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
public class FunctionOverloding {
    
    
    
    
    public static void main(String[] args) {
        
        add(5,6);
        add("5as","6");
        
        
    }
    
    
   static void add(int a,int b){
        System.out.println("int ");
    }
     static void add(String a,String b){
        System.out.println("str ");
    }  
    
}
