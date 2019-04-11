package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgBasicSearch {

WebDriver driver;
	
	public  OrgBasicSearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Org Basic')]")
	WebElement OrgBasic;
	
	@FindBy(xpath="//span[contains(text(),'Open Query')]")
			WebElement OpenQuery;
	
	@FindBy(xpath="//*[@id='aF:STC3:incSTC3:qriSB5:sfi1_SB5:search_criteria_1_SB5']")
	WebElement orgSearch;
	
	@FindBy(xpath="//td[contains(text(),'Run Search')]")
	WebElement runsearch;
	
	@FindBy(xpath="//td[contains(text(),'Open Hierarchy')]")
	
	WebElement OrgBasicSearchTest;
	
	@FindBy(xpath="//table/tbody/tr/td[contains(.,'Open')]/ancestor::div[@class='sipButCommon globalButton']")
	
	WebElement clickOnOpen;
	
	@FindBy(xpath="//td[contains(text(),'Open Hierarchy')]")
	
	WebElement openquery;
	
	@FindBy(xpath="//td/span/span[contains(text(),'Party Group')]")
	
	WebElement openquery_GROUP;
	
	
	@FindBy(xpath="//td[contains(text(),'Rowid Object')]")
	
	WebElement openquery_GROUP_test;
	
	public WebElement OrgBasicClick()
	{
		return OrgBasic;
	}
	public WebElement OpenQueryclick()
	{
		return OpenQuery;
	}
	public WebElement orgSearchData()
	{
		return orgSearch;
	}
	public WebElement runsearchclick()
	{
		return runsearch;
	}
	public WebElement OrgBasicSearchclick()
	{
		return OrgBasicSearchTest;
	}
	public WebElement clickOnOpen()
	{
		return clickOnOpen;
	}
	public WebElement openQueryTest()
	{
		return openquery;
	}
	public WebElement Party_group()
	{
		return openquery_GROUP;
	}
	public WebElement Party_group_test()
	{
		return openquery_GROUP_test;
	}
}

