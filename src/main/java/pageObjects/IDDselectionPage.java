package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IDDselectionPage {
	WebDriver driver;
	
	public  IDDselectionPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
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
}
