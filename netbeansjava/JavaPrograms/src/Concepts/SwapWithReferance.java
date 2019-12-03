/*

this swap code will not work 

*/
package Concepts;

/**
 *
 * @author Abhishek
 */
public class SwapWithReferance {
    
    public static void main(String[] args) {
        int a=10,b=15;
        Integer i1=new Integer(5),i2=new Integer(7);
        
        System.out.println("before the swap  : "+a+"  "+b);
        swap(a, b);
        System.out.println("after the swap  : "+a+"  "+b);
        swap1(i1, i2);
        System.out.println("after the swap Integer  : "+i1+"  "+i2);
                
        
        
    }
    static void swap(int a,int b ){
          int temp;
          temp=a;
          a=b;
          b=temp;
        
    }
    
    static void swap1(Integer a,Integer b ){
          Integer temp;
          temp=a;
          a=b;
          b=temp;
        
    }
    
    
    
}
