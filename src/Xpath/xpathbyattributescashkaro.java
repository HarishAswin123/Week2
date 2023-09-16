package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattributescashkaro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cashkaro.com/blog/best-online-shopping-apps-in-india/185530");
		driver.findElement(By.xpath("(//input[@placeholder=\"Search\"]) [1]")).sendKeys("Shoes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btnsearch hideonmobile'])[1]")).click();
		
		
		
		

	}

}
