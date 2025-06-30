package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on Deleivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI Payments");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payments");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking");
		
	}
     
	public static void main(String[] args) {
		Amazon paymentScreenshot = new Amazon();
		paymentScreenshot.cashOnDelivery();
		paymentScreenshot.upiPayments();
		paymentScreenshot.cardPayments();
		paymentScreenshot.internetBanking();
		paymentScreenshot.recordPaymentDetails();
		
		
	}
	
	

}
