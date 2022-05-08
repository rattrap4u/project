package day06_Concepts_of_methods_in_java;

public class O1_methods_intro 
{
	public static int sum(int x,int y)  //method named sum to print the summation between two numbers
	{
		int sum=0;
		for(int i=x;i<=y;i++)
			sum=sum+i;
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		System.out.println(sum(1,10));  //method call (main is calling)
		System.out.println(sum(100,150));
		
		int res1=sum(1000,1500);
		System.out.println(res1);
		
		int res2=O1_methods_intro.sum(12345, 54321);
		System.out.println(res2);
		
	}
}










//package day6_Concepts_of_methods_in_java;
//
//public class O1_methods_intro 
//{
//	public static void sum(int x,int y)  //method named sum to print the summation between two numbers
//	{
//		int sum=0;
//		for(int i=x;i<=y;i++)
//			sum=sum+i;
//		System.out.println(sum);
//	}
//	public static void main(String[] args)
//	{
//		sum(1,10);  //method call (main is calling)
//		sum(100,150);
//		sum(1000,1500);
//		sum(12345,54321);
//		O1_methods_intro.sum(1, 10);   //  alternate way to call a method.
//	}
//}








	
//	
//	
//	public static void main(String[] args)
//	{
//		int sum1=0;
//		for(int i=1;i<=10;i++)
//			sum1=sum1+i;
//		System.out.println(sum1);
//		
//		int sum2=0;
//		for(int i=100;i<=150;i++)
//			sum2=sum2+i;
//		System.out.println(sum2);
//		
//		int sum3=0;
//		for(int i=200;i<=500;i++)
//			sum3=sum3+i;
//		System.out.println(sum3);
//	}

