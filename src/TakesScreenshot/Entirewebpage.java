package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entirewebpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		 TakesScreenshot shot =(TakesScreenshot) driver;
		 File f = shot.getScreenshotAs(OutputType.FILE);
		 System.out.println(f);
		FileHandler.copy(f, new File("./Errorshots/image1.png"));

	}

}
