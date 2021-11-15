package baseLayerPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class demo extends baseclass {
	public static void main(String[] args) throws InterruptedException {
	baseclass.intiliazation();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	driver.findElement(By.name("alert")).click();
	Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	}
}
