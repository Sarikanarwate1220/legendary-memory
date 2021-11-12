package baseLayerPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dplistascending {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://en-gb.facebook.com/r.php");
 WebElement wb=   driver.findElement(By.id("month"));
    Select sel= new Select (wb);
    ArrayList ar=new ArrayList();
  List<WebElement> wb1=  sel.getOptions();
    
	for (WebElement xyz:wb1) {
    String a=xyz.getText();
    ar.add(a);
	}
	Collections.sort(ar);
	}
}
