package day07_0_Object_oriented_programing_constructor;

public class TestStudentArray 
{

	//  Starting point of application
		public static void main(String[] args) 
		{
			// an array of Student objects
			Students[] s=new Students[5];  // created an array of 5 students
			for(int i=0;i<s.length;i++)
			{
				s[i]=new Students();   // constructor - 5 times
				s[i].disp();   // to display the data as output
				s[i].findAvg();
				
			}
		}

}
