package week5.day1;

import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableInteraction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// Entering MAS
		WebElement fromStation = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromStation.clear();
		fromStation.sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		
        //Entering MDU
		Thread.sleep(3000);
		WebElement toStation = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		toStation.clear();
		toStation.sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		
		Thread.sleep(3000);
		//uncheck radio button
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		//Retriving the train names 
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		List<WebElement> tablerowList = table.findElements(By.tagName("tr"));
		
		//System.out.println(tablerowList);
		
		//List<WebElement> columnValue = table.findElements(By.tagName("td"));
		//int sizeofColumn = columnValue.size();
		
		WebElement trainNameColumn = table.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//a[text()='Train Name']"));
		//trainNameColumn.getSize();
		
		String trainNameColumn1 = trainNameColumn.getText();
		
		System.out.println(trainNameColumn1);
		
		}
	
}
