package baseLayerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com/");
		  String a= driver.getCurrentUrl();
  if (a.contains("google"))
  {
	  System.out.println("test case is pass");
  }
  else
  {
  System.out.println("test case is fail");
	}

}
}