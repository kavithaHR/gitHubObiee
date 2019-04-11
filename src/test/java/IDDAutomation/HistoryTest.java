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
import pageObjects.History;
import pageObjects.IDDselectionPage;
import pageObjects.OrgBasicSearch;
import pageObjects.clickOnQueries;
import pageObjects.loginpage;
import pageObjects.xref;

public class HistoryTest  extends driverSelection {
	public static Logger log=LogManager.getLogger(HistoryTest.class.getName());	
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
//		System.out.println("p1");
//		obs.orgSearchData().sendKeys("wells");
//		Thread.sleep(3000);
//		System.out.println("p2");
//		obs.runsearchclick().click();
//		Thread.sleep(10000);
//		System.out.println("p3");
//		obs.clickOnOpen().click();
//		System.out.println("p4");
//		Thread.sleep(1000);
//		//driver.findElement(By.linkText("XREF")).click();
//		}
//	
	@Test(priority=1)
	public void HistoryVal_DIR() throws InterruptedException, IOException
	{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_DIR();
		Thread.sleep(3000);
		History hsr=new History(driver);
		hsr.historyClick().click();
		Thread.sleep(10000);
		Assert.assertEquals(hsr.historyClickTest().getText(), "BO Updates");
		log.info("successfully clicked on xref button");
		System.out.println("historypass");
	}
	
	@Test(priority=2)
	public void HistoryVal_AGN() throws InterruptedException, IOException
	{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_AGN();
		Thread.sleep(10000);
		History hsr=new History(driver);
		hsr.historyClick().click();
		Thread.sleep(10000);
		Assert.assertEquals(hsr.historyClickTest().getText(), "BO Updates");
		log.info("successfully clicked on xref button");
		System.out.println("historypass");
	}
	@Test(priority=3)
	public void HistoryVal_NCS() throws InterruptedException, IOException
	{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_NCS();
		Thread.sleep(10000);
		History hsr=new History(driver);
		hsr.historyClick().click();
		Thread.sleep(10000);
		Assert.assertEquals(hsr.historyClickTest().getText(), "BO Updates");
		log.info("successfully clicked on xref button");
		System.out.println("historypass");
	}
	@Test(priority=4)
	public void HistoryVal_MGS() throws InterruptedException, IOException
	{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_MGS();
		Thread.sleep(10000);
		History hsr=new History(driver);
		hsr.historyClick().click();
		Thread.sleep(10000);
		Assert.assertEquals(hsr.historyClickTest().getText(), "BO Updates");
		log.info("successfully clicked on xref button");
		System.out.println("historypass");
	}
	
	@Test(priority=5)
	public void HistoryVal_PARTY() throws InterruptedException, IOException
	{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_PARTY();
		Thread.sleep(10000);
		History hsr=new History(driver);
		hsr.historyClick().click();
		Thread.sleep(10000);
		Assert.assertEquals(hsr.historyClickTest().getText(), "BO Updates");
		log.info("successfully clicked on xref button");
		System.out.println("historypass");
	}
	@Test(priority=6)
	public void HistoryVal_PARTY_GROUP() throws InterruptedException, IOException
	{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_PARTY_GROUP();
		Thread.sleep(10000);
		History hsr=new History(driver);
		hsr.historyClick().click();
		Thread.sleep(10000);
		Assert.assertEquals(hsr.historyClickTest().getText(), "BO Updates");
		log.info("successfully clicked on xref button");
		System.out.println("historypass");
	}
	@AfterMethod

	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
}



