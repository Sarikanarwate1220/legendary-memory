package baseLayerPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static WebDriver driver;
	public static void main (String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   driver.manage().deleteAllCookies();
	}
}
