package scripts;

import org.testng.annotations.Test;

import Generic_library.Base_class;
import pom.AddtocartPage;
import pom.DemoSkillraryAppLoginpage;
import pom.SkillraryLoginPage;

public class AddToCart extends Base_class {

	@Test
	public void TC_1() throws Throwable {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbtn();
		s.skillrarydemoApp();
		
		
		utilities.switchtabs(driver);
		
		DemoSkillraryAppLoginpage d=new DemoSkillraryAppLoginpage(driver);
		Thread.sleep(3000);
	     utilities.mousehover(driver,d.getCourse());
		d.seleniumtrainingtab();
		
		
		AddtocartPage a=new AddtocartPage(driver);
		utilities.doubleclick(driver, a.getPlusbtn());
		a.addtocart();
		
		utilities.alertpopupok(driver);
		
	}
	
	
	
}
