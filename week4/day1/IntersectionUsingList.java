package week4.day1;

import java.util.Arrays;
import java.util.List;

public class IntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array1 = {3, 2, 11, 4, 6, 7};
        Integer[] array2 = {1, 2, 8, 4, 9, 7};
        
        List<Integer> list1 = Arrays.asList(array1);
        List<Integer> list2 = Arrays.asList(array2);
        
        for (int i = 0; i < list1.size(); i++) {
            Integer value = list1.get(i);
            if (list2.contains(value)) {
                System.out.println(value);
            }
        }
        
        
	}

}
