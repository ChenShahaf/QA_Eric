package QATests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chen\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String check = driver.getCurrentUrl();
		
		if(check.equals("https://www.google.com/")) {
			System.out.println("Test case - passed ok");
		}
		else {
			System.out.println("Test case - Failed");
		}
		driver.close();

	}

}
