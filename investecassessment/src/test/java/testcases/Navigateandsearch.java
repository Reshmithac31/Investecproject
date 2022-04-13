package testcases;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.Initializeandclose;
import pageobjects.Pageobjects;

public class Navigateandsearch {
	Pageobjects page;//calling the page object  from pageobjects
	Initializeandclose open;//calling the page object from Initializeandclose
	
	@BeforeTest
	//performs initiation of chrome browser
	public void openbrowser() throws Exception {
		Initializeandclose start= new Initializeandclose(driver);
		driver=start.init();
	}
	
		WebDriver driver;
		
		//Testcase to perform search operation and verify the result
		@Test
		public void Homenavigation() throws Exception {
			Pageobjects search = new Pageobjects(driver);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			search.searchclick().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			search.searchbox().clear();
			search.searchbox().sendKeys("understanding cash investment");
			search.searchenter().click();
			search.cookieclose().click();
			js.executeScript("window.scrollBy(0,500)", "");
			//Also we can use below method to scroll until the element is found in dynamic way
			//js.executeScript("arguments[0].scrollIntoView();",search.searchrest());
	        search.searchrest().click();
	        js.executeScript("window.scrollBy(0,400)", "");
	      //Also we can use below method to scroll until the element is found
	       // js.executeScript("arguments[0].scrollIntoView();",search.signupbutton());
	        search.signupbutton().click();
	        search.entername().clear();
	        search.entername().sendKeys("Reshmitha");
	        search.surname().clear();
	        search.surname().sendKeys("chadive");
	        search.email().clear();
	        search.email().sendKeys("test@investec.co.za");
	        js.executeScript("window.scrollBy(0,200)", "");
	        search.checkbox().click();
	        System.out.println(search.checkbox().isSelected());
	        search.submit().click();
	        System.out.println(search.thankyoumsg().isDisplayed());
	        
		}
		//closing the browser after completing execution
		@AfterTest
		public void closebrowser() throws InterruptedException {
			Initializeandclose end= new Initializeandclose(driver);
			end.close();
		}
}
