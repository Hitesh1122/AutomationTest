package rbShoeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import rbShoeUtil.Util;

public class MonthVerification extends Util{
	
	private Util utilMethods = new Util();
	
	@BeforeClass
	public void initiate(){
		utilMethods.setDriver("firefox");
	}
	
	@Test
	public void verifyMonth(){
		
		WebDriver driver = utilMethods.getDriver();
		driver.get(utilMethods.getURL());
		
		String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};

		for (int i = 0; i < month.length; i++) {
			
			//Verify that month link exist on page
			try {
				
				WebElement ele = driver.findElement(By.linkText(month[i]));
				Assert.assertTrue(ele.isDisplayed());
				ele.click();
				
				Assert.assertTrue(driver.getPageSource().contains(month[i]+"'s Shoes"), month[i]+" Page successfully loaded");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	@AfterClass
	public void testEnd(){
		utilMethods.getDriver().close();
		utilMethods.getDriver().quit();
	}
	
}
