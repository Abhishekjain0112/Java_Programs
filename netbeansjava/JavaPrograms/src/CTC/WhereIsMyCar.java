/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTC;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class WhereIsMyCar {
    
    
    
    public static void main(String[] args) {
        System.out.println("Welcome To Where Is My Car App : " ); 
                
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int parkingGap=sc.nextInt();
        int maxCapacity=sc.nextInt();
        
        
     int city[][]=new int[X][Y];
        
     int k=1;
     
     for(int i=0;i<X;i=i+maxCapacity){
     
         for(int j=0;j<Y;j=j+maxCapacity){
             
              city[i][j]=k;
              k++;  
           }
         
     }k--;
     
        ArrayList<ArrayList<String>> parkingSlots=new ArrayList<ArrayList<String>>();
        for(int i=0;i<8;i++){
           ArrayList<String> a=new ArrayList<>();
           parkingSlots.add(a);
        
        }
        
        
        //System.out.println("Total Size of the list : : "+parkingSlots.size());
        int numberOfLoop=sc.nextInt();
         ArrayList<String> slist=new ArrayList<>();
         // slist.add("Total Parking "+k);
         for(int num=0;num<numberOfLoop;num++){
        
            System.out.println("\n Slect your options :\t P : Parking of car \t R : Retrieval of Car ");
            char choise=sc.next().charAt(0);
            
        
            
            switch(choise){
            
                case 'P' :
                {
                   int px,py;
                  ////  System.out.print("\n Enter your Location x , y :");
                    px=sc.nextInt();
                    py=sc.nextInt();  
                  ////System.out.print("\n Enter Car Number  :");
                    String carNumber=sc.next();
                    
                    
                  
             /*   ////    System.out.println("-----Citya --------");
                
                  //  for print the City matics
                    for(int i=0;i<X;i++){
                   for(int j=0;j<Y;j++){
                       System.out.print(" "+city[i][j]);
                   }System.out.println("");
                } 
               */
                    //  System.out.println("Value of K :"+k);
                    int array[]=new int[k];
                    int distance=0;
                    int c=0;
                    
                    for(int i=0;i<X;i++){
                      for(int j=0;j<Y;j++){
                          distance=-1;
                        
                          if(city[i][j]!=0){
                            distance=0;
                              if(((px+py)==(i+j))||px==0 ){//this is changed 
                              distance=Math.abs(px-i)+Math.abs(py-j);
                              }
                              else
                             // distance=Math.abs((px+py)-(i+j));
                            //tis is just for demo 
                                  distance=Math.abs(px-i)+Math.abs(py-j);
                              
                              array[c]=distance;
                           
                            c++;
                           }
                   }
                    }    
           int newArray[]=array.clone();
           Arrays.sort(newArray);
                        
           int getParkingNumber=newArray[0];
               int listno=-1;
               
                    System.out.println("\n array ");
                    for(int i:array)
                        System.out.print(" : "+i);
                    
               
               
                    System.out.println("\nSorted array ");
                    for(int i:newArray)
                        System.out.print(" : "+i);
                    
                    
               System.out.println("getParkingIndex  :  "+getParkingNumber);
           for(int i=0;i<k;i++)
            {
              if(getParkingNumber==array[i]){
                  listno=i;           
                      break;
                     }  
            }  
           ///
                    System.out.println("value of listno   :  "+listno);
                    System.out.println("SizeOf Total List   :  "+parkingSlots.size());
                    
                    
           parkingSlots.get(listno).add(carNumber);
           
           
           
           
           
                    break;   
                }
                case 'R' :
                {
           
                    String findCarenumber=sc.next();
                    
                 
                 int count=1,indexofnumber;   
                   
                 for( ArrayList<String> ar:parkingSlots){
                     
                    if(ar.contains(findCarenumber)){
                      int xx=-1,yy=-1;
                      
                        for(int i=0;i<X;i++){
                           for(int j=0;j<Y;j++){
                            if(count==city[i][j])
                            {
                               xx=i;
                               yy=j;
                               break;
                            }
                           }
                        }
                        
                        
                        indexofnumber=ar.indexOf(findCarenumber)+1;
                        
                        System.out.println(" Care Number :"+indexofnumber);
                        
                        
                        int carPosition=indexofnumber%maxCapacity;
                        if(carPosition==0)carPosition=maxCapacity;
                        
                        
                        int floorNumber=(int)indexofnumber/maxCapacity;
                         if(floorNumber!=0)floorNumber--;
                                 // because when it first  divide  will gave output 1 
                                 // and it is on zero flore 
                        slist.add(""+xx+" "+yy+" "+floorNumber+" "+carPosition);
                        
                    }
                    count++;
                    }
            break;
                }                    
                
                
            }
           
  
        }
                    
            for(String s:slist){
                System.out.println(""+s);
            }
            
          
        
        
        

    
    
    
    }
           
    
    
    
    
    
    
    
}



