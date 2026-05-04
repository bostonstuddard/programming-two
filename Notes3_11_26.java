package testspace;

import java.io.*;

public class Notes3_11_26 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/bstudd100/Downloads/data.txt"));
		String line;
		String[] tokens = new String[3];
		
		int rows = 0;
        int columns = 0;
        int lineCount = 0;
        String symbol = "";
        
        while ((line = br.readLine()) != null) {
            line = line.trim();
            
            if (lineCount == 0) {
                rows = Integer.parseInt(line);
            } else if (lineCount == 1) {
                columns = Integer.parseInt(line);
            } else if (lineCount == 2) {
                symbol = line;
            }
            
            lineCount++;
		}
		
		for(int i = 0; i < rows; i++) {
			System.out.println();
			for(int j = 0; j < columns; j++) {
				System.out.print(symbol);
			}
		}
		
		br.close();
	}

}
