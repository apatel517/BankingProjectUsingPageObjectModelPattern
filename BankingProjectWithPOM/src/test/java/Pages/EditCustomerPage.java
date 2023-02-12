package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditCustomerPage {

	WebDriver driver;
	By Edit_cus_tab = By.linkText("Edit Customer");
	By Cus_Id = By.name("cusid");
	By Edit_Sub_btn = By.name("AccSubmit");
	
	public EditCustomerPage(WebDriver driver) {
		this.driver=driver;
		
    }
	
	public void clickonEditcusTab() {
		
		driver.findElement(Edit_cus_tab).click();
	}
	
	public void enterCusId(String CustomerID) {
		driver.findElement(Cus_Id).sendKeys(CustomerID);
		
	}
	
	public void editcussubmitbtn() {
		
		driver.findElement(Edit_Sub_btn).click();
	}
	
	
}
