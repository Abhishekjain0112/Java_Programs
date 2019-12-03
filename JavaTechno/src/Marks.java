import java.util.Scanner;
class Marks{
	public static void main(String args[])
	{
		int rollno,year,semister,maxMarks,minMarks;
		float obtainMarks;
		String studentName,collegeName,course,branch;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------Student Information System---------------");
		
		System.out.print("Enter The RollNumber =");
		rollno=sc.nextInt();

		System.out.print("Enter Student Name =");
		studentName=sc.nextLine();
		studentName=sc.nextLine();
				System.out.print("Enter College Name=");
		collegeName=sc.nextLine();
      // collegeName=sc.nextLine();

		System.out.print("Enter Course Name =");
		course=sc.nextLine();

		System.out.print("Enter Branch =");
		branch=sc.nextLine();
			
	  System.out.print("Enter semister Name =");
         semister=sc.nextInt();
      System.out.print("Enter Max Marks =");
maxMarks=sc.nextInt();

System.out.print("Enter Minmum Marks =");	  
			minMarks=sc.nextInt();
		float totalMarks=0,percentage=0;
		switch(course)
		{
			case "be" :{
				System.out.println("Enter The marks of :\n ADA : \n CSO : \n TOC : ");
				float ada,cso,toc;
				ada=sc.nextFloat();
				cso=sc.nextFloat();
				toc=sc.nextFloat();
		0		totalMarks=ada+cso+toc;
			percentage=(totalMarks*100)/300;	
				
			} break;
			case "BE" :{
				System.out.println("Enter The marks of :\n ADA : \n CSO : \n TOC : ");
				float ada,cso,toc;
				ada=sc.nextFloat();
				cso=sc.nextFloat();
				toc=sc.nextFloat();
				totalMarks=ada+cso+toc;
			percentage=(totalMarks*100)/300;	
				
			}break;
			
		case "bcom" :{
				System.out.println("Enter The marks of :\n phy : \n chem : \n maths : ");
				float phy,chem,maths;
				phy=sc.nextFloat();
				chem=sc.nextFloat();
				maths=sc.nextFloat();
				totalMarks=maths+chem+phy;
			percentage=(totalMarks*100)/300;	
				
			}		break;
			default :{
				System.out.println("Branch invalid!!!!!!!!!!!!");
				
			}
			
		}
	
	char grade;
	 if(percentage>80)
		 grade='A';
	
	else if(percentage<80 && percentage>70)
		grade='B';
	
	else if(percentage<70&&percentage>60)
		grade='C';
	else 
	{grade='F';}

	System.out.println("\n \t\tYour Final percentage is :"+percentage);

	System.out.println("\n \t\tYour FinalGrade is :"+grade);
	
	switch(grade)
	{
		case 'A' :{
			System.out.println("Company Name = Google \n TotalBranch=100 \nAddress=Usa \nCity=Seattle \nPlatForm = Java,python \n Total Number of Employe =80000");
			System.out.println("Company Name = FaceBook \n TotalBranch=100 \nAddress=Usa \nCity=losAngalus \nPlatForm = Java \n Total Number of Employe=60000");
		System.out.println("Company Name = Microsoft \n TotalBranch=120 \nAddress=Usa \nCity=losAngalus \nPlatForm = .net,pythone \n TotalNumber of Employe=90000");
		
		}break;
		
	
	    case 'B' :{
		System.out.println("Company Name = Einoeye \n TotalBranch=5 \nAddress=India \nCity=indore \nPlatForm = Java \n TotalNumber of Employes=600");
		
	}break;
	
	case 'C' :{
		System.out.println("Company Name = YashTechnology \n TotalBranch=5 \nAddress=India \nCity=indore \nPlatForm = Java \n TotalNumber of Employes=600");
		
	}break;
	
  default :
  {
	  System.out.println("You r not valid !!!!!");
  }
	
	}
	}
	
	
}