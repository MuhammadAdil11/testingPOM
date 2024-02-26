package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.FacebookLoginPage;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Adil\\Testing\\eclipse\\POM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		
		loginPage.setEmail("abc@gmail.com");
		loginPage.setPasswd("12345678");
		
		loginPage.clickLogin();
		
		driver.quit();
	}

}
