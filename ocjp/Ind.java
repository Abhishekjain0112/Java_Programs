public class Ind{
	
	private int i;
	
	void dis(){
		while(i<=5){
			for(i=1;i<=5;)
			{
				System.out.println(i+"  ");
                     i++;
				}
			i++;
		}
		

	}

	public static void main(String...arg){
		
			new Ind().dis();
		
	}
	
	}