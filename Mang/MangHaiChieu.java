package Mang;

public class MangHaiChieu {
	public static void main(String[] args) {
		int[][] matrix= {
				{1 , 2 , 3},
				{4 , 5 , 6},
				{7 , 8 , 9}
		};
		
		System.out.println(matrix[0][1]);	// [hang][cot]
		
		//in ra mang
		for(int i = 0; i < matrix.length ; i ++) {
			for(int j = 0; j < matrix.length; j ++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
		
		
		boolean[][] myArray = new boolean[5][9];
		myArray[0][0] = true;
		myArray[5][9] = false;
		
		System.out.println(myArray[4][8]);
		
		
		
	}
}
