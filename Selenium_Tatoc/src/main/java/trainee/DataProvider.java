package trainee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.14.57:9292");
		
		List<WebElement> allElements = driver.findElements(By.xpath("//div[@id='content']/ul/li")); 

		  for (WebElement element: allElements) {
		        System.out.println(element.getText());
		  }


	}

}
