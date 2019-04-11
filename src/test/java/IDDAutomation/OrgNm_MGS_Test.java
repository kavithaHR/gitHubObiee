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
import pageObjects.OrgNm_Objects;

public class OrgNm_MGS_Test extends driverSelection{
	public static Logger log=LogManager.getLogger(OrgNm_MGS_Test.class.getName());	
	@Test
	public void MGS_Val() throws IOException, InterruptedException
	{
	driver=initializeriver();
	driver.get(prop.getProperty("URL"));
	OrgNm_Objects org = new OrgNm_Objects(driver);
	org.uname().sendKeys(prop.getProperty("username"));
	org.pwrd().sendKeys(prop.getProperty("password"));
	org.lgn().click();
	d.until(ExpectedConditions.visibilityOfAllElements(org.Iddselection_Org_MGS()));
	Assert.assertEquals(org.Iddselection_Org_MGS().getText(), "FA MGS IDD App");
	log.info("successfully logged in");
	System.out.println("loginpass");
	String idds1=org.Iddselection_Org_MGS().getText();
	System.out.println(idds1);
	
	////IDD selection
	
	org.Iddselection_Org_MGS().click();
	Thread.sleep(10000);
	Assert.assertEquals(org.iddSelectionTest().getText(), "Queries");
	log.info("successfully selected IDD"+idds1 +"- Org");
	System.out.println("IDDSelection pass");
	////queries
	Thread.sleep(10000);
	org.queryClick().click();
	Thread.sleep(10000);
	driver.switchTo().frame(driver.findElement( By.xpath("//*[@id='wsfd-tab0t1']/iframe")));
	Assert.assertEquals(org.clickOnQueriesTest().getText(),"Saved Queries");
	log.info("successfully clicked on Queries");
	System.out.println("queries pass"); 
//	//org search
	Actions action = new Actions(driver);
	action.moveToElement(org.OrgBasicClick()).doubleClick().build().perform();
	Thread.sleep(10000);
	org.extended_Search().click();
	Thread.sleep(10000);
	org.OrgSearchData().sendKeys("Wells Fargo");
	Thread.sleep(10000);
	org.runsearchclick().click();
	Thread.sleep(100000);
	Assert.assertEquals(org.OrgBasicSearchclick().getText(), "Open Hierarchy");
	log.info("successfully clicked on RunSearch");
	Thread.sleep(10000);
	org.clickOnOpen().click();
	Assert.assertEquals(org.openQueryTest().getText(), "Open Hierarchy");
	log.info("successfully clicked on open button");
	System.out.println("orgsearchpass");
	Thread.sleep(10000);
//	//data attributes
	org.OrgAlternateNameclick().click();
	Thread.sleep(1000);
	org.OrgElectronicAddressclick().click();
	Thread.sleep(10000);
	org.Orgclassificationclick().click();
	Thread.sleep(10000);
	org.Orgcommentsclick().click();
	Thread.sleep(10000);
	org.OrgElectronicAddressclick().click();
	Thread.sleep(10000);
	org.OrgIdentifierclick().click();
	Thread.sleep(10000);
	org.OrgTeleComclick().click();
	Thread.sleep(10000);
	org.ObjectRelclick().click();
	Thread.sleep(10000);
	org.SubjectRelclick().click();
	Thread.sleep(10000);
	org.Relationshipsclick().click();
	Thread.sleep(10000);
	org.xrefclick().click();
	Assert.assertEquals(org.DataAttributesTest().getText(), "Organization");
	log.info("successfully clicked on open button");
	System.out.println("data attributes pass");
	Thread.sleep(10000);
	org.xrefClick().click();
	Thread.sleep(10000);
	Assert.assertEquals(org.xrefClickTest().getText(), "Customize Table");
	log.info("successfully clicked on xref button");
	System.out.println("xref pass");
	org.historyClick().click();
	Thread.sleep(10000);
	Assert.assertEquals(org.historyClickTest().getText(), "BO Updates");
	log.info("successfully clicked on xref button");
	System.out.println("historypass org");
	}
	
	@AfterMethod

	public void teardown()
	{
		driver.close();
		driver=null;
	}

			

}
