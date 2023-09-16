package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.id("small-searchterms")).sendKeys("Dress");
		//driver.findElement(By.xpath("//input[@value='Search'] and //input[@type='submit']")).click();
		//driver.get("https://www.meesho.com/");
		//driver.findElement(By.xpath("//input[@placeholder=\"Try Saree, Kurti or Search by Product Code\"]")).sendKeys("Saree").
		//driver.findElement(By.cssSelector("svg")
		//driver.findElement(By.cssSelector("img[alt='Home Decor Items ']")).click();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.name("q")).sendKeys("Watch");
		// X-path by Multiple attributes
		driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Search\"]")).click();
		
		
		
		
		
		
		
		

	}

}
