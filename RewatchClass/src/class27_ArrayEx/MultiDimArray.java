package class27_ArrayEx;

import java.util.Arrays;

public class MultiDimArray {

	public static void main(String[] args) {
		// Write 2D String array with 4*5 dimensions

		String[][] names = new String[4][5];
		{
//				{"", "", "", "", "Muhammad"},
//				{"Muhammad", "", "", "", ""},
//				{"", "", "", "Muhammad", ""},
//				{"", "Muhammad", "", "", ""},
//		};	 

			names[0][4] = "Name";
			names[1][0] = "Name";
			names[2][2] = "Name";
			names[3][1] = "Name";

//			System.out.println(Arrays.deepToString(names));
//			System.out.println(names[0].length);
//			System.out.println(names.length);
			
			for (int i = 0; i < names.length; i++) {
				for (int j = 0; j < names[i].length; j++) {
					System.out.print(names[i][j] + "\t");
				}
				System.out.println();
			}

		}
	}
}
