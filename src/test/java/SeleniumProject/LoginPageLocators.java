package SeleniumProject;

import org.openqa.selenium.By;

public class LoginPageLocators {

	By email = By.id("userEmail");
	By password = By.id("userPassword");
	By login = By.id("login");
	By message = By.xpath("//div[text() =' Incorrect email or password. ']");
	
}
