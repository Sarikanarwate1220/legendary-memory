package baseLayerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class operationonbutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/login/web/");
		   WebElement wb=driver.findElement(By.name("login"));
  System.out.println(wb.isDisplayed());
  System.out.println(wb.isEnabled());
  Thread.sleep(5000);
  //capture button value
    String a=wb.getAttribute("type");
    System.out.println("button type is "+a);
    String b=wb.getAttribute("value");
    System.out.println("button type is "+b);
    //click on button
    wb.click();
    Thread.sleep(5000);
    WebElement abc=driver.findElement(By.xpath("//div[@class='_9ay7']"));
   System.out.println(abc.getText());
	}

}
