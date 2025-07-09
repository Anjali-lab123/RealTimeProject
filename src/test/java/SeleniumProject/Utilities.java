package SeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));

	public void VisibilityOfWebElement(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void VisibilityOfElementLocated(By by) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(by));

	}

	public void InvisibilityOfWebElement(WebElement element) {

		wait.until(ExpectedConditions.invisibilityOf(element));

	}

	public void InvisibilityOfElementLocated(By by) {

		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));

	}
}
