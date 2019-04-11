package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickOnQueries {
WebDriver driver;
	
	public  clickOnQueries(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
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
}
