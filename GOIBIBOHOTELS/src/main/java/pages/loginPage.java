package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class loginPage extends BasePage {
	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div[@class='login__tab gotrible']")
	private WebElement profile;
	
	
	public WebElement getProfile() {
		return profile;
	}
	@FindBy(xpath="(//span[text()='+91 -']/following::input)[2]")
	private WebElement continueButton;
	public WebElement getContinueButton() {
		return continueButton;
	}
	@FindBy(name="phone")
	private WebElement phone;

	public WebElement getPhone() {
		return phone;
	}

}
