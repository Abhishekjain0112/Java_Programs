
import java.util.*;







class D{
	
	 public static void main(String[] args)
	{
	
		List<A> s=new ArrayList<A>();
		
		s.add(new A());
		s.add(new B());
		s.add(new C());
		
		for(A a : s)
			System.out.println(a.dostuff("java"));
		
	}
	
	
}



class A{
	
	public String dostuff(String msg){
		
		return msg;
		
	}

	
}


class B extends A{
	
	public String dostuff(String msg){
		
		return msg.replace('a','e');
	
	}
	
}

class C extends B{
	public String dostuff(String msg){
		
		return msg.substring(2);
	
	}
	
	
}