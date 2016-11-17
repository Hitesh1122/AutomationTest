package rbShoeUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Util {

	WebDriver driver = null;
	String browserName = null;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(String broserName) {
		
		if(browserName.equalsIgnoreCase("IE")){
			this.driver = new InternetExplorerDriver();
		}else if(browserName.equalsIgnoreCase("firefox")){
			this.driver = new FirefoxDriver();
		}
		
		
	}
	public String getBrowserName() {
		return browserName;
	}
	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}
	
	
	
	
}
