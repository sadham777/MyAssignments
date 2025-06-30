package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Entering login details
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		// Clicking link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Clicking Leadbutton
		driver.findElement(By.linkText("Leads")).click();

		// createlead
		driver.findElement(By.linkText("Create Lead")).click();

		// entering detials using XPATH
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("SadhamCompany");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test sadham");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Test hussian");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Name Local");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Last Local");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test description content");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test Department");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sadhamtest@gmail.com");

		// dropdown
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropdown = new Select(stateDD);
		stateDropdown.selectByVisibleText("New York");

		// click on create button
		driver.findElement(By.className("smallSubmit")).click();

		// click edit button
		driver.findElement(By.linkText("Edit")).click();

		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test important note");
		
		//update button using xpath with index
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String finalWindowTitle = driver.getTitle();
		System.out.println("The final wndow title is :" +finalWindowTitle);

	}

}
