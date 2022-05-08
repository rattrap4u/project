//	-----Method Overloading-----
//	it is possible as long as multiple methods by the same name but different parameters.
//	if same parameters are there or different parameters(int,string) are there still method overloading is possible.


package day08_1_Static_keyword;
class Calculations
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
public class O3Method_overloading 
{

	public static void main(String[] args) 
	{
		Calculations s=new Calculations();
		s.sum(10,10,10);
		s.sum(20,20);
	}

}

// method overloading is possible until 
//number of arguments are different
//type of arguments are different
//order and type of arguments