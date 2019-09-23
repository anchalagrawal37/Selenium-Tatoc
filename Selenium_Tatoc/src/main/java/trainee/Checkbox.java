package trainee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		  driver.get("http://10.0.14.57:9292/checkboxes");
		  
			 WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
			
			 
			 if(checkbox.getText().contentEquals(" checkbox 2"))
			 {
				 System.out.println(checkbox.getText());

			 checkbox.click();
			 }
	}

}
