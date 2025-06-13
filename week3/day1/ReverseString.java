package week3.day1;

public class ReverseString {

	public static void main(String[] args) {

		// given input string
		String companyName = "TestLeaf";
		// To find length
		int lengthOfString = companyName.length();
		System.out.println("Lenght = " + lengthOfString);

		// converting string into array
		char[] stringArray = companyName.toCharArray();

		// For loop to reverse
		for (int i = stringArray.length - 1; i >= 0; i--) {
			System.out.print(stringArray[i]);
		}

	}

}
