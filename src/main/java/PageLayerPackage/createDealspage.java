package PageLayerPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayerPackage.baseclass1;

public class createDealspage extends baseclass1 {	  
		@FindBy(xpath="//a[@href='/deals/new']")
		WebElement createDeals;
		@FindBy(name="title")
		WebElement tittlename;
		@FindBy(name="//input[@class='search']")
		WebElement companyname;
		  public void createDealspage(){
				PageFactory.initElements(driver, this); 
			  }
		public void validateDealspage() {
			createDeals.click();
		}
		 public void Validatetittlename(String tname) {
			 tittlename.sendKeys(tname);
		 }
		
		 public void Validatecompanyname(String cname) {
			 companyname.sendKeys(cname);
		 }
}
