package pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCheckout 
{
	WebDriver driver;
	Actions act;

	@FindBy (xpath="//button[@class='_2KpZ6l _2doB4z']")
	WebElement loginpopup;
	
	public void loginpopup()
	{
		loginpopup.click();
	}
	
	@FindBy (xpath="//input[@type='text']")
	WebElement SearchBox;
	public void SearchBox()
	{
		SearchBox.sendKeys("Ipad");
	}

	@FindBy (xpath="//li[@class='Y5N33s']")
	List<WebElement> sc;
	public void selectpr()
	{
		
	for(int i=0;i<sc.size()-1;i++)
		{	
			String av= sc.get(i).getText();
			
			if(av.contains(" 9th generation"))
			{
				sc.get(i).click();
				System.out.println("Required product selected from suggestionss");
			}
		}
	}
	
	@FindBy (xpath="//a[@class='_3-PJz-']")
	WebElement move;
	
	public void required()
	{
		act.moveToElement(move, 0, 0).perform();
		
	}
	
	@FindBy (xpath="(//div[@class='_30jeq3 _1_WHN1'])[1]")
	WebElement addtocart;
	
	public void addtocart()
	{
		addtocart.click();
		
	}
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement add;
	
	public void add()
	{
		add.click();
	}
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	WebElement placeorder;
	
	public void placeorder()
	{
		placeorder.click();
	}
	
	@FindBy (xpath="//input[@class='_2IX_2- _17N0em']")
	WebElement username;
	
	
	public void username()
	{
		username.sendKeys("123456789");
	}
	
	public ProductCheckout(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
}
