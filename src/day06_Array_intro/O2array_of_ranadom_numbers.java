package day06_Array_intro;

public class O2array_of_ranadom_numbers {

	public static void main(String[] args) 
	{
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100); //random number will be generated double value from 0 to 9
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The array is :"+arr[i]);
		}
	}

}
