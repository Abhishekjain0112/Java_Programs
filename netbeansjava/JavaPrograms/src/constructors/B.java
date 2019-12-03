/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author Abhishek
 */
public class B extends A{
    
    B(){
        this(50);
        System.out.println("Default Constructor of class B");
    }
    
        B(int x){
            
        System.out.println("Constructor of class B with aurgument"+x);
    }
    
    
    
}
