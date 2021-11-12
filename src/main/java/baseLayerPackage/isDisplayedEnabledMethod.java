package baseLayerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com/");
   
  WebElement wb=driver.findElement(By.partialLinkText("Gmai"));
  System.out.println(wb.isDisplayed());
  System.out.println(wb.isEnabled());
  System.out.println(wb.getText());
  Thread.sleep(5000);
  wb.click();
  String a=driver.getCurrentUrl();
  if(a.contains("facebook"))
  {
	  System.out.println("test case is pass");
  }
  else
  {
  System.out.println("test case is fail");
   }
}
}