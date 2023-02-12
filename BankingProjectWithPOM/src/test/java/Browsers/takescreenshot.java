package Browsers;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshot  {

	WebDriver driver;
	public takescreenshot(WebDriver driver) {
		this.driver=driver;
}
	public void capturescreenshot(String fileName) throws IOException {
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(srcFile, new File(fileName + ".png"));
  
     }
}
