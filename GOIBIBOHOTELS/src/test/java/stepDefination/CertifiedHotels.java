//
//  package stepDefination;
//  import java.util.concurrent.TimeUnit;
//  
//  
//  import org.openqa.selenium.Keys; 
//  import org.openqa.selenium.WebDriver;
//  import
//  org.openqa.selenium.chrome.ChromeDriver; import
//  org.openqa.selenium.support.ui.ExpectedConditions; import
//  org.openqa.selenium.support.ui.WebDriverWait; import org.testng.Assert;
//  
//  import genericUtil.ExcelUtility; import genericUtil.IAutoConstants; import
//  io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
//  io.cucumber.java.en.When; import io.github.bonigarcia.wdm.WebDriverManager;
//  import pages.HotelsHomePage; import pages.SelectedHotelPage; import
//  pages.multiplsHotelsPage;
//  
//  public class CertifiedHotels { public WebDriver driver; public ExcelUtility
//  readExcel=new ExcelUtility(); public HotelsHomePage certified; public
//  SelectedHotelPage certifiedHotel; public WebDriverWait wait;
//  
//  @Given("Open the Browser") public void open_the_browser() {
//  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
//  driver.manage().window().maximize();
//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }
//  
//  @When("Enter the URL of application") public void
//  enter_the_url_of_application() {
//  
//  
//  //driver.get("https://www.goibibo.com/");
//	  String
//  url=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH, "Sheet1", 0,
//  0); driver.get(url); String expectedHomePageTitle =
//  "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off"
//  ; Assert.assertEquals(driver.getTitle(),
//  expectedHomePageTitle,"FAIL: Home Page is  Not Displayed");
//  System.out.println("PASS: Home Page is Displayed Successfully");
//  
//  }
//  
//  @When("Clicked on Hotels") public void clicked_on_hotel() { HotelsHomePage
//  hotelsLink=new HotelsHomePage(driver); hotelsLink.getHotels().click();
//  
//  String expectedHomePageTitle =
//  "Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo";
//  Assert.assertEquals(driver.getTitle(),
//  expectedHomePageTitle,"FAIL:Hotel Home Page is Not Displayed");
//  System.out.println("PASS:Hotel Home Page is Displayed Sucessfully");
//  
//  }
//  
//  
//  
//  @When("user enters the Area\\/Landmark\\/Hotel name") public void
//  user_enters_the_area_landmark_hotel_name() { certified=new
//  HotelsHomePage(driver);
//  
//  certified.getAreaAdressTextField().click();
//  
//  //String area=readExcel.readStringDataFromExcel(IAutoConstants.EXCEL_PATH,"Sheet1", 0,2);
//  certified.getAreaAdressTextField().sendKeys("Hyderabad");
//  
//  certified.getAreaAdressTextField().sendKeys(Keys.ARROW_DOWN);
//  
//  try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
//  
//  
//  
//  certified.getAreaAdressTextField().sendKeys(Keys.ENTER);
//  
//  
//  }
//  
//  
//  
//  @When("User click on Search Hotels") public void
//  user_click_on_search_hotels() { certified = new HotelsHomePage(driver); wait
//  = new WebDriverWait(driver, 10);
//  
//  wait.until(ExpectedConditions.elementToBeClickable(certified.
//  getSearchHotelsButton())); certified.getSearchHotelsButton().click();
//  
//  
//  }
//  
//  
//  @When("user clicks on gostays Certified") public void
//  user_clicks_on_gostays_certified() {
//  
//  
//  multiplsHotelsPage gostays=new multiplsHotelsPage(driver);
//  
//  gostays.getGoStaysCertified().click();
//  
//  //((JavascriptExecutor) driver).executeScript("scroll(0,500)"); 
//  }
//  
//  @Then("User can able to view the Certified Hotels") 
//  public void user_can_able_to_view_the_certified_hotels() {
//	  multiplsHotelsPage certifiedHotels=new multiplsHotelsPage(driver);
//	  if(certifiedHotels.getGoStaysCertified().isDisplayed())
//	  {
//		  System.out.println("  CERTIFIED HOTELS ARE DISPLAYED SUCCESSFULLY");
//	  }
//  }
//
//@Then("Close the Browser")
//public void close_the_browser() {
//	
//	try {
//		Thread.sleep(3000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//  driver.quit();
//}
//
//
//  }
//  
//  
// 