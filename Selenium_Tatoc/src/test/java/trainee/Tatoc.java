package trainee;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tatoc {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://10.0.1.86/tatoc");
		// List<WebElement> data;
		// data = driver.findElements(By.cssSelector("ul > ul> li"));
		// System.out.println(data.size());

		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.cssSelector(".greenbox")).click();
		driver.switchTo().frame("main");

		String box1 = driver.findElements(By.xpath("//*[@id='answer']")).get(0).getAttribute("class");
		String box2 = null;

		System.out.println(box1);

		while (!box1.equalsIgnoreCase(box2)) {
			driver.findElements(By.tagName("a")).get(0).click();
			driver.switchTo().frame("child");

			box2 = driver.findElements(By.xpath("//*[@id='answer']")).get(0).getAttribute("class");

			System.out.println(box2);
			driver.switchTo().parentFrame();
		}

		driver.findElements(By.tagName("a")).get(1).click();

		WebElement from, to;

		from = driver.findElement(By.className("ui-draggable"));
		to = driver.findElement(By.id("dropbox"));

		Actions act = new Actions(driver);

		act.dragAndDrop(from, to).build().perform();

		driver.findElement(By.tagName("a")).click();

		driver.findElements(By.cssSelector(".wrapper .page a")).get(0).click();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		driver.findElement(By.id("name")).sendKeys("abcd");
		driver.findElement(By.id("submit")).click();
		driver.switchTo().window(tabs2.get(0));

		driver.findElements(By.cssSelector(".wrapper .page a")).get(1).click();
		driver.findElements(By.cssSelector(".wrapper .page a")).get(0).click();
		
		String token = driver.findElement(By.id("token")).getText();
		System.out.println(token.substring(7));
	    Cookie cookie = new Cookie("Token", token.substring(7));
		System.out.println(cookie.getValue());
		driver.manage().addCookie(cookie);


		driver.findElements(By.cssSelector(".wrapper .page a")).get(1).click();


		

	}

}
