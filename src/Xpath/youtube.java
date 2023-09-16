package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Lesa lesa");
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		//driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[text()='Tom and Jerry | Tom and Jerry Bangla | cartoon | Tom and Jerry cartoon | Bangla Tom and Jerry']")).click();
		//driver.findElement(By.xpath("//*[text()='Tom & Jerry | Tom & Jerry in Full Screen | Classic Cartoon Compilation | WB Kids by WB Kids 1 year ago 21 minutes 443,490,471 views']")).click();
	//	driver.findElement(By.xpath("//*[text()='Tom & Jerry | Summer Cruise Abroad 🚢 | Classic Cartoon Compilation | @wbkids​']")).click();
driver.findElement(By.xpath("Lesa Lesa | Yedho Ondru Video Song | Shaam, Trisha | Harris Jayaraj | Priyadarshan")).click();
	}

}
