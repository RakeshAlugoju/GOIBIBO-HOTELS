
	package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class multiplsHotelsPage  extends BasePage{

		public multiplsHotelsPage(WebDriver driver) {
			super(driver);
	}

	public WebElement getFourpointfivwecheckbox() {
			return fourpointfivwecheckbox;
		}

	    @FindBy(xpath="//span[contains(text(),\"4.5+\")]")
	    private WebElement fourpointfivwecheckbox;

	    public WebElement getSelecthotel_1() {
			return selecthotel_1;
		}

		@FindBy(xpath="(//img[@class='HotelCardImageGallerystyles__ImageStyle-r3dzqu-1 dFVxSO'])[1]")
	    private WebElement selecthotel_1;
		@FindBy(xpath="//span[text()='Free Breakfast Included']")
		private WebElement breakfastcheckbox;
		public WebElement getBreakfastcheckbox() {
			return breakfastcheckbox;
		}

		public WebElement getPricerangeCheck() {
			return pricerangeCheck;
		}

		public WebElement getCancelationcheckbox() {
			return cancelationcheckbox;
		}
		@FindBy(xpath="(//span[text()='CCTV surveillance'])[2]")
		private WebElement cctvCheckBox;
		public WebElement getCctvCheckBox() {
			return cctvCheckBox;
		}

		public WebElement getFourPlusPoinCheckBox() {
			return fourPlusPoinCheckBox;
		}

		public WebElement getAirConditionCheckBox() {
			return airConditionCheckBox;
		}

		@FindBy(xpath="//span[contains(text(),\"4+\")]")
		private WebElement fourPlusPoinCheckBox;
		@FindBy(xpath="//span[text()='Air Conditioning']")
		private WebElement airConditionCheckBox;
		@FindBy(xpath="//span[text()='₹2001 - ₹4000']")
		private WebElement pricerangeCheck;
		
		@FindBy(xpath="//span[text()='Free Cancellation Available']")
		private WebElement cancelationcheckbox;
		@FindBy(xpath="(//img[@class='HotelCardImageGallerystyles__ImageStyle-r3dzqu-1 dFVxSO'])[2]")
		private WebElement selectOyoRoom;
		public WebElement getSelectOyoRoom() {
			return selectOyoRoom;
		}
		@FindBy(xpath="//span[text()='OYO Rooms']")
		private WebElement oyo;
		public WebElement getOyo() {
			return oyo;
		}
		@FindBy(xpath="//span[text()='goStays Certified']")
		private WebElement goStaysCertified;

	public WebElement getGoStaysCertified() {
			return goStaysCertified;
		}

		public WebElement getCouplesFriendly() {
			return couplesFriendly;
		}
	@FindBy(xpath="(//span[text()='Couple Friendly'])[1]")
	private WebElement couplesFriendly;

	}



	


