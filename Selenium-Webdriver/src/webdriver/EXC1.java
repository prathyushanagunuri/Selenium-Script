package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EXC1{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32(2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("prathyusha");
		driver.findElement(By.name("password")).sendKeys("prathyusha");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		}
				
        WebElement DD = driver.findElement(By.name("fromPort"));
        Select sel = new Select(DD);
        List<WebElement> data = sel.getOptions();
        System.out.println(data.size());
       for(int i=0;i<data.size();i++)
       {
    	  System.out.println(data.get(i).getText());
       }
        System.out.println();
        //1st option
        //sel.selectByVisibleText("2");
        Thread.sleep(2000);
        //2nd option
        //sel.selectByIndex(2);
        //3rd option
        //sel.selectByValue("1");
        driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
        driver.findElement(By.name("findFlights")).click();
        driver.findElement(By.name("reserveFlights")).click(); 
        driver.findElement(By.name("passFirst0")).sendKeys("prathyusha");
        driver.findElement(By.name("passLast0")).sendKeys("nagunuri");
        driver.findElement(By.name("creditnumber")).sendKeys("123456");
        List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
        for(WebElement e:checkbox)
        {
        	e.click();
        }
                
        driver.findElement(By.name("buyFlights")).click();
	}

}
