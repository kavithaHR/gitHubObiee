package IDDAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.driverSelection;
import pageObjects.IDDselectionPage;
import pageObjects.loginpage; 

public class loginTest extends driverSelection {
	
	
	public static Logger log=LogManager.getLogger(loginTest.class.getName());	
	
	//@Test(dataProvider="getData")
	//public void loginpage(String URL ,String username,String password) throws IOException
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeriver();
	}
	
	
	@Test
	public void loginpage() throws IOException, InterruptedException
	{
		
		driver.get(prop.getProperty("URL"));
		loginpage ln = new loginpage(driver);
		ln.uname().sendKeys(prop.getProperty("username"));
		ln.pwrd().sendKeys(prop.getProperty("password"));
		//System.out.println("sa");
		ln.lgn().click();
		d.until(ExpectedConditions.visibilityOfAllElements(ln.iddselection()));
		Assert.assertEquals(ln.iddselection().getText(), "FA DIR IDD App");
		log.info("successfully logged in");
		System.out.println("loginpass");
		
	}
@AfterMethod

public void teardown()
{
	driver.close();
	driver=null;
}
//	@DataProvider
//	public Object[][] getData()
//	{
//		Object[][] data=new Object[1][3];
//		data[0][0]="http://snavnappimdm011:7001/bdd/";
//		data[0][1]="krangaiah";
//		data[0][2]="Welcome04";
//		return data;
//	}
}
