package javascriptExceutor;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://en-gb.facebook.com/");
		  WebElement wb= driver.findElement(By.name("login"));
		   demo1.flash(wb);
	}
	
   public static void flash (WebElement wb) {
	  String bgcolor= wb.getCssValue("backgroundColor");
	   for(int i=0;i<=100;i++)
	   {
		   demo1.changecolor(bgcolor,wb);
		   demo1.changecolor("rgb(0,255,0)",wb); 
	   }
   }
   public static void changecolor (String color ,WebElement wb) 
   {
   JavascriptExecutor js=(JavascriptExecutor)driver;
   js.executeScript("arguments[0].style.backgriundcolor='" + color + "'", wb);
   
   
}
}
