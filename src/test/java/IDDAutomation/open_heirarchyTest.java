package IDDAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.driverSelection;
import pageObjects.History;
import pageObjects.IDDselectionPage;
import pageObjects.OrgBasicSearch;
import pageObjects.clickOnQueries;
import pageObjects.loginpage;
import pageObjects.open_heirarchy;

public class open_heirarchyTest  extends driverSelection {
	public static Logger log=LogManager.getLogger(open_heirarchyTest.class.getName());	
//	@BeforeTest
//	
//	public void initialize() throws IOException, InterruptedException
//	{
//		driver=initializeriver();
//		driver.get(prop.getProperty("URL"));
//		loginpage ln = new loginpage(driver);
//		ln.uname().sendKeys(prop.getProperty("username"));
//		ln.pwrd().sendKeys(prop.getProperty("password"));
//		ln.lgn().click();
//		IDDselectionPage idd=new IDDselectionPage(driver);
//		idd.iddselection().click();
//		Thread.sleep(10000);
//		clickOnQueries cq=new clickOnQueries(driver);
//		cq.queryClick().click();
//		Thread.sleep(10000);
//		driver.switchTo().frame(driver.findElement( By.xpath("//*[@id='wsfd-tab0t1']/iframe")));
//		OrgBasicSearch obs=new OrgBasicSearch(driver);
//		Actions action = new Actions(driver);
//		action.moveToElement(obs.OrgBasicClick()).doubleClick().build().perform();
//		Thread.sleep(3000);
//		obs.orgSearchData().sendKeys("wells");
//		Thread.sleep(3000);
//		obs.runsearchclick().click();
//		Thread.sleep(10000);
//	    obs.clickOnOpen().click();
//		Thread.sleep(10000);
//	
//		}
	
	@Test
	public void open_heirarchy_val() throws InterruptedException, IOException
	{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_DIR();
		Thread.sleep(3000);
		open_heirarchy ohr=new open_heirarchy(driver);
		ohr.open_heirarchyclick().click();
		Thread.sleep(10000);
		ohr.getAdobeFlashPlayer_click().click();
		Thread.sleep(10000);
		Runtime.getRuntime().exec("C:\\Users\\krangaiah\\MDMIDDAutomation\\MDMIDDallow_Test.exe");
		Thread.sleep(40000);
		Assert.assertEquals(ohr.getAdobeFlashPlayer_Test().getText(),"New Entity");
		System.out.println("open heirarchy pass");		
	}
	@AfterTest

	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
}



