package week5.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v129.fetch.Fetch;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExecutionClass extends ProjectSpecificMethod {

	@DataProvider(name = "fetch")
	public String[][] newdata() {
		String[][] newDatas = new String[2][2];
		newDatas[0][0] = "Testleaf";
		newDatas[0][1] = "Salesforce";

		newDatas[1][0] = "Qeagle";
		newDatas[1][1] = "Odigma";
		return newDatas;
	}

	@Test(dataProvider = "fetch" )
	public void executionClass(String company, String Description) throws IOException {

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
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("TestSadham");
		
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(company);
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys(Description);
		// driver.findElement(By.xpath("//span[@part='input-button-value']")).click();
		// Select statusDD = new Select(statusDropDown);
		// statusDD
		
		//scroll action in new pop up 
				WebElement statusField = driver.findElement(By.xpath("(//label[text()='Status']//following::button)[1]"));
				driver.executeScript("arguments[0].click();", statusField);
				scroll.scrollToElement(statusField).perform();
				driver.findElement(By.xpath("//span[@title='Active']")).click();

		// name
		String verifiedText = driver.findElement(By.xpath("//div[@data-name='Name']")).getText();
		System.out.println("The Text is :" + verifiedText);

		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

		// takescreenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Snaps./image.png");
		FileUtils.copyFile(source, destination);
	}

}
