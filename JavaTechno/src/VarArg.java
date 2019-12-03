import java.util.Scanner;
import static java.lang.System.out;

 class VarArgClass {

Scanner scan=new Scanner(System.in);

public static void set(int choice,int...ar)
      {
            if(choice==1)
{int even=0,odd=0;
for(int data : ar)
{
if(data%2==0) even++;
else odd++;
}
out.println("Total number of even ="+even+"\tOdd="+odd);
}

else if(choice==2)
   {
   int key=0,count=0;
out.println("Enter the key : ");
Scanner sc=new Scanner(System.in);
key=sc.nextInt();
for(int data: ar)
{
if(data==key)
{   out.println("Element Found");  count=1; break;  }
}
if(count !=1) 
   out.println("The element not Found");
 }

else if(choice==3)
 {
out.println("Sort the elements in accending order");
java.util.Arrays.sort(ar);
      for(int data : ar)
{out.println(data);}


out.println("Sort the elements in decending order");
for(int i=ar.length-1; i>=0;i--)
{
out.println(ar[i]);
}

}
else if(choice==4)
{
   out.println("The Even And odd array");

java.util.Arrays.sort(ar);
out.println("Even Elements ");
for(int data :ar)
{
if(data%2==0)
  out.println(data);
}

out.println("odd number");
for(int data :ar)
{
if(data%2==1)
  out.println(data);
}

}


else if(choice==5)
{
int sum=0;
for(int data :ar)
{

sum=data+sum;
} out.println("the sum ="+sum);
}


    else if(choice==6){

    int count;
       for(int data:ar)      {
count=0;         for(int i=1;i<=data;i++){
           if(data%i==0)
          count++;                   }
if(count==2) 
         {
out.println("\t"+data);
         }
//          out.println("count="+count);    
                                    }

                              }
 
      }

        }

 class VarArg{

public static void main(String...arg){

out.println("----------Choose the opetation you want to perform ------------------");
out.println("1. To find the no. of even and odd");
out.println("2.To search any element");
out.println("3. To sort Elements ");
out.println("4. To Sort Even and odd saparately ");
out.println("5. To Find the Addition of the numbers");
out.println("6. Total number of prime Numbers");

Scanner scan= new Scanner(System.in);
int choice =scan.nextInt();
       
VarArgClass.set(choice,5,10,1,78,9,8,7,6,2,3,100,15,44,77,15);
}

}