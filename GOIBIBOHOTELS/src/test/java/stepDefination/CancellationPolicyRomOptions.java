//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Keys;
//
//import org.openqa.selenium.WebDriver; 
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import genericUtil.ExcelUtility;
//import genericUtil.IAutoConstants;
//
//import io.cucumber.java.en.Given; 
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.HotelsHomePage;
//import pages.SelectedHotelPage;
//
//public class CancellationPolicyRomOptions { 
//	public WebDriver driver;
//	public HotelsHomePage cancel;
//	public SelectedHotelPage room;
//	public ExcelUtility readExcel=new ExcelUtility();
//	public WebDriverWait wait;
//
//
//	@Given("Open the Browser") public void open_the_browser() {
//
//		WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//	}
//
//	@When("Enter the URL of application") 
//	public void enter_the_url_of_application()
//	{ 
//		String url=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 0);
//		driver.get(url);
//		String expectedHomePageTitle = "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off";
//
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL: Home Page is  Not Displayed");
//		System.out.println("PASS: Home Page is Displayed Successfully");
//	}
//
//
//	@When("Clicked on Hotels") 
//	public void clicked_on_hotels()
//	{
//
//
//
//		cancel=new HotelsHomePage(driver);
//
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(cancel.getHotels()));
//		cancel.getHotels().click();
//
//
//
//		String expectedHomePageTitle = "Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL:Hotel Home Page is Not Displayed");
//		System.out.println("PASS:Hotel Home Page is Displayed Sucessfully");
//
//	}
//
//	@When("user enters the Area\\/Landmark\\/Hotel name")
//	public void user_enters_the_area_landmark_hotel_name() throws InterruptedException 
//	{ 
//		HotelsHomePage area = new HotelsHomePage(driver); 
//		area.getAreaAdressTextField().click();
//		Thread.sleep(2500);
//
//
//		area.getAreaAdressTextField().sendKeys("Hyderabad Hotels");
//		Thread.sleep(2500);
//
//		area.getAreaAdressTextField().sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2500);
//
//		area.getAreaAdressTextField().sendKeys(Keys.ENTER);
//
//
//	}
//
//
//
//	@When("user Select CHECK-IN and CHECK-OUT Dates")
//	public void user_select_check_in_and_check_out_dates()
//	{
//		cancel=new HotelsHomePage(driver);
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(cancel.getCheckIn()));
//		cancel.getCheckIn().click();
//		wait.until(ExpectedConditions.elementToBeClickable(cancel.getCheckINdate_30()));
//		cancel.getCheckINdate_30().click();
//
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(cancel.getCheckOut()));
//		cancel.getCheckIn().click();
//		wait.until(ExpectedConditions.elementToBeClickable(cancel.getCheckOutDate_14()));
//		cancel.getCheckINdate_30().click();
//
//		cancel.getCheckOutDate_14();
//
//
//	}
//
//
//
//
//	@When("User click on Search Hotels and select hotel")
//	public void user_click_on_search_hotels_and_select_hotel() 
//	{
//
//		cancel = new HotelsHomePage(driver);
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(cancel.getSearchHotelsButton()));
//		cancel.getSearchHotelsButton().click();
//
//
//	}
//
//	@When("Click on ROOM OPTIONS") 
//	public void click_on_room_options() {
//
//		room=new SelectedHotelPage(driver);
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(room.getRoomOptionsLink()));
//
//		room.getRoomOptionsLink().click();
//
//	}
//
//	@When("Click on Cancellation Policy")
//	public void click_on_cancellation_policy() {
//		wait = new WebDriverWait(driver, 10);
//
//		wait.until(ExpectedConditions.elementToBeClickable(room.getCancel()));
//
//		room.getCancel().click();
//
//	}
//
//	@Then("User views the cancellation-policy")
//	public void user_views_the_cancellation_policy() {
//		SelectedHotelPage availiablePage = new SelectedHotelPage(driver);
//		
//		String expectedCancellationPolicy="Cancellation Policy";
//		Assert.assertEquals(expectedCancellationPolicy,availiablePage.getCancellationtext().getText(),"FAIL:CANCELLATION POLICY  IS NOT DISPLAYED");
//		System.out.println("PASS: CANCELLATION POLICY IS DISPLAYED SUCCESSFULLY");
//
//
//
//	}
//
//
//	@Then("close the Browser")
//	public void close_the_browser() {
//		
//		
//
//		driver.quit();
//
//
//	}
//
//
//
//
//
//}
