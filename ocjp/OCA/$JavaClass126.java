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
public class $JavaClass126 {
    
    private  boolean flag;
    public  void disp()
    {
    int num=2;
     while(num%7==0)
     {
         flag=false;
         System.out.println(num);   
         num+=2;
     }
        System.out.println("nothing ends");
    }
    
    public static void main(String[] args) {
        new $JavaClass126().disp();
    }
    
}
