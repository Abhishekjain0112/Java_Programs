/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTC;

import com.sun.org.apache.xml.internal.utils.StringBufferPool;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class PrisinoresProblrm {
    
    
    public class Node{
    int data;
    Node next;
    
    public Node(int data){
    this.data=data;
    }
    
        }
    
    
  public Node head=null;
  public Node tail=null;
  
    
  public void add(int data){
  Node temp=new Node(data);
  
  if(head==null){
   head=temp;
   tail=temp;
  // tail.next=temp;
    temp.next=head;
  }
  else{
   tail.next=temp;
   temp.next=head;
   tail=temp;
   
  }
  }  

 public void display(){
  System.out.println("----Display--Data--------------");
       
     if(head==null){
         System.out.println("List Is Empty");
     }
  else{
      Node temp=head;
 
      System.out.println(" ");
      System.out.print(" : "+temp.data);
     
        temp=temp.next;

     while(temp!=head)
      {
       System.out.print(" "+temp.data);
       temp=temp.next;
       }
   }
     
   
 } 
  
  public int totalCount(){
      int c=0;
     if(head==null){
         //System.out.println("List Is Empty");
       return 0;
     }
   else{
      Node temp=head;
      System.out.println(" ");
       
        temp=temp.next;
        c++;
     while(temp!=head)
      {
       //System.out.print(" "+temp.data);
       temp=temp.next;
       c++; 
      }
   }
     return c;
 } 
 //improve this-----------
  public void delete(Node priviousNode,Node Currentnode,Node head,Node tail){

    if(Currentnode==tail){// ||priviousNode==tail){
   //   priviousNode.next=Currentnode.next;
 priviousNode.next=Currentnode.next;
 tail=priviousNode;
   }
    else  if(Currentnode==head){
        System.out.println("current node is head");
      //tail.next=Currentnode.next;
      priviousNode.next=Currentnode.next;
        System.out.println("previous head data :" +head.data);
      head=head.next;
        System.out.println("after head data :" +head.data);
        
      
    }else{
      priviousNode.next=Currentnode.next;
        
    }     
      
      
      
  }
  
 
 
 
 
 
 
    public static void main(String[] args) {
        
        PrisinoresProblrm list=new PrisinoresProblrm();
     
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers  : ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
          list.add(i);
        }         
       list.display();
        //System.out.println("Length before delete  :"+list.totalCount());
        //Node temp=list.head;
        //list.delete(temp, temp.next);
       // System.out.println("Length after delete  :"+list.totalCount());
        //System.out.println("------Data--------------");
       // list.display(); 
        
      Node currentNode=list.head;
      Node previousNode=list.head;
      
       //  System.out.println("count :" +list.totalCount());
        System.out.println("---while stats : ---");
        
        while (list.head!=list.tail) { 
           System.out.println("count :" +list.totalCount());
         
             System.out.println("\n Before delete  \nHead  Data :" +list.head.data);
           System.out.println("tail  Data :" +list.tail.data);
           
           
           currentNode=previousNode.next;   
            
           
           
           list.delete(previousNode,currentNode,list.head,list.tail);
           if(currentNode==list.tail){list.tail=previousNode;}
            if(currentNode==list.head){list.head=list.head.next;}
            
            System.out.println("\n After Delete  \n Head  Data :" +list.head.data);
           System.out.println("tail  Data :" +list.tail.data);
              list.display(); 
            
           
           
            previousNode=currentNode.next;
      
        
        }
        
//        System.out.println(" -----Output : "+previousNode.data);
        System.out.println(" -----Output : "+currentNode.data);
            
        System.out.println(" -----Output : "+previousNode.data);
        System.out.println(" -----Output : "+previousNode.next.data);
    
    
    }
    
    
    
    
}
