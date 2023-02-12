package TestMethods;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.openqa.selenium.Alert;
import Browsers.Browsersfactory;
import Browsers.takescreenshot;
import Pages.BalanceInqPage;
import Pages.ChangPasswordPage;
import Pages.DeleteCustomerpage;
import Pages.DepositPage;
import Pages.EditCustomerPage;
import Pages.FundTransferPage;
import Pages.LoginPage;
import Pages.NewAccountPage;
import Pages.NewCustomerPage;
import Pages.WithdrawalPage;

public class TestScripts extends Browsersfactory {

	LoginPage lpage;
	NewCustomerPage custRG;
	EditCustomerPage EdCustomer;
	takescreenshot tk;
	WithdrawalPage wpage;

	@Test(priority = 1)
	public void login() throws InterruptedException {

		lpage = new LoginPage(driver);
		lpage.enterUsername("mngr476499");
		lpage.enterPassword("des@23");
		lpage.clickBtn();

		if (driver.getPageSource().contains("Welcome To Manager's Page of Guru99 Bank\n" + "Manger Id : mngr476499"))
			;
		{
			System.out.println("Test is Passed");

		}

	}

	@Test(priority = 2)
	public void customeRegistration() throws InterruptedException, IOException {

		custRG = new NewCustomerPage(driver);
		custRG.clickCustomerTab();
		custRG.setName("Asad patel");
		custRG.setGen();
		custRG.setDob("10/16/1996");
		custRG.setAddress("123  lee st");
		custRG.setCity("Desplaines");
		custRG.setState("Illinois");
		custRG.setPin("600162");
		custRG.setMono("0987654321");
		custRG.setEmail("ap09@gmail.com");
		custRG.setPassword("des@23");
		custRG.submit();
		tk = new takescreenshot(driver);
		tk.capturescreenshot("NewCustomer");

		if (driver.getPageSource().contains("Customer Registered Successfully!!!"))
			;
		{

		}
		System.out.println("Customer Registered Successfully!!!");
	}

	@Test(priority = 3)

	public void EditCustomer() {
		EdCustomer = new EditCustomerPage(driver);
		EdCustomer.clickonEditcusTab();
		EdCustomer.enterCusId("43405");
		EdCustomer.editcussubmitbtn();
		Alert alert = driver.switchTo().alert();
		String Actualaltext = alert.getText();
		String Expectedalttext = "No Changes made to Customer records";
		System.out.println(Actualaltext);
		AssertJUnit.assertEquals(Actualaltext, Expectedalttext);
		alert.accept();

	}

	@Test(priority = 4)

	public void NewAccount() throws IOException {
		NewAccountPage naccount = new NewAccountPage(driver);
		naccount.clicknewacctab();
		naccount.enternewaccid("22707");
		naccount.acctType("Saving");
		naccount.fistDeposit("10000");
		naccount.submitDepo();
		tk = new takescreenshot(driver);
		tk.capturescreenshot("New Account");

		if (driver.getPageSource().contains("Account Generated Successfully!!!"))
			;
		{

		}
		System.out.println("Customer Generated Successfully!!!");

	}

	@Test(priority = 5)
	public void Depositp() throws IOException, InterruptedException {

		DepositPage dpage = new DepositPage(driver);

		dpage.clickdeposittab();
		dpage.DepositAccNumber("118336");
		dpage.DepositAmount("10000");
		dpage.depositDescription("Rental");
		dpage.submitdeposit();
		tk = new takescreenshot(driver);
		tk.capturescreenshot("initial deposite");

	}

	@Test(priority = 6)
	public void withdrwalp() throws IOException {

		WithdrawalPage wpage = new WithdrawalPage(driver);

		wpage.clickwithdrwaltab();
		wpage.withdaccnum("118336");
		wpage.withAmount("5000");
		wpage.WithdDescription("Rental");
		wpage.withdrawalbtn();
		tk = new takescreenshot(driver);
		tk.capturescreenshot("WithDrwal confirmation");

	}

	@Test(priority = 7)
	public void TransferFund() throws IOException {

		FundTransferPage fPage = new FundTransferPage(driver);
		fPage.clicktransfer_tab();
		fPage.payeraccnumber("118334");
		fPage.payeeaccnumber("118336");
		fPage.transferamount("1000");
		fPage.transferDescription("Rent");
		fPage.transfersumbitbtn();
		tk = new takescreenshot(driver);
		tk.capturescreenshot("Transfer confirmation");
	}

	@Test(priority = 8)
	public void BalanceEnquiry() throws IOException {
		BalanceInqPage Bpage = new BalanceInqPage(driver);
		Bpage.clickbalanceinqtab();
		Bpage.balanceinqacc("118336");
		Bpage.balanceinqbtn();
		tk = new takescreenshot(driver);
		tk.capturescreenshot("BalanceEnquiry confirmation");

	}

	@Test(priority = 9)
	public void ChangePassword() throws IOException {
		ChangPasswordPage changpass = new ChangPasswordPage(driver);
		changpass.clickchangpasstab();
		changpass.enteroldpass("des@12");
		changpass.enternewpass("des@23");
		changpass.enternewconfirmationpass("des@23");
		changpass.clicksubbtn();
		// String alert = driver.switchTo().alert().getText();
		// System.out.println(alert);
		tk = new takescreenshot(driver);
		tk.capturescreenshot("changepassword confirmation");
	}

	@Test
	public void DeleteCustomer() {
		DeleteCustomerpage deletecust = new DeleteCustomerpage(driver);

		deletecust.clickDeletecustab();
		deletecust.EnterCustIdDelete("118336");
		deletecust.clicksubbtnfordelet();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String ActualaltextDel = alert.getText();
		System.out.println(ActualaltextDel);
		String ExpectedalttextDel = "Customer does not exist!!";
		AssertJUnit.assertEquals(ActualaltextDel, ExpectedalttextDel);
		alert.accept();
	}
}
