package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo12 {

	public static void main(String[] args) throws AWTException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32(2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
			Thread.sleep(3000);
			//how many tabs are present ll know by getwindowshandles
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			System.out.println(tabs.size());
			//switchj b/w tabs/browser
			driver.switchTo().window(tabs.get(1));
			String title = driver.getTitle();
			System.out.println(title);
			driver.switchTo().window(tabs.get(0));
			String title1 = driver.getTitle();
			System.out.println(title1);
			if(title.equals(title1))
			{
				System.out.println("Title are same");
			}
			
			else
			{
				System.out.println("Title are not same");
			}
			
			
			
			           
            
            
            
	}    
            
	}


