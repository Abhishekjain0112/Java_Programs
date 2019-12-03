/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class JurrasicPark {
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        System.out.println("enter values string :");
       String park[][] =new String[r][c];
       /* int gate1[]=new int[2];
        int gate2[]=new int[2];
        int gate3[]=new int[2];
        */
       int animal[]=new int[2];
        //,gate2[2],gate3[2],animal[2];
      int gates[][]=new int[3][2];
       
         for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                gates[i][j]=sc.nextInt()-1;
            }
          }
                 animal[0]=sc.nextInt()-1;
                 animal[1]=sc.nextInt()-1;  
     System.out.println("Row "+ r+"  Colum :" +c);
        int kk=0;
        for(int ga[]:gates){kk++;
           for(int g:ga){
               System.out.print("Gate no : "+kk +" : "+g);
             }System.out.println("");
        }
       System.out.println("loop start ENTER THE PLACSES:");
    for(int i=0;i<r;i++)
     {
      for(int j=0;j<c;j++){
        park[i][j]=sc.next();
     }
    } 
   String parkcopy[][]=park;
   park[animal[0]][animal[1]]="A"; 
   markSafeGrassLand(gates, park, r, c);
   forApprochableToSmilodon(animal,park,r,c);
   showPark(park); 
   checkSave(park);
   
    }
             // main over  
   
    
    static int checkSave(String park[][]){
     int dsum=0,nsum=0;
     
        for(String st[]:park)
        {
           for(String s:st){
           //  if()
               // here i have to write code of sum of both G an sG both differently
              if(s.equals("G")||s.equals("SG")||s.equals("SSG")) {dsum++;nsum++;}
              if(s.equals("US")||s.equals("A"))dsum++;
           }
        }
        System.out.println("Total GrassLand      : "+dsum);
        System.out.println("Total SafeGrassLand  :"+nsum);
        float saftyindex=(nsum/(float)dsum)*100;
        System.out.println("\t SaftyIndex   : "+saftyindex+"%");
     return 0;    
    }    
    static void showPark(String park[][]){
        System.out.println("-------- ");
        for(String ss[]:park){
             for(String s:ss){
                 System.out.print("    "+s);
                 
             }System.out.println("");
    }
        System.out.println("-------- ");
    }
    //
    
    
    static void markSafeGrassLand(int gates[][],String park[][],int r,int c){
     
              for(int gtr[]:gates)
              {
                  
                  forAsingleGate(gtr, park, r, c);
              }
    }
    //for mark unsafe :
      static void markSafeGrassLand(int animal[],String park[][],int r,int c){
     
                  forApprochableToSmilodon(animal, park, r, c);
                 
    }  
   // HERE FOR PERSON AND ANIMAL 
     static void forAsingleGate(int gate[],String park[][],int r,int c)
     {
        // int i=gate[0];
      //  int j=gate[1];
        
        if(IsGoTop(gate, park, r, c,'P')){
            int index[]={gate[0]-1,gate[1]};    
            forAsingleGate(index, park, r, c);
        }

        if(IsGoDown(gate, park, r, c,'P')){
             int index[]={gate[0]+1,gate[1]};   
            forAsingleGate(index, park, r, c);
        }
        
         if(IsGoRight(gate, park, r, c,'P')){
              int index[]={gate[0],gate[1]+1};   
            forAsingleGate(index, park, r, c);
        }       
        
         if(IsGoLeft(gate, park, r, c,'P')){
              int index[]={gate[0],gate[1]-1};   
            forAsingleGate(index, park, r, c);
        }      
        
     }
 
     //  FOR THE CAGE TO UNSAFE GRASSLAND :
    //
     //
     
 static void forApprochableToSmilodon(int []animal,String park[][],int r,int c)
     {
          //int i=animal[0];
         // int j=animal[1];
        
        if(IsGoTop(animal, park, r, c,'A')){
            int index[]={animal[0]-1,animal[1]};    
            forApprochableToSmilodon(index, park, r, c);
        }

        if(IsGoDown(animal, park, r, c,'A')){
             int index[]={animal[0]+1,animal[1]};   
            forApprochableToSmilodon(index, park, r, c);
        }
        
         if(IsGoRight(animal, park, r, c,'A')){
              int index[]={animal[0],animal[1]+1};   
            forApprochableToSmilodon(index, park, r, c);
        }       
        
         if(IsGoLeft(animal, park, r, c,'A')){
              int index[]={animal[0],animal[1]-1};   
            forApprochableToSmilodon(index, park, r, c);
        }      
        
     }     
   
  static boolean isGate(int gindexs[],int [][]gates){
      for(int gate[]:gates){
          
               if(gate[0]==gindexs[0] && gate[1]==gindexs[1] )
                   return true;
             
                    }
      return false;
          
  }  
  
    static boolean IsGoTop(int source[], String park[][], int r,int c,char find )
    {
        int i=source[0]-1;
        int j=source[1];
          
     char ch=find;
     
     switch(find){
     
         case 'P': {
         
              if((i>-1&&i<r)&&(j>-1)&&j<c)
            {
               if(park[i][j].equals("G")){
                   park[i][j]="SG";
                   return true;
               }
        
            }
             
         
         }
         break;
         
         case 'A': {
         //sab m cpy krna h abhi ye code
        if((i>-1&&i<r)&&(j>-1)&&j<c)
            {
                if(park[i][j].equals("W"))
                    return false;
                
                
               if(park[i][j].equals("M")||park[i][j].equals("G")||park[i][j].equals("SG")){
                   //park[i][j]="SG";
              
                       if(park[i][j].equals("SG"))
                         park[i][j]="SSG";
                   if(park[i][j].equals("M"))
                         park[i][j]="MM";               
                   
                   
                   if(park[i][j].equals("G"))
                         park[i][j]="US";
                   return true;
               }
        
            }
             
         }
         break;
     
        }
        return false ;
       
    }
   
    
    static boolean IsGoDown(int source[], String park[][], int r,int c,char find )
    {
        int i=source[0]+1;
        int j=source[1];
        char ch=find;
     
     switch(find){
     
         case 'P': {
         
         if((i>-1&&i<r)&&(j>-1)&&j<c)
        {
               if(park[i][j].equals("G")){
                   park[i][j]="SG";
                   return true;
               }
        
        }   
         }
         break;
         
         case 'A': {
          if((i>-1&&i<r)&&(j>-1)&&j<c)
            {
                if(park[i][j].equals("W"))
                    return false;

                
                
                
               if(park[i][j].equals("M")||park[i][j].equals("G")||park[i][j].equals("SG")){
                   //park[i][j]="SG";
                
                    if(park[i][j].equals("SG"))
                         park[i][j]="SSG";
                   if(park[i][j].equals("M"))
                         park[i][j]="MM";
                   
                   
                   if(park[i][j].equals("G"))
                   {park[i][j]="US";
                    //   return false;   
                   }
                   return true;
               }
        
            }
          
             
         }
         break;
     
        }  
     return false ;
       
    }
 
    static boolean IsGoRight(int source[], String park[][], int r,int c,char find )
    {
        int i=source[0];
        int j=source[1]+1;
        char ch=find;
     
     switch(find){
     
         case 'P': {
        
        if((i>-1&&i<r)&&(j>-1)&&j<c)
        {
               if(park[i][j].equals("G")){
                   park[i][j]="SG";
                   return true;
               }
        
        }
              
         
         }
         break;
         
         case 'A': {
         
        if((i>-1&&i<r)&&(j>-1)&&j<c)
            {
                if(park[i][j].equals("W"))
                    return false;
                
               if(park[i][j].equals("M")||park[i][j].equals("G")||park[i][j].equals("SG")){
                   //park[i][j]="SG";
                   if(park[i][j].equals("SG"))
                         park[i][j]="SSG";
                   if(park[i][j].equals("M"))
                         park[i][j]="MM";   
                   
                   if(park[i][j].equals("G"))
                         park[i][j]="US";
                   return true;
               }
            }      
         }
         break;
     
        }   
        return false ;
       
    }   
    
     static boolean IsGoLeft(int source[], String park[][], int r,int c ,char find)
    {
        int i=source[0];
        int j=source[1]-1;
        char ch=find;
     
     switch(find){
         case 'P': {
        if((i>-1&&i<r)&&(j>-1)&&j<c)
        {
               if(park[i][j].equals("G")){
                   park[i][j]="SG";
                   return true;
               }
        }                 
                    }
         break;
         case 'A': {
         
        if((i>-1&&i<r)&&(j>-1)&&j<c)
            {
                if(park[i][j].equals("W"))
                    return false;
                    
                
               if(park[i][j].equals("M")||park[i][j].equals("G")||park[i][j].equals("SG")){
                   //park[i][j]="SG";
                   if(park[i][j].equals("SG"))
                         park[i][j]="SSG";
                   if(park[i][j].equals("M"))
                         park[i][j]="MM";
                
                   if(park[i][j].equals("G"))
                         park[i][j]="US";
                   return true;
               }
        
            }      
  }
         break;
        }
        return false ;
    }      
}
