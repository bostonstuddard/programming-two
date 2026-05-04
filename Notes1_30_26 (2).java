package testspace;

public class Notes2_1_30_26 {

	public static void main(String[] args) {
		
		String text = "water";
		String reversetext = "";
		int i = text.length()-1;
		
		while(i >= 0) {
			reversetext += text.charAt(i);
			i--;
		}
		
		System.out.println(reversetext);
		
	}
	
}
