package day07_0_Object_oriented_programing_constructor;

public class TestStudent 
{

	public static void main(String[] args) 
	{
		Students s1=new Students();
		s1.disp();
		s1.findAvg();
//		System.out.println(s1.rollno);  //compile time error as rollno is private in class Students
		
		Students s2=new Students();
		s2.disp();
		s2.findAvg();
		
		Book b1=new Book();
		b1.getBook();
	}

}
