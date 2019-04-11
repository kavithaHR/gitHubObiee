package baseclass;


import java.io.File;

import org.apache.commons.io.FileUtils;



import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driverSelection {
	public Properties prop;
	public WebDriver TakeScreenshot;
	public static WebDriver driver;
	public WebDriverWait d ;
	
	public WebDriver initializeriver() throws IOException
	{
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\krangaiah\\MDMIDDAutomation\\src\\main\\java\\baseclass\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\krangaiah\\Desktop\\Selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
		}
		
		else if (browserName.equals("firefox"))
		{
			
		}
		else if (browserName.equals("IE"))
		{
			
		}
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		d=new WebDriverWait(driver,20);
		return driver;
	}
	
	public void getScreenshotOnPass(String resultpass) throws IOException
	{
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                File DestFile=new File("C://Users//krangaiah//MDMIDDAutomation//TestResult//Pass//"+resultpass+"screenshot.png");
                

                FileUtils.copyFile(SrcFile, DestFile);
		
		
		
	}
	public void getScreenshotOnFail(String resultfail) throws IOException
	{
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                File DestFile=new File("C://Users//krangaiah//MDMIDDAutomation//TestResult//Fail//"+resultfail+"screenshot.png");
                

                FileUtils.copyFile(SrcFile, DestFile);
		
		
		
	}
}
