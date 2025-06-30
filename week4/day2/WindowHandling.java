package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		//Entering login details
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking link
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     //contact
	     driver.findElement(By.linkText("Contacts")).click();
	     //mergecontacts
	     driver.findElement(By.linkText("Merge Contacts")).click();
	     
	     //clicking on the widget
	     ////input[@name='partyIdFrom']/following-sibling::a
	     //img[@alt='Lookup'])[1]
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("input[@name='partyIdFrom']/following-sibling::a")).click();
	     
	     //switching window
	     Set<String> newWindow = driver.getWindowHandles();
	     List<String> newWindowList = new ArrayList<String>(newWindow);
	     driver.switchTo().window(newWindowList.get(1));
	     
	     driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	     
	     //returning to parentwindow
	     driver.switchTo().window(newWindowList.get(0));
	     driver.findElement(By.xpath("//input[@name='partyIdTo']/following-sibling::a")).click();
	     
	     driver.switchTo().window(newWindowList.get(1));
	     driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	     
	     //alert
	     
	     Alert alertBox = driver.switchTo().alert();
	     alertBox.accept();
	     
	     //getTitle
	     driver.switchTo().window(newWindowList.get(0));
	     String finalWindowTitle = driver.getTitle();
	     System.out.println(finalWindowTitle);
	     
	     
	     
	     
	 
	     
	    
	     
	   
	}

}
