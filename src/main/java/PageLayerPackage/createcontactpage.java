package PageLayerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayerPackage.baseclass1;

public class createcontactpage extends baseclass1 {

	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement createpage;
	@FindBy(name="first_name")
	WebElement firstname;
	@FindBy(name="last_name")
	WebElement lastname;
	@FindBy(name="middle_name")
	WebElement middlename;
	@FindBy(name="value")
	WebElement emailid;
	@FindBy(name="description")
	WebElement Description;
	 public void createcontactpage() {
			PageFactory.initElements(driver, this); 
		  }
	public void validatecreatepage() {
		createpage.click();
	}
	 public void Validatefirstname(String fname) {
		  firstname.sendKeys(fname);
	 }
	 public void Validatelastname(String lname) {
		  lastname.sendKeys(lname);
	 }
	 public void Validatemiddlename(String mname) {
		  middlename.sendKeys(mname);
	 }
	 public void ValidateEmailid(String emailID) {
		  emailid.sendKeys(emailID);
	 }
	 public void Validatediscription(String abc) {
		  Description.sendKeys(abc);
	 }
}
