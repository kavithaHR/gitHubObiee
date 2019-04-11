package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class History {
	
WebDriver driver;
	
	public  History(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
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


