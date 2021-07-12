//
//  package stepDefination;
//  
//  import java.util.concurrent.TimeUnit;
//  
//  import org.openqa.selenium.Keys; import org.openqa.selenium.WebDriver; import
//  org.openqa.selenium.chrome.ChromeDriver;
//  
//  import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
//  io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
//  io.github.bonigarcia.wdm.WebDriverManager; import pages.HotelsHomePage;
//  
//  
//  public class InternationToIndiaRadioButton { public WebDriver driver;
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
//  
//  @When("user clicked on INTERNATIONAL Radio-button") public void
//  user_clicked_on_international_radio_button() { HotelsHomePage inter_radio=new
//  HotelsHomePage(driver); inter_radio.getInternationalRadioButton().click(); }
//  
//  
//  @And("user enters the Area\\/Landmark\\/Hotel name and Selects  Hotel from the DropDownList"
//  ) public void
//  user_enters_the_area_landmark_hotel_name_and_selects_hotel_from_the_drop_down_list
//  () {
//  
//  { HotelsHomePage area = new HotelsHomePage(driver);
//  area.getAreaAdressTextField().click(); try { Thread.sleep(2000); } catch
//  (InterruptedException e) { // TODO Auto-generated catch block
//  e.printStackTrace(); }
//  area.getAreaAdressTextField().sendKeys("Hyderabad Hotels"); try {
//  Thread.sleep(2000); } catch (InterruptedException e) {  e.printStackTrace(); }
//  area.getAreaAdressTextField().sendKeys(Keys.ARROW_DOWN); try {
//  Thread.sleep(2000); } catch (InterruptedException e) {  e.printStackTrace(); }
//  
//  area.getAreaAdressTextField().sendKeys(Keys.ENTER);
//  
//  } }
//  
//  
//  
//  
//  @Then("India radio-button is selected automatically") public void
//  india_radio_button_is_selected_automatically() {
//  
//  }
//  
//  
//  }
// 