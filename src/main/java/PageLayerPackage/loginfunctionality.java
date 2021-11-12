package PageLayerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayerPackage.baseclass1;

public class loginfunctionality extends baseclass1{
	
   @FindBy(xpath="//input[@name='email']")
  WebElement Username;
  @FindBy(name="password")
  WebElement Password;
  @FindBy(xpath="//div[@class='ui fluid large blue submit button']")
  WebElement loginButton;
  
  public loginfunctionality() {
  	
		PageFactory.initElements(driver, this);
	} 
  public void ValidateUsername(String uname) {
	  Username.sendKeys(uname);
  }
  public void ValidatePassword(String pname) {
	  Password.sendKeys(pname);
  }
  
  public void Validateloginbutton() {
	  loginButton.click();
  }

}
