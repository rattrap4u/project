// to find the maximum and minimum values of an array
package day06_Array_intro;

public class O4min_max_in_array 
{
	public static void main(String[] args) 
	{
		int[] a=new int[10];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100);
		}
		for(int x:a)
			System.out.println(x);
		
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		
		System.out.println("The minimum value is :"+min);
		System.out.println("The maximum value is :"+max);
	}

}
