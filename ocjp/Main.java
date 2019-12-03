     public class Main{ 
           private int i = 1; 
           public static void main(String argv[]){ 
              int i = 2; 
              Main s = new Main (); 
              s.someMethod(); 
           } 
           public static void someMethod(){ 
              System.out.println(i); 
           } 
         } 