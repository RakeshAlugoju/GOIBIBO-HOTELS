//
//  package stepDefination;
//  
//  import java.util.concurrent.TimeUnit;
//  
//  import org.openqa.selenium.WebDriver; import
//  org.openqa.selenium.chrome.ChromeDriver; 
//  
//  import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
//  io.cucumber.java.en.When; import io.github.bonigarcia.wdm.WebDriverManager;
//  import pages.HotelsHomePage; import pages.loginPage;
//  
//  public class login { public WebDriver driver;
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
//  System.out.println("  Home Page is not Displayed "); } }
//  
//  @When("Clicked on Hotels") public void clicked_on_hotels() { HotelsHomePage
//  hotelsLink=new HotelsHomePage(driver); hotelsLink.getHotels().click(); }
//  
//  @When("User click on Login or Signup") public void
//  user_click_on_login_or_signup() { HotelsHomePage login=new
//  HotelsHomePage(driver); login.getLogin().click(); }
//  
//  @When("User Enter the phone number in the LoginWithPhoneNUmber TextFeild")
//  public void
//  user_enter_the_phone_number_in_the_login_with_phone_n_umber_text_feild() {
//  loginPage phone=new loginPage(driver); phone.getPhone().click();
//  phone.getPhone().sendKeys("8309212165");
//  
//  }
//  
//  @When("User Click on continue") public void user_click_on_continue() {
//  loginPage continueButton=new loginPage(driver);
//  continueButton.getContinueButton().click();
//  
//  }
//  
//  @Then("Login successfully") public void login_successfully() {
//  
//  }
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
//  }
// 