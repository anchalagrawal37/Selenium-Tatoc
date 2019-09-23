package trainee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://10.0.14.57:9292/nested_frames");

		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.switchTo().parentFrame();

		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.switchTo().parentFrame();

		driver.switchTo().frame("frame-right");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();

		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());



	}
}
