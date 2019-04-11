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
import pageObjects.DataAttributes;
import pageObjects.IDDselectionPage;
import pageObjects.OrgBasicSearch;
import pageObjects.clickOnQueries;
import pageObjects.loginpage;

public class dataAttributesTest extends driverSelection {
	public static Logger log=LogManager.getLogger(dataAttributesTest.class.getName());	
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
//		//driver.findElement(By.linkText("Org Alternate Name")).click();
//		//driver.findElement(By.xpath("//span[contains(text(),'Org Alternate Name')]")).click();
//	}
	
	@Test(priority=1)
	public void dataAttrVal_DIR() throws InterruptedException, IOException{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_DIR();
		Thread.sleep(10000);
		DataAttributes da=new DataAttributes(driver);
		da.OrgAlternateNameclick().click();
		Thread.sleep(1000);
		da.Orgaddressclick().click();
		Thread.sleep(3000);
		da.Orgclassificationclick().click();
		Thread.sleep(3000);
		da.Orgcommentsclick().click();
		Thread.sleep(3000);
		da.OrgElectronicAddressclick().click();
		Thread.sleep(3000);
		da.OrgIdentifierclick().click();
		Thread.sleep(3000);
		da.OrgTeleComclick().click();
		Thread.sleep(3000);
		da.ObjectRelclick().click();
		Thread.sleep(3000);
		da.SubjectRelclick().click();
		Thread.sleep(3000);
		da.Relationshipsclick().click();
		Thread.sleep(3000);
		da.xrefclick().click();
		Assert.assertEquals(da.DataAttributesTest().getText(), "Organization");
		log.info("successfully clicked on open button");
		System.out.println("data attributes pass");
	}
	
	@Test(priority=2)
	public void dataAttrVal_AGN() throws InterruptedException, IOException{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_AGN();
		Thread.sleep(10000);
		DataAttributes da=new DataAttributes(driver);
		da.OrgAlternateNameclick().click();
		Thread.sleep(1000);
		da.Orgaddressclick().click();
		Thread.sleep(3000);
		da.Orgclassificationclick().click();
		Thread.sleep(3000);
		da.Orgcommentsclick().click();
		Thread.sleep(3000);
		da.OrgElectronicAddressclick().click();
		Thread.sleep(3000);
		da.OrgIdentifierclick().click();
		Thread.sleep(3000);
		da.OrgTeleComclick().click();
		Thread.sleep(3000);
		da.ObjectRelclick().click();
		Thread.sleep(3000);
		da.SubjectRelclick().click();
		Thread.sleep(3000);
		da.Relationshipsclick().click();
		Thread.sleep(3000);
		da.xrefclick().click();
		Assert.assertEquals(da.DataAttributesTest().getText(), "Organization");
		log.info("successfully clicked on open button");
		System.out.println("data attributes pass");
	}
	
	@Test(priority=3)
	public void dataAttrVal_NCS() throws InterruptedException, IOException{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_NCS();
		Thread.sleep(10000);
		DataAttributes da=new DataAttributes(driver);
		da.OrgAlternateNameclick().click();
		Thread.sleep(1000);
		da.Orgaddressclick().click();
		Thread.sleep(3000);
		da.Orgclassificationclick().click();
		Thread.sleep(3000);
		da.Orgcommentsclick().click();
		Thread.sleep(3000);
		da.OrgElectronicAddressclick().click();
		Thread.sleep(3000);
		da.OrgIdentifierclick().click();
		Thread.sleep(3000);
		da.OrgTeleComclick().click();
		Thread.sleep(3000);
		da.ObjectRelclick().click();
		Thread.sleep(3000);
		da.SubjectRelclick().click();
		Thread.sleep(3000);
		da.Relationshipsclick().click();
		Thread.sleep(3000);
		da.xrefclick().click();
		Assert.assertEquals(da.DataAttributesTest().getText(), "Organization");
		log.info("successfully clicked on open button");
		System.out.println("data attributes pass");
	}
	@Test(priority=4)
	public void dataAttrVal_MGS() throws InterruptedException, IOException{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_NCS();
		Thread.sleep(10000);
		DataAttributes da=new DataAttributes(driver);
		da.OrgAlternateNameclick().click();
		Thread.sleep(1000);
		da.Orgaddressclick().click();
		Thread.sleep(3000);
		da.Orgclassificationclick().click();
		Thread.sleep(3000);
		da.Orgcommentsclick().click();
		Thread.sleep(3000);
		da.OrgElectronicAddressclick().click();
		Thread.sleep(3000);
		da.OrgIdentifierclick().click();
		Thread.sleep(3000);
		da.OrgTeleComclick().click();
		Thread.sleep(3000);
		da.ObjectRelclick().click();
		Thread.sleep(3000);
		da.SubjectRelclick().click();
		Thread.sleep(3000);
		da.Relationshipsclick().click();
		Thread.sleep(3000);
		da.xrefclick().click();
		Assert.assertEquals(da.DataAttributesTest().getText(), "Organization");
		log.info("successfully clicked on open button");
		System.out.println("data attributes pass");
	}
	
	@Test(priority=5)
	public void dataAttrVal_PARTY() throws InterruptedException, IOException{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_PARTY();
		Thread.sleep(10000);
		DataAttributes da=new DataAttributes(driver);
		da.OrgAlternateNameclick().click();
		Thread.sleep(1000);
		da.Orgaddressclick().click();
		Thread.sleep(3000);
		da.Orgclassificationclick().click();
		Thread.sleep(3000);
		da.Orgcommentsclick().click();
		Thread.sleep(3000);
		da.OrgElectronicAddressclick().click();
		Thread.sleep(3000);
		da.OrgIdentifierclick().click();
		Thread.sleep(3000);
		da.OrgTeleComclick().click();
		Thread.sleep(3000);
		da.ObjectRelclick().click();
		Thread.sleep(3000);
		da.SubjectRelclick().click();
		Thread.sleep(3000);
		da.Relationshipsclick().click();
		Thread.sleep(3000);
		da.xrefclick().click();
		Assert.assertEquals(da.DataAttributesTest().getText(), "Organization");
		log.info("successfully clicked on open button");
		System.out.println("data attributes pass");
	}
	@Test(priority=6)
	public void dataAttrVal_PARTY_GROUP() throws InterruptedException, IOException{
		OrgsearchTest orgser=new OrgsearchTest();
		orgser.OrgSearchValidation_PARTY_GROUP();
		Thread.sleep(10000);
		DataAttributes da=new DataAttributes(driver);
		//Thread.sleep(3000);
		da.xrefclick().click();
		Assert.assertEquals(da.DataAttributes_group_Test().getText(), "Rowid Object");
		log.info("successfully clicked on open button");
		System.out.println("data attributes pass");
	}
	@AfterMethod

	public void teardown()
	{
		driver.close();
		driver=null;
	}
}

