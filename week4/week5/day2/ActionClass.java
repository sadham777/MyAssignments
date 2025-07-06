package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionClass {

	public static void main(String[] args) throws IOException {

		// launching browser and lauch URL
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// searchbox
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 10 pro", Keys.ENTER);
		WebElement poductText = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
		String productPrice = poductText.getText();
		System.out.println("The price of the 1st Product :" + productPrice);

		// printing number of ratings 1st product
		WebElement ratingCount = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[2]"));
		ratingCount.getText();
		System.out.println("The number of rating is :" + ratingCount.getText());

		// clikcing the product
		driver.findElement(By.xpath("//span[text()='OnePlus 10 Pro 5G (Emerald Forest, 8GB RAM, 128GB Storage)']"))
				.click();

		// takingscreenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Snaps./image.png");
		FileUtils.copyFile(source, destination);

		// add to cart
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();

		// verify cart subtotal with product price

		WebElement subTotal = driver.findElement(By.xpath("//span[text()='39,999']"));
		String subtotalText = subTotal.getText();
		System.out.println("The cart Subtotal is :" +subtotalText);
		
if (productPrice.equals(subtotalText)) {
			System.out.println("Price Verified");
		} else {
System.out.println("Price Mismatched");
		}
	}

}
