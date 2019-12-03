/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 
 * @author Abhishek
 */
public class Constructor {
    public Constructor(int a) {
        System.out.println("hello constructor "); 
    }   
    public static void main(String[] args) {
        
        Constructor c=new Constructor(8);
        
               
        
    }

    private Constructor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
