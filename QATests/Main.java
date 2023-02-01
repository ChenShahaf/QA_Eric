package QATests;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

	public static void main(String[] args) {
		serachJava();

		
		
		

	}

	public static void serachJava(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chen\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(40));
		
		String cssOfInputField = "input[name='q']";
		
		WebElement inputFieldQ = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssOfInputField)));
		
		inputFieldQ.sendKeys("java");
		
		//WebDriverWait wait2= new WebDriverWait(driver,Duration.ofSeconds(2000));
		
		String cssOfSearchield = "input[name='btnK']";
		
		WebElement searchBtn =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssOfSearchield)));
		
		searchBtn.click();
		
	driver.close();
			
	driver.quit();
			

	}
	


}
