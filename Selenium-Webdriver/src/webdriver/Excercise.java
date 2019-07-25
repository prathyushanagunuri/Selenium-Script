package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32(2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("http://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a")) ;
		System.out.println(links.size());
		for(WebElement e:links)
		{
		String text = e.getText();
		System.out.println(text);
		}
	}

}
