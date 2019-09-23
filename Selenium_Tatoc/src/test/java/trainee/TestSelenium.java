package trainee;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestSelenium {

	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		driver = new ChromeDriver();

		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
	    	System.setProperty("webdriver.gecko.marionette","/home/qainfotech/Downloads/geckodriver");

			driver = new FirefoxDriver();
		}
		
	}

	@Test(retryAnalyzer = trainee.RetryAnalyzer.class)
	@Parameters({"key"})
	public void f(String key) {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys(key);

		driver.findElement(By.name("q")).submit();

		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

		String actualText = driver.findElement(By.xpath("//*[@id='rso']//a/h3")).getText();
		String expectedText = "QA InfoTech | Your Software Testing Partner";

		AssertJUnit.assertEquals(actualText, expectedText);
		
		Reporter.log("TesntNG logger");
		/*
		 * if (expectedText.contentEquals(actualText)) {
		 * System.out.println("Correct Content"); } else {
		 * System.out.println("Incorrect Content");
		 * 
		 * }
		 */

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
