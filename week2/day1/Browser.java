package week2.day1;

public class Browser {

	public String launchbrowser(String message) {
		System.out.println(message);
	return message;	

	}
	
    public void loadUrl() {
	System.out.println();

    }
    public static void main(String[] args) {
		Browser desktopOptions =new Browser();
		desktopOptions.launchbrowser("Browser Launched Sucessfully");
		desktopOptions.loadUrl();
	}
	
}
