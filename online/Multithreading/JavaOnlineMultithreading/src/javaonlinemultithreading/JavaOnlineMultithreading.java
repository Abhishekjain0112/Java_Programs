
package javaonlinemultithreading;


public class JavaOnlineMultithreading {


    public static void main(String[] args) throws Exception
    {
  System.out.println("Main Thread Execute ");
     MyThread M=new MyThread();
     M.start();
     for(int i=1;i<=10;i++)
     {
       System.out.println("Main Thread "+i);
       Thread.sleep(1000);
     }
  
 System.out.println("Main Thread Ends");   
    }
    
}
