/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

/**
 *
 * @author Abhishek
 */
public class ConstructorTry {

    public ConstructorTry() {
    //this(5);
        try {
     //      this(5);
            throw  new Exception();
        } catch (Exception e) {
            System.out.println("Hello try");
        }
        
    }
    
    ConstructorTry(int i)throws Exception
    {
    
    }
    
    int a(){
     return 0;
    }
  
    
    
    
    
    public static void main(final String[] args) {
        
        ConstructorTry cn=new ConstructorTry();
     String s=" ",ss="sssasa";// false " " ;
     
        System.out.println(ss.replaceAll("a","xx"));
     System.out.println(ss.replace("a","xx"));
        System.out.println(s.isEmpty());
        
    }
    
    
    
    
}
