package rbShoeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import rbShoeUtil.Util;

public class EmailVerification extends Util{
	
	private Util utilMethods = null;
	
	@BeforeClass
	public void initiate(){
		utilMethods.setDriver("IE");
	}
	
	@Test
	public void verifyEmail(){
		
		WebDriver driver = utilMethods.getDriver();
		driver.get(utilMethods.getURL());

		//Verify email remind feature
		try {
			
			WebElement ele = driver.findElement(By.id("remind_email_input"));
			Assert.assertTrue(ele.isDisplayed());
			ele.sendKeys(utilMethods.getEmailID());
			WebElement submit = driver.findElement(By.id("remind_email_submit"));
			submit.click();
			Thread.sleep(3000);
			WebElement confirmText = driver.findElement(By.xpath("//div[@id='flash']/div"));
			
			Assert.assertTrue(confirmText.getText().contains("Thanks! We will notify you of our new shoes at this email: "+utilMethods.getEmailID()));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	@AfterClass
	public void testEnd(){
		utilMethods.getDriver().close();
		utilMethods.getDriver().quit();
	}
	
}
