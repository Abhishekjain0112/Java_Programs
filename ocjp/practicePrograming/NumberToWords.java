/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicePrograming;

/**
 *
 * @author Abhishek
 */
public class NumberToWords {
    
    static String ones[]={"","One","Two","Three","Fore","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twevle"
     ,"Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen" 
    };
    
    static String tens[]={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    
    
    public static void main(String[] args) {
        
       // System.out.println("number : "+convert(69));
        
        //System.out.println("number : "+convert(15));
        
        //System.out.println("number : "+convert(78));      
        System.out.println("number 178: "+convert(178));
     System.out.println("number 618: "+convert(618));
     System.out.println("number 787: "+convert(787));
    System.out.println("number 111: "+convert(111)); 
    System.out.println("number 108: "+convert(108));
    System.out.println("number 5895: "+convert(5895));
    System.out.println("number 85258: "+convert(85258));
    System.out.println("number 7895: "+convert(7895));
      System.out.println("number 4000: "+convert(4000));
      System.out.println("number 7052: "+convert(7052));
    System.out.println("number 7500: "+convert(7500));
     System.out.println("number 77500: "+convert(77500));
     System.out.println("number 110012: "+convert(11012));
    
    
    }
        
    
    public static String convert(int num){
    int n,d=0;
    String s="";
  
    if(num>99&&num<1000)
    d=2;
    else if(num<100)
    d=1;
    else if(num>999 && num<100000)
    d=3;
            
  switch(d){
    // if(num>99&&num<1000)
       case 3:  {    s=s+returnTens(num/1000)+" Thousand ";//+returnTens(num%100);
               //num/=100;
           //System.out.println("case 3");
                 num=num%1000;
               } 
      case 2:  {   
              if(num/100==0){}
              else{
          s=s+returnTens(num/100)+" Hundred ";//+returnTens(num%100);
               //num/=100;
              }
      }
    //else if(num<100)
      case 1: { s=s+returnTens(num%100);}
  }
    return s;
    }
    public static String returnTens(int num){
       int n=num,dig;
        String s="";
        if(num>100)n%=100;
          if(n<20){
           s=ones[n];
          return s;
          }else{
            s=ones[n%10];
            n/=10;
            s=tens[n%10]+" "+s;
         return s;
          }
   }
 
}
