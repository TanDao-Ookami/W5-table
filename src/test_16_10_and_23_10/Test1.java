package test_16_10_and_23_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(test_16_10_and_23_10.ListenerTest.class)

public class Test1 extends Astractclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	@BeforeMethod
	@Test (priority = 0)
	public static void Testcase1() {
		System.out.println("Testcase1");
		String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
        actualTitle = driver.getTitle();
        
       Assert.assertEquals(actualTitle, expectedTitle);
//        if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
	}
	@Test (priority = 1)
	public void Testcase2() {
		System.out.println("Testcase2");
		driver.findElement(By.linkText("REGISTER")).click();;
//		WebElement register = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
//		register.click();
		String expectedTitle2 = "Register: Mercury Tours";
		String actualTitle2 = "";
		
		actualTitle2 = driver.getTitle();
	    Assert.assertEquals(actualTitle2, expectedTitle2);

		
//		if (actualTitle2.contentEquals(expectedTitle2)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }

	}
	
	@Test (priority = 3)
	public static void Testcase4() {
		System.out.println("Testcase4");

//		WebElement home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"));
//		home.click();
		driver.findElement(By.linkText("SUPPORT")).click();
		String expectedTitle3 = "Under Construction: Mercury Tours";
		String actualTitle3 = "";
		
		actualTitle3 = driver.getTitle();
		
//		if (actualTitle3.contentEquals(expectedTitle3)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
		Assert.assertEquals(actualTitle3, expectedTitle3);

	}
	
	@Test (priority = 2)
	public static void Testcase3() {
		System.out.println("Testcase3");
		driver.findElement(By.linkText("Home")).click();
//		WebElement home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a"));
//		home.click();
		String expectedTitle4 = "Welcome: Mercury Tours";
		String actualTitle4 = "";
		
		actualTitle4 = driver.getTitle();
		
//		if (actualTitle4.contentEquals(expectedTitle4)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
		Assert.assertEquals(actualTitle4, expectedTitle4);

	}
	
//	@AfterMethod
	@Test (priority = 4)
	public static void Testcase5() {
		System.out.println("Testcase5");
		driver.findElement(By.xpath("//table//tbody//tr//a//img")).click();
//		WebElement home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a"));
//		home.click();
		String expectedTitle5 = "Welcome: Mercury Tours";
		String actualTitle5 = "";
		
		actualTitle5 = driver.getTitle();
		
//		if (actualTitle4.contentEquals(expectedTitle4)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
		Assert.assertEquals(actualTitle5, expectedTitle5);

	}
	
	
	

}
