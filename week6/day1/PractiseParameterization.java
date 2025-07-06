package week6.day1;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class  PractiseParameterization {

	
	   public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		 String titleOfPage  = driver.getTitle();
		    System.out.println("Title of the Page is :" +titleOfPage);
		    
		    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		    driver.findElement(By.xpath("//button[text()='View All']")).click();
		    
		    driver.findElement(By.xpath("//div[@data-name=\"Sales\"]")).click();
		    //Thread.sleep(2000);
		    
		    WebElement accountsLink = driver.findElement(By.xpath("//a[@title='Accounts']"));

		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].click();", accountsLink);
		    driver.findElement(By.xpath("//div[@title='New']")).click();
		    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Test Sadham");
		    driver.findElement(By.xpath("//div[@aria-label='Ownership']")).click();
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement ownershipDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Ownership']")));
		    ownershipDropdown.click();
		    WebElement publicOption = wait.until(ExpectedConditions.elementToBeClickable(
		    	    By.xpath("//lightning-base-combobox-item[@data-value='Public']")));
		    	publicOption.click();
		    driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Public']")).click();
		    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		    String titleOfLastPage = driver.getTitle();
		    System.out.println("Title of the Last Page :" +titleOfLastPage);
	}
	     
	     
			
}
