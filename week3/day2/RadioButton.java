package week3.day2;

public class RadioButton extends Button {

	public void selectRadioButton() {
		System.out.println("Radio button selected");
	}
   public static void main(String[] args) {
	   RadioButton buttonFunc = new RadioButton();
	   buttonFunc.selectRadioButton();
	   buttonFunc.submit();
}
}
