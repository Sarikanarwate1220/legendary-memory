package baseLayerPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass1 {
	public static WebDriver driver;
	public static void intialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		    driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   driver.manage().deleteAllCookies();
		   driver.get("https://ui.cogmento.com/");
		   
	}
}



