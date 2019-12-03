/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyNameDataType;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author Abhishek
 */
public class Name <Abhishek,jain> {
    
    Abhishek a;
    jain j;
    
    void set(Abhishek a,jain j)
    {
    this.a=a;
    this.j=j;
        
    }
    
    void get()
    {
        System.out.println("   " +a+"   " +j);
    }
   
  
    
}
