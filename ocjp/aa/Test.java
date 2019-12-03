class A{
	
	public String[] main=new String[2];
	A(String[] main)
	{
		
		for(int ii=0;ii<main.length;ii++)
		{
			this.main[ii]=main[ii]+5;
		}
		
	}
	public void main(){
			
			System.out.println(main[0] + main[1]);
			
		}
		
		
		
	}
	
	
	


public class Test{
	
    
    public static void main(String args[]) {
        A main=new A(args);
		main.main();

    }   
	
	
}








