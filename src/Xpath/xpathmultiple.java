package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathmultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cashkaro.com/blog/best-online-shopping-apps-in-india/185530");
		driver.findElement(By.xpath("(//input[@placeholder=\"Search\"])[1]")).sendKeys("Shoes");
		driver.findElement(By.xpath("(//button[@type=\"submit\"and //button[@class=\"btnsearch hideonmobile\"])[1]")).click();//X- Path by Grouped index and multiple

	}

}
