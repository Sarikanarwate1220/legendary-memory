package baseLayerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumwebdriver {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
    driver.get("https://en-gb.facebook.com/");
   String a= driver.getTitle();
     if(a.equals("Facebook"))
     {
    	 System.out.println("test case is pass");
     }
     else
     {
    	 System.out.println("teast case is fail");
     }
	}

}
