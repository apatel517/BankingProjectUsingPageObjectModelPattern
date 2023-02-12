package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	protected WebDriver driver ;
	By txt_username = By.name("uid");
	By txt_password = By.name("password");
	By btn_login    = By.name("btnLogin");
	
	public LoginPage(WebDriver driver) {
	   this.driver = driver;
	}

	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickBtn() {
	    driver.findElement(btn_login).click();
	}
}
