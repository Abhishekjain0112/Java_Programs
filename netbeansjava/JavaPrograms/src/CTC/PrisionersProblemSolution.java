/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTC;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class PrisionersProblemSolution {
    
    
        
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

    if(Currentnode==tail){
 priviousNode.next=Currentnode.next;
 tail=priviousNode;
   }
    else  if(Currentnode==head){
     priviousNode.next=Currentnode.next;    
      head=head.next;
   
        
      
    }else{
      priviousNode.next=Currentnode.next;
        
    }     
      
      
      
  }
  
 
 
 
 
 
 
    public static void main(String[] args) {
        
        PrisionersProblemSolution list=new PrisionersProblemSolution();
     
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers  : ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
          list.add(i);
        }         
       list.display();
      Node currentNode=list.head;
      Node previousNode=list.head;
      
       //  System.out.println("count :" +list.totalCount());
        System.out.println("---while stats : ---");
        
        while (list.head!=list.tail) { 
     currentNode=previousNode.next;   
       list.delete(previousNode,currentNode,list.head,list.tail);
           if(currentNode==list.tail){list.tail=previousNode;}
            if(currentNode==list.head){list.head=list.head.next;}
             previousNode=currentNode.next;
      
        
        }
        
//          
        System.out.println(" -----Output : "+previousNode.data);
    //    System.out.println(" -----Output : "+previousNode.next.data);
    
    
    }
    
  
    
    
}
