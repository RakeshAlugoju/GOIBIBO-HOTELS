//
//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import  org.openqa.selenium.chrome.ChromeDriver;
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
//public class LocationOfNearByAttractionPlaces { 
//	public WebDriver driver;
//	public ExcelUtility readExcel=new ExcelUtility();
//	public WebDriverWait  wait;
//
//	@Given("Open the Browser")
//	public void open_the_browser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//	}
//
//	@When("Enter the URL of application") 
//	public void enter_the_url_of_application() { 
//
//		String url=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 0);
//		driver.get(url);
//		String expectedHomePageTitle = "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL: Home Page is  Not Displayed");
//		System.out.println("PASS: Home Page is Displayed Successfully");
//
//	}
//
//	@When("Clicked on Hotels")
//	public void clicked_on_hotels() {
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
//
//	@When("user enters the Area\\/Landmark\\/Hotel name")
//	public void user_enters_the_area_landmark_hotel_name() throws InterruptedException { 
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
//
//
//	}
//
//	@When("User click on Search Hotels and select the hotel")
//	public void user_click_on_search_hotels_and_select_hotel() {
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
//	@When("Click on Location")
//	public void click_on_location() {
//
//
//		SelectedHotelPage location=new SelectedHotelPage(driver);
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(location.getLocation()));
//
//		location.getLocation().click();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//
//
//	}
//
//	@When("Enter the location in the search box") 
//	public void enter_the_location_in_the_search_box() throws InterruptedException {
//		SelectedHotelPage search_attraction= new SelectedHotelPage(driver);
//
//			
//		wait= new WebDriverWait(driver, 10);
//
//		wait.until(ExpectedConditions.elementToBeClickable(search_attraction.getNearbylocations()));
//
//		search_attraction.getNearbylocations().click();
//		Thread.sleep(3000);
//
//
//
//		wait.until(ExpectedConditions.elementToBeClickable(search_attraction.getSatellite()));
//
//		search_attraction.getSatellite().click();
//		Thread.sleep(3000);
//		search_attraction.getFulllocation().click();
//		Thread.sleep(3000);
//		wait.until(ExpectedConditions.elementToBeClickable(search_attraction.getZoomin()));
//		search_attraction.getZoomin().click();
//		Thread.sleep(2000);
//
//		search_attraction.getZoomin().click();
//
//		//Actions act= new Actions(driver);
//		//act.doubleClick(search_attraction.getZoomin());
//		//act.doubleClick(search_attraction.getZoomout());
//		Thread.sleep(2000);
//		search_attraction.getFulllocation().click();
//
//
//
//
//	
//	}
//
//
//
//	@Then("User should view the details of nearby attractive places of hotels")
//	public void user_should_view_the_details_of_nearby_attractive_places_of_hotels() {
//		SelectedHotelPage availiableText=new SelectedHotelPage(driver);
//		availiableText.getShowHotel().click();
//
//
//		String expectedText="SHOW ALL NEARBY PLACES";
//		Assert.assertEquals(expectedText,availiableText.getNearbylocations().getText(),"FAIL:USER IS NOT ABLE TO VIEW THE LOCATION(MAP) NEARBY PLACES ");
//		System.out.println(" PASS:USER CAN ABLE TO VIEW THE LOCATION(MAP) OF NEAR BY  ATTRACTION PLACES SUCCESSFULLY )");
//
//	}
//
//	@Then("close the Browser")
//	public void close_the_browser() {
//
//		driver.quit();
//	}
//
//
//
//
//
//
//
//}
