package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;

public class CreateLeadLeafTaps {

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
     //Cliking Leads
     driver.findElement(By.linkText("Leads")).click();
     
     //create leads
     driver.findElement(By.linkText("Create Lead")).click();
     
     //Entering details in the text field
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TeatLeaf");
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sadham");
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Hussain");
     driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("CreateLeads");
     
     //submit button
     driver.findElement(By.className("smallSubmit")).click();
     
     //get Title Text 
     WebElement titleField = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
     if (titleField.getText()!=null) {
		System.out.println("Title Displayed as"+ " " +titleField.getText());
	}
     else {
		System.out.println("No Title Entered");
	}
     
     //driver.close();
     
     
    
     
   
	}

}
