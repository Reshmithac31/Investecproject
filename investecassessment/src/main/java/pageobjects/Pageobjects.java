package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobjects {
	
	public Pageobjects(WebDriver driver) {
		//super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public WebDriver driver;

	
	
	@FindBy(xpath="//*[@id=\"search-toggle\"]/a/div")
	public
	WebElement searchclick;
	@FindBy(id="searchBarInput")
	WebElement searchbox;
	@FindBy(id="Layer_1")
	WebElement cookieclose;
	 @FindBy(xpath="//*[@id=\"searchBarButton\"]/a/button") 
	 WebElement searchenter;
     @FindBy(xpath="/html/body/div[2]/div[3]/div[2]/div/div/div[4]/div[3]/div[3]/div/div[2]/div/div/div/a/h4")
	 WebElement searchrest;
	@FindBy(xpath="//*[contains(text(),'Sign up')]")
	WebElement signupbutton;
	@FindBy(name="name")
	WebElement entername;
	@FindBy(name="surname")
	WebElement surname;
	@FindBy(name="email")
	WebElement email;
	@FindBy(xpath="//button[contains(@class,'button--first-child')]")
	WebElement checkbox;
	@FindBy(xpath="//*[contains(text(),'Submit')]")
	WebElement submit;
	@FindBy(className="thank-you__heading")
	WebElement thankyoumsg;
	
	public WebElement searchclick(){
		return searchclick;
	}
	
	public WebElement searchbox(){
		return searchbox;
		
	}
	
	 public WebElement searchenter(){ 
		 return searchenter;
	  
	  }
	 public WebElement cookieclose(){ 
		 return cookieclose;
	  
	  }
	 
		
		  public WebElement searchrest(){ return searchrest;
		  
		  }
		 
	public WebElement signupbutton(){
		return signupbutton;
		
	}
	public WebElement entername(){
		return entername;
		
	}
	public WebElement surname(){
		return surname;
		
	}
	public WebElement email(){
		return email;
		
	}
	
	  public WebElement checkbox(){ 
		  return checkbox;
	  
	  }
	 
	public WebElement submit(){
		return submit;
	}

	
	  public WebElement thankyoumsg(){ 
		  return thankyoumsg;
	  
	  }
}
	
	
	
