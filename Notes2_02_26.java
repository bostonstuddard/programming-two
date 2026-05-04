package testspace;

public class Notes1_02_02_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "18,20,40,80,120,60,10";
		String subtext;
		int position;
		int totalInt = 0;
		
		while (text.length() > 0) {
			
			if (text.indexOf(",") == -1) {
				subtext = text.substring(0, text.length());
				totalInt += Integer.parseInt(subtext);
				text = "";
				System.out.println(subtext);
			}else {
				position = text.indexOf(",");
				subtext = text.substring(0, position);
				text = text.substring(position+1, text.length());
				totalInt += Integer.parseInt(subtext);
				System.out.println(subtext);
				
			}	
		}
		
		System.out.println(totalInt);
		
	}

}
