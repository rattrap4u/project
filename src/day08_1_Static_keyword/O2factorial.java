package day08_1_Static_keyword;

class Calculation
{
	void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is : "+fact);
	}
}
public class O2factorial 
{

	public static void main(String[] args) 
	{
		// here there is no reference (unreference object)
		new Calculation().fact(5);   // calling method with anonymous object.
	//  Calculation c1=new Calculation();   object is created & we have c1 as reference
	//	c1.fact(5);     
	}

}
