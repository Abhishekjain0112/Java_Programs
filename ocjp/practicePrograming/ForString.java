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
public class ForString {
    
    public static void main(String[] args) {
        
        String s="A  bhi hek      aaaaaabcacbaababababdeerea           ..   jain  ..   :eewe.";
        System.out.println("input  :" +s);
        
        s=s.replaceAll("( )+"," ");
        System.out.println("output  :"+s);
       
                
        /*s=s.replace('a','#');//replace all a eith the *;
        System.out.println("replace 1:"+s);
        */
        
        
        
        s=s.replaceAll("(a)+","*");//replace all a eith the *;
        System.out.println("output 2:"+s);
         
        s=s.replaceAll(".$","");//remove the last element ;
        System.out.println("output 3:"+s);
         
        String abhi="abhishek jain aabb";
        
        abhi=abhi.replaceFirst("a","");
        System.out.println("output new :"+abhi);
        
        //abhi=abhi.replaceFirst("a$","");
       //System.out.println("output ne: :"+abhi);
        
        
        
        
        
        
       //int count=0;
      // String ss="";
       
      
        
    }
    
    
    
    
}
