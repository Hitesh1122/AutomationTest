package rbShoeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import rbShoeUtil.Util;

public class EmailVerification extends Util{

	private static final Logger logger = Logger.getLogger(EmailVerification.class.getName());
	private Util utilMethods = new Util();
	
	@BeforeClass
	public void initiate(){
		utilMethods.setDriver("firefox");
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
			WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout
			WebElement confirmText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='flash']/div")));
			
			Assert.assertTrue(confirmText.getText().contains("Thanks! We will notify you of our new shoes at this email: "+utilMethods.getEmailID()));
			
			
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception occurred during email verification", e);
			Assert.fail("Exception occurred during email verification. " + e.getMessage());
		}

	}
	
	@AfterClass
	public void testEnd(){
		utilMethods.getDriver().close();
		utilMethods.getDriver().quit();
	}
	
}
