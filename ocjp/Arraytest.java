import java.util.*;

class A{
	
	public String dostuff(String msg){
		
		return msg;
		
	}

	
}


class B{
	
	public String dostuff(String msg){
		
		return msg.replace('a','e');
	
	}
	
}

class C{
	public String dostuff(String msg){
		
		return msg.substring(2);
	
	}
	
class D{
	
	public static void main(String...arg)
	{
		
		List<A> s=new ArrayList<A>();
		
		s.add(new A);
		s.add(new B);
		s.add(new C);
		
		for(A a : s)
			System.out.println(t.dostuff("java"));
		
	}
	
	
}	
	
	
	
}