package pom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibrary.Baseclass;

public class Skillrarysearch extends Baseclass{

@FindBy(name="q")
private WebElement search;
@FindBy(xpath="//input[@type='submit']")
private WebElement searchicon;

public Skillrarysearch(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void searchopt() throws FileNotFoundException, IOException
{
	search.sendKeys(pdata.getData("course"));
}
public void searching()
{
	searchicon.click();
}

}
