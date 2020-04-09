package mavenPOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTestClass {

	@Test
	public void testgooglesearch(){
		 
		WebDriver driver = new FirefoxDriver();
		//it will open the google page
		driver.get("http://google.in"); 
		//we expect the title �Google � should be present 
		String Expectedtitle = "Google";
		//it will fetch the actual title 
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		//it will compare actual title and expected title
		Assert.assertEquals(Actualtitle, Expectedtitle);
		//print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		driver.close();
	 }
	
}
