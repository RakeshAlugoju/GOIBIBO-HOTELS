package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import genericUtil.ExcelUtility;
import genericUtil.IAutoConstants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HotelsHomePage;
import pages.PaymentPage;
import pages.SelectedHotelPage;

public class Payment {
	public WebDriver driver;
	public WebDriverWait wait;
	public SelectedHotelPage guest;
	public ExcelUtility readExcel=new ExcelUtility();
	public Actions act;

	@Given("Open the Browser")
	public void open_the_browser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }

	@When("Enter the URL of application")
	public void enter_the_url_of_application() { 

		String url=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 0);
		driver.get(url);
		String expectedHomePageTitle = "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off";
		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL: Home Page is  Not Displayed");
		System.out.println("PASS: GOIBIBO HOME PAGE IS DISPLAYED SUCCESSFULLY");


	}

	@When("Clicked on Hotels")
	public void clicked_on_hotel() {



		HotelsHomePage hotelsLink=new HotelsHomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(hotelsLink.getHotels()));
		hotelsLink.getHotels().click();
		//act.doubleClick(hotelsLink.getHotels()).perform();

		String expectedHomePageTitle = "Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo";
		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL:Hotel Home Page is Not Displayed");
		System.out.println("PASS:HOTELS HOME PAGE IS DISPLAYED SUCCESSFULLY");
	}

	@When("user enters the Area\\/Landmark\\/Hotel name") 
	public void user_enters_the_area_landmark_hotel_name() throws InterruptedException {

		HotelsHomePage area = new HotelsHomePage(driver);

		area.getAreaAdressTextField().click(); 

		Thread.sleep(3000);
		area.getAreaAdressTextField().sendKeys("Hyderabad Hotels"); 
		Thread.sleep(3000);
		area.getAreaAdressTextField().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		area.getAreaAdressTextField().sendKeys(Keys.ENTER);


	}

	@When("User click on Search Hotels") 
	public void user_click_on_search_hotels() {

		HotelsHomePage search = new HotelsHomePage(driver);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(search.getSearchHotelsButton()));
		search.getSearchHotelsButton().click();

	}

	@And("Select a Room")
	public void select_a_room() throws InterruptedException {

		SelectedHotelPage roomOptions=new SelectedHotelPage(driver);
		roomOptions.getRoomOptionsLink().click(); 
		WebDriverWait wait = new WebDriverWait(driver,15);

		wait.until(ExpectedConditions.elementToBeClickable(roomOptions.getSelectRoomButton()));


		roomOptions.getSelectRoomButton().click();
	//	roomOptions.getSelectRoomButton().click();
		
		Thread.sleep(3000);
		String uff="Book Cheap Flights, Air Tickets, Hotels, Bus & Holiday Package at Goibibo";
		Assert.assertEquals(uff,driver.getTitle(),"FAIL");
		System.out.println("PASS");
	//	((JavascriptExecutor) driver).executeScript("scroll(0,1000)");



		


	}

	@And("Enter the details of the User")
	public void enter_the_details_of_the_user() throws InterruptedException {
		

        guest=new SelectedHotelPage(driver);
    	guest.getDropDownHotelInfo().click();

		PaymentPage payment=new PaymentPage(driver);

		payment.getMrOrms().click();
		payment.getMrOrms().sendKeys(Keys.ARROW_DOWN);
		payment.getMrOrms().sendKeys(Keys.ARROW_DOWN);
		payment.getMrOrms().sendKeys(Keys.ENTER);

		payment.getMrOrms().click();




		payment.getFirst_Name_TextField().click();
		payment.getFirst_Name_TextField().sendKeys("jayasree");
	
		payment.getLast_Name_TextField().click();

		payment.getLast_Name_TextField().sendKeys("madipoju");



		payment.getEmail_TextField().click();
		payment.getEmail_TextField().sendKeys("jayasreemadipoju30@gmail.com");
	

		payment.getPhone_Num_TextField().click();
		payment.getPhone_Num_TextField().sendKeys("8309212165");
		

		payment.getGST_checkBox().click();
		payment.getGST_checkBox().click();
	

		payment.getProceed_To_Pay_Btn().click();

	}

	@When("User clicks on proceed to payment options button")
	public void user_clicks_on_proceed_to_payment_options_button() {
		SelectedHotelPage proceed=new SelectedHotelPage(driver);
		proceed.getProceedToPaymentButton().click();

	}

	@Then("it will redirect to payment mode")
	public void it_will_redirect_to_payment_mode() {
		SelectedHotelPage availiableText=new SelectedHotelPage(driver);
		String expectedText="PAYMENT MODE";
		Assert.assertEquals(expectedText,availiableText.getPayment_Mode().getText(),"FAIL:PAYMENT MODE PAGE IS NOT DISPLAYED");
		System.out.println("PASS:PAYMENT MODE PAGE IS DISPLAYED SUCCESSFULLY");

	}

	@Then("User Enter the invalid card details for payment")
	public void user_enter_the_invalid_card_details_for_payment() {
		SelectedHotelPage cardDetails=new SelectedHotelPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(cardDetails.getCard_Number()));

		cardDetails.getCard_Number().click();
		cardDetails.getCard_Number().sendKeys("1234 5678");
		wait.until(ExpectedConditions.elementToBeClickable(cardDetails.getCc_Name()));

		cardDetails.getCc_Name().click();

		cardDetails.getCc_Name().sendKeys("Rupay");
		wait.until(ExpectedConditions.elementToBeClickable(cardDetails.getCard_Expiry()));

		cardDetails.getCard_Expiry().click();
		cardDetails.getCard_Expiry().sendKeys("3021");
		wait.until(ExpectedConditions.elementToBeClickable(cardDetails.getCard_CVV()));

		cardDetails.getCard_CVV().click();
		cardDetails.getCard_CVV().sendKeys("143");


	}

	@Then("User is able to view  a alert messages like ENTER THE  VALID CARD DETAILS")
	public void user_is_able_to_view_a_alert_messages_like_enter_the_valid_card_details() {
		SelectedHotelPage availiableText=new SelectedHotelPage(driver);
		String expectedText="Please Enter Valid Card Number";
		Assert.assertEquals(expectedText,availiableText.getEnter_Valid_Card_details().getText(),"FAIL:USER IS NOT ABLE TO SEE ANY ALERT MESSAGE ");
		System.out.println("PASS:USER IS ABLE TO SEE AN ALERT MESSAGE - PLEASE ENTER THE VALID CARD DETAILS ");



	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}









}