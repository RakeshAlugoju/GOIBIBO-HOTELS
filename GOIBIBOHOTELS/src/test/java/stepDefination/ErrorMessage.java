//
//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver; 
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import genericUtil.ExcelUtility;
//import genericUtil.IAutoConstants;
//import io.cucumber.java.en.Given; 
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.HotelsHomePage; 
//import pages.SelectedHotelPage;
//
//public class ErrorMessage {
//	public WebDriver driver;
//	public HotelsHomePage  error;
//	public ExcelUtility readExcel=new ExcelUtility();
//
//	@Given("Open the Browser")
//	public void open_the_browser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }
//
//	@When("Enter the URL of application")
//	public void enter_the_url_of_application()
//	{
//
//		String url=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 0);
//		System.out.println(url);
//		driver.get(url);
//		//		if(!driver.getTitle().isBlank())
//		//		{
//		//		String expectedHomePageTitle = "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto50%off";
//		//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL: Home Page is  Not Displayed");
//		//		System.out.println("PASS: Home Page is Displayed Successfully");
//
//	}
//
//
//	@When("Clicked on Hotels") public void clicked_on_hotel() {
//
//
//		HotelsHomePage hotelsLink=new HotelsHomePage(driver);
//		hotelsLink.getHotels().click();
//
//		//		String expectedHomePageTitle = "Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo";
//		//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL:Hotel Home Page is Not Displayed");
//		//		System.out.println("PASS:Hotel Home Page is Displayed Sucessfully");
//
//	}
//
//	@When("user enters the Area\\/Landmark\\/Hotel name") 
//	public void user_enters_the_area_landmark_hotel_name() {
//		error=new  HotelsHomePage(driver);
//
//		error.getAreaAdressTextField().click();
//
//		String area=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 1);
//		error.getAreaAdressTextField().sendKeys(area);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//
//
//
//
//		error.getAreaAdressTextField().sendKeys(Keys.ARROW_DOWN);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//
//
//
//		error.getAreaAdressTextField().sendKeys(Keys.ENTER);
//
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//
//
//	}
//
//	@When("User click on Search Hotels") 
//	public void user_click_on_search_hotels() {
//		HotelsHomePage search = new HotelsHomePage(driver);
//		search.getSearchHotelsButton().click();
//
//	}
//
//	@When("Select a Room")
//	public void select_a_room() throws InterruptedException {
//
//		SelectedHotelPage roomOptions=new SelectedHotelPage(driver);
//		roomOptions.getRoomOptionsLink().click(); 
//
//		Thread.sleep(2000);
//
//		roomOptions.getSelectRoomButton().click();
//	}
//
//
//
//
//	@When("Entered a invalid Promo code") 
//	public void entered_a_invalid_promo_code() {
//		SelectedHotelPage invalid = new SelectedHotelPage(driver);
//		invalid.getDropDownHotelInfo().click();
//		
////		invalid.getEnterpromo().click();
////		invalid.getEnterpromo().sendKeys("3008"); }
//	}
//
//
//	@When("Click On Apply")
//	public void click_on_apply() {
//		SelectedHotelPage apply = new SelectedHotelPage(driver);
//		apply.getApply().click();
//
//	}
//
//	@Then("Throws a error message PROMOCODE NOT APPLICABLE") 
//	public void throws_a_error_message_promocode_not_applicable() {
//		SelectedHotelPage availiableMessage=new SelectedHotelPage(driver);
//		String expectedMessage="Promo Code Not Applicable";
//		Assert.assertEquals(expectedMessage,availiableMessage.getErrorText().getText(),"FAIL: ERROR MESSAGE IS NOT DISPLAYED " );
//		System.out.println("PASS:ERROR MESSAGE IS DISPLAYED SUCCESSFULLY");
//	}
//
//
//	@Then("close the  Browser")
//	public void close_the_browser() throws InterruptedException {
//		Thread.sleep(2000);
//
//		driver.quit();
//	}
//
//}