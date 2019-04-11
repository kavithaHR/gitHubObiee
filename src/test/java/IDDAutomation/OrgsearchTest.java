package IDDAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.driverSelection;
import pageObjects.IDDselectionPage;
import pageObjects.OrgBasicSearch;
import pageObjects.clickOnQueries;
import pageObjects.loginpage;

public class OrgsearchTest extends driverSelection {
	public static Logger log=LogManager.getLogger(OrgsearchTest.class.getName());	
//	@BeforeTest
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
//	}
	@Test(priority=1)
	public void OrgSearchValidation_DIR() throws IOException, InterruptedException
	{
		
		QueriesTest qr=new QueriesTest();
		qr.QueriesValidation_DIR();
		
		OrgBasicSearch obs=new OrgBasicSearch(driver);
		Actions action = new Actions(driver);
		action.moveToElement(obs.OrgBasicClick()).doubleClick().build().perform();
		Thread.sleep(10000);
		obs.orgSearchData().sendKeys("wells");
		Thread.sleep(3000);
		obs.runsearchclick().click();
		Thread.sleep(10000);
		Assert.assertEquals(obs.OrgBasicSearchclick().getText(), "Open Hierarchy");
		log.info("successfully clicked on RunSearch");
		Thread.sleep(3000);
		obs.clickOnOpen().click();
		Assert.assertEquals(obs.openQueryTest().getText(), "Open Hierarchy");
		log.info("successfully clicked on open button");
		System.out.println("orgsearchpass");

	}
	
	@Test(priority=2)
	public void OrgSearchValidation_AGN() throws IOException, InterruptedException
	{
		
		QueriesTest qr=new QueriesTest();
		qr.QueriesValidation_AGN();
		
		OrgBasicSearch obs=new OrgBasicSearch(driver);
		Actions action = new Actions(driver);
		action.moveToElement(obs.OrgBasicClick()).doubleClick().build().perform();
		Thread.sleep(10000);
		obs.orgSearchData().sendKeys("Academy Mortgage");
		Thread.sleep(3000);
		obs.runsearchclick().click();
		Thread.sleep(10000);
		Assert.assertEquals(obs.OrgBasicSearchclick().getText(), "Open Hierarchy");
		log.info("successfully clicked on RunSearch");
		Thread.sleep(3000);
		obs.clickOnOpen().click();
		Assert.assertEquals(obs.openQueryTest().getText(), "Open Hierarchy");
		log.info("successfully clicked on open button");
		System.out.println("orgsearchpass");

	}
	@Test(priority=3)
	public void OrgSearchValidation_NCS() throws IOException, InterruptedException
	{
		
		QueriesTest qr=new QueriesTest();
		qr.QueriesValidation_NCS();
		
		OrgBasicSearch obs=new OrgBasicSearch(driver);
		Actions action = new Actions(driver);
		action.moveToElement(obs.OrgBasicClick()).doubleClick().build().perform();
		Thread.sleep(10000);
		obs.orgSearchData().sendKeys("Academy Mortgage");
		Thread.sleep(3000);
		obs.runsearchclick().click();
		Thread.sleep(10000);
		Assert.assertEquals(obs.OrgBasicSearchclick().getText(), "Open Hierarchy");
		log.info("successfully clicked on RunSearch");
		Thread.sleep(3000);
		obs.clickOnOpen().click();
		Assert.assertEquals(obs.openQueryTest().getText(), "Open Hierarchy");
		log.info("successfully clicked on open button");
		System.out.println("orgsearchpass");

	}
	@Test(priority=4)
	public void OrgSearchValidation_MGS() throws IOException, InterruptedException
	{
		
		QueriesTest qr=new QueriesTest();
		qr.QueriesValidation_MGS();
		
		OrgBasicSearch obs=new OrgBasicSearch(driver);
		Actions action = new Actions(driver);
		action.moveToElement(obs.OrgBasicClick()).doubleClick().build().perform();
		Thread.sleep(10000);
		obs.orgSearchData().sendKeys("A Greener Life");
		Thread.sleep(3000);
		obs.runsearchclick().click();
		Thread.sleep(10000);
		Assert.assertEquals(obs.OrgBasicSearchclick().getText(), "Open Hierarchy");
		log.info("successfully clicked on RunSearch");
		Thread.sleep(3000);
		obs.clickOnOpen().click();
		Assert.assertEquals(obs.openQueryTest().getText(), "Open Hierarchy");
		log.info("successfully clicked on open button");
		System.out.println("orgsearchpass");

	}
	@Test(priority=5)
	public void OrgSearchValidation_PARTY() throws IOException, InterruptedException
	{
		
		QueriesTest qr=new QueriesTest();
		qr.QueriesValidation_PARTY();
		
		OrgBasicSearch obs=new OrgBasicSearch(driver);
		Actions action = new Actions(driver);
		action.moveToElement(obs.OrgBasicClick()).doubleClick().build().perform();
		Thread.sleep(10000);
		obs.orgSearchData().sendKeys("A Greener Life");
		Thread.sleep(3000);
		obs.runsearchclick().click();
		Thread.sleep(10000);
		Assert.assertEquals(obs.OrgBasicSearchclick().getText(), "Open Hierarchy");
		log.info("successfully clicked on RunSearch");
		Thread.sleep(3000);
		obs.clickOnOpen().click();
		Assert.assertEquals(obs.openQueryTest().getText(), "Open Hierarchy");
		log.info("successfully clicked on open button");
		System.out.println("orgsearchpass");

	}
	
	@Test(priority=6)
	public void OrgSearchValidation_PARTY_GROUP() throws IOException, InterruptedException
	{
		
		QueriesTest qr=new QueriesTest();
		qr.QueriesValidation_PARTY_GROUP();
		
		OrgBasicSearch obs=new OrgBasicSearch(driver);
		Actions action = new Actions(driver);
		action.moveToElement(obs.Party_group()).doubleClick().build().perform();
		Thread.sleep(10000);
		obs.orgSearchData().sendKeys("Snowball Inc");
		Thread.sleep(3000);
		obs.runsearchclick().click();
		Thread.sleep(10000);
		obs.clickOnOpen().click();
		Thread.sleep(3000);
		Assert.assertEquals(obs.Party_group_test().getText(), "Rowid Object");
		log.info("successfully clicked on open button");
		System.out.println("orgsearchpass");

	}
	@AfterMethod

	public void teardown()
	{
		driver.close();
		driver=null;
	}




}
