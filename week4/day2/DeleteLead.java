package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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

		// find leads
		WebElement element = driver.findElement(By.linkText("Find Leads"));
		element.click();
		//driver.findElement(By.partialLinkText("//*[@id=\'ext-gen859\']"));
		

		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//capturing lead id of the first row
		Thread.sleep(1000);
		WebElement leadID = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String firstText = leadID.getText();
		System.out.println("The Lead id is :" +firstText);
		leadID.click();
		
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		//findleads
		Thread.sleep(3000);
		
		//find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//driver.findElement(By.xpath("//*[@id=\"ext-gen859\"]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstText);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement recordStatus = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		System.out.println(recordStatus.getText());
		
		
		
		

	}

}
