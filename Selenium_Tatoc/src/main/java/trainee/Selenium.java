package trainee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("QA InfoTech \n");
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * 
		 * WebElement element =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.id("btnK")));
		 */

		driver.findElement(By.name("q")).submit();
		
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));


	    String actualText = driver.findElement(By.xpath("//*[@id='rso']//a/h3")).getText();
/*	    // this are all the links you like to visit
	    for (WebElement webElement : findElements)
	    {
	        System.out.println(webElement.getAttribute("href"));
	    }
*/	    
	    String expectedText = "QA InfoTech | Your Software Testing Partner";

	    
	    if(expectedText.contentEquals(actualText))
	    {
	    	System.out.println("Correct Content");
	    }
	    else {
	    	System.out.println("Incorrect Content");

	    }
	    
	}

}
