
public class p0_1_0randomvalueoddoreven {

	public static void main(String[] args) 
	{
		int n=(int)(Math.random()*100);
		System.out.println("Generated number is "+n);
		if (n%2==0)
			System.out.println(n+" is Even");
		else
			System.out.println(n+ " is Odd");
	}

}
