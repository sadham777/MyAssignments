package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterization extends StaticParameterization {
	// String[][] dynamicDatas = {{"aaaa", "bbbb", "ccc"},{"aaa","bbb", "ccc"}};

	@DataProvider
	public String[][] dynamicDatas() {
		String[][] dynamicDatas = new String[2][3];
		dynamicDatas[0][0] = "Salesforce Automation by Sadham";
		dynamicDatas[0][1] = "TestLeaf";
		dynamicDatas[0][2] = "SalesForces";

		dynamicDatas[1][0] = "Salesforce Automation by Hussain";
		dynamicDatas[1][1] = "TestLeaf";
		dynamicDatas[1][2] = "SalesForces";
		
		return dynamicDatas;

	}

	@Test(dataProvider = "dynamicDatas")
	public void createEntityAndSave(String name, String companyName, String description) throws InterruptedException {
		// Test Process

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		// scroll action
		Actions scroll = new Actions(driver);
		WebElement legalEntities = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		scroll.scrollToElement(legalEntities).perform();
		legalEntities.click();

		// newentity
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(companyName);
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys(description);

		// name
		String verifiedText = driver.findElement(By.xpath("//div[@data-name='Name']")).getText();
		System.out.println("The Text is :" + verifiedText);

		 driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	}

}
