package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectedHotelPage  extends BasePage{

	public SelectedHotelPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub




	}
	@FindBy(xpath="//div[@class='HotelsModal__CloseButtonWrapper-rgix69-3 izcuNV']")
	private WebElement cancelationPolicymessage;

	public WebElement getCancelationPolicymessage() {
		return cancelationPolicymessage;
	}
	@FindBy(linkText="Guest Reviews")
	private WebElement guestRatings;
	public WebElement getGuestRatings() {
		return guestRatings;
	}
	@FindBy(xpath="//div[@class='HotelsModal__CloseButtonWrapper-rgix69-3 izcuNV']")
	private WebElement errormsg;
	public WebElement getErrormsg() {
		return errormsg;
	}



	@FindBy(xpath="	//select[@class='PersonalProfile__NameEnterSelect-sc-1r9ak8b-7 hkMeMW']")
	private WebElement mrOrMs;
	@FindBy(xpath="(//input[@class='PersonalProfile__NameEnterInput-sc-1r9ak8b-6 hEgRgJ'])[1]")
	private WebElement FirstNameTextField;
	@FindBy (xpath="//input[@placeholder='Enter Last Name']")
	private WebElement lastNameTextField;
	@FindBy (xpath="//input[@placeholder='Enter Email Address']")
	private WebElement emailTextField;
	@FindBy (xpath="//input[@placeholder='Enter Phone Number']")
	private WebElement phoneNumberTextField;
	@FindBy(xpath="//span[text()='Proceed To Payment Options']")
	private WebElement proceedToPaymentButton;

	@FindBy(xpath="//select[@class='PersonalProfile__NameEnterSelect-sc-1r9ak8b-7 hkMeMW']")
	
	private WebElement paymentRadioButton;
	public WebElement getMrOrMs() {
		return mrOrMs;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getProceedToPaymentButton() {
		return proceedToPaymentButton;
	}

	public WebElement getPaymentRadioButton() {
		return paymentRadioButton;
	}
	@FindBy(xpath="//div[@id='30']/div[1]") 
	private WebElement dinnerImages;


	public WebElement getDinnerImages() {
		return dinnerImages;
	}

	@FindBy(xpath="/html/body/div[1]/section[1]/div[1]/section/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/span/div[2]/a")
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}
	@FindBy(xpath="(//div[@class='RoomFlavorstyles__CancellationPolicyContainer-sc-1btnl3r-31 dpbkmY']//a)[1]")
	private WebElement cancellation;
	public WebElement getCancellation() {
		return cancellation;
	}

	@FindBy(xpath="//button[text()='Show Hotel']")
	private WebElement showHotel;
	public WebElement getShowHotel() {
		return showHotel;
	}
	@FindBy(xpath="//button[@title='Toggle fullscreen view']")
	private WebElement fulllocation;
	public WebElement getFulllocation() {
		return fulllocation;
	}
	@FindBy(xpath="(//div[@class='LocationMapstyles__ListItemTextsContainer-caml-13 fAoVni']//a)[1]")
	private WebElement ForumSunaja;
	public WebElement getForumSunaja() {
		return ForumSunaja;
	}
	@FindBy(xpath="//input[@placeholder='Find nearby attractions and other places near Hotel']")

	private WebElement searchattractionPlaces;
	@FindBy (xpath="//a[@data-testid='navigation-header-cta-#location']")
	private WebElement location;	
	@FindBy(xpath="//button[contains(@class,'dwebCommonstyles__ButtonBase-sc-112ty3f-10 RoomFlavorstyles__ButtonWrapper-sc-1btnl3r-15')]")

	private WebElement selectRoomButton;
	public WebElement getSelectRoomButton() {
		return selectRoomButton;
	}
	
	@FindBy(xpath="//input[@placeholder='e.g. - Area, Landmark or Hotel Name']")
	private WebElement areaSelection;

	public WebElement getAreaSelection() {
		return areaSelection;
	}
	@FindBy (xpath="//div[@itemprop='aggregateRating']")
	private WebElement ratings;

	public WebElement getRatings() {
		return ratings;
	}

	public WebElement getSearchattractionPlaces() {
		return searchattractionPlaces;
	}
	public WebElement getLocation() {
		return location;
	}
	@FindBy(xpath="//input[@placeholder='Enter Promo Code']")
	private WebElement enterpromo;

	public WebElement getEnterpromo() {
		return enterpromo;
	}
	@FindBy(xpath="//a[@data-testid='navigation-header-cta-#rooms']")
	private WebElement roomOptionsLink;
	public WebElement getRoomOptionsLink() {
		return roomOptionsLink;
	}
	@FindBy (xpath="//button[text()='APPLY']")
	private WebElement apply;
	public WebElement getApply() {
		return apply;
	}
	@FindBy(xpath="(//h3[text()='HOTEL INFO']/following-sibling::div)[1]")
	private WebElement dropDownHotelInfo;
	public WebElement getDropDownHotelInfo() {
		return dropDownHotelInfo;
	}
	@FindBy(xpath="//button[text()='Show All Nearby Places']")
	private WebElement nearbylocations;
	public WebElement getNearbylocations() {
		return nearbylocations;
	}
	@FindBy(xpath="//button[@title='Show satellite imagery']")
	private WebElement satellite;
	public WebElement getSatellite() {
		return satellite;
	}
	@FindBy(xpath="//p[text()='Photos by Travellers (']")	
	private WebElement image;

	public WebElement getImage() {
		return image;
	}
	@FindBy(xpath="//h3[text()='Promo Code Not Applicable']")
	private WebElement errorText;
	public WebElement getErrorText() {
		return errorText;
	}
	@FindBy(xpath="//h3[text()='Cancellation Policy']")
	private WebElement cancellationtext;
	public WebElement getCancellationtext() {
		return cancellationtext;
	}
	@FindBy (xpath="//div[text()='Room']")
	private WebElement roomimages;

	public WebElement getRoomimages() {
		return roomimages;
	}	
	public WebElement getBedImages() {
		return bedImages;
	}
	@FindBy(xpath="//button[text()='Show All Nearby Places']")
	private WebElement nearByplaces;
	public WebElement getNearByplaces() {
		return nearByplaces;
	}
	@FindBy(xpath="//button[@aria-label='Zoom in']")
	private WebElement zoomin;
	@FindBy(xpath="//button[@title='Zoom out']")
	private WebElement zoomout;
	public WebElement getZoomin() {
		return zoomin;
	}

	public WebElement getZoomout() {
		return zoomout;
	}
	public WebElement getGST_CheckBox() {
		return GST_CheckBox;
	}
	@FindBy (xpath="(//img[@class='CaptivativeImagesGridstyles__CaptivateLandscapeImage-j13xmf-0 iAsHcP'])[1]")
	private WebElement bedImages;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement GST_CheckBox;
	@FindBy(id="Super Deals")
	private WebElement super_Deals;
	
	
	public WebElement getSuper_Deals() {
		return super_Deals;
	}
	@FindBy(xpath="//h4[text()='PAYMENT MODE']")
	private WebElement payment_Mode;
	@FindBy(xpath="(//input[@name='cardnumber'])[1]")
	private WebElement card_Number;
	@FindBy(xpath="(//input[@name='ccname'])[1]")
	 private WebElement cc_Name;
	@FindBy(xpath="(//input[@name='cardExpiry'])[1]")
	private WebElement card_Expiry;
	@FindBy(xpath="(//input[@name='cardCVV'])[1]")
	private WebElement card_CVV;
	@FindBy(xpath="(//button[contains(@class,'button green')])[1]")
	private WebElement pay_Btn;
	@FindBy(xpath="//p[text()='Please Enter Valid Card Number']")
	private WebElement  enter_Valid_Card_details;
	@FindBy(xpath="(//h3[text()='HOTEL INFO']/following-sibling::div)[1]")
	private WebElement  guest_Details_Drop_Down;

	
	public WebElement getGuest_Details_Drop_Down() {
		return guest_Details_Drop_Down;
	}

	public WebElement getEnter_Valid_Card_details() {
		return enter_Valid_Card_details;
	}

	public WebElement getPayment_Mode() {
		return payment_Mode;
	}

	public WebElement getCard_Number() {
		return card_Number;
	}

	public WebElement getCc_Name() {
		return cc_Name;
	}

	public WebElement getCard_Expiry() {
		return card_Expiry;
	}

	public WebElement getCard_CVV() {
		return card_CVV;
	}

	public WebElement getPay_Btn() {
		return pay_Btn;
	}

	public WebElement getHotel_Info() {
		return hotel_Info;
	}
	@FindBy(xpath="//h3[text()='HOTEL INFO']")
	private WebElement hotel_Info;





}

