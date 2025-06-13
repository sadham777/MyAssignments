package week3.day2;

public class Edge extends Browser {
 
	public void takeSnap() {
		System.out.println("Snap Taken");

	}
	public void clearCookies() {
		System.out.println("Cookies Cleared");
		

	}
	public static void main(String[] args) {
		Edge edgeBrowser = new Edge();
		edgeBrowser.openURL();
		edgeBrowser.closeBrowser();
		edgeBrowser.navigateBack();
		edgeBrowser.takeSnap();
		edgeBrowser.clearCookies();
		
	}
	
}

