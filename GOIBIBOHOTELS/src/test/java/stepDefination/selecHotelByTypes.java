//
//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
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
//
//
//public class selecHotelByTypes {
//	public WebDriver driver;
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
//	public void enter_the_url_of_application() { 
//		String url=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 0);
//		driver.get(url);
//		String expectedHomePageTitle = "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL: Home Page is  Not Displayed");
//		System.out.println("PASS: GOIBIBO HOME PAGE IS DISPLAYED SUCCESSFULLY");
//	}
//
//	@When("Clicked on Hotels") 
//	public void clicked_on_hotel() {
//		HotelsHomePage hotelsLink=new HotelsHomePage(driver);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(hotelsLink.getHotels()));
//		hotelsLink.getHotels().click();
//		//act.doubleClick(hotelsLink.getHotels()).perform();
//
//		String expectedHomePageTitle = "Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL:Hotel Home Page is Not Displayed");
//		System.out.println("PASS:HOTELS HOME PAGE IS DISPLAYED SUCCESSFULLY");
//
//	}
//
//
//
//	@When("user enters the Area\\/Landmark\\/Hotel name")
//	public void user_enters_the_area_landmark_hotel_name() throws InterruptedException
//	{
//		HotelsHomePage area = new HotelsHomePage(driver);
//
//		//WebDriverWait wait = new WebDriverWait(driver, 10);
//		//wait.until(ExpectedConditions.elementToBeClickable(area.getAreaAdressTextField()));
//		area.getAreaAdressTextField().click(); 
//
//		Thread.sleep(3000);
//		//	String area=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 2);
//
//		area.getAreaAdressTextField().sendKeys("Hyderabad"); 
//		Thread.sleep(3000);
//		area.getAreaAdressTextField().sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(3000);
//		area.getAreaAdressTextField().sendKeys(Keys.ENTER);
//	}
//
//
//	@When("User click on Search Hotels") 
//	public void user_click_on_search_hotels()
//	{
//		HotelsHomePage search = new HotelsHomePage(driver);
//
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(search.getSearchHotelsButton()));
//
//		search.getSearchHotelsButton().click();
//
//
//	}
//
//	@When("user clicks on gostays Certified and scrolls down and scrolls up")
//	public void user_clicks_on_gostays_certified_and_scrolls_down_and_scrolls_up() throws InterruptedException {
//		multiplsHotelsPage gostays=new multiplsHotelsPage(driver);
//
//
//		
//		Thread.sleep(2000);
//
//
//		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
//		Thread.sleep(2000);
//		((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");
//		Thread.sleep(2000);
//
//
//	}
//
//	@When("user clicks on couplesFriendly  and scrolls down and scrolls up")
//	public void user_clicks_on_couples_friendly_and_scrolls_down_and_scrolls_up() throws InterruptedException {
//
//		multiplsHotelsPage couples=new multiplsHotelsPage(driver);
//
//		couples.getCouplesFriendly().click();
//		Thread.sleep(2000);
//
//		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
//		Thread.sleep(2000);
//		((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");
//
//
//	}
//
//	@When("user clicks on  oyo   and scrolls down")
//	public void user_clicks_on_oyo_and_scrolls_down() throws InterruptedException {
//
//
//		multiplsHotelsPage oyo=new multiplsHotelsPage(driver);
//
//		oyo.getOyo().click();
//		((JavascriptExecutor) driver).executeScript("scroll(0,800)");
//		Thread.sleep(2000);
//
//
//
//	}
//
//	@When("user select a hotel from oyo")
//	public void user_select_a_hotel_from_oyo() {
//
//		//		try {
//		//			Thread.sleep(2000);
//		//		} catch (InterruptedException e) {
//		//
//		//			e.printStackTrace();
//		//		}
//		//
//
//		multiplsHotelsPage selectOyoHotel=new multiplsHotelsPage(driver);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(selectOyoHotel.getSelectOyoRoom()));
//		selectOyoHotel.getSelectOyoRoom().click();
//
//
//	}
//
//	@Then("it is selected and  viewed succesfully")
//	public void it_is_selected_and_viewed_succesfully() {
//		multiplsHotelsPage selectOyoHotel=new multiplsHotelsPage(driver);
//		selectOyoHotel.getSelectOyoRoom().click();
//		String expectedTitle= "Results";
//		Assert.assertEquals(driver.getTitle(),expectedTitle,"FAIL:HOTEL IS NOT SELECTED SUCCESSFULLY");
//		System.out.println("PASS: HOTEL IS SELECTED SUCCESSFULLY");
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
//}
//
//
//
//
