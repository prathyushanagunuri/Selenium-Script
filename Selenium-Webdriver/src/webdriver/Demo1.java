package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32(2)\\chromedriver.exe");

	WebDriver driver = new ChromeDriver ();
		
	//	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJar\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver ();
		driver.get("http://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	}

}
