package baseLayerPackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dimensionmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   //change dimension of the browser
		   Dimension d= new Dimension(2000,4000);
		   driver.manage().window().setSize(d);
	}

}
