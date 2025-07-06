package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomatingFrame {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch to frame
		WebElement newFrame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(newFrame);
		
		//clicking button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//alert
		Alert alertBox = driver.switchTo().alert();
		alertBox.accept();
		
		//verifying text
		String textVerified = driver.findElement(By.id("demo")).getText();
		System.out.println(textVerified);
		
		
		

	}

}
