package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.dream11.com/");
		//driver.switchTo().frame("send-sms-iframe");
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("1234567895");
		driver.findElement(By.id("regUser")).click();
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
}
	