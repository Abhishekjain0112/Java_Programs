import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Company implements Serializable {
	
	int regNo;
	String cmpName;
	Long cmpNo;
	
	void set (int rno, String cName,long cNo)
	{
		  regNo=rno;
		 
		  cmpName=cName;
		
		 cmpNo=cNo;
	}
	
	void show(){
		
		 System.out.println(regNo+"     "+cmpName  +"    "+ cmpNo);
	}
	
	
	
}




class Oops {
	
	static public  void main(String...arg) throws Exception{
		
		Company cmp=new Company();
		cmp.set(121,"TechnoSoft Project",554555);
		
		FileOutputStream fos=new FileOutputStream("binary.txt");
		
		ObjectOutputStream os =new ObjectOutputStream(fos);
		
               os.writeObject(cmp);
			   os.close();
			   
FileInputStream fis=new FileInputStream("binary.txt");
ObjectInputStream ios=new ObjectInputStream(fis);

   Company cmp1=(Company)ios.readObject();
   //down casting 
   cmp1.show();

   }

}
		
	