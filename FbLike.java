package scripts;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_library.Base_class;

import pom.DemoSkillraryAppLoginpage;
import pom.LikePage;
import pom.SkillraryLoginPage;
import pom.TestingPage;

public class FbLike extends Base_class{
	
	@Test
	public void TC_2() throws Throwable {
		
		
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbtn();
		s.skillrarydemoApp();
		
		utilities.switchtabs(driver);
		
		DemoSkillraryAppLoginpage d=new DemoSkillraryAppLoginpage(driver);
		//utilities.dropdown(d.getCoursedd(), "Testing");
		utilities.dropdown(d.getCoursedd(), pdata.PropertyFile("coursedd"));
		
		utilities.switchtabs(driver);
		
		TestingPage t=new TestingPage(driver);
		WebElement fb = t.getFbicon();
		Point loc = fb.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		utilities.scrollbar(driver, x, y);
		t.fbicon();
		
		
		
		LikePage l=new LikePage(driver);
		l.likebtn();
		
		
	}
}
