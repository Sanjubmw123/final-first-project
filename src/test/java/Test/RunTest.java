package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import MakePage.First_tQues;
import MakeUtil.LaunchBrowser;


public class RunTest {
	WebDriver driver;
	First_tQues categoary_test ;
	LaunchBrowser launch;
	
	@Test
	public void browser() throws Exception {
		driver=LaunchBrowser.startwebsite();
		First_tQues  categoary_test=PageFactory.initElements(driver, First_tQues.class);
		categoary_test.addCategory();
				categoary_test.submit();
				categoary_test.validatingAddCategory();
	}
	

		
	}


