package week1.day2;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,  b=1; //default should be start with 0,1
		for (int i = 0; i <8; i++) {
			System.out.print(a+ ",");
			int c= a+b;
			a=b;
			b=c; 
			
			
			
		}

		
	}

}
