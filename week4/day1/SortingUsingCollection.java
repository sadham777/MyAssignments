package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] companiesCollection = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		List<String> companiesList = new ArrayList<String>(Arrays.asList(companiesCollection));
		Collections.sort(companiesList);
		System.out.println(companiesList);
		Collections.sort(companiesList);

		// System.out.println(companiesList);
		// System.out.println("The Reverse Sorted List is :" +companiesList);

		for (int i = companiesList.size() - 1; i >= 0; i--) {
			System.out.print(companiesList.get(i));
			if (i != 0)
				System.out.print(", ");
		}

	}

}
