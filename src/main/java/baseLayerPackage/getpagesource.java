package baseLayerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesource {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://en-gb.facebook.com/");
	  String pagesource=  driver.getPageSource();
      System.out.println(pagesource);
       
	}
}
