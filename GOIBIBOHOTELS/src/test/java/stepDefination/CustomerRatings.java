//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
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
//public class CustomerRatings {
//	public WebDriver driver;
//	public ExcelUtility readExcel=new ExcelUtility();
//	public WebDriverWait wait;
//	public HotelsHomePage customer;
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
//		customer=new HotelsHomePage(driver);
//
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(customer.getHotels()));
//		customer.getHotels().click();
//
//
//
//		String expectedHomePageTitle = "Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL:Hotel Home Page is Not Displayed");
//		System.out.println("PASS:Hotel Home Page is Displayed Sucessfully");
//	} 
//
//	@When("user enters the Area\\/Landmark\\/Hotel name") 
//	public void user_enters_the_area_landmark_hotel_name() {
//		customer=new  HotelsHomePage(driver);
//
//		customer.getAreaAdressTextField().click();
//
//		String area=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 1);
//		customer.getAreaAdressTextField().sendKeys(area);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//
//
//
//		customer.getAreaAdressTextField().sendKeys(Keys.ARROW_DOWN);
//
//		customer.getAreaAdressTextField().sendKeys(Keys.ENTER);
//
//
//	}
//
//	@When("User click on Search Hotels and  Select a Hotel") 
//	public void user_click_on_search_hotels_and_select_a_hotel() {
//	     customer = new HotelsHomePage(driver); 
//		customer.getSearchHotelsButton().click();
//	}
//	@When("User clicks on Ratings")
//	public void user_clicks_on_ratings() {
//		SelectedHotelPage ratings=new SelectedHotelPage(driver);
//		ratings.getGuestRatings().click();
//		ratings.getGuestRatings().click();
//
//		
//	}
//
//	@Then("User can view the customer ratings of that particular hotel") 
//	public void user_can_view_the_customer_ratings_of_that_particular_hotel() {
//
//		
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
