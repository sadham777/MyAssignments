package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateEntity extends StaticParameterization {
	
	
	
	
	
	@Test
	public void createEntity() {

		// Test Process

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		// scroll action
		Actions scroll = new Actions(driver);
		WebElement legalEntities = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		scroll.scrollToElement(legalEntities).perform();
		legalEntities.click();

		// newentity
		driver.findElement(By.xpath("//a[@title='New']")).click();
		//driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Test Sadham");

		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("SalesForces");

		// name
		String verifiedText = driver.findElement(By.xpath("//div[@data-name='Name']")).getText();
		System.out.println("The Text is :" + verifiedText);

		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

}
