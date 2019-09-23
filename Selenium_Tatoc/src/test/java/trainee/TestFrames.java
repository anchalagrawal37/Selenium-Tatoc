package trainee;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class TestFrames {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void left() {

		driver.get("http://10.0.14.57:9292/nested_frames");

		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.switchTo().parentFrame();
	}
	
	@Test
	public void middle() {
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.switchTo().parentFrame();
	}
	
	@Test
	public void right() {
		driver.switchTo().frame("frame-right");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
	}
	
	@Test
	public void bottom() {
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());


	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
