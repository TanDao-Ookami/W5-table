package TH_9_10_Team5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRowNBValue_GetTableCellValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://bobapop.com.vn";
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL+ "/menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//getRowNumberByValue
		WebElement tableRow = driver.findElement(By.xpath("//span[text()=\"TRÀ SỦI BỌT\"]//following::table[1]//tbody//tr[3]"));
		
		WebElement tableRowText = driver.findElement(By.xpath("//span[text()=\"TRÀ SỦI BỌT\"]//following::table[1]//tbody//tr[3]//td[1]"));

		String rowText = tableRow.getText();
		System.out.println("Third row of table: "+rowText);
		//getTableCellValue
		WebElement Cell = tableRow.findElement(By.xpath("//span[text()=\"TRÀ SỦI BỌT\"]//following::table[1]//tbody//tr[3]//td[2]"));
		String value = Cell.getText();
		System.out.println("Cell value: "+value);

	}

}
