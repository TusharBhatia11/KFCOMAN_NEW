package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class HomeSidemenu extends Utility{

	@FindBy(id="com.kfc.oman:id/tv_login")
	WebElement SidemenuLogin;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_side_menu_name'][1]")
	WebElement SidemenuTrackorder;

	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_side_menu_name'][2]")
	WebElement SidemenuOrderhistory;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_side_menu_name'][3]")
	WebElement SidemenuOffers;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_side_menu_name'][4]")
	WebElement SidemenuExploremenu;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_side_menu_name'][5]")
	WebElement SidemenuFeedback;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_side_menu_name'][6]")
	WebElement SidemenuFAQ;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_side_menu_name'][7]")
	WebElement Sidemenutermsandconditions;
	
	
	@FindBy(id="com.kfc.oman:id/iv_settings")
	WebElement profilesettings;
	
	@FindBy(id="com.kfc.oman:id/tv_phone")
	WebElement profilephonenumber;
	

	@FindBy(id="com.kfc.oman:id/et_name")
	WebElement profileusername;


	@FindBy(id="com.kfc.oman:id/bt_cancel")
	WebElement EditprofileCancelbtn;
	

	@FindBy(id="com.kfc.oman:id/bt_save")
	WebElement EditprofileSavebtn;
	
	@FindBy(id="com.kfc.oman:id/tv_edit_profile")
	WebElement EditProfile;

	@FindBy(id="com.kfc.oman:id/tv_add_new_number")
	WebElement profileAddnewnumber;

	@FindBy(id="com.kfc.oman:id/tv_fav")
	WebElement profileMyFav;
	
	@FindBy(id="com.kfc.oman:id/tv_addresses")
	WebElement profileMyaddress;
	
	@FindBy(id="com.kfc.oman:id/tv_orders")
	WebElement profileMyorders;
	
	@FindBy(id="com.kfc.oman:id/tv_save_cards")
	WebElement profileMysavedcards;
	
	@FindBy(id="com.kfc.oman:id/tv_support")
	WebElement profileSupport;
	
	@FindBy(id="com.kfc.oman:id/tv_logout")
	WebElement profileLogout;
	
	@FindBy(id="com.kfc.oman:id/iv_menu")
	WebElement HomeBannerHamburgerMenu;
	
	@FindBy(id="com.kfc.oman:id/et_mobile_number")
	WebElement MobileNumber;
	
	@FindBy(id="com.kfc.oman:id/et_order_id")
	WebElement TrackorderOrderNo;
	
	@FindBy(id="com.kfc.oman:id/btn_submit")
	WebElement TrackorderSubmit;
	
	@FindBy(id="com.kfc.oman:id/et_country_code")
	WebElement TrackorderCountrycode;
	
	 public HomeSidemenu()
		{
			PageFactory.initElements(driver, this);
		}


		public void TC23_UserProfile() throws InterruptedException {
			
			
			click(HomeBannerHamburgerMenu);
			click(profilesettings);
			click(EditProfile);
			click(profileusername);
			type(profileusername, "QA Auto");
			back();
			click(EditprofileSavebtn);
			back();
		}
		
		public void TC23_Trackorder(){
			click(HomeBannerHamburgerMenu);
			click(SidemenuTrackorder);
		//	gettext(TrackorderCountrycode);
			click(MobileNumber);
			type(MobileNumber, "510000017");
			click(TrackorderOrderNo);
			type(TrackorderOrderNo, "UAE-58735693");
			click(TrackorderSubmit);
			
		}
	
}
