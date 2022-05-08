package day06_Array_intro;

public class O3array 
{
	public static void main(String[] args) 
	{
		int[] a=new int [10];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100);
		}
		int sum=0;
		for(int x:a)
		{
			System.out.println(x);
			sum+=x;
		}
		// sum of all the array elements
		System.out.println("Sum : "+sum);
	}
	
}
