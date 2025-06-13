package week3.day2;

public class TextField extends WebElement {

	public void getText() {
		System.out.println("Getted Text");
	}
	
	public static void main(String[] args) {
		TextField textFieldFunc = new TextField();
		textFieldFunc.click();
		textFieldFunc.getText();
		}
	
	

}
