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
public class MidChild extends MidClass142{

    public MidChild() {
    
        try{
       
    }
    catch(Exception e){
    
    }
    
    }
    
    MidChild(int s){
   // this();
    //MidChild();
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        int c;
        
        
        
        MidClass142 m=new MidClass142();
        MidChild mm=new MidChild();
        c=m.mid(7,6);
        boolean b=new Boolean(null);
        System.out.println(c);
        System.out.println(b);
    m=mm;
        System.out.println(mm.getClass());
        System.out.println(m.getClass());

        
    
    }
    
    
}
