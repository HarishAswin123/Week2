package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfcbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("356432");
		//driver.switchTo().frame("fldLoginUserId");
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("123456");
		//driver.findElement(By.linkText("CONTINUE")).click();
		//driver.switchTo().parentFrame();
		
		
		
		
		
		
		

	}

}
