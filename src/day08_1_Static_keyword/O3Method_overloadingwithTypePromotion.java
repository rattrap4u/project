package day08_1_Static_keyword;

class Calcu
{
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
public class O3Method_overloadingwithTypePromotion 
{

	public static void main(String[] args) 
	{
		Calcu l=new Calcu();
		l.sum(20,20);   // now second int literal will be promoted to long
		l.sum(20, 20,20);
	}

}
