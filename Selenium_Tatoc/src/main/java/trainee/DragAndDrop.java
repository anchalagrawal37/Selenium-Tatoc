package trainee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		  driver.get("http://10.0.14.57:9292/dropdown");
		  
		  //driver.findElement(By.id("dropdown")).click();
		  Select select = new Select(driver.findElement(By.id("dropdown")));
		  select.selectByVisibleText("Option 1");
	}
		  
}
