package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage
{
 @FindBy(xpath="(//a[text()='Selenium Training'])[2]")
 private WebElement seleniumTraining;
 
 
 @FindBy(id="cartArea")
 private WebElement cartbtn;
 

@FindBy(xpath="//i[@class='fa fa-facebook']")
 private WebElement facebook;
 
 public TestingPage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 
 public WebElement getSeleniumTraining() {
	return seleniumTraining;
}

public WebElement getCartbtn() {
	return cartbtn;
}

public void facebookicon()
{
	facebook.click();
}
}
