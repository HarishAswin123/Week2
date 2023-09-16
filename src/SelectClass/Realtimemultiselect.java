package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Realtimemultiselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapp.skillrary.com/");
		WebElement multi = driver.findElement(By.id("cars"));
		Select s=new Select(multi);
		s.selectByIndex(0);
		s.selectByValue("199");
		s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		s.deselectByValue("199");
		System.out.println("The first selected option:"+ s.getFirstSelectedOption().getText());
		List<WebElement> multiple = s.getAllSelectedOptions();
		for(WebElement multi1: multiple)
		{
			
			System.out.println(multi1.getText());
			
		}
			System.out.println("Checking is it multiple or not:" +s.isMultiple());
		s.deselectAll();
		
		

	}

}
