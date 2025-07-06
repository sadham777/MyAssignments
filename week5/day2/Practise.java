package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practise {

	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// username and password locator
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();

		// Test Process
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		// handling alert
		// Alert alertBox = driver.switchTo().alert();
		// alertBox.accept();

		// switching Windows
		// Set<String> newWindow = driver.getWindowHandles();

		// List<String> newWindowList = new ArrayList<String>(newWindow);

		// driver.switchTo().window(newWindowList.get(1));

		// scroll action
		Actions scroll = new Actions(driver);
		WebElement legalEntities = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		scroll.scrollToElement(legalEntities).perform();
		legalEntities.click();

		// newentity
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Test Sadham");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("SalesForces");
		
		
		
		//scroll action in new pop up 
		WebElement statusField = driver.findElement(By.xpath("(//label[text()='Status']//following::button)[1]"));
		driver.executeScript("arguments[0].click();", statusField);
		scroll.scrollToElement(statusField).perform();
		driver.findElement(By.xpath("//span[@title='Active']")).click();
		
		//driver.findElement(By.xpath("//span[@part='input-button-value']")).click();
		// Select statusDD = new Select(statusDropDown);
		// statusDD
		
		//name
		String verifiedText = driver.findElement(By.xpath("//div[@data-name='Name']")).getText();
		System.out.println("The Text is :" +verifiedText);

		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

		// takescreenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Snaps./image.png");
		FileUtils.copyFile(source, destination);
	}
}
