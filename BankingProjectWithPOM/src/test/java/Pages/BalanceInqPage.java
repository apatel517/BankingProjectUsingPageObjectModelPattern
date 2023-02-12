package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BalanceInqPage {

	
	WebDriver driver;
	By Balanceinq_tab = By.linkText("Balance Enquiry");
	By balanceinq_acc_no = By.name("accountno");
	By balance_sub_btn = By.name("AccSubmit");
	
	public BalanceInqPage(WebDriver driver) {
		this.driver=driver;
}
   public void clickbalanceinqtab() {
	   
	   driver.findElement(Balanceinq_tab).click();
   }
   public void balanceinqacc(String Balanceinqnum) {
	   driver.findElement(balanceinq_acc_no).sendKeys(Balanceinqnum);
   }
   public void balanceinqbtn() {
	   
	   driver.findElement(balance_sub_btn).click();
   }
}
