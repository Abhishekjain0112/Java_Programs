import static java.lang.System.out;

class Asser {
	
	int var;
	void set(int var){
		this.var=var;
		show();
	}
	void show(){
		var=var*100;
		assert(var==1000):"Bug Found!!!";
		out.println(var);
		
	}
}
class Assertion {
	
	public static void main(String...ar){
		
		Asser as=new Asser();
         as.set(1);
		
	}
}