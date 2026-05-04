package testspace;

public class TwoDimLogic {

	public static void main(String[] args) {

		//int[][] values = new int[3][5];
		
		int[][] values = {{ 1, 2, 3, 4, 5 },
						{ 6, 7, 4, 3, 2 },
						{ 1, 1, 1, 2, 2 }
		};
		
		//int oldNum = 0;
		
		//System.out.println(values[1][0]);
		
		for (int i = 0; i < values.length; i++) {
			System.out.println();
			for (int j = 0; j < values[i].length; j++) {
				
				if (values[i][j] % 2 == 0) {

					values[i][j] = 0;
					System.out.print(values[i][j]);

				} else {

					System.out.print(values[i][j]);

				}
				if (j+1 != values[i].length) {
					System.out.print(",");
				}
			}
			
		}
		
		System.out.println();
		
		int [][] y = {{1,2,3},
				{6,7,4},
				{1,1,1}
				};
		
		String format = "";
		
		for (int i = 0; i*values.length < values.length; i++) {
			
			if(i % 3 == 0) {
				System.out.println(y[i/3][i/3]);
			}
				
			else {
				System.out.println("0");
				
			}
			
		}

	}

}
