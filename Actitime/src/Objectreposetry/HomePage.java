package Objectreposetry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//div[.='Time-Track']")
	 private WebElement timetrack;
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement task;
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reports;
	@FindBy(xpath="//div[.='Users']")
	private WebElement userstab;
	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getTimetrack() {
		return timetrack;
	}
	public WebElement getTask() {
		return task;
	}
	public WebElement getReports() {
		return reports;
	}
	public WebElement getUserstab() {
		return userstab;
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
}
