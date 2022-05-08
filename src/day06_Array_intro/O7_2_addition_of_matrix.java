package day06_Array_intro;

public class O7_2_addition_of_matrix {

	public static void main(String[] args) 
	{
		int[][] matrix1=new int[3][3];
		int[][] matrix2=new int[3][3];
		int[][] matrix3=new int[3][3];
		//reading values to the array using random method
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix1[i][j]=1+(int)(Math.random()*10);  // 1+ is mentioned to avoid the value zero
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix2[i][j]=1+(int)(Math.random()*10);  // 1+ is mentioned to avoid the value zero
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix3[i][j]=1+(int)(Math.random()*10);  // 1+ is mentioned to avoid the value zero
			}
		}
		// printing array elements
		System.out.println("The value of Matrix1 is : \n");
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				
				System.out.println(matrix1[i][j]+" ");    //
			}
		}
		System.out.println("\n\nThe value of Matrix2 is : \n");
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				System.out.println(matrix2[i][j]+" ");    //
			}
		}
		
		// addition of two matrix
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("The addition of matrix1 and matrix2 is : ");
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				System.out.println(matrix3[i][j]+" ");    //
			}
		}
	}

}