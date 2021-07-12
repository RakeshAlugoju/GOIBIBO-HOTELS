//package stepDefination;
//
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
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
//
//import pages.multiplsHotelsPage;
//
//public class DifferentTypesOfHotels {
//	public WebDriver driver;
//	public ExcelUtility readExcel=new ExcelUtility();
//	public HotelsHomePage different;
//	public WebDriverWait wait;
//
//
//	@Given("Open the Browser") 
//	public void open_the_browser() {
//		WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
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
//
//	@When("user  Clicked on Hotels")
//	public void user_clicked_on_hotels() {
//
//		HotelsHomePage hotelsLink=new HotelsHomePage(driver);
//		hotelsLink.getHotels().click();
//
//		String expectedHomePageTitle = "Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL:Hotel Home Page is Not Displayed");
//		System.out.println("PASS:Hotel Home Page is Displayed Sucessfully");
//
//
//
//	}
//
//
//
//	@When("user enters the Area\\/Landmark\\/Hotel name")
//	public void user_enters_the_area_landmark_hotel_name() throws InterruptedException
//	{
//		different=new  HotelsHomePage(driver);
//
//		different.getAreaAdressTextField().click();
//
//		String area=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 1);
//		different.getAreaAdressTextField().sendKeys(area);
//		Thread.sleep(3000);
//
//		different.getAreaAdressTextField().sendKeys(Keys.ARROW_DOWN);
//
//		different.getAreaAdressTextField().sendKeys(Keys.ENTER);
//
//	}
//
//
//	@When("User click on Search Hotels") 
//	public void user_click_on_search_hotels()
//	{
//		different = new HotelsHomePage(driver); 
//		different.getSearchHotelsButton().click();
//
//	}
//
//	@When("user clicks on gostays Certified and scrolls down and scrolls up")
//	public void user_clicks_on_gostays_certified_and_scrolls_down_and_scrolls_up() {
//		multiplsHotelsPage gostays=new multiplsHotelsPage(driver);
//		gostays.getGoStaysCertified().click();
//	
//		
//		((JavascriptExecutor) driver).executeScript("scroll(0,800)");
//		((JavascriptExecutor) driver).executeScript("scroll(0,-800)");
//
//		
//
//	}
//
//	@When("user clicks on couplesFriendly  and scrolls down and scrolls up")
//	public void user_clicks_on_couples_friendly_and_scrolls_down_and_scrolls_up() {
//
//		multiplsHotelsPage couples=new multiplsHotelsPage(driver);
//
//		couples.getCouplesFriendly().click();
//		((JavascriptExecutor) driver).executeScript("scroll(0,700)");
//
//		
//		((JavascriptExecutor) driver).executeScript("scroll(0,-700)");
//		
//
//	}
//
//	@When("user clicks on  oyo   and scrolls down")
//	public void user_clicks_on_oyo_and_scrolls_down() {
//
//
//		multiplsHotelsPage oyo=new multiplsHotelsPage(driver);
//
//		oyo.getOyo().click();
//		((JavascriptExecutor) driver).executeScript("scroll(0,700)");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//
//
//
//	}
//
//	@When("user select a hotel from oyo")
//	public void user_select_a_hotel_from_oyo() {
//		((JavascriptExecutor) driver).executeScript("scroll(0,700)");
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//
//
//		multiplsHotelsPage selectOyoHotel=new multiplsHotelsPage(driver);
//		selectOyoHotel.getSelectOyoRoom().click();
//
//
//	}
//
//	@Then("it is selected and  viewed succesfully")
//	public void it_is_selected_and_viewed_succesfully() {
//	multiplsHotelsPage differentHotels=new multiplsHotelsPage(driver);
//		if((differentHotels.getGoStaysCertified().isDisplayed())||(differentHotels.getCouplesFriendly().isDisplayed())||differentHotels.getSelectOyoRoom().isEnabled())
//			
//{
//			System.out.println("DIFFERENT TYPES OF HOTELS ARE SELECTED SUCCESSFULLY");
//
//	}
//		
//
//
//	}
//}
