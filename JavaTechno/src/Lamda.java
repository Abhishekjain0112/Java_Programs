import java.util.ArrayList;
import static java.lang.System.out;
class Lamda{
	static public void main(String...ar)
	{
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		list.add(666);
		list.add(777);
		list.add(888);
		list.add(999);
		list.add(222);
		
		list.forEach(data->System.out.println(data));
	}
	
	
}