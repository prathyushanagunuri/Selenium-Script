package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32(2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
			
		//	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJar\\geckodriver.exe");
		//	WebDriver driver = new FirefoxDriver ();
			driver.get("http://elearning.upskills.in/");
			driver.manage().window().maximize();
			driver.findElement(By.id("login")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("admin@123");
			driver.findElement(By.id("form-login_submitAuth")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='list-items-admin']/li[4]/a")).click();
			//upload file
			driver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\PrathyushaNagunuri\\Desktop\\code.csv");
			
			
			

	}

}
