package test_16_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

public class Astractclass {

	
	public static String baseUrl = "http://demo.guru99.com/test/newtours/";
    public static String driverPath = "D:\\chromedriver.exe";
    public static WebDriver driver; 
   

    
    @BeforeTest 
	public void beforeTest()
	{
    	System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
    
   
    @AfterTest 
	public void tearDown()
	{
		//driver.close();
	}
  
    @BeforeClass
	public void beforeClass()
	{
    	System.out.println("Start testing for class");
	}
  

    @org.testng.annotations.AfterClass
	public void AfterClass()
	{
    	System.out.println("End testing for class");
	}
}
