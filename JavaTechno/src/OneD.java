import java.util.Scanner;
import static java.lang.System.out;

class OneD{
	
	public static void main(String...args)
	{
		
		out.println("Enter the Size of array");
            Scanner sc=new Scanner(System.in);		
int size=sc.nextInt();	
	int ar[]=new int[size];
		
		out.println("Enter the Elements in the Array");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		 int count=0;
		out.println("For Searching Enter Key----:");
		int key=sc.nextInt();

		for(int i=0;i<size;i++)
		{
			if(ar[i]==key){
				out.println("Element is Found");
			    count=1;
			}
			
		}
				if(count!=1)
		out.println("Element not foud");
	int temp,j=0 ;	
for(int i=1;i<size;i++)
{
	temp=ar[i];
	   j=i-1;
	   while(j>=0&& ar[j]>temp)
	   {
		   ar[j+1]=ar[j];
		   j--;
		   
	   }
	   
	   ar[j+1]=temp;
}	

	
	//	java.util.Arrays.sort(ar);
  		

		out.println("Sorted array is");
			for(int i=0;i<size;i++)
		{
out.println(ar[i]);
			
		}
	
	
	
	}
}