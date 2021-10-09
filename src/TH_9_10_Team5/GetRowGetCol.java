package TH_9_10_Team5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRowGetCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://bobapop.com.vn";
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL+ "/menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//GetTotalCol
		List<WebElement> col = driver.findElements(By.xpath("//span[text()=\"TRÀ SỦI BỌT\"]//following::table[1]//th"));
		
		System.out.println("Number of cols are: "+col.size());
		
		//GetTotalRow
		List<WebElement> row = driver.findElements(By.xpath("//span[text()=\"TRÀ SỦI BỌT\"]//following::table[1]//tbody//tr"));
		
		System.out.println("Number of rows are: "+row.size());

	}

}
