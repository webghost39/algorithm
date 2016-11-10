package cc1.ch1;

import cc1.BaseCCI;
//Write an algorithm such that if an element in an MxN matrix is 0, its entire row
//and column are set to 0.
public class S1_7 extends BaseCCI
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public static void zeroMatrix(int[][] matrix)
	{
		if (matrix == null)
		{
			return;
		}
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				if (matrix[i][j] == 0)
				{
					row[i] = true;
					column[j] = true;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				if (row[i] || column[j])
				{
					matrix[i][j] = 0;
				}
			}
		}
	}

}
