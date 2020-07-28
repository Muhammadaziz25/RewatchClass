package class28_Methods;

import java.util.Arrays;

public class MultiDArray {

	public static void main(String[] args) {

		int[][] array = new int[2][2];

		array[0][0] = 5;
		array[0][1] = 1;
		array[1][0] = 25;
		array[1][1] = 10;
		System.out.println(Arrays.deepToString(array));

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			int[] array1 = array[i];
			for (int j = 0; j < array1.length; j++) {
				int num = array1[j];
				sum += num;
				System.out.print(num + ", ");
			}

		}
		System.out.println();
		System.out.println(sum);
		
		//////////////////////////////////////////////////////////////////////////
		
		int [][][] array3D = new int [2][3][4];
		
		array3D [0][0][0] = 1;
		array3D [0][0][1] = 4;
		array3D [0][0][2] = 7;
		array3D [0][0][3] = 2;
		
		array3D [0][1][0] = 1;
		array3D [0][1][1] = 1;
		array3D [0][1][2] = 1;
		array3D [0][1][3] = 1;
		
		array3D [0][2][0] = 1;
		array3D [0][2][1] = 1;
		array3D [0][2][2] = 1;
		array3D [0][2][3] = 1;
		
		array3D [1][0][0] = 1;
		array3D [1][0][1] = 4;
		array3D [1][0][2] = 7;
		array3D [1][0][3] = 2;
		
		array3D [1][1][0] = 1;
		array3D [1][1][1] = 1;
		array3D [1][1][2] = 1;
		array3D [1][1][3] = 1;
		
		array3D [1][2][0] = 1;
		array3D [1][2][1] = 1;
		array3D [1][2][2] = 1;
		array3D [1][2][3] = 1;
		
//		System.out.println(Arrays.deepToString(array3D));
		for (int i = 0; i < array3D.length; i++) {
			int [][] array1 = array3D[i];
			for (int j = 0; j < array1.length; j++) {
				int[] array2 = array1[j];
				for (int k = 0; k < array2.length; k++) {
					int nums = array2[k];
					System.out.print(nums + "\t");
					
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
