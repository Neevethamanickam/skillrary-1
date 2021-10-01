package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import genericlibrary.Baseclass;
import pom.SkillraryDemoLoginPage;
import pom.SkillraryLoginPage;
import pom.TestingPage;

public class FaceBookLike extends Baseclass
{
@Test
public void tc2() throws FileNotFoundException, IOException
{
 SkillraryLoginPage s = new SkillraryLoginPage(driver);
 s.gearsButton();
 s.demoApplication();
 
 SkillraryDemoLoginPage d = new SkillraryDemoLoginPage(driver);
 utilize.switchTabs(driver);
 utilize.dropDown(d.getCourseBtn(),pdata.getData("coursedd"));

 TestingPage t = new TestingPage(driver);
 utilize.dragAndDrop(driver, t.getSeleniumTraining(), t.getCartbtn());
 t.facebookicon();
 
 
}
}
