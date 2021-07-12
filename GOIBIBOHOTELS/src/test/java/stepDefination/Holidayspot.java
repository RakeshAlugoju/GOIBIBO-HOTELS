//
//  package stepDefination;
//  
//  import java.util.concurrent.TimeUnit;
//  
//  import org.openqa.selenium.JavascriptExecutor;
//  
//  //import java.util.concurrent.TimeUnit;
//  
//  import org.openqa.selenium.WebDriver; import
//  org.openqa.selenium.chrome.ChromeDriver;
//  
//  import pages.*; import io.cucumber.java.en.Given; import
//  io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
//  io.github.bonigarcia.wdm.WebDriverManager;
//  
//  public class Holidayspot { public WebDriver driver;
//  
//  @Given("Open the Browser") public void open_the_browser() {
//  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
//  driver.manage().window().maximize();
//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }
//  
//  @When("Enter the URL of application") public void
//  enter_the_url_of_application() { driver.get("https://www.goibibo.com/");
//  String expectedHomePageTitle =
//  "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off"
//  ; if (driver.getTitle().equals(expectedHomePageTitle)) {
//  System.out.println("Home Page is Displayed Successfully"); } else {
//  System.out.println("  Home Page is not Displayed ");
//  
//  } }
//  
//  @When("Clicked on Hotels") public void clicked_on_hotel() { HotelsHomePage
//  hotlesLinks = new HotelsHomePage(driver);
//  
//  hotlesLinks.getHotels().click();
//  
//  String expectedHomePageTitle =
//  "Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo"; if
//  (driver.getTitle().equals(expectedHomePageTitle)) {
//  System.out.println(" HotelsHomePage is Displayed Successfully"); } else {
//  System.out.println(" HotelsHomePage is not Displayed ");
//  
//  } }
//  
//  @When("scroll down") public void scroll_down() {
//  
//  ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
//  
//  }
//  
//  @When("selected on one of the holiday-spot") public void
//  selected_on_one_of_the_holiday_spot() {
//  
//  HotelsHomePage holidays = new HotelsHomePage(driver);
//  holidays.getWeekendGateway().click(); try { Thread.sleep(3000); } catch
//  (InterruptedException e) { // TODO Auto-generated catch block
//  e.printStackTrace(); }
//  
//  
//  holidays.getIndianPilgrimages().click(); try { Thread.sleep(3000); } catch
//  (InterruptedException e) { 
//  e.printStackTrace(); }
//  
//  
//  
//  holidays.getStayLikeRoyal().click();
//  
//  
//  
//  }
//  
//  
//  
//  
//  @Then("it displays the hotels of the particular holiday spot.") public void
//  it_displays_the_hotels_of_the_particular_holiday_spot() { String
//  expectedHolidayTitle="    ";
//  if(driver.getTitle().equals(expectedHolidayTitle)) {
//  System.out.println("holidaySpot is Displayed Successfully"); } else {
//  System.out.println("  Holidayspot is not Displayed ");
//  
//  } }
//  
//  
//  }
//  
//  
//  
// 