package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initializeandclose {
	
	
		public Initializeandclose(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

		//Initialization of browser
		public WebDriver init() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PraveenReddy\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.investec.com/en_za.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			return driver;
		}
		
		//closing browser
		public WebDriver close() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.close();
			return driver;
			
		}
	}

