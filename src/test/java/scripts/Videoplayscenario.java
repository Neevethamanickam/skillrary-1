package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import pom.Corejavaforselenium;
import pom.Selenium;
import pom.Skillrarysearch;

@SuppressWarnings("unused")
public class Videoplayscenario extends Baseclass
{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException
	{
		Skillrarysearch s = new Skillrarysearch(driver);
		s.searchopt();
		s.searching();
		
		Selenium s1 = new Selenium(driver);
		s1.corejav();
		
		Corejavaforselenium c = new Corejavaforselenium(driver);
		c.close();
		utilize.switchFrame(driver);
		c.playbtn();
		Thread.sleep(15000);
		c.pausebtn();
		Thread.sleep(5000);
		utilize.switchBackFrame(driver);
		
	}
}
