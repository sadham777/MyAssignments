package week3.day2;

public class Button extends WebElement {
    public void submit() {
    	System.out.println("Button Submitted");
	}
	
	
	public static void main(String[] args) {
		Button webElemtxecution = new Button();
		webElemtxecution.click();
		String newText = webElemtxecution.setText("SadhamText");
		System.out.println("The New Text is =" +newText);
		webElemtxecution.submit();
		

	}

}
