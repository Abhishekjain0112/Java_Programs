class String2{

public static void main (String[] args){
   
   String str[]={"Pune","Mumbai","Devas","Agra","Indore"},s1;
     int i,n,j;
    for(i=0;i<5;i++)
    {
      System.out.println("\n\t String["+i +"]=" +str[i]);
    
    }

   for(j=0;j<4;j++)
    {
  
    for(i=0;i<4;i++)
      {

          n=str[i].compareTo(str[i+1]);
         if(n>0){
           s1=str[i+1];
           str[i+1]=str[i];
            str[i]=s1;
            }
          } 
        }
      System.out.println("\n The New Sorted String is ->");
for(i=0;i<5;i++)
{
 System.out.println("\n\t String["+i +"]=" +str[i]);
}

}
}