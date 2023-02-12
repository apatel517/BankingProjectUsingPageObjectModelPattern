package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositPage {

	WebDriver driver;
	
	By deposit_tab = By.linkText("Deposit");
	By Depo_acct_num = By.name("accountno");
	By Depo_ammount = By.name("ammount");
	By Depo_discripttion = By.name("desc");
	By Depo_submit = By.name("AccSubmit");
	
	public DepositPage(WebDriver driver) {
		this.driver=driver;
}
	public void clickdeposittab() {
		driver.findElement(deposit_tab).click();
	}
	public void DepositAccNumber(String accnumber) {
		driver.findElement(Depo_acct_num).sendKeys(accnumber);
	}
	public void DepositAmount (String amount) {
		
		driver.findElement(Depo_ammount).sendKeys(amount);
	}
	public void depositDescription (String description) {
		driver.findElement(Depo_discripttion).sendKeys(description);
	}
	public void submitdeposit() {
		driver.findElement(Depo_submit).click();
	}
}

