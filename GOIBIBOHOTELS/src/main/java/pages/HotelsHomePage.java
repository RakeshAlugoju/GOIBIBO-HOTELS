package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsHomePage extends BasePage {
	public WebElement driver;
	
	
	public HotelsHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public WebElement getBeachVacations() {
		return beachVacations;
	}

	public WebElement getWeekendGateway() {
		return weekendGateway;
	}
	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getStayLikeRoyal() {
		return stayLikeRoyal;
	}
	public WebElement getAddAdult() {
		return addAdult;
	}
	public WebElement getDriver() {
		return driver;
	}
	public WebElement getIndianPilgrimages() {
		return indianPilgrimages;
	}
	public WebElement getGuestRoom() {
		return guestRoom;
	}
	public WebElement getAreaAdressTextField() {
		return areaAdressTextField;
	}
	public WebElement getSearchHotelsButton() {
		return searchHotelsButton;
	}
	@FindBy(xpath="(//span[text()='-'])[2]")
	private WebElement adultMinusButton;
	
	public WebElement getAdultMinusButton() {
		return adultMinusButton;
	}
	@FindBy(xpath="(//input[@name='CountryType'])[2]")
	private WebElement InternationalRadioButton;
	public WebElement getInternationalRadioButton() {
		return InternationalRadioButton;
	}
	@FindBy(xpath="//p[text()='Login or Signup']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath="(//span[text()='+'])[1]")
	private WebElement addRoom;
	@FindBy(xpath="(//span[text()='+'])[3]")
	private WebElement addchildren;


	public WebElement getAddRoom() {
		return addRoom;
	}
	public WebElement getAddchildren() {
		return addchildren;
	}
	@FindBy (xpath="//button[@data-testid='searchHotelBtn']")
	private WebElement searchHotelsButton;

	
	@FindBy(xpath="//li[text()='Indian Pilgrimages']")
	private WebElement indianPilgrimages;
    @FindBy(xpath="//input[@placeholder='e.g. - Area, Landmark or Hotel Name']")
    private WebElement areaAdressTextField;
	
	@FindBy(linkText="Hotels")   
	private WebElement Hotels ;
	@FindBy(xpath="//li[text()='Beach Vacations']")
	private WebElement beachVacations;
	@FindBy(xpath="//li[text()='Weekend Getaways']")
	private WebElement weekendGateway;
	@FindBy(xpath="//li[text()='Stay Like Royals']")
	private WebElement stayLikeRoyal;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/section[1]/div[1]/div/div[4]/div/input")
	private WebElement guestRoom;
	@FindBy(xpath="(//span[text()='+'])[2]")
	private WebElement addAdult;
	@FindBy(xpath="(//h4[contains(@class,'dwebCommonstyles__SmallSectionHeader-sc-112ty3f-7 SearchBlockUIstyles__CheckInDateWrapDiv-fity7j-14')])[1]")
	private WebElement checkIn;
	@FindBy (xpath="(//h4[contains(@class,'dwebCommonstyles__SmallSectionHeader-sc-112ty3f-7 SearchBlockUIstyles__CheckInDateWrapDiv-fity7j-14')])[2]")
    private WebElement checkOut;
	@FindBy (xpath="//span[text()='30']")
	private WebElement checkINdate_30;
    @FindBy(xpath="(//div[@class='dcalendarstyles__SliderArrow-r2jz2t-14 eBymQa'])[2]")
    private WebElement slideArrow;
     @FindBy(xpath="//span[text()='8']")
     private WebElement eigth_Date;
     
     
     @FindBy(xpath="//span[text()='14']")
     private WebElement fourteen_date;
    
    
	public WebElement getSlideArrow() {
		return slideArrow;
	}
	public WebElement getEigth_Date() {
		return eigth_Date;
	}
	public WebElement getFourteen_date() {
		return fourteen_date;
	}
	@FindBy(xpath="//span[text()='14']")
	private WebElement checkOutDate_14;
	@FindBy(xpath="//button[@data-testid='searchHotelBtn']")
	private WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	public WebElement getCheckINdate_30() {
		return checkINdate_30;
	}
	public WebElement getCheckOutDate_14() {
		return checkOutDate_14;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	
	

	
	

	/*
	 * @FindBy( ) private WebElement ;
	 * 
	 * @FindBy( ) private WebElement ;
	 * 
	 * @FindBy( ) private WebElement ;
	 * 
	 * @FindBy( ) private WebElement ;
	 * 
	 * @FindBy( ) private WebElement ;
	 * 
	 * @FindBy( ) private WebElement ;
	 */
	

}
