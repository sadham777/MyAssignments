package week3.day2;

public class Safari extends Browser {
	public void readerMode() {
		System.out.println("Reader Mode Activated");

	}
	private void fullScreenMode() {
		System.out.println("Fullscreen Mode Activated");  
	}
	public static void main(String[] args) {
		Safari safariBrowser = new Safari();
		safariBrowser.openURL();
		safariBrowser.closeBrowser();
		safariBrowser.navigateBack();
		safariBrowser.readerMode();
		safariBrowser.fullScreenMode();
		
	}
	
}
