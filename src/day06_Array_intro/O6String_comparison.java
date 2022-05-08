
package day06_Array_intro;

public class O6String_comparison 
{
	public static void main(String[] args) 
	{
		String[] languages= {"java","python","C","javascript","C#","SQL","HTML5"};
		for(String x:languages)
			System.out.println(x);
		System.out.println("\n");
		
		java.util.Arrays.sort(languages);
		
		System.out.println("\nSorted order : \n");
		for(String x:languages)
			System.out.println(x);
	}

}
