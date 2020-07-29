/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

/**
 *
 * @author Abhishek
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class String_Stack_Match{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        
		while(testCases>0){
			String line = in.nextLine();
			
           
           int str=0,end=0,len=line.length();
           int stag=0,etag=0;
           
           ArrayList<String> al=new ArrayList<String>();

            char chr[]=line.toCharArray();
            
               int count1=0,count2=0;
             
             for(int i=0;i<len;i++){
                  if(chr[i]=='<')
                  count1++;
                  if(chr[i]=='>')
                  count2++;
             }
              if(count1!=count2)
                System.out.println("None");
               else{ 

                for(int i=0;i<len;i++)
                {

                 if(chr[i]=='<' && chr[i+1]!='/'){
                  stag=i+1;
                  int j=i;
                   for(j=i;j<len;j++){
                        if(chr[j]=='>')
                         {
                            etag=j;
                            break;
                         }
                     }
                   
                   i=j;
                    str=etag+1;
                   al.add(line.substring(stag,etag));  
                 }

                 //login to fatch out the end tag string
                 if(chr[i]=='<' && chr[i+1]=='/'){                 
                   stag=i+2;
                   
                  int j=i;
                  
                   for(j=i+2;j<len;j++){
                        if(chr[j]=='>')
                         {
                            etag=j;
                            break;
                         }
                     }
                   
                   i=j;
                   //al.add(line.substring(stag,etag)); 

                   if(line.substring(stag,etag).equals(al.get(al.size()-1)))
                     {
                         al.remove(al.size()-1);
                     }else{System.out.println("None");}

                     end=stag-2;
                     if(al.size()==0)
                     {
                        for(int ii=str;ii<end;ii++){
                         if(chr[ii]=='<'){
                            str=i;
                            end=i;
                            break;
                            }
                         System.out.print(chr[ii]);  


                        }
                        System.out.println(); 
                        
                     }
                   
                       


                 }

                 
               

                }

               }

          	//Write your code here
			    
                 // System.out.println("  : "+al);
                   int k=0;
                    if(k==0){

                   //System.out.println(line.substring(str,end));
                    // System.out.println("  Start : " +str +"  End  : "+end);
                   
                        k++;
                     

                    }


			testCases--;
		}
	}
}



