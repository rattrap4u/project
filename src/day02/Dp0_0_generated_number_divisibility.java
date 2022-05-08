package day02;

public class Dp0_0_generated_number_divisibility {

	public static void main(String[] args) 
	{
		int n=(int)(Math.random()*100); // random number 0-99
		System.out.println("The random generated number is "+n);
		if (n%2==0 && n%3==0)
			System.out.println(n+" is divisible by 2 and 3");
		
		if (n%2==0 || n%3==0)
			System.out.println(n+" is divisible by 2 or 3");
		
	}

}
