package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceAcoountCreation {

	public static void main(String[] args) {
		//For avoiding popupbox in chrome
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("guest");
	    ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        
        //facebook new account
        driver.findElement(By.linkText("Create new account")).click();
        
        //entering details in the page
        driver.findElement(By.name("firstname")).sendKeys("Sadham");
        driver.findElement(By.name("lastname")).sendKeys("Hussain");
        
        //datedropdowns
        
        WebElement dayDropdown = driver.findElement(By.name("birthday_day"));
        Select dayDD = new Select(dayDropdown);
        dayDD.selectByValue("7");
        
        WebElement monthDropdown = driver.findElement(By.name("birthday_month"));
        Select monthDD = new Select(monthDropdown);
        monthDD.selectByVisibleText("Nov");
        
        WebElement yearDropdown = driver.findElement(By.name("birthday_year"));
        Select yearDD = new Select(yearDropdown);
        yearDD.selectByIndex(10);
        
      //RadioButtons
        driver.findElement(By.xpath("//input[@value='2']")).click();
        
        //Email and password fields
        driver.findElement(By.name("reg_email__")).sendKeys("test@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("12345678asfsds@@1");
        
       
        
        

        
	}

}
