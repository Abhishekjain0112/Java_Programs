import java.util.*;
public class Student{
    int rolno;
    String name;
    double per;

    public int getRolno() {
        return rolno;
    }

    public void setRolno(int rolno) {
        this.rolno = rolno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    

 
    public static void main(String[] args)
 {
   int i,r;
    String n;
    double p;
     System.out.println("class Test Run");

       List<Student>mylist=new ArrayList<Student>();
          Student s=new Student();
      
  Scanner scan=new Scanner(System.in);

for(i=0;i<2;i++)
{
     //Student s=new Student();
     
        System.out.print("\nEnter Name=");
   n=scan.next();
        System.out.print("\nEnter Rollnumber =");
   r=scan.nextInt();
   
        System.out.print("\nEnter Percentage=");
   p=scan.nextDouble();

s.setName(n);
s.setRolno(r);
s.setPer(p);     
mylist.add(s);
} 
  for(Student S : mylist){

System.out.print(s.getName()); 
System.out.print(" "+ s.getRolno());
System.out.println(" " + s.getPer());
         } 
System.out.println(mylist);
              
        
        }
}