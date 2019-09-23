package trainee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://10.0.14.57:9292/windows");
		
		driver.findElement(By.xpath("//a[contains(@href, '/windows')]")).click();
		
		driver.close();
	}

}
