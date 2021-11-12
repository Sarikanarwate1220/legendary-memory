package PageLayerPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseLayerPackage.baseclass1;

public class HomePage extends baseclass1 {
	 
	  @FindBy(className="user-display")
	  WebElement loginUser;
	  @FindBy(linkText="contacts")
	  WebElement createcontact;
	  @FindBy(linkText="deals")
	  WebElement createdeals;
	  public void HomePage(){
		  	PageFactory.initElements(driver, this); 
		  	
		  	
	  }
	  
	  public String ValidateloginUser() {
		String abc=  loginUser.getText();
		  System.out.println("logged user is ::"+abc);
		return abc;
		}
		public void Createcontactspage(){
			createcontact.click();	
		} 
		public void CreateDealspage(){
			createdeals.click();	
		}  
}
