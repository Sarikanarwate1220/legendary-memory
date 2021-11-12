package baseLayerPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class demo extends baseclass {
	public static void main(String[] args) throws InterruptedException {
	baseclass.intiliazation();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	WebElement wb=driver.findElement(By.name("proceed"));
	wb.click();
	Alert ab =driver.switchTo().alert();
	String s=ab.getText();
	System.out.println(s);
	Thread.sleep(5000);
     ab.accept();
	}
}
