package week2.day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountLeaftaps {

	public static void main(String[] args) {
		
		//For avoiding popupbox in chrome
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("guest");
	     ChromeDriver driver = new ChromeDriver(options);
	     driver.get("http://leaftaps.com/opentaps/control/main");
	     driver.manage().window().maximize();
	     
	   //login functionality
	     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     
	   //Clicking link
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     
	     //Account tab 
	     driver.findElement(By.linkText("Accounts")).click();
	     driver.findElement(By.linkText("Create Account")).click();
	     
	     //Creating an account
	     driver.findElement(By.id("accountName")).sendKeys("Tester Accounts1");
	     driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	     
	     //dropdowns with input tags
	     
	     WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
	     Select industryDD = new Select(industryDropdown);
	     industryDD.selectByVisibleText("Computer Software");
	     
	     
	     WebElement  ownershipDropDown = driver.findElement(By.name("ownershipEnumId"));
	     Select ownershipDD = new Select(ownershipDropDown);
	     ownershipDD.selectByVisibleText("S-Corporation");
	     
	     WebElement sourceDropDown = driver.findElement(By.id("dataSourceId"));
	     Select sourceDD = new Select(sourceDropDown);
	     sourceDD.selectByValue("LEAD_EMPLOYEE");
	     
	     WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		 Select marketingCampaignDD = new Select(marketingCampaign);
		 marketingCampaignDD.selectByIndex(5);
	   
		 WebElement stateDropDown = driver.findElement(By.id("generalStateProvinceGeoId"));
		 Select stateDD = new Select(stateDropDown);
		 stateDD.selectByValue("TX");
		 
		 //Click submit button
		 driver.findElement(By.className("smallSubmit")).click();	
		 
		 //get text of account name field
		 String accountName = driver.findElement(By.xpath("//span[@class='requiredField']//following::span")).getText();
		 //System.out.println(accountName);
	   if (accountName.contains("Tester Accounts1")) {
		System.out.println("Account Name Displayed Correctly");
		
	}
	   
	   else {
		System.out.println("Account Name Duplicated");
	}
	     
	     

	}

}
