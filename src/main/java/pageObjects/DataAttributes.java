package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataAttributes {

WebDriver driver;
	
	public  DataAttributes(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Org Alternate Name")
	WebElement OrgAlternateName;
	
	@FindBy(linkText="Org Address")
	WebElement Orgaddress;
	
	@FindBy(linkText="Org Classification")
	WebElement Orgclassification;
	
	@FindBy(linkText="Org Comments")
	WebElement Orgcomments;
	
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
	
	@FindBy(xpath="//td[contains(text(),'Rowid Object')]")
	WebElement dataattributes_group;
	
	public WebElement OrgAlternateNameclick()
	{
		return OrgAlternateName;
	}
	public WebElement Orgaddressclick()
	{
		return Orgaddress;
	}
	public WebElement Orgclassificationclick()
	{
		return Orgclassification;
	}
	public WebElement Orgcommentsclick()
	{
		return Orgcomments;
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
	
	public WebElement DataAttributes_group_Test()
	{
		return dataattributes_group;
	}
}
