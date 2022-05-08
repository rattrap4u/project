package day8_1_Static_keyword;

public class O1StaticDemo 
{

	int count;  // default value is 0
	
	public O1StaticDemo() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		StaticDemo d1=new StaticDemo();
		StaticDemo d2=new StaticDemo();
		StaticDemo d3=new StaticDemo();
		
	}// output will be 1 1 1

}



package day08_1_Static_keyword;

public class O1StaticDemo 
{

	int count;  // default value is 0
	
	public O1StaticDemo() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		StaticDemo d1=new StaticDemo();
		StaticDemo d2=new StaticDemo();
		StaticDemo d3=new StaticDemo();
		
	}// output will be 1 2 3

}