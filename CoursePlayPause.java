package scripts;

import org.testng.annotations.Test;

import Generic_library.Base_class;
import pom.SkillraryLoginPage;

public class CoursePlayPause extends Base_class{

	@Test
	public void TC_3() throws Throwable {
		
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.searchbox();
		
		s.searchbtn();
	}
}
