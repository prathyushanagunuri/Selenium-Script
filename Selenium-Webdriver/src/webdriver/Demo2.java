package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32(2)\\chromedriver.exe");

			WebDriver driver = new ChromeDriver ();
				
			//	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJar\\geckodriver.exe");
			//	WebDriver driver = new FirefoxDriver ();
				driver.get("http://newtours.demoaut.com/");
				driver.manage().window().maximize();
				WebElement UN=driver.findElement(By.name("userName"));
				if(UN.isEnabled())
				{
					UN.sendKeys("sunil");
					Thread.sleep(3000);
					UN.clear();
					UN.sendKeys("sunil");
				}
						
if(driver.findElement(By.name("userName")).isDisplayed()) 
{
	//get the username and print that username in my console
	//System.out.println(UN.getAttribute("value"));
	String name = UN.getAttribute("value");
	System.out.println("This ll fecth the attribute of the value "+ name);
	String name1 = UN.getAttribute("name");
	driver.findElement(By.name(name1)).clear();
	System.out.println("This ll fetch the attriute of name "+name1);
			
			String type = UN.getAttribute("type");
			System.out.println(type);
			
			String a = UN.getAttribute("Size");
			System.out.println(a);
			//Gettext can be used for label as well as for dropdown
			String label1=driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
			System.out.println(label1);
			
			
}
	}
}


