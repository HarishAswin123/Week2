package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Satish");
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		driver.findElement(By.id("Email")).sendKeys("satishkumar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Harish123@");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1234&^%$");
		driver.findElement(By.partialLinkText("BOOKS")).click();
		//driver.findElement(By.linkText("Books")).click();
		
		
		
		
		
		

	}

}
