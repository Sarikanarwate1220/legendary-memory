import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtomethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("file:///F:/HTML%20Code/multipleBrowser.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("sachin");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("malegave");
		driver.findElement(By.linkText("Visit Facebook")).click();
		driver.findElement(By.linkText("Visit Orange HRM")).click();
		Set<String> H1=driver.getWindowHandles();
		ArrayList<String> s1=new ArrayList <String>(H1);
		
		Thread.sleep(1000);
		
		driver.switchTo().window(s1.get(1));
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
		
		Thread.sleep(1000);
		
		driver.switchTo().window(s1.get(2));
		
		driver.findElement(By.id("email")).sendKeys("8087181504");
		
		Thread.sleep(1000);
		
		driver.switchTo().window(s1.get(0));
		
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("anand nagar udgir");
		
		
		
		
		
		
		
		

	



	}

}
