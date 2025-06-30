package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlesMethod {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Clicking on FLIGHTS link
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		//windowHandling
		
		Set<String> windowAddresses = driver.getWindowHandles();
		System.out.println(windowAddresses);
		
		List<String> windowAddressList = new ArrayList<String>(windowAddresses);
		
		driver.switchTo().window(windowAddressList.get(1));
		
		String newWindowTitle = driver.getTitle();
		System.out.println("The Child Window title is : " +newWindowTitle);
		
		driver.switchTo().window(windowAddressList.get(0));
		driver.close();
		
		

		
		
		
		
		

	}

}
