package trainee;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestCheckbox {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
	   driver = new ChromeDriver();
	  
  }

  @Test
  public void f() {
	  driver.get("http://10.0.14.57:9292/checkboxes");
	  
	 WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
	
	 System.out.println(checkbox.getText());
	 if(checkbox.getText().contentEquals(" checkbox 2"));
	 checkbox.click();
	
  }
  
  @AfterClass
  public void afterClass() {
  }

}
