package week3.day1;

import java.util.Arrays;

import org.checkerframework.checker.units.qual.Length;

public class MissingElementsOnArray {

	public static void main(String[] args) {
    int[] elements = {1,4,3,2,8, 6, 7};
     
    Arrays.sort(elements);
    //System.out.println(elements[1]);
    int lengthOfElements = elements.length;
    System.out.println("Length of Array is " +lengthOfElements);
    
    for (int i = 0; i < elements.length-1; i++) {
    	if (elements[i+1]!=elements[i]+1) {
			System.out.println("Missing Element "  + (elements[i]+1));
			break;
		}
		
	}
    
	}
	

}
