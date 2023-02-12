package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FundTransferPage {

	
	WebDriver driver;
	By FundTransfer_tab = By.linkText("Fund Transfer");
	By payer_acc_no = By.name("payersaccount");
	By payee_acc_no = By.name("payeeaccount");
	By transfer_amt = By.name("ammount");
	By transfer_descr = By.name("desc");
	By transfe_sub_btn = By.name("AccSubmit");
	
	public FundTransferPage(WebDriver driver) {
		this.driver=driver;
}
	public void clicktransfer_tab() {
		driver.findElement(FundTransfer_tab).click();
		
	}
	public void payeraccnumber(String Payeraccnumber) {
		driver.findElement(payer_acc_no).sendKeys(Payeraccnumber);
	}
	public void payeeaccnumber (String Payeeaccnumber) {
		driver.findElement(payee_acc_no).sendKeys(Payeeaccnumber);
	}
	public void transferamount(String transferAmount) {
		driver.findElement(transfer_amt).sendKeys(transferAmount);
	}
	public void transferDescription(String TranDescription) {
		driver.findElement(transfer_descr).sendKeys(TranDescription);
	}
	public void transfersumbitbtn() {
		driver.findElement(transfe_sub_btn).click();
	}
}
