package testspace;

public class Notes2_02_02_26 {

	public static void main(String[] args) {

		String text = "2,#,3,1,4,6,7,1,3,1,8,2";
		int totalNum = 0;
		
		for (int i = 0; i < text.length(); i++) {
			
			
			
			if (text.charAt(i) == '1' || text.charAt(i) == '2' || text.charAt(i) == '3'|| text.charAt(i) == '4'|| text.charAt(i) == '5'|| text.charAt(i) == '6'|| text.charAt(i) == '7'|| text.charAt(i) == '8'|| text.charAt(i) == '9'|| text.charAt(i) == '0') {
				
				totalNum += Integer.parseInt(Character.toString(text.charAt(i)));
			}
			
		}
		
		System.out.println(totalNum);
		

	}

}
