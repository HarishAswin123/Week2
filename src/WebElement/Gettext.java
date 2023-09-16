package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) {
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
		
		 
		

	}

}
