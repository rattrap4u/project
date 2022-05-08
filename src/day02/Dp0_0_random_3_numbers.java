package day02;

public class Dp0_0_random_3_numbers {

	public static void main(String[] args) 
	{
		int a=(int)(Math.random()*100);
		int b=(int)(Math.random()*100);
		int c=(int)(Math.random()*100);
		
		System.out.println();
		// use conditional operator to find the biggest
		
		System.out.println("The random number generated are :" +a+" "+b+" "+c);
		int big=(a>b&&a>c)?a:(b>c?b:c);
		
		int small=(a<b&&a<c)?a:(b<c?b:c);
		
		System.out.println("Biggest :"+big+"\nSmallest :"+small);	
	}

}
