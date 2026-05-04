package workspace;

import java.util.Scanner;

/********************************
Name: Boston Studdard
Problem Set: PS1
Due Date: March 9th, 2026
********************************/

public class PS1Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		int[][] Matrix1 = {
				{1, 2, 1},
				{3, 4, 5},
				{2, 1, 2},
		};
		int[][] Matrix2 = {
				{1, 2, 3, 4},
				{2, 3, 4, 5},
				{6, 5, 4, 3},
				{3, 2, 1, 0},
		};
		
		int[][] Matrix3 = new int[Matrix2.length][Matrix2.length];
		
		int Sum = 0;
		
		for(int i = 0; i < Matrix2.length; i++) {
		    for(int j = 0; j < Matrix2[0].length; j++) {
		    	
		    	// 
		    	
		    	Sum = 0;
		        Sum += matrixMath(i, j, Matrix2, Matrix1);
		        Matrix3[i][j] = Sum;
		        
		    }
		}
		
		for(int i = 0; i < Matrix3.length; i++) {
			System.out.println();
			for(int j = 0; j < Matrix3[0].length; j++) {
				System.out.print(Matrix3[i][j] + ", ");
			}
		}
		
		key.close();
		
	}
	
	public static int matrixMath(int i, int j, int[][] A, int[][] B) {

	    int n = A.length;
	    int sum = 0;
	    int y;
	    int z;

	    for(int s = -1; s <= 1; s++) {
	        for(int p = -1; p <= 1; p++) {

	            y = i + s;
	            z = j + p;

	            if(y >= 0 && y < n && z >= 0 && z < n) {
	                sum += A[y][z] * B[s+1][p+1];
	            }

	        }
	    }

	    return sum;
	}
	
}
