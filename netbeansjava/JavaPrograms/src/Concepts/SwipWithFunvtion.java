/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;

/**
 *
 * @author Abhishek
 */
public class SwipWithFunvtion {
    
    int a=5,b=7;
    public static void main(String[] args) {
        
         SwipWithFunvtion s=new SwipWithFunvtion();
        System.out.println("before the swap  : "+s.a+"  "+s.b);
        s.swap(s);
        System.out.println("after the swap  : "+s.a+"  "+s.b);
      
    }
    void swap(SwipWithFunvtion swapReferance){
             int temp=swapReferance.a;
            swapReferance.a=swapReferance.b;
             swapReferance.b=temp;
      }
    
    
    
}
