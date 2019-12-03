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
public class TestArrayArument {
    
    
    public static void main(String[] args) {
        int a[]={1,2,1,3,4};
        
        System.out.println("befor function : 1 & 2  : "+a[0]+" , " +a[1]);
        fun(a);
        System.out.println("After function : 1 & 2  : "+a[0]+" , " +a[1]);
        
        
    }
    static void fun(int ar[]){
         ar[0]=98;
         ar[1]=100;
    }
    
    
}
