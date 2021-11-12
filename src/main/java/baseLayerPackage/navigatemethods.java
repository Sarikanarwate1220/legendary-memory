package baseLayerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com/");
		   String a=driver.getTitle();
		   //capture title
		   System.out.println(a);
		   Thread.sleep(5000);
		   driver.navigate().to("https://www.facebook.com/login/web/");
		   String b=driver.getTitle();
		   //capture a tittle
		System.out.println(b);
		driver.navigate().back();
		//print url
		String c=driver.getCurrentUrl();
 System.out.println(c);
 Thread.sleep(5000);
 driver.navigate().forward();
 String d=driver.getCurrentUrl();
System.out.println(d);
 Thread.sleep(5000);
 driver.navigate().refresh();
 driver.quit();
	}
}
