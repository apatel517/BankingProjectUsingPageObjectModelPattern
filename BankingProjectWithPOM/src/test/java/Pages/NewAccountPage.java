package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage {

	WebDriver driver ;
	By new_Accnt = By.linkText("New Account");
	By new_acc_id = By.name("cusid");
	By acc_type = By.name("selaccount");
	By ini_depo = By.name("inideposit");
	By Depo_sub_btn = By.name("button2");
	
	public NewAccountPage(WebDriver driver) {
		this.driver=driver;
}
	public void clicknewacctab () {
		
		driver.findElement(new_Accnt).click();
	}
	public void enternewaccid(String NewAccId) {
		
		driver.findElement(new_acc_id).sendKeys(NewAccId);
	}
	public void acctType(String acctypesel) {
		
		driver.findElement(acc_type).sendKeys(acctypesel);
	}
	
	public void fistDeposit(String DepoAmount) {
		driver.findElement(ini_depo).sendKeys(DepoAmount);
		
	}
	public void submitDepo() {
		driver.findElement(Depo_sub_btn).click();
	}
	
}
