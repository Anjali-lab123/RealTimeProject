package SeleniumProject;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends BaseTest{

	
	@Test()
	public void negativeLogintest() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		LoginPageLocators locate = new LoginPageLocators();
		driver.findElement(locate.email).sendKeys("rita1@gmail.com");
		driver.findElement(locate.password).sendKeys("A1234567");
		driver.findElement(locate.login).click();
		String message = driver.findElement(locate.message).getText();
		System.out.println(message);
		Assert.assertEquals(message, "Incorrect email or password.");
		
	}
}
