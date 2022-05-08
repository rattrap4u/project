package day02;

public class Dp0_0_ternary_conditional_operator {

	public static void main(String[] args) 
	{
		int a=(int)(Math.random()*100); // generating random number 0-99
		int b=(int)(Math.random()*100); // generating random number 0-99
		System.out.println("Numbers generated are: "+a+" "+b);
		// use conditional operator to find the biggest
		int big=a>b?a:b;
		int small=a<b?a:b;
		System.out.println("biggest number is: "+big);
		System.out.println("smallest number is: "+small);
	}

}
