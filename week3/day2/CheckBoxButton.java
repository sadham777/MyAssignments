package week3.day2;

public class CheckBoxButton extends Button {
	public void clickCheckButton() {
		System.out.println("Click button checked");

	}
	public static void main(String[] args) {
		CheckBoxButton checkBoxFunc = new CheckBoxButton();
		checkBoxFunc.clickCheckButton();
		checkBoxFunc.submit();
	}

}
