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
public class Armain {
    
    String[] main =new String[2];

    public Armain(String[] main) {
       // this();
        //super();
        
        for(int i=0;i<main.length;i++)
        {
        this.main[i]=main[i]+5;
        }
        
    //    super();
    }
    
     void main(){
         System.out.println(main[0]+"   "+ main[1]);
     }
    
}
