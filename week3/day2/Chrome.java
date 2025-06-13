package week3.day2;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("Incognito Opened");

	}
    
	public void clearCache() {
		System.out.println("Cache Cleared");

	}
	public static void main(String[] args) {
		Chrome chromeBrowser = new Chrome();
		chromeBrowser.openURL();
		chromeBrowser.closeBrowser();
		chromeBrowser.navigateBack();
		chromeBrowser.openIncognito();
		chromeBrowser.clearCache();
	}
}
