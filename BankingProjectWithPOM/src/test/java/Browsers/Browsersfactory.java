package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Browsersfactory {

protected WebDriver driver ;
	
	//String projectPath = System.getProperty("user.dir");
	 
	
	@Parameters("browserName")
    @BeforeTest
	
    
    public void Setup(@Optional String browserName) {
   	
   	 System.out.println("Browser name is :"+browserName);
   	 
   	 if(browserName.equalsIgnoreCase("chrome")) {
   		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/Drivers/chromedriver");
   		
   		 driver = new ChromeDriver();
   	 }
   	 else if (browserName.equalsIgnoreCase("firefox")) {
   		 System.setProperty("webdriver.geko.driver",System.getProperty("user.dir") + "/Drivers/geckodriver");
   		 
   		 driver = new FirefoxDriver();
   	 }
   	 else if (browserName.equalsIgnoreCase("safari")) {
   		  
   		 driver = new SafariDriver();
   	 }
   	 
   	  driver.get("https://demo.guru99.com/V4/");
   
  
		 
	    }
	  @AfterTest
	  public void teardown(String browserName) {
	
		  driver.quit();
		  driver.close();

	    }
	  
	  
   
}
