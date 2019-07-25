package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXC3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32(2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("http://elearning.upskills.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.id("form-login_submitAuth")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();

	}

}
