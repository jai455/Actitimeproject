package Objectreposetry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage {

	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement dsccutomer;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcutbutton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancl;
	
	
	//initilization
	public Taskpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getDsccutomer() {
		return dsccutomer;
	}

	public WebElement getCreatecutbutton() {
		return createcutbutton;
	}

	public WebElement getCancl() {
		return cancl;
	}
	
	
}
