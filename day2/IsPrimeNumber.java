package week1.day2;

public class IsPrimeNumber {
    public static void main(String[] args) {

        int num = 10008;
        boolean isPrime=false;
        //O, 1 are not prime numbers by default
        for (int i = 2; i < num; i++) {
			if (num%i==0) {
				isPrime = true;
				break;
			}
		}
        if (isPrime==false && num>1) {
			System.out.println(+num +" " +"is a Primenumber");
		} else {
			System.out.println(+num +" " +"is not a Primenumber");
		}
		 
	}
}
