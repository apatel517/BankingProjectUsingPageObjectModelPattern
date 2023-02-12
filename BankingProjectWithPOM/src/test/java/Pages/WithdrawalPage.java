package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithdrawalPage {

	WebDriver driver;
	By Withdrawal_tab = By.linkText("Withdrawal");
	By Withd_acc_no = By.name("accountno");
	By withd_amt= By.name("ammount");
	By withd_descr = By.name("desc");
	By withd_sub_btn = By.name("AccSubmit");
	
	public WithdrawalPage(WebDriver driver) {
		this.driver=driver;
}
	public void clickwithdrwaltab() {
		driver.findElement(Withdrawal_tab).click();
	}
	public void withdaccnum(String Withaccnumber) {
		driver.findElement(Withd_acc_no).sendKeys(Withaccnumber);
	}
	public void withAmount(String WithdAmount) {
		driver.findElement(withd_amt).sendKeys(WithdAmount);
	}
	public void WithdDescription (String Wdescription) {
		driver.findElement(withd_descr).sendKeys(Wdescription);
	}
	public void withdrawalbtn() {
		driver.findElement(withd_sub_btn).click();
	}
}
