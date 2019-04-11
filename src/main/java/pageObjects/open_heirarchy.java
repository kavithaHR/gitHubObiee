package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class open_heirarchy {
WebDriver driver;
	
	public  open_heirarchy(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(text(),'Open Hierarchy')]")
	WebElement openheirarchy;
	
	@FindBy(xpath="//img[@src='images/get_flash_player.gif']")
	WebElement getAdobeFlashPlayer; 
	
	@FindBy(xpath="//td[contains(text(),'New Entity')]")
	WebElement getAdobeFlashPlayerTest; 
//	
//	@FindBy(xpath="	//*[@id='aF:HMTC2:incHMTC2:incHmView:j_id226container']/table/tbody/tr/td[2]")
//	WebElement getAdobeFlashPlayerTest; 
//	

	
	
	public WebElement open_heirarchyclick()
	{
		return openheirarchy;
	}
	public WebElement getAdobeFlashPlayer_click()
	{
		return getAdobeFlashPlayer;
	}
	public WebElement getAdobeFlashPlayer_Test()
	{
		return getAdobeFlashPlayerTest;
	}

}
