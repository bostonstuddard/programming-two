package testspace;

public class Notes1_02_04_26 {

	public static void main(String[] args) {

		String[] easyMoney = { "123", "456", "789" };
		String tempString;
		String tempChar;
		int finalNum = 0;

		for (int i = 0; i < easyMoney.length; i++) {

			tempString = easyMoney[i];

			for (int in = 0; in < tempString.length(); in++) {

				tempChar = Character.toString(tempString.charAt(in));

				if (Integer.parseInt(tempChar) % 2 == 0) {

					finalNum += Integer.parseInt(tempChar);

				}

			}

		}

		System.out.println(finalNum);

	}

}
