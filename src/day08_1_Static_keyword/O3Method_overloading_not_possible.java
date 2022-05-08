// not possible by changing the return type of the method becuase 

package day08_1_Static_keyword;

class Cacl
{
	int sum(int a,int b)
	{
		System.out.println(a+b);
	}
	double sum(int a,int b)
	{
		System.out.println(a+b);
	}
}
public class O3Method_overloading_not_possible 
{

	public static void main(String[] args) 
	{
		Calc c=new Calc();
		int result=c.sum(20,20);   // compile time error.
	}

}


//method overloading is possible until 
//number of arguments are different
//type of arguments are different
//order and type of arguments