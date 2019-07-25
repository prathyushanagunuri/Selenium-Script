package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32(2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
			
			driver.get("http://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("txtUsername")).sendKeys("admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();	
			Thread.sleep(3000);
			act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
			//driver.navigate().back();

	}

}
