package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.shoppersstack.com/");
		Actions action = new Actions(driver);
		for(;;)
		{
			try {
				driver.findElement(By.partialLinkText("Swagger Documentation")).click();
				break;
			}catch(Exception e)
			{
				action.sendKeys(Keys.PAGE_DOWN);
			}
		}
		
		

	}

}
