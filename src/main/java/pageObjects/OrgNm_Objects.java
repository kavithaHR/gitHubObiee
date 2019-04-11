package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgNm_Objects {
WebDriver driver;
	
	public  OrgNm_Objects(WebDriver driver)
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
	WebElement iddselection_Party;
	
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
	public WebElement Iddselection_Org_DIR()
	{
		return iddselection_DIR;

	}
	public WebElement Iddselection_Org_AGN()
	{
		return iddselection_AGN;

	}
	public WebElement Iddselection_Org_MGS()
	{
		return iddselection_MGS;

	}
	public WebElement Iddselection_Org_NCS()
	{
		return iddselection_NCS;

	}
	public WebElement Iddselection_Org_Party()
	{
		return iddselection_Party;

	}

	
		@FindBy(xpath="//td[contains(text(),'Queries')]")
		WebElement queries;
	
	
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
		////org search
		@FindBy(xpath="//span[contains(text(),'Org Basic')]")
		WebElement OrgBasic;
		
		@FindBy(xpath="//span[contains(text(),'Open Query')]")
				WebElement OpenQuery;
		
		@FindBy(xpath="//*[@id='aF:STC3:incSTC3:qriSB5:sfi1_SB5:search_criteria_1_SB5']")
		WebElement OrgSearch;
		
		@FindBy(xpath="//td[contains(text(),'Run Search')]")
		WebElement runsearch;
		
		@FindBy(xpath="//td[contains(text(),'Open Hierarchy')]")
		
		WebElement OrgBasicSearchTest;
		
		@FindBy(xpath="//table/tbody/tr/td[contains(.,'Open')]/ancestor::div[@class='sipButCommon globalButton']")
		
		WebElement clickOnOpen;
		
		@FindBy(xpath="//td[contains(text(),'Open Hierarchy')]")
		
		WebElement openquery;
		
		@FindBy(xpath="//input[@type='radio']/following::label[contains(text(),'Extended Search')]")
		WebElement extenededSearch;

		
		public WebElement OrgBasicClick()
		{
			return OrgBasic;
		}
		public WebElement OpenQueryclick()
		{
			return OpenQuery;
		}
		public WebElement OrgSearchData()
		{
			return OrgSearch;
		}
		
		public WebElement extended_Search()
		{
			return  extenededSearch;
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
		
		//data attributes
		
		@FindBy(linkText="Org Alternate Name")
		WebElement OrgAlternateName;
		
		@FindBy(linkText="Org  Address")
		WebElement OrgAddress;
		
		@FindBy(linkText="Org Comments")
		WebElement OrgComments;
		
		@FindBy(linkText="Org Classification")
		WebElement OrgClassification;
		
		@FindBy(linkText="Org Electronic Address")
		WebElement OrgElectronicAddress;
		
		@FindBy(linkText="Org Identifier")
		WebElement OrgIdentifier;
		
		@FindBy(linkText="Org TeleCom")
		WebElement OrgTeleCom;
		
		@FindBy(linkText="Subject Rel")
		WebElement SubjectRel;
		
		@FindBy(linkText="Object Rel")
		WebElement ObjectRel;
		
		@FindBy(linkText="Relationships")
		WebElement Relationships;
		
		@FindBy(xpath="//a/span[contains(.,'XREF')]/preceding-sibling::img")
		WebElement xref;
		
		@FindBy(linkText="Organization")
		WebElement dataattributesavailable;
		
//		@FindBy(xpath="//td[contains(text(),'Rowid Object')]")
//		WebElement dataattributes_group;
		
		public WebElement OrgAlternateNameclick()
		{
			return OrgAlternateName;
		}
		public WebElement Orgaddressclick()
		{
			return OrgAddress;
		}
		public WebElement Orgclassificationclick()
		{
			return OrgClassification;
		}
		public WebElement Orgcommentsclick()
		{
			return OrgComments;
		}
		public WebElement OrgElectronicAddressclick()
		{
			return OrgElectronicAddress;
		}
		public WebElement OrgIdentifierclick()
		{
			return OrgIdentifier;
		}
		public WebElement OrgTeleComclick()
		{
			return OrgTeleCom;
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
		
		
		
		////Group name validation
		@FindBy(xpath="//a[contains(text(),'FA PARTY GROUP IDD App')]")
		WebElement partygroup;
		
//		@FindBy(xpath="//span[contains(text(),'BO Updates')]")
//		WebElement historybuttonTest;
//		
		//@FindBy(xpath="//td[contains(text(),'Customize Table')]")
		
		public WebElement Party_Group_IDD()
		{
			return partygroup;
		}
		
		
		@FindBy(xpath="//span[contains(text(),'Party Group')]")
		WebElement Partygroupclick;
		
		public WebElement Party_Group_click()
		{
			return Partygroupclick;
		}
		
	
		@FindBy(xpath="//*[@id='aF:STC3:incSTC3:qriSB5:sfi1_SB5:search_criteria_1_SB5']")
		WebElement groupnamesearch;
//		
		public WebElement Party_Group_search()
		{
			return groupnamesearch;
		}
//		@FindBy(xpath="//td[contains(text(),'Run Search')]")
//		WebElement runsearch;
//		
		@FindBy(xpath="//td[contains(text(),'Open')]")
		
		WebElement groupname_open;
		public WebElement Party_Group_Test()
		{
			return groupname_open;
		}
		@FindBy(xpath="//td[contains(text(),'Rowid Object')]")
		WebElement clickOnOpenTest;
		
		public WebElement clickOnOpen_Test()
		{
			return clickOnOpenTest;
		}
//		
//		@FindBy(xpath="//td[contains(text(),'Open Hierarchy')]")
//		
//		WebElement openquery;
//		
//		@FindBy(xpath="//input[@type='radio']/following::label[contains(text(),'Extended Search')]")
//		WebElement extenededSearch;
//		
		
		
		
		
		
		
		
		
		
		
//		public WebElement historyClickTest()
//		{
//			return historybuttonTest;
//		}
		
		
//		@FindBy(xpath="//td/span/span[contains(text(),'Party Group')]")
	//	
//		WebElement openquery_GROUP;
		
		
//		@FindBy(xpath="//td[contains(text(),'Rowid Object')]")
	//	
//		WebElement openquery_GROUP_test;
}
