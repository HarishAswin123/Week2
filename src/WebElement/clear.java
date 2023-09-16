package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class clear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("Weekend");
		WebElement password= driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("123ER");
		System.out.println(username.getText());
		System.out.println(username.getCssValue("border"));
		System.out.println(username.getCssValue("color"));
		System.out.println(password.getText());
		System.out.println(username.getTagName());
		System.out.println(username.getAttribute("value"));
		System.out.println(username.getLocation());
		System.out.println(username.getSize());
		
		
		
		
		
		
		
		
		
	}
}

		
		
		

	


