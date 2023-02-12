package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangPasswordPage {

	
	WebDriver driver;
	By Changepassword_tab = By.linkText("Change Password");
	By old_password = By.name("oldpassword");
	By new_password = By.name("newpassword");
	By new_confpassword = By.name("confirmpassword");
	By pass_sub_btn = By.name("sub");

	public  ChangPasswordPage(WebDriver driver) {
		this.driver=driver;
}
	public void clickchangpasstab() {
		driver.findElement(Changepassword_tab).click();
	}
	public void enteroldpass(String oldpassword) {
		driver.findElement(old_password).sendKeys(oldpassword);
	}
	public void enternewpass(String newpassword) {
		driver.findElement(new_password).sendKeys(newpassword);
	}
	public void enternewconfirmationpass(String newconfrimationpass) {
		driver.findElement(new_confpassword).sendKeys(newconfrimationpass);
	}
	public void clicksubbtn() {
		driver.findElement(pass_sub_btn).click();
	}
}
