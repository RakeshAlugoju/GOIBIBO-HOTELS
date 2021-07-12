//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import io.cucumber.java.en.And; 
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When; 
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//import pages.HotelsHomePage;
//import genericUtil.ExcelUtility;
//import genericUtil.IAutoConstants;
//public class AddAdult { 
//	public WebDriver driver; 
//	public ExcelUtility readExcel=new ExcelUtility();
//
//	@Given("Open the Browser") 
//	public void open_the_browser() {
//
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//
//	}
//
//
//	@When("Enter the URL of application")
//
//	public void enter_the_url_of_application() {
//
//		String url=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 0);
//		driver.get(url);
//		String expectedHomePageTitle = "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL: Home Page is  Not Displayed");
//		System.out.println("PASS: Home Page is Displayed Successfully");
//	}
//	@And("Clicked on Hotel")
//	public void clicked_on_hotel() {
//
//		HotelsHomePage hotelsLink=new HotelsHomePage(driver);
//		hotelsLink.getHotels().click();
//
//
//	}
//
//	@When("User should be able to view the Hotel Home Page of Application")
//	public void user_should_be_able_to_view_the_hotel_home_page_of_application()
//	{
//
//		String expectedHomePageTitle = "Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL:Hotel Home Page is Not Displayed");
//		System.out.println("PASS:Hotel Home Page is Displayed Sucessfully");
//
//
//
//	}
//
//	@When("Click On GUESTS&ROOMS")
//	public void click_on_guests_rooms() {
//
//		HotelsHomePage guestRoom=new HotelsHomePage(driver);
//		guestRoom.getGuestRoom().click();
//
//	}
//
//	@Then("Click On  + in ADULTS")
//	public void click_on_in_adults() {
//
//
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		HotelsHomePage adultPlus = new HotelsHomePage(driver);
//		wait.until(ExpectedConditions.elementToBeClickable(adultPlus.getAddAdult()));
//		Actions act=new Actions(driver);
//		act.doubleClick(adultPlus.getAddAdult()).perform();
//		act.doubleClick(adultPlus.getAddRoom()).perform();
//		act.doubleClick(adultPlus.getAddchildren()).perform();
//		act.doubleClick(adultPlus.getAddAdult()).perform();
//		act.doubleClick(adultPlus.getAddRoom()).perform();
//		act.doubleClick(adultPlus.getAddchildren()).perform();
//		act.doubleClick(adultPlus.getAddAdult()).perform();
//		act.doubleClick(adultPlus.getAddRoom()).perform();
//		act.doubleClick(adultPlus.getAddchildren()).perform();
//		act.doubleClick(adultPlus.getAddAdult()).perform();
//		act.doubleClick(adultPlus.getAddRoom()).perform();
//		act.doubleClick(adultPlus.getAddchildren()).perform();
//		act.doubleClick(adultPlus.getAddAdult()).perform();
//		act.doubleClick(adultPlus.getAddRoom()).perform();
//		act.doubleClick(adultPlus.getAddchildren()).perform();
//		act.doubleClick(adultPlus.getAddAdult()).perform();
//		act.doubleClick(adultPlus.getAddRoom()).perform();
//		act.doubleClick(adultPlus.getAddchildren()).perform();
//		act.doubleClick(adultPlus.getAddAdult()).perform();
//		act.doubleClick(adultPlus.getAddRoom()).perform();
//		act.doubleClick(adultPlus.getAddchildren()).perform();
//		act.doubleClick(adultPlus.getAddAdult()).perform();
//		act.doubleClick(adultPlus.getAddRoom()).perform();
//		act.doubleClick(adultPlus.getAddchildren()).perform();
//		act.doubleClick(adultPlus.getAddAdult()).perform();
//		act.doubleClick(adultPlus.getAddRoom()).perform();
//		act.doubleClick(adultPlus.getAddchildren()).perform();
//
//
//
//		driver.switchTo().alert().accept();
//
//
//	
//
//		
//		
//		
//	}
//	
//
//
//	@Then("Close the  website")
//	public void close_the_website() {
//		
//		driver.quit();
//		
//
//	}
//
//}
//
//
//
