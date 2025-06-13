package week3.day1;

public class ChangeOddIndexToUppercase {

    public static void main(String[] args) {
        String test = "changeme";
        char[] testArray = test.toCharArray(); // Convert to char array

        // Loop from start to end
        for (int i = 0; i < testArray.length; i++) {
            if (i % 2 != 0) { // If index is odd
                
                testArray[i] = Character.toUpperCase(testArray[i]);
            }

            System.out.print(testArray[i]);
        }
    }
}