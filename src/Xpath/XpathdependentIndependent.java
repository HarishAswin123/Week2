package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathdependentIndependent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.dunzo.com/bangalore");
		//driver.findElement(By.xpath("//p[text()='Search']")).click();
		//driver.findElement(By.xpath("//input[@class=\"sc-fznZeY jRsRRC\"]")).sendKeys("Oranges");
		//driver.findElement(By.xpath("(//p[text()='Orange - Nagpur'])[1]/../../..//button[text()='ADD']")).click();
		driver.get("https://www.dunzo.com/bangalore");
		driver.findElement(By.xpath("//p[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Search for item or a store\"]")).sendKeys("Oranges");
		driver.findElement(By.xpath("(//p[text()=\"Orange - Kinnow\"])[1]/../../..//button[text()=\"ADD\"]")).click();
		

	}

}
