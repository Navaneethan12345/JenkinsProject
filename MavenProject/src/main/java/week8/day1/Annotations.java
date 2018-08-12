
package week8.day1;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
//import wdMethods.SeMethods;

public class Annotations extends SeMethods{
	public ExtentTest test;
	
   
	@Parameters({"url","uName","uPwd"})
	@BeforeMethod
	public void login(String URL,String USERNAME,String PASSWORD) {
		startApp("chrome", URL);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, USERNAME);
		WebElement elePassword = locateElement("id","password");
		type(elePassword,PASSWORD);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement CrmLink = locateElement("linktext","CRM/SFA");
		click(CrmLink);
		
	}
	@AfterMethod
	public void closeApp() {
		
		closeAllBrowsers();
	}
}