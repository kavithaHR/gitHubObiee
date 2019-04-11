package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartyNm_Objects {
	
WebDriver driver;
	
	public  PartyNm_Objects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='ifrm1_user']/input")
	WebElement username;
	
	@FindBy(xpath="//*[@id='ifrm1_password']/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id='infaButton1']/span")
	WebElement login;
	
	@FindBy(xpath="//a[contains(text(),'FA DIR IDD App')]")
	WebElement iddselection_DIR;
	@FindBy(xpath="//a[contains(text(),'FA AGN IDD App')]")
	WebElement iddselection_AGN;
	@FindBy(xpath="//a[contains(text(),'FA NCS IDD App')]")
	WebElement iddselection_NCS;
	@FindBy(xpath="//a[contains(text(),'FA MGS IDD App')]")
	WebElement iddselection_MGS;
	@FindBy(xpath="//a[contains(text(),'FA PARTY IDD App')]")
	WebElement iddselect_Party;
	
	public WebElement uname()
	{
		return username;
	}
	public WebElement pwrd()
	{
		return password;
	}
	public WebElement lgn()
	{
		return login;
	}
	public WebElement Iddselection_DIR()
	{
		return iddselect_DIR;

	}
	public WebElement Iddselection_AGN()
	{
		return iddselect_AGN;

	}
	public WebElement Iddselection_MGS()
	{
		return iddselect_MGS;

	}
	public WebElement Iddselection_NCS()
	{
		return iddselect_NCS;

	}
	public WebElement Iddselection_Party()
	{
		return iddselect_PARTY;

	}
	//IDD selection 
	@FindBy(xpath="//a[contains(text(),'FA DIR IDD App')]")
	WebElement iddselect_DIR;
	
	@FindBy(xpath="//a[contains(text(),'FA AGN IDD App')]")
	WebElement iddselect_AGN;
	
	@FindBy(xpath="//a[contains(text(),'FA NCS IDD App')]")
	WebElement iddselect_NCS;
	
	@FindBy(xpath="//a[contains(text(),'FA MGS IDD App')]")
	WebElement iddselect_MGS;
	
	@FindBy(xpath="//a[contains(text(),'FA PARTY IDD App')]")
	WebElement iddselect_PARTY;
	
	@FindBy(xpath="//a[contains(text(),'FA PARTY GROUP IDD App')]")
	WebElement iddselect_PARTY_GROUP;
	
	@FindBy(xpath="//td[contains(text(),'Queries')]")
	WebElement queries;

	public WebElement iddselection_DIR()
	{
		return iddselect_DIR;
	}
	public WebElement iddselection_AGN()
	{
		return iddselect_AGN;
	}
	public WebElement iddselection_NCS()
	{
		return iddselect_NCS;
	}
	
	public WebElement iddselection_MGS()
	{
		return iddselect_MGS;
	}
	public WebElement iddselection_PARTY()
	{
		return iddselect_PARTY;
	}
	public WebElement iddselection_PARTY_GROUP()
	{
		return iddselect_PARTY_GROUP;
	}
	public WebElement iddSelectionTest()
	{
		return queries;
	}
//queries
	@FindBy(xpath="//td[contains(text(),'Queries')]")
	WebElement query;
	
	@FindBy(xpath="//div[contains(text(),'Saved Queries')]")
			WebElement clickOnQuery;
	
	public WebElement queryClick()
	{
		return query;
	}
	public WebElement clickOnQueriesTest()
	{
		return clickOnQuery;
	}
//party search
	@FindBy(xpath="//span[contains(text(),'Person Basic')]")
	WebElement PersonBasic;
	
	@FindBy(xpath="//span[contains(text(),'Open Query')]")
			WebElement OpenQuery;
	
	@FindBy(xpath="//*[@id='aF:STC3:incSTC3:qriSB5:sfi1_SB5:search_criteria_1_SB5']")
	WebElement personSearch;
	
	@FindBy(xpath="//td[contains(text(),'Run Search')]")
	WebElement runsearch;
	
	@FindBy(xpath="//td[contains(text(),'Open Hierarchy')]")
	
	WebElement personBasicSearchTest;
	
	@FindBy(xpath="//table/tbody/tr/td[contains(.,'Open')]/ancestor::div[@class='sipButCommon globalButton']")
	
	WebElement clickOnOpen;
	
	@FindBy(xpath="//td[contains(text(),'Open Hierarchy')]")
	
	WebElement openquery;
	
	@FindBy(xpath="//input[@type='radio']/following::label[contains(text(),'Extended Search')]")
	WebElement extenededSearch;
	
