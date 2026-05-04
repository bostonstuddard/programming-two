package testspace;
import java.util.Scanner;

public class Notes3_03_04_46 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int[][] A = {
				{3,5,2,7},
				{4,1,3,8},
				{6,3,8,2},
				{9,6,1,5}
		};
		
		int[][] B = {
				{1,2,1},
				{2,1,2},
				{1,1,2}
		};
		
		
		int[][] C = new int[A.length][A[0].length];
		
		int inputOne = -1;
		int inputTwo = -1;
		
		while (inputOne == -1 || inputTwo == -1) {
			System.out.println("Please choose your first square! (1-4)");
			inputOne = key.nextInt()-1;
			if(inputOne < 0 || inputOne > 3){
				inputOne = -1;
				System.out.println("You picked an unusable value.");
			}else {
				System.out.println("Please choose your second square! (1-4)");
				inputTwo = key.nextInt()-1;
				if(inputTwo < 0 || inputTwo > 3) {
					inputTwo = -1;
					System.out.println("You picked an unusable value.");
				}else {
					System.out.println("You choose:");
					System.out.println("(" + (inputOne) + ", " + (inputTwo) + ")");
					System.out.println("That is: " + A[inputOne][inputTwo]);
				}
			
				
			}
			
		}
		
		for(int i = 0; i < A.length; i++) {
			System.out.println();
			for(int j = 0; j < A[0].length; j++) {
				
				if(j == A[0].length-1) {
					System.out.print(A[i][j]);
				}else {
					System.out.print(A[i][j] + ", ");
				}
				
			}
		}
		
		int sum;
		int boundOne;
		int boundTwo;
		
		System.out.println();
		System.out.println("Below is an attempt to calculate your table contents!");
		
		for(int i = 0; i < A.length; i++) {
			sum = 0;
			System.out.println();
			for(int j = 0; j < A[0].length; j++) {
				
				boundOne = i;
				boundTwo = j;
				
				if((boundOne-1 < 0 || boundTwo-1 < 0) || (boundOne+1 >= A.length || boundTwo+1 >= A[0].length)) {
					System.out.print("0, ");
				}else {
					System.out.print(A[boundOne][boundTwo] + ", ");
				}
				
						
			}
		}
		
		C[0][0] = A[0][0];
		
		
		
		
		key.close();

	}

}
