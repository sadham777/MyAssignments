package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input= 12321;
		int result=input;
		int i=0;
		for ( i = 0; input > 0; input=input/10) {
			
			 int rem= input%10;
			//1
			 i=i*10+rem; //1 2 3 2 1 
				 
			
		}
		
	if (result==i) {
		System.out.println(result+ " " +"number is a Palindrome");
	} else {
        System.out.println(result+ " " +"number is not Palindrome");
	}
	}

}
