package trainee;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMultipleWindows {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
  @Test
  public void f() {
	  driver.get("http://10.0.14.57:9292/windows");
		
		driver.findElement(By.xpath("//a[contains(@href, '/windows')]")).click();
		driver.navigate().back();
		
  }
  
  @AfterClass
  public void afterClass() {
	  //driver.close();
  }
}
