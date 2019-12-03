

package javaonlinemultithreading;

public class MyThread extends Thread
{
    public void run(){
    try{
  System.out.println("My thread start");
   for(int i=500;i<=510;i++)
   {
       System.out.println("MY Thread " +i);
       Thread.sleep(1000);
   }
   }
   catch(Exception e){
           System.out.println(e);
           }

}}

