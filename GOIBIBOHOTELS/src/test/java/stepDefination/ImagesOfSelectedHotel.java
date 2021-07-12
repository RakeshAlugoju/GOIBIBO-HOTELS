//
//package stepDefination;
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
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.HotelsHomePage;
//import pages.SelectedHotelPage;
//
//public class ImagesOfSelectedHotel { 
//	public WebDriver driver;
//	public ExcelUtility readExcel=new ExcelUtility();
//
//	public WebDriverWait wait;
//
//	@Given("Open the Browser")
//	public void open_the_browser() {
//		WebDriverManager.chromedriver().setup(); 
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
//	public void user_enters_the_area_landmark_hotel_name() throws InterruptedException { 
//		HotelsHomePage area = new HotelsHomePage(driver);
//		area.getAreaAdressTextField().click();
//		{
//			area.getAreaAdressTextField().sendKeys("Hyderabad Hotels");
//			area.getAreaAdressTextField().sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(3000);
//			area.getAreaAdressTextField().sendKeys(Keys.ENTER);
//		}
//	}
//	@When("User click on Search Hotels and Select a Hotel")
//	public void user_click_on_search_hotels_and_select_a_hotel() {
//		HotelsHomePage search = new HotelsHomePage(driver); 
//		search.getSearchHotelsButton().click();
//
//
//
//
//
//	}
//
//	@When("user clicks on Photos by travelers") 
//	public void user_clicks_on_photos_by_travelers() {
//
//		SelectedHotelPage images=new SelectedHotelPage(driver);
//
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(images.getImage()));
//		images.getImage().click();
//
//
//
//	}
//
//	@And("Scroll down and  choose the image")
//	public void scroll_down_and_choose_the_image() {
//		SelectedHotelPage roomimages=new SelectedHotelPage(driver); 
//
////WebDriverWait wait = new WebDriverWait(driver, 10);
////wait.until(ExpectedConditions.elementToBeClickable(roomimages.getRoomimages()));
//		roomimages.getRoomimages().click();
//		
//
//		((JavascriptExecutor) driver).executeScript("scroll(0,600)"); 
//		
//
//	//	wait.until(ExpectedConditions.elementToBeClickable(roomimages.getBedImages()));
//		
//
//	//	roomimages.getBedImages().click();
//		
//
//		roomimages.getBedImages().click();
//		//Thread.sleep(2000);
//		Actions act = new Actions(driver);
//		act.doubleClick(roomimages.getBedImages()).perform();
//
//
//
//
//
//	}
//
//	@Then("image is selected and viewed") 
//	public void image_is_selected_and_viewed() {
//		String ExpectedTitle= "Zibe - Hyderabad by GRT Hotels Hyderabad - Reviews, Photos, Price & Offers";
//		Assert.assertEquals(driver.getTitle(),ExpectedTitle,"FAIL:  HOTEL IMAGES ARE NOT VIEWED");
//		System.out.println("PASS:HOTEL IMAGES ARE SELECTED AND VIEWED");
//
//	}
//
//
//	@Then("close the browser")
//	public void close_the_browser() {
//		driver.quit();
//	}}
