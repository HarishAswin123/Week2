package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooksignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("Satish");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("satishkumar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("123@#test");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		

	}

}
