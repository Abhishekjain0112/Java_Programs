/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceConcepts;

/**
 *
 * @author Abhishek
 */
public interface parent {

    void print1();
    void print2();
    default void print()
    {
        System.out.println("Default method of the interface");
    }
    
    
    
}
