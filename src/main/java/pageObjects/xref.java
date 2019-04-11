package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class xref {
	
WebDriver driver;
	
	public  xref(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
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

}
