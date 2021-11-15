package baseLayerPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testngdemo {
	
	public class ParameterWithParallelMethod {

		@Parameters("Browser")
		@Test
			public void launching(String name ) {
				
				if(name.equalsIgnoreCase("Chrome"))
				{

					System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHREE\\Desktop\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.google.co.in/");
					driver.manage().window().maximize();
				}
				
				
				else if(name.equalsIgnoreCase("Chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHREE\\Desktop\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					
					driver.get("https://www.facebook.com/");
					
					
				}
					
			}
			
			

		}	
}


