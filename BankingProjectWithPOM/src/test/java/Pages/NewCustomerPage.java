package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage {

	
	WebDriver driver ;
    By newcust_tab = By.linkText("New Customer");
	By cust_Name = By.name("name");
    By cust_Gendar = By.name("rad1");
	By cust_DOB = By.id("dob");
	By cust_Addr = By.name("addr");
	By cust_City = By.name("city");
	By cust_State = By.name("state");
	By cust_PIN = By.name("pinno");
	By cust_MoNo = By.name("telephoneno");
	By cust_Email = By.name("emailid");
	By cust_Pass = By.name("password");
	By sub_btn = By.name("sub");
	
	
	public NewCustomerPage(WebDriver driver) {
		this.driver=driver;
		
    }
	public void clickCustomerTab() {
	   driver.findElement(newcust_tab).click();
	}
	public void setName(String name) {
		driver.findElement(cust_Name).sendKeys(name);
	}
	public void setGen() {
		driver.findElement(cust_Gendar).click();
	}
	public void setDob(String Dob) {
		driver.findElement(cust_DOB).sendKeys(Dob);
	}
	public void setAddress(String Address) {
		driver.findElement(cust_Addr).sendKeys(Address);
	}
	public void setCity(String city) {
		driver.findElement(cust_City).sendKeys(city);
	}
	public void setState(String state) {
		driver.findElement(cust_State).sendKeys(state);
	}
	public void setPin(String pin) {
		driver.findElement(cust_PIN).sendKeys(pin);
	}
	public void setMono(String mobileno) {
		driver.findElement(cust_MoNo).sendKeys(mobileno);
	}
	public void setEmail(String email) {
		driver.findElement(cust_Email).sendKeys(email);
	}
	public void setPassword (String password) {
		driver.findElement(cust_Pass).sendKeys(password);
	}
	public void submit() {
		driver.findElement(sub_btn).click();
	}
	
}
