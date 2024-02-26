package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	
	WebDriver driver;
	
	@FindBy(id = "email")
	WebElement emailField;
	
	@FindBy(id = "pass")
	WebElement passwdField;
	
	@FindBy(name = "login")
	WebElement loginButton;
	
	public FacebookLoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String email) {
		
		emailField.sendKeys(email);
	}
	
	public void setPasswd(String passwd) {
		
		passwdField.sendKeys(passwd);
	}
	
	public void clickLogin() {
		
		loginButton.click();
	}

}
