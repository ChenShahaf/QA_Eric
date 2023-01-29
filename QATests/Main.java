package QATests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Main {

	public static void main(String[] args) {
		serachJava();

		
		
		

	}
	public static WebDriver openDrive() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chen\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}
	public static void serachJava(){
		WebDriver driver = openDrive();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chen\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Java");
		
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2));
			

			WebElement list=driver.findElement(By.className("sbtc"));
			
			
			List<WebElement> rows=list.findElements(By.tagName("li"));

			
			for(WebElement elem:rows) {
			System.out.println(elem.getText());
			}
		

	}
	
	//VALIDATION FUNCTION
	
	public static void checkOpenChtomeCorrectly() {
		WebDriver testDriver = openDrive();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chen\\Desktop\\chromedriver_win32\\chromedriver.exe");
		testDriver.get("https://www.google.com/");
		String check = testDriver.getCurrentUrl();
		if(check.equals("https://www.google.com/")) {
			System.out.println("Test case - passed ok");
		}
		else {
			System.out.println("Test case - Failed");
		}
	}
	


}