//	@FindBy(xpath="//td/span/span[contains(text(),'Party Group')]")
//	
//	WebElement openquery_GROUP;
	
	
//	@FindBy(xpath="//td[contains(text(),'Rowid Object')]")
//	
//	WebElement openquery_GROUP_test;
	
	public WebElement personBasicClick()
	{
		return PersonBasic;
	}
	public WebElement OpenQueryclick()
	{
		return OpenQuery;
	}
	public WebElement personSearchData()
	{
		return personSearch;
	}
	
	public WebElement extended_Search()
	{
		return  extenededSearch;
	}
	public WebElement runsearchclick()
	{
		return runsearch;
	}
	public WebElement personBasicSearchclick()
	{
		return personBasicSearchTest;
	}
	
	
	public WebElement clickOnOpen()
	{
		return clickOnOpen;
	}
	public WebElement openQueryTest()
	{
		return openquery;
	}
//	public WebElement Party_group()
//	{
//		return openquery_GROUP;
//	}
//	public WebElement Party_group_test()
//	{
//		return openquery_GROUP_test;
//	}
	
	//data attributes
	
	@FindBy(linkText="Person Alternate Name")
	WebElement PersonAlternateName;
	
	@FindBy(linkText="Person  Address")
	WebElement PersonAddress;
	
	@FindBy(linkText="Person Comments")
	WebElement PersonComments;
	
	@FindBy(linkText="Person Classification")
	WebElement PersonClassification;
	
	@FindBy(linkText="Person Electronic Address")
	WebElement PersonElectronicAddress;
	
	@FindBy(linkText="Person Identifier")
	WebElement PersonIdentifier;
	
	@FindBy(linkText="Person TeleCom")
	WebElement PersonTeleCom;
	
	@FindBy(linkText="Subject Rel")
	WebElement SubjectRel;
	
	@FindBy(linkText="Object Rel")
	WebElement ObjectRel;
	
	@FindBy(linkText="Relationships")
	WebElement Relationships;
	
	@FindBy(xpath="//a/span[contains(.,'XREF')]/preceding-sibling::img")
	WebElement xref;
	
	@FindBy(linkText="Person")
	WebElement dataattributesavailable;
	
//	@FindBy(xpath="//td[contains(text(),'Rowid Object')]")
//	WebElement dataattributes_group;
	
	public WebElement PersonAlternateNameclick()
	{
		return PersonAlternateName;
	}
	public WebElement Personaddressclick()
	{
		return PersonAddress;
	}
	public WebElement Personclassificationclick()
	{
		return PersonClassification;
	}
	public WebElement Personcommentsclick()
	{
		return PersonComments;
	}
	public WebElement OrgElectronicAddressclick()
	{
		return PersonElectronicAddress;
	}
	public WebElement PersonIdentifierclick()
	{
		return PersonIdentifier;
	}
	public WebElement PersonTeleComclick()
	{
		return PersonTeleCom;
	}
	public WebElement SubjectRelclick()
	{
		return SubjectRel;
	}
	public WebElement ObjectRelclick()
	{
		return ObjectRel;
	}
	public WebElement Relationshipsclick()
	{
		return Relationships;
	}
	public WebElement xrefclick()
	{
		return xref;
	}
	public WebElement DataAttributesTest()
	{
		return dataattributesavailable;
		}
 //////xref validation
	
	@FindBy(linkText="XREF")
	WebElement xrefbutton;
	
	@FindBy(xpath="//td[contains(text(),'Customize Table')]")
	WebElement xrefbuttonTest;
	
	//@FindBy(xpath="//td[contains(text(),'Customize Table')]")
	
	public WebElement xrefClick()
	{
		return xrefbutton;
	}
	public WebElement xrefClickTest()
	{
		return xrefbuttonTest;
	}
	
	
	////history test
	
	@FindBy(linkText="History")
	WebElement historybutton;
	
	@FindBy(xpath="//span[contains(text(),'BO Updates')]")
	WebElement historybuttonTest;
	
	//@FindBy(xpath="//td[contains(text(),'Customize Table')]")
	
	public WebElement historyClick()
	{
		return historybutton;
	}
	public WebElement historyClickTest()
	{
		return historybuttonTest;
	}

}







