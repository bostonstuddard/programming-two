package testspace;

public class Notes1_1_30_26 {
	
	public static void main(String[] args) {
		
		String text = "water";
		String reversetext = "";
		
		for (int i = text.length()-1; i >= 0; i--) {
			
			reversetext += text.charAt(i);
			
		}
		
		System.out.println(reversetext);
		
	}
	
}