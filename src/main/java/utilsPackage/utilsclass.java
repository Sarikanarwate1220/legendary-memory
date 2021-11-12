package utilsPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
 
import baseLayerPackage.baseclass;

public class utilsclass extends baseclass {
	public static void dropDownHandle(WebElement wb, String DPvalue) {
		Select sel=new Select(wb);
		sel.selectByVisibleText(DPvalue);
	}
	public static void CountDPValue(WebElement wb) {
		Select sel=new Select(wb);
		List<WebElement> ls=sel.getOptions();
		ls.size();
		for(WebElement abc:ls)
		{
			String data=abc.getText();
			System.out.println("drop down values are :"+data);
		}	
	}
}

