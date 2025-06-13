package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class FindDups {

	public static void main(String[] args) {
		int[] num = { 2, 5, 7, 7, 9, 2, 3, 4, 5, 8, 8, };

		// sorting in ascending order
		Arrays.sort(num);

		// for loop for checking the duplicate values
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == num[i + 1]) {
				System.out.println(num[i]);
			}

		}
	}

}
