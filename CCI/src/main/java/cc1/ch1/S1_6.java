package cc1.ch1;

import cc1.BaseCCI;

/*
 * Given an image represented by an NxN matrix, where each pixel in the image is
 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
 place?
 */

public class S1_6 extends BaseCCI
{

	public static void main(String[] args)
	{

	}

	/*
	 * Because we're rotating the matrix by 90 degrees, the easiest way to do
	 * this is to imple- ment the rotation in layers. We perform a circular
	 * rotation on each layer, moving the top edge to the right edge, the right
	 * edge to the bottom edge, the bottom edge to the left edge, and the left
	 * edge to the top edge.
	 * 
	 * How do we perform this four-way edge swap? One option is to copy the top
	 * edge to an array, and then move the left to the top, the bottom to the
	 * left, and so on. This requires 0(N) memory, which is actually
	 * unnecessary. A better way to do this is to implement the swap index by
	 * index. In this case, we do the following:
	 * 
	 * for i = 0 to n temp = top[i] top[i] = left[i] left[i] = bottom[i]
	 * bottom[i] = right[i] right[i] = temp
	 */

	public void rotate(int[][] matrix)
	{
		if (matrix == null || matrix[0] == null
				|| matrix[0].length != matrix.length)
			return;
		int layer = matrix.length / 2;
		for (int start = 0; start < layer; start++)
		{
			int end = matrix.length - 1 - layer;
			for (int i = start; i < end; i++)
			{
				int offset = i - start;
				int top = matrix[start][i];
				// left to top
				matrix[start][i] = matrix[end - offset][start];
				// bottom to left
				matrix[end - offset][start] = matrix[end][end - offset];
				// right -> bottom
				matrix[end][end - offset] = matrix[i][end];
				//
				matrix[i][end] = top;
			}
		}
	}
}
