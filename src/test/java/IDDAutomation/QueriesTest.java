package IDDAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.driverSelection;
import pageObjects.IDDselectionPage;
import pageObjects.clickOnQueries;
import pageObjects.loginpage;

public class QueriesTest extends driverSelection{
	public static Logger log=LogManager.getLogger(QueriesTest.class.getName());	
//	@BeforeTest
//	public void initialize() throws IOException, InterruptedException
//	{
//		driver=initializeriver();
//		driver.get(prop.getProperty("URL"));
//		loginpage ln = new loginpage(driver);
//		ln.uname().sendKeys(prop.getProperty("username"));
//		ln.pwrd().sendKeys(prop.getProperty("password"));
//		ln.lgn().click();
//		Thread.sleep(10000);
//		IDDselectionPage idd=new IDDselectionPage(driver);
//		idd.iddselection().click();
//		Thread.sleep(10000);
//	}
	@Test(priority=1)
	public void QueriesValidation_DIR() throws IOException, InterruptedException
	{
		IDDSelectionTest idds=new IDDSelectionTest();
		idds.IDDvalidation_DIR();
		Thread.sleep(2000);
		clickOnQueries cq=new clickOnQueries(driver);
		cq.queryClick().click();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement( By.xpath("//*[@id='wsfd-tab0t1']/iframe")));
		Assert.assertEquals(cq.clickOnQueriesTest().getText(),"Saved Queries");
		log.info("successfully clicked on Queries");
		System.out.println("queries pass"); 
	}
	
	@Test(priority=2)
	public void QueriesValidation_AGN() throws IOException, InterruptedException
	{
		IDDSelectionTest idds=new IDDSelectionTest();
		idds.IDDvalidation_AGN();	
		Thread.sleep(2000);
		clickOnQueries cq=new clickOnQueries(driver);
		cq.queryClick().click();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement( By.xpath("//*[@id='wsfd-tab0t1']/iframe")));
		Assert.assertEquals(cq.clickOnQueriesTest().getText(),"Saved Queries");
		log.info("successfully clicked on Queries");
		System.out.println("queries pass"); 
	}
	
	@Test(priority=3)
	public void QueriesValidation_NCS() throws IOException, InterruptedException
	{
		IDDSelectionTest idds=new IDDSelectionTest();
		idds.IDDvalidation_NCS();	
		Thread.sleep(2000);
		clickOnQueries cq=new clickOnQueries(driver);
		cq.queryClick().click();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement( By.xpath("//*[@id='wsfd-tab0t1']/iframe")));
		Assert.assertEquals(cq.clickOnQueriesTest().getText(),"Saved Queries");
		log.info("successfully clicked on Queries");
		System.out.println("queries pass"); 
	}
	@Test(priority=4)
	public void QueriesValidation_MGS() throws IOException, InterruptedException
	{
		IDDSelectionTest idds=new IDDSelectionTest();
		idds.IDDvalidation_MGS();	
		Thread.sleep(4000);
		clickOnQueries cq=new clickOnQueries(driver);
		cq.queryClick().click();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement( By.xpath("//*[@id='wsfd-tab0t1']/iframe")));
		Assert.assertEquals(cq.clickOnQueriesTest().getText(),"Saved Queries");
		log.info("successfully clicked on Queries");
		System.out.println("queries pass"); 
	}
	@Test(priority=5)
	public void QueriesValidation_PARTY() throws IOException, InterruptedException
	{
		IDDSelectionTest idds=new IDDSelectionTest();
		idds.IDDvalidation_PARTY();	
		Thread.sleep(4000);
		clickOnQueries cq=new clickOnQueries(driver);
		cq.queryClick().click();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement( By.xpath("//*[@id='wsfd-tab0t1']/iframe")));
		Assert.assertEquals(cq.clickOnQueriesTest().getText(),"Saved Queries");
		log.info("successfully clicked on Queries");
		System.out.println("queries pass"); 
	}
	@Test(priority=6)
	public void QueriesValidation_PARTY_GROUP() throws IOException, InterruptedException
	{
		IDDSelectionTest idds=new IDDSelectionTest();
		idds.IDDvalidation_PARTY_GROUP();	
		Thread.sleep(4000);
		clickOnQueries cq=new clickOnQueries(driver);
		cq.queryClick().click();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement( By.xpath("//*[@id='wsfd-tab0t1']/iframe")));
		Assert.assertEquals(cq.clickOnQueriesTest().getText(),"Saved Queries");
		log.info("successfully clicked on Queries");
		System.out.println("queries pass"); 
	}
	@AfterMethod

	public void teardown()
	{
		driver.close();
		driver=null;
	}



}
