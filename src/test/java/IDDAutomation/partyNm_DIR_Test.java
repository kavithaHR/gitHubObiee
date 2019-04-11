package IDDAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import baseclass.driverSelection;
import pageObjects.PartyNm_Objects;
import pageObjects.clickOnQueries;


public class partyNm_DIR_Test  extends driverSelection{
	public static Logger log=LogManager.getLogger(partyNm_DIR_Test.class.getName());	
	@Test
	public void DIR_Val() throws IOException, InterruptedException
	{
	driver=initializeriver();
	driver.get(prop.getProperty("URL"));
	PartyNm_Objects prt = new PartyNm_Objects(driver);
	prt.uname().sendKeys(prop.getProperty("username"));
	prt.pwrd().sendKeys(prop.getProperty("password"));
	prt.lgn().click();
	d.until(ExpectedConditions.visibilityOfAllElements(prt.Iddselection_DIR()));
	Assert.assertEquals(prt.iddselection_DIR().getText(), "FA DIR IDD App");
	log.info("successfully logged in");
	System.out.println("loginpass");
	String idds2=prt.iddselection_DIR().getText();
	System.out.println(idds2);
	prt.iddselection_DIR().click();
	Thread.sleep(10000);
	Assert.assertEquals(prt.iddSelectionTest().getText(), "Queries");
	log.info("successfully selected IDD"+idds2 +"- Person");
	System.out.println("IDDSelection pass");
	//queries
	Thread.sleep(10000);
	prt.queryClick().click();
	Thread.sleep(10000);
	driver.switchTo().frame(driver.findElement( By.xpath("//*[@id='wsfd-tab0t1']/iframe")));
	Assert.assertEquals(prt.clickOnQueriesTest().getText(),"Saved Queries");
	log.info("successfully clicked on Queries");
	System.out.println("queries pass"); 
	//party search
	Actions action = new Actions(driver);
	action.moveToElement(prt.personBasicClick()).doubleClick().build().perform();
	Thread.sleep(10000);
	prt.extended_Search().click();
	Thread.sleep(10000);
	prt.personSearchData().sendKeys("John Gilman");
	Thread.sleep(10000);
	prt.runsearchclick().click();
	Thread.sleep(10000);
	Assert.assertEquals(prt.personBasicSearchclick().getText(), "Open Hierarchy");
	log.info("successfully clicked on RunSearch");
	Thread.sleep(10000);
	prt.clickOnOpen().click();
	Assert.assertEquals(prt.openQueryTest().getText(), "Open Hierarchy");
	log.info("successfully clicked on open button");
	System.out.println("orgsearchpass");
	Thread.sleep(10000);
	//data attributes
	prt.PersonAlternateNameclick().click();
	Thread.sleep(1000);
	prt.OrgElectronicAddressclick().click();
	Thread.sleep(10000);
	prt.Personclassificationclick().click();
	Thread.sleep(10000);
	prt.Personcommentsclick().click();
	Thread.sleep(10000);
	prt.OrgElectronicAddressclick().click();
	Thread.sleep(10000);
	prt.PersonIdentifierclick().click();
	Thread.sleep(10000);
	prt.PersonTeleComclick().click();
	Thread.sleep(10000);
	prt.ObjectRelclick().click();
	Thread.sleep(10000);
	prt.SubjectRelclick().click();
	Thread.sleep(10000);
	prt.Relationshipsclick().click();
	Thread.sleep(10000);
	prt.xrefclick().click();
	Thread.sleep(10000);
	Assert.assertEquals(prt.DataAttributesTest().getText(), "Person");
	log.info("successfully clicked on open button");
	System.out.println("data attributes pass");
	Thread.sleep(10000);
	prt.xrefClick().click();
	Assert.assertEquals(prt.xrefClickTest().getText(), "Customize Table");
	log.info("successfully clicked on xref button");
	System.out.println("xref pass");
	prt.historyClick().click();
	Thread.sleep(10000);
	Assert.assertEquals(prt.historyClickTest().getText(), "BO Updates");
	log.info("successfully clicked on xref button");
	System.out.println("historypass Person");
	}
	
	@AfterMethod

	public void teardown()
	{
		driver.close();
		driver=null;
	}

			
}
