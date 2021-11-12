package testLayerpackage;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageLayerPackage.HomePage;
import PageLayerPackage.createDealspage;
import PageLayerPackage.createcontactpage;
import PageLayerPackage.loginfunctionality;
import baseLayerPackage.baseclass;
import baseLayerPackage.baseclass1;

public class loginpageTest extends  baseclass1{
	public static HomePage obj;
  public static createcontactpage abc;
  public static createDealspage xyz;
	@BeforeClass
    public void SetUp() {
			baseclass1.intialization(); 
	
		
	}
	
	@Test(priority=1)
    public void usernamefunctionality() throws InterruptedException {
			
			loginfunctionality obj= new loginfunctionality();
			
			obj.ValidateUsername("narwatesarika078@gmail.com");
			obj.ValidatePassword("Saru078@");
			obj.Validateloginbutton();
			Thread.sleep(5000);
		}
		@Test(priority=2)
		public void loggeduserfunctionality() throws InterruptedException {
			 obj=new HomePage();
		String loggedusername=obj.ValidateloginUser();
		System.out.println(loggedusername);
		Thread.sleep(5000);
		}
		@Test(priority=3)
		public void contactPagefunctionality() throws InterruptedException {
			 obj.Createcontactspage();
		}
		@Test(priority=4)
		public void createContactPagefunctionality() throws InterruptedException {
			createcontactpage abc= new createcontactpage();
			abc.validatecreatepage();
			abc.Validatefirstname("sarika");
			abc.Validatemiddlename("I");
			abc.Validatelastname("Narwate");
			abc.Validatediscription("ok");
			Thread.sleep(5000);
		}
		@Test(priority=5)
		public void dealsPagefunctionality() throws InterruptedException {
			obj.CreateDealspage();
		}
	  @Test(priority=6)
	   public void creatdealspageFunctionality() {
	   createDealspage xyz= new createDealspage();
	   xyz.Validatetittlename("Student");
	   xyz.Validatecompanyname("Amdocs");
	}
		@AfterClass
		public void TearDown() {
			driver.close();
		}
	}
