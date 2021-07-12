//
//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import genericUtil.ExcelUtility;
//import genericUtil.IAutoConstants;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When; import
//io.github.bonigarcia.wdm.WebDriverManager;
//import pages.HotelsHomePage;
//
//public class CalendarWidget {
//	public WebDriver driver;
//	public ExcelUtility readExcel=new ExcelUtility();
//	public HotelsHomePage calendar;
//	public WebDriverWait wait;
//
//	@Given("Open the Browser")
//	public void open_the_browser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//
//	}
//
//	@When("Enter the URL of application") 
//	public void enter_the_url_of_application() {
//		String url=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0, 0);
//		driver.get(url);
//		String expectedHomePageTitle ="Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL:Hotel Home Page is Not Displayed");
//		System.out.println("PASS:Hotel Home Page is Displayed Sucessfully");
//	}
//
//
//
//	@And("Clicked on Hotel") 
//	public void clicked_on_hotel() {
//		calendar=new HotelsHomePage(driver);
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(calendar.getHotels()));
//
//		calendar.getHotels().click();
//
//	}
//
//	@When("User should be able to view the Hotel Home Page of Application")
//	public void user_should_be_able_to_view_the_hotel_home_page_of_application()
//	{
//
//		String expectedHomePageTitle ="Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo";
//		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"FAIL: Home Page is  Not Displayed");
//		System.out.println("PASS: Home Page is Displayed Successfully");
//	}
//
//	@When("Enter CHECK-IN Date from the Calendar Widget") 
//	public void enter_check_in_date_from_the_calendar_widget() {
//
//
//
//		calendar=new HotelsHomePage(driver);
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(calendar.getCheckIn()));
//		calendar.getCheckIn().click();
//		calendar.getSlideArrow().click();
//		calendar.getSlideArrow().click();
//		calendar.getSlideArrow().click();
//
//		wait.until(ExpectedConditions.elementToBeClickable(calendar.getEigth_Date()));
//		calendar.getEigth_Date().click();
//
//	}
//
//	@When("CHECK-OUT Dates from the Calendar Widget") 
//	public void check_out_dates_from_the_calendar_widget() {
//		calendar=new HotelsHomePage(driver);
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(calendar.getCheckOut()));
//		calendar.getCheckOut().click();
//		//calendar.getSlideArrow().click();
//
//
//		wait.until(ExpectedConditions.elementToBeClickable(calendar.getFourteen_date()));
//		calendar.getFourteen_date().click();
//
//		calendar.getFourteen_date();
//	}
//
//
//	@Then("Close the browser")
//	public void close_the_browser() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.quit();
//
//	}
//
//
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
//
//
//
//
//
//
//
//
