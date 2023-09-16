package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import WebElement.WebElementClick;

public class Countingoftags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");;
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println(img.size());
		 List<WebElement> a = driver.findElements(By.tagName("a"));
		 System.out.println(a.size());
		 List<WebElementClick> abc = driver.findElements(By.tagName("classname"));
		 System.out.println(abc.size());
		 List<WebElement> div1 = driver.findElements(By.tagName("div"));
		 System.out.println(div1.size());
		 List<WebElement> tr1 = driver.findElements(By.tagName("tr"));
		 System.out.println(tr1.size());
		 List<WebElement> td1 = driver.findElements(By.tagName("td"));
		 System.out.println(td1.size());
	}
}

		 
		 
		 
		 


