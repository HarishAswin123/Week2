package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		//driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Harish");
		//Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Harish");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Thr453@#@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Log in\"]")).submit();
		//driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("123@#");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
	

	}

}
