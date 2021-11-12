
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice1 {
	
	public static void main(String[] args) throws InterruptedException {
	int a=100;
		int b=20, c=300;
		if((a<b)&&(b>c)&&(b<a)) {
			System.out.println("a is big no");
		}
		else if((c<a)&&(c<b)&&(c>a))
		{
			System.out.println("c is big no");
		}
		else
		{
			System.out.println("c is big no");
		}
}
}