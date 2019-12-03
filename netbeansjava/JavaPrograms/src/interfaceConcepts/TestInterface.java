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
public class TestInterface {

    
    public static void main(String[] args) {
        
        parent p =new Chiled();
        Chiled c=new Chiled();
        
        Chiled c1 =new SubChild();
        
        
        //p.print();
        c1.print();
        c1.print4();
        
    }
    
}
