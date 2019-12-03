import java.util.Scanner;
import static java.lang.System.out;

class Republic{

public static void main(String...arg)
  {
        out.println("--------------Guest  On The Republic Day(2000-2018)---------------");
 out.print("Enter The Year  :");
 Scanner scan=new Scanner(System.in);
int year;
year=scan.nextInt();

switch(year)
 {
         case 2000: out.println("President :  Olusegun Obasanjo  \n\t Country :-Nigeria");break;
        case 2001:out.println("President :Abdelaziz Bouteflika  \n\t country :- Algeria");break;
        case 2002:out.println("President Cassam Uteem \n\t country:- Mauritius");break;
       case 2003:out.println("President Mohammed Khatami	\n\t Country :- Iran ");break;
       case 2004:out.println("President Luiz Inacio Lula da Silva	\n\t Country :- Brazil ");break;
       case 2005:out.println("King Jigme Singye Wangchuck	 \n\t Country :-Bhutan ");break;
      case 2006:out.println("King Abdullah bin Abdulaziz al-Saud	\n\t Country :- Saudi Arabia ");break;
       case 2007:out.println("President Vladimir Putin	\n\t Country :- Russia ");break;
       case 2008:out.println("President Nicolas Sarkozy \n\t Country :-France ");break;
       case 2009:out.println("President Nursultan Nazarbayev \n\t Country :- Kazakhstan");break;
       case 2010:out.println("President Lee Myung Bak \n\t Country :-South Korea ");break;
       case 2011:out.println("President Susilo Bambang Yudhoyono     \n\t Country :-Indonesia ");break;
       case 2012:out.println("Prime Minister Yingluck Shinawatra   \n\t Country :- Thailand");break;
       case 2013:out.println("King Jigme Khesar Namgyel Wangchuck   \n\t Country :- Bhutan ");break;
       case 2014:out.println("Prime Minister Shinzo Abe       \n\t Country :-Japan ");break;
       case 2015:out.println("President Barack Obama       \n\t Country :-United States ");break;
       case 2016:out.println("President François Hollande      \n\t Country :-France");break;
       case 2017:out.println("Crown Prince Sheikh Mohammed bin Zayed Al Nahyan	\n\t Country :- United Arab Emirates ");break;
       case 2018:out.println("Prime Minister Sultan Hassanal Bolkiah\n\t Country :-  Hun Sen ");break;


   default : out.println("InviledCase");
 }
  }

}

/*

2000	President Olusegun Obasanjo	 Nigeria
2001	President Abdelaziz Bouteflika	 Algeria
2002	President Cassam Uteem	\n\t Country :- Mauritius
2003	President Mohammed Khatami	\n\t Country :- Iran
2004	President Luiz Inacio Lula da Silva	\n\t Country :- Brazil

2005	King Jigme Singye Wangchuck	 \n\t Country :-Bhutan
2006	King Abdullah bin Abdulaziz al-Saud	\n\t Country :- Saudi Arabia


2007	President Vladimir Putin	\n\t Country :- Russia
2008	President Nicolas Sarkozy	 \n\t Country :-France
2009	President Nursultan Nazarbayev	\n\t Country :- Kazakhstan
2010	President Lee Myung Bak	 \n\t Country :-South Korea
2011	President Susilo Bambang Yudhoyono	 \n\t Country :-Indonesia
2012	Prime Minister Yingluck Shinawatra	\n\t Country :- Thailand
2013	King Jigme Khesar Namgyel Wangchuck	\n\t Country :- Bhutan
2014	Prime Minister Shinzo Abe	 \n\t Country :-Japan
2015	President Barack Obama	 \n\t Country :-United States
2016	President François Hollande	 \n\t Country :-France
2017	Crown Prince Sheikh Mohammed bin Zayed Al Nahyan	\n\t Country :- United Arab Emirates*/