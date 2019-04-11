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

public class GroupName_Test  extends driverSelection{
	public static Logger log=LogManager.getLogger(GroupName_Test.class.getName());	
	@Test
	public void GroupName_Val() throws IOException, InterruptedException
	{
	driver=initializeriver();
	driver.get(prop.getProperty("URL"));
	OrgNm_Objects org = new OrgNm_Objects(driver);
	org.uname().sendKeys(prop.getProperty("username"));
	org.pwrd().sendKeys(prop.getProperty("password"));
	org.lgn().click();
	d.until(ExpectedConditions.visibilityOfAllElements(org.Party_Group_IDD()));
	Assert.assertEquals(org.Party_Group_IDD().getText(), "FA PARTY GROUP IDD App");
	log.info("successfully logged in");
	System.out.println("loginpass");
	String idds1=org.Party_Group_IDD().getText();
	System.out.println(idds1);
	
	////IDD selection
	
	org.Party_Group_IDD().click();
	Thread.sleep(10000);
	Assert.assertEquals(org.iddSelectionTest().getText(), "Queries");
	log.info("successfully selected IDD"+idds1+"- group");
	System.out.println("IDDSelection pass");
//	////queries
//	Thread.sleep(2000);
	org.queryClick().click();
	Thread.sleep(10000);
	driver.switchTo().frame(driver.findElement( By.xpath("//*[@id='wsfd-tab0t1']/iframe")));
	Assert.assertEquals(org.clickOnQueriesTest().getText(),"Saved Queries");
	log.info("successfully clicked on Queries");
	System.out.println("queries pass"); 
//	//org search
	Actions action = new Actions(driver);
	action.moveToElement(org.Party_Group_click()).doubleClick().build().perform();
	Thread.sleep(10000);
	org.extended_Search().click();
	Thread.sleep(10000);
	org.Party_Group_search().sendKeys("Wells Fargo");
	Thread.sleep(3000);
	org.runsearchclick().click();
	Thread.sleep(20000);
	Assert.assertEquals(org.Party_Group_Test().getText(), "Open");
	log.info("successfully clicked on RunSearch");
	Thread.sleep(3000);
	org.clickOnOpen().click();
	Thread.sleep(3000);
	Assert.assertEquals(org.clickOnOpen_Test().getText(), "Rowid Object");
	log.info("successfully clicked on open button");
	System.out.println("groupsearchpass");
	Thread.sleep(10000);
////	//data attributes


	org.xrefclick().click();
	Thread.sleep(3000);
	org.xrefClick().click();
	Thread.sleep(3000);
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

