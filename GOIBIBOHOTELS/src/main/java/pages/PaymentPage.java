package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {

	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="(//div[@class='dwebCommonstyles__CircularDiv-sc-112ty3f-9 bpZCIo'])[1]")
	private WebElement drop_down;
	public WebElement getDrop_down() {
		return drop_down;
	}
	@FindBy(xpath="//span[text()='Title']/following-sibling::select")
	private WebElement mrOrms;
	@FindBy(xpath="//input[@placeholder='Enter First Name']")
	private WebElement first_Name_TextField;
	@FindBy(xpath="//input[@placeholder='Enter Last Name']")
	private WebElement last_Name_TextField;

	@FindBy(xpath="//input[@placeholder='Enter Email Address']")
	private  WebElement email_TextField;
	@FindBy(xpath="//input[@placeholder='Enter Phone Number']")
	private WebElement phone_Num_TextField;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement GST_checkBox;
	@FindBy(xpath="//span[text()='Proceed To Payment Options']")
	private WebElement proceed_To_Pay_Btn;
	public WebElement getMrOrms() {
		return mrOrms;
	}
	public WebElement getFirst_Name_TextField() {
		return first_Name_TextField;
	}
	public WebElement getLast_Name_TextField() {
		return last_Name_TextField;
	}
	public WebElement getEmail_TextField() {
		return email_TextField;
	}
	public WebElement getPhone_Num_TextField() {
		return phone_Num_TextField;
	}
	public WebElement getGST_checkBox() {
		return GST_checkBox;
	}
	public WebElement getProceed_To_Pay_Btn() {
		return proceed_To_Pay_Btn;
	}






}
