package SeleniumProject;

import java.time.Duration;

import org.testng.annotations.Test;

public class PositiveLoginTest extends BaseTest{

	
	@Test
	public void positivelogintest() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		LoginPageLocators locate = new LoginPageLocators();
		driver.findElement(locate.email).sendKeys("rita@gmail.com");
		driver.findElement(locate.password).sendKeys("A1234567a");
		driver.findElement(locate.login).click();
	}
	
	
}
