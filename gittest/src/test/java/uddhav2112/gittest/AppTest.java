package uddhav2112.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Unit test for simple App.
 */
public class AppTest{
	
	static WebDriver driver;
	public static void main(String[] args)
	{
		
		try{
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		driver.get("http://www.gmail.com");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
    
}
