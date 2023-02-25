package test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.ProductCheckout;

public class test 
{
	
	@Test
	public void Searchforproduct() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Rahul Doc\\Selenium\\New folder\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		System.out.println("Browser is opened");
		
		driver.navigate().to("https://www.flipkart.com/");
		
		System.out.println("URL is opened");
		
		ProductCheckout ob1= new ProductCheckout(driver);

		ob1.loginpopup();
		System.out.println("Login PopUp closed");
		Thread.sleep(500);
		
		ob1.SearchBox();
		System.out.println("ipad typed in the search box");
		Thread.sleep(2000);
		
		ob1.selectpr();
		System.out.println("Product selected from suggestions");
		Thread.sleep(500);//okay
		
		String parent = driver.getWindowHandle();	
		
//		driver.navigate().refresh();
		
		ob1.required();
		Thread.sleep(2000);
		
		ob1.addtocart();
		System.out.println("Product selected from results");
		Thread.sleep(2000);
		
		Set<String> windows= driver.getWindowHandles();
		
		for(String s:windows)
		{
			if(!s.equals(parent))
			{
				driver.switchTo().window(s);
			}
		}
		
		ob1.add();
		System.out.println("clicked on Add to cart");
		Thread.sleep(2000);
		
		ob1.placeorder();
		System.out.println("clicked on Place Order");
		Thread.sleep(2000);
		
		ob1.username();
		System.out.println("Entered the login credential");
		Thread.sleep(2000);
		
		System.out.println("Test Case is Passed");
		
		driver.quit();
		System.out.println("Browser is Closed");
		
	}
}
