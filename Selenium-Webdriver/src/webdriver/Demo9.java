package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo9 {

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
			WebElement link = driver.findElement(By.linkText("PIM"));
			Action mouseover = act.moveToElement(link).build();
			mouseover.perform();
			WebElement link1 = driver.findElement(By.linkText("Employee List"));
			Actions act1 = new Actions(driver);
			//act.sendKeys(link1, (Keys.ENTER)).perform();
			//act.sendKeys(link1, (Keys.PAGE_DOWN)).build().perform();
			act1.sendKeys(link1, (Keys.PAGE_DOWN)).build().perform();
		
			

	}

}
