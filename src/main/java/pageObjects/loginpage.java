package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;
	
	public  loginpage(WebDriver driver)
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
	WebElement iddselect;
	
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
	public WebElement iddselection()
	{
		return iddselect;
	}
}
