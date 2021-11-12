package testLayerpackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageLayerPackage.HomePage;
import PageLayerPackage.createDealspage;
import PageLayerPackage.createcontactpage;
import PageLayerPackage.loginfunctionality;
import baseLayerPackage.baseclass1;

public class homePageTest extends baseclass1 {
	public static HomePage obj;
	public static HomePage  abc;
	 
		@BeforeClass
	    public void SetUp() {
				baseclass1.intialization(); 
				loginfunctionality obj =new loginfunctionality();
				HomePage abc= new HomePage();
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
	    String expectedName="Sarika Narwate";
	    Assert.assertEquals(loggedusername,expectedName);
		Thread.sleep(5000);
		}
		@Test(priority=3)
		public void contactPagefunctionality() throws InterruptedException {
			 obj.Createcontactspage();
		}
		@Test(priority=4)
		public void dealsPagefunctionality() throws InterruptedException {
			obj.CreateDealspage();
		}
		@AfterClass
		public void TearDown() {
			driver.close();
		}
}
