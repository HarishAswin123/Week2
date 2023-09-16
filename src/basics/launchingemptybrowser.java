package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingemptybrowser {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	String title = driver.getTitle();
	System.out.println(driver.getTitle());
	String getcurrenturl= driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	driver.close();
	driver.quit();
	}

}
