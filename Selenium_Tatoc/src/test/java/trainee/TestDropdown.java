package trainee;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class TestDropdown {
	WebDriver driver;

  @Test
  public void f() {
	  driver.get("http://10.0.14.57:9292/dropdown");
	  
	  //driver.findElement(By.id("dropdown")).click();
	  Select select = new Select(driver.findElement(By.id("dropdown")));
	  select.selectByVisibleText("Option 1");
  }
  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		driver = new ChromeDriver();
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
