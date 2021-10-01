package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import pom.Addtocartpage;
import pom.SkillraryDemoLoginPage;
import pom.SkillraryLoginPage;

public class AddingcourseTocart extends Baseclass {
	
	@Test
	public void tc1() throws FileNotFoundException, IOException
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.demoApplication();
		
		SkillraryDemoLoginPage d = new SkillraryDemoLoginPage(driver);
		utilize.switchTabs(driver);
		utilize.mouseHover(driver,d.getcoursetab());
		d.seleniumtrainingbtn();
		
		
		Addtocartpage a = new  Addtocartpage(driver);
		utilize.doubleClick(driver,a.getAddbtn());
		a.addtocartbtn();
		utilize.alertPopup(driver);
		
		Assert.assertEquals(driver.getTitle(), pdata.getData("skillrarytitle"));
				
		
	}
	
	

}
