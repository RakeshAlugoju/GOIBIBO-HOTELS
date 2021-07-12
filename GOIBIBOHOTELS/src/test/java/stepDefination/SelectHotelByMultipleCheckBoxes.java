//
//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.JavascriptExecutor;
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
//import pages.multiplsHotelsPage;
//
//public class SelectHotelByMultipleCheckBoxes {
//	public WebDriver driver;
//	public ExcelUtility readExcel=new ExcelUtility();
//	public WebDriverWait wait;
//
//	@Given("Open the Browser") 
//	public void open_the_browser() {
//		WebDriverManager.chromedriver().setup(); 
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }
//
//	@When("Enter the URL of application")
//	public void enter_the_url_of_application() { 
//
//		String url=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 0);
//		driver.get(url);
//		String expectedHomePageTitle = "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL: Home Page is  Not Displayed");
//		System.out.println("PASS: Home Page is Displayed Successfully");
//	}
//
//	@When("Clicked on Hotels") 
//	public void clicked_on_hotel() {
//		HotelsHomePage hotelsLink=new HotelsHomePage(driver);
//		hotelsLink.getHotels().click();
//
//		String expectedHomePageTitle = "Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL:Hotel Home Page is Not Displayed");
//		System.out.println("PASS:Hotel Home Page is Displayed Sucessfully");
//
//	}
//
//
//
//	@When("user enters the Area\\/Landmark\\/Hotel name")
//	public void user_enters_the_area_landmark_hotel_name() throws InterruptedException
//	{
//		HotelsHomePage area = new HotelsHomePage(driver);
//		area.getAreaAdressTextField().click();
//		Thread.sleep(3000);
//
//		String name=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 2);
//		area.getAreaAdressTextField().sendKeys(name); 
//		Thread.sleep(3000);
//		area.getAreaAdressTextField().sendKeys(Keys.ARROW_DOWN);
//
//		area.getAreaAdressTextField().sendKeys(Keys.ENTER);
//
//	}
//
//
//	@When("User click on Search Hotels") 
//	public void user_click_on_search_hotels()
//	{
//		HotelsHomePage search = new HotelsHomePage(driver); 
//
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(search.getSearchHotelsButton()));
//		search.getSearchHotelsButton().click();
//
//
//
//	}
//
//
//	@When("user clikcs on  multiple checkboxes")
//	public void user_clikcs_on_multiple_checkboxes() {
//		multiplsHotelsPage checks=new multiplsHotelsPage(driver);
//		wait = new WebDriverWait(driver, 10);
//		checks.getCancelationcheckbox().click();
//		wait.until(ExpectedConditions.elementToBeClickable(checks.getBreakfastcheckbox()));
//		checks.getBreakfastcheckbox().click();
//		wait.until(ExpectedConditions.elementToBeClickable(checks.getPricerangeCheck()));
//		checks.getPricerangeCheck().click();
//
//
//
//
//	}
//
//	@When("use select on Hotel")
//	public void use_select_on_hotel() {
//		multiplsHotelsPage hotels=new multiplsHotelsPage(driver);
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(hotels.getSelecthotel_1()));
//
//		hotels.getSelecthotel_1().click();
//
//
//	}
//
//	@Then("user view the selected hotel successfully")
//	public void user_view_the_selected_hotel_successfully() {
//		String expectedtitle="Results";
//		Assert.assertEquals(driver.getTitle(), expectedtitle,"FAIL: USER IS NOT ABLE TO SELECT THE HOTEL BY  SELECTING MULTIPLE CHECKBOXES");
//		System.out.println("PASS; USER VIEWED THE SELECTED HOTEL SUCCESSFULLY");
//	}
//
//	@Then("close the Browser")
//	public void close_the_browser()  {
//
//		driver.quit();
//	}
//
//
//
//
//}
