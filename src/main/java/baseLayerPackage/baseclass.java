package baseLayerPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class baseclass {
public static WebDriver driver;
	
	public static void intiliazation() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHREE\\Desktop\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();		
	}
}
