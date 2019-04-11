package IDDAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.driverSelection;
import pageObjects.IDDselectionPage;
import pageObjects.loginpage;

public class IDDSelectionTest extends driverSelection{
	public static Logger log=LogManager.getLogger(IDDSelectionTest.class.getName());	
//	@BeforeTest
//	public void initialize() throws IOException
//	{
//		driver=initializeriver();
//		driver.get(prop.getProperty("URL"));
//		loginpage ln = new loginpage(driver);
//		ln.uname().sendKeys(prop.getProperty("username"));
//		ln.pwrd().sendKeys(prop.getProperty("password"));
//		ln.lgn().click();
//		System.out.println("p1");
//	}
	@Test(priority=1)
	public void IDDvalidation_DIR() throws IOException, InterruptedException
	{
	loginTest lgntest=new loginTest();
	lgntest.initialize();
	lgntest.loginpage();
	IDDselectionPage idd=new IDDselectionPage(driver);
	String idds=idd.iddselection_DIR().getText();
	System.out.println(idds);
	idd.iddselection_DIR().click();
	Thread.sleep(10000);
	Assert.assertEquals(idd.iddSelectionTest().getText(), "Queries");
	log.info("successfully selected IDD");
	System.out.println("IDDSelection pass");
	}
	
	@Test(priority=2)
	public void IDDvalidation_AGN() throws IOException, InterruptedException
	{
	loginTest lgntest=new loginTest();
	lgntest.initialize();
	lgntest.loginpage();
	IDDselectionPage idd=new IDDselectionPage(driver);
	String idds=idd.iddselection_AGN().getText();
	System.out.println(idds);
	
	idd.iddselection_AGN().click();
	Thread.sleep(10000);
	Assert.assertEquals(idd.iddSelectionTest().getText(), "Queries");
	log.info("successfully selected IDD");
	System.out.println("IDDSelection pass");
	}
	
	@Test(priority=3)
	public void IDDvalidation_NCS() throws IOException, InterruptedException
	{
	loginTest lgntest=new loginTest();
	lgntest.initialize();
	lgntest.loginpage();
	IDDselectionPage idd=new IDDselectionPage(driver);
	String idds=idd.iddselection_NCS().getText();
	System.out.println(idds);
	
	idd.iddselection_NCS().click();
	Thread.sleep(10000);
	Assert.assertEquals(idd.iddSelectionTest().getText(), "Queries");
	log.info("successfully selected IDD");
	System.out.println("IDDSelection pass");
	}
	
	@Test(priority=4)
	public void IDDvalidation_MGS() throws IOException, InterruptedException
	{
	loginTest lgntest=new loginTest();
	lgntest.initialize();
	lgntest.loginpage();
	IDDselectionPage idd=new IDDselectionPage(driver);
	String idds=idd.iddselection_MGS().getText();
	System.out.println(idds);
	
	idd.iddselection_MGS().click();
	Thread.sleep(10000);
	Assert.assertEquals(idd.iddSelectionTest().getText(), "Queries");
	log.info("successfully selected IDD");
	System.out.println("IDDSelection pass");
	}
	
	@Test(priority=5)
	public void IDDvalidation_PARTY() throws IOException, InterruptedException
	{
	loginTest lgntest=new loginTest();
	lgntest.initialize();
	lgntest.loginpage();
	IDDselectionPage idd=new IDDselectionPage(driver);
	String idds=idd.iddselection_PARTY().getText();
	System.out.println(idds);
	
	idd.iddselection_PARTY().click();
	Thread.sleep(10000);
	Assert.assertEquals(idd.iddSelectionTest().getText(), "Queries");
	log.info("successfully selected IDD");
	System.out.println("IDDSelection pass");
	}
	
	@Test(priority=6)
	public void IDDvalidation_PARTY_GROUP() throws IOException, InterruptedException
	{
	loginTest lgntest=new loginTest();
	lgntest.initialize();
	lgntest.loginpage();
	IDDselectionPage idd=new IDDselectionPage(driver);
	String idds=idd.iddselection_PARTY_GROUP().getText();
	System.out.println(idds);
	
	idd.iddselection_PARTY_GROUP().click();
	Thread.sleep(10000);
	Assert.assertEquals(idd.iddSelectionTest().getText(), "Queries");
	log.info("successfully selected IDD");
	System.out.println("IDDSelection pass");
	}
	@AfterMethod

	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
