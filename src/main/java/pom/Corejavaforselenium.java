package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

@SuppressWarnings("unused")
public class Corejavaforselenium {
	@FindBy(xpath="//a[@class ='close_cookies']")
	private WebElement close;
	
	@FindBy(xpath="//div[@class ='play-icon']")
	private WebElement play;
	
	@FindBy(xpath="//div[@class ='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath="//span[text()='Share via Twitter']")
	private WebElement shrtwit;
	
	public Corejavaforselenium(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void close()
	{
		close.click();
	}
	public void playbtn()
	{
		play.click();
	}
	
	public void pausebtn()
	{
		pause.click();
	}
	
	public void sharetwitter()
	{
		shrtwit.click();
	}
	
	
}
