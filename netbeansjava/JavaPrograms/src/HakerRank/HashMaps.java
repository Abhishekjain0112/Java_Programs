/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HakerRank;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Abhishek
 */
public class HashMaps {
    
    
    public static void main(String[] args) {
        
      
       
       int a[]={1,2,3,-1,-4,0,0,-3};
        
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
         
        hm.put('P', 0);
        hm.put('N',0);
        hm.put('Z', 0);
        for(int i:a ){
        if(i>0) {
          hm.put('P',hm.get('P')+1);
        }else if(i<0){
        hm.put('N',hm.get('N')+1);
        }
        else if(i==0)  hm.put('Z',hm.get('Z')+1);
        }
       for(int i:hm.values()){
           System.out.println("  "+i);
       }   
       System.out.println(" total p : "+hm.get('P'));
       System.out.println(" total N : "+hm.get('N'));
       System.out.println(" total Z : "+hm.get('Z'));
 
        
    }
    
    
    
}
