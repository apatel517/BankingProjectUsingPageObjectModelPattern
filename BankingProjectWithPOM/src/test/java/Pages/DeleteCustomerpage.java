package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerpage {

	
	WebDriver driver;
	By Del_cus_tab = By.linkText("Delete Customer");
	By Cus_Id_Delet = By.name("cusid");
	By delete_Sub_btn = By.name("AccSubmit");
	
	public DeleteCustomerpage(WebDriver driver) {
		this.driver=driver;
}
	
	public void clickDeletecustab() {
		
		driver.findElement(Del_cus_tab).click();
	}
	public void EnterCustIdDelete(String cusDelId) {
		
		driver.findElement(Cus_Id_Delet).sendKeys(cusDelId);
	}
	public void clicksubbtnfordelet() {
		
		driver.findElement(delete_Sub_btn).click();
	}
}
