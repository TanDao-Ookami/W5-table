package test_16_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test2 extends Astractclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Test (priority = 1)
	public static void Testcase1() {
		
		System.out.println("Testcase");
		
		WebElement register = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		register.click();
		
		String Username = "DuyTan";
		String password = "123456";
		String Cfpassword = password;
		
		WebElement Username_input= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		Username_input.clear();
		Username_input.sendKeys(Username);

		WebElement password_input= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
		password_input.clear();
		password_input.sendKeys(password);
		
		WebElement Cfpassword_input= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
		Cfpassword_input.clear();
		Cfpassword_input.sendKeys(Cfpassword);
		
		WebElement bntpassword_input= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
		bntpassword_input.click();

		
		
		String expectedRegister = "sign-in";
        
		String actualRegister = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a")).getText();
                
        if (actualRegister.equals(expectedRegister)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
	}

}
