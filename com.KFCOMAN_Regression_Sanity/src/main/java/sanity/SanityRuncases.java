 package sanity;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;


public class SanityRuncases extends Utility{

	
	@FindBy(id="com.kfc.oman:id/rb_english") 
	WebElement EnglishLanguage;
	
	@FindBy(id="com.kfc.oman:id/rb_arabic")
	WebElement ArabicLanguage;
	
	@FindBy(id="com.kfc.oman:id/tv_country_code")
	WebElement CountryName;
	
	@FindBy(id="com.kfc.oman:id/tv_change_country")
	WebElement Changecountry;
	
	@FindBy(id="com.kfc.oman:id/tv_login")
	WebElement Login;
	
	@FindBy(id="com.kfc.oman:id/tv_tandc")
	WebElement TermsandCondition;
	
	@FindBy(id="com.kfc.oman:id/tv_skip_login")
	WebElement SkipLogin;
	
	@FindBy(id="com.kfc.oman:id/tv_skip_continue")
	WebElement SkipLogin_continue;
	

	@FindBy(id="com.kfc.oman:id/design_bottom_sheet")
	WebElement ChangecountryBottomSheet;
	
	@FindBy(id="com.kfc.oman:id/tv_title")
	WebElement ChangecountryBottomSheetTitle;
	
	@FindBy(id="com.kfc.oman:id/tv_des")
	WebElement ChangecountryBottomSheetDescription;
	
	
	@FindBy(xpath="//android.view.ViewGroup[@resource-id='com.kfc.oman:id/rl_main'][1]")
	WebElement ChangecountryBottomCountryUAE;


	@FindBy(xpath="//android.view.ViewGroup[@resource-id='com.kfc.oman:id/rl_main'][2]")
	WebElement ChangecountryBottomCountryKSA;

	@FindBy(id="com.kfc.oman:id/tv_sub_msg")
	WebElement ChangecountryBottomCountry1Message;

	
	@FindBy(id="com.kfc.oman:id/rb_country")
	WebElement ChangecountryBottomCountry1Radiobutton;

	@FindBy(id="com.kfc.oman:id/btn_confirm")
	WebElement Changecountrydone;
	
	
	@FindBy(id="com.kfc.oman:id/iv_logo")
	WebElement SplashLogo;


	@FindBy(id="com.kfc.oman:id/tv_login_des_label")
	WebElement SplashLabelDescritpion;
	
	@FindBy(id="com.kfc.oman:id/tv_finger_label")
	WebElement SplashLabel1;

	@FindBy(id="com.kfc.oman:id/iv_drop_down")
	WebElement CountryDropdown;
	
	@FindBy(id="com.kfc.oman:id/tv_country_code")
	WebElement Countrycode;
	
	@FindBy(id="com.kfc.oman:id/et_mobile_number")
	WebElement MobileNumber;
	
	@FindBy(id="com.kfc.oman:id/textinput_helper_text")
	WebElement MobileNumberEgText;

	@FindBy(id="com.kfc.oman:id/bt_select")
	WebElement SubmitMobileNumber;

	@FindBy(id="com.kfc.oman:id/tv_facebook")
	WebElement FacebookLogin;

	@FindBy(id="com.kfc.oman:id/tv_google")
	WebElement GoogleLogin;

	@FindBy(id="com.kfc.oman:id/tv_login_title")
	WebElement SocialLoginTitle;
	
	@FindBy(id="com.kfc.oman:id/tv_detail")
	WebElement OTPMessage;
	
	@FindBy(id="com.kfc.oman:id/et1")
	WebElement OTPBox1;
	
	@FindBy(id="com.kfc.oman:id/et2")
	WebElement OTPBox2;
	
	@FindBy(id="com.kfc.oman:id/et3")
	WebElement OTPBox3;
	
	@FindBy(id="com.kfc.oman:id/et4")
	WebElement OTPBox4;
	
	@FindBy(id="com.kfc.oman:id/tv_timer")
	WebElement OTPtimer;
	
	@FindBy(id="com.kfc.oman:id/tv_resend")
	WebElement ResendOTP;
	
	@FindBy(id="com.kfc.oman:id/bt_verify")
	WebElement VerifyOTP;
	
	@FindBy(id="com.kfc.oman:id/et_name")
	WebElement Createprofilename;
	
	@FindBy(id="com.kfc.oman:id/iv_flag")
	WebElement createprofileflag;
	
	@FindBy(id="com.kfc.oman:id/iv_drop_down")
	WebElement createprofileflagdropdown;
	
	@FindBy(id="com.kfc.oman:id/tv_country_code")
	WebElement Createprofilecountrycode;
	
	@FindBy(id="com.kfc.oman:id/et_mobile_number")
	WebElement Createprofilemobilenumber;
	
	@FindBy(xpath="//android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText[@resource-id='com.kfc.oman:id/et_mobile_number']")
	WebElement SocialLoginAddprofilemobilenumber;
	

	@FindBy(id="com.kfc.oman:id/et_email")
	WebElement Createprofileemail;
	
	@FindBy(id="com.kfc.oman:id/bt_save")
	WebElement Createprofilesave;

	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
	WebElement Allowlocation;

	@FindBy(id="com.android.packageinstaller:id/permission_deny_button")
	WebElement Denylocation;

	@FindBy(id="com.kfc.oman:id/iv_menu")
	WebElement HomeBannerHamburgerMenu;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_side_menu_name'][4]")
	WebElement SidemenuExploremenu;
	
	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[@resource-id='com.kfc.oman:id/tv_add_to_cart']")
	WebElement MenuAddtocartP1;
	
	@FindBy(xpath="//android.view.ViewGroup[2]/android.view.ViewGroup[@resource-id='com.kfc.oman:id/tv_add_to_cart']")
	WebElement MenuAddtocartP2;
	
	@FindBy(xpath="//android.view.ViewGroup[3]/android.view.ViewGroup[@resource-id='com.kfc.oman:id/tv_add_to_cart']")
	WebElement MenuAddtocartP3;
	
	@FindBy(xpath="//android.view.ViewGroup[1]/android.widget.CheckBox[@resource-id='com.kfc.oman:id/iv_fav']")
	WebElement MenuP1Favourite;
	
	@FindBy(xpath="//android.view.ViewGroup[2]/android.widget.CheckBox[@resource-id='com.kfc.oman:id/iv_fav']")
	WebElement MenuP2Favourite;
	
	@FindBy(xpath="//android.view.ViewGroup[3]/android.widget.CheckBox[@resource-id='com.kfc.oman:id/iv_fav']")
	WebElement MenuP3Favourite;
	

	@FindBy(id="com.kfc.oman:id/cl_view_cart")
	WebElement MenuViewcart;
	
	@FindBy(id="com.kfc.oman:id/tv_apply")
	WebElement CartApplycoupon;
	
	
	@FindBy(id="com.kfc.oman:id/tv_coupon_code")
	WebElement CartCouponcode;
	
	@FindBy(id="com.kfc.oman:id/tv_offer_apply")
	WebElement CartCouponcodeApplyC1;
	
	@FindBy(id="com.kfc.oman:id/tv_des")
	WebElement CartCouponcodedescription;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_price']")
	WebElement Cartwidgetpricedisplayed;
	
	@FindBy(id="com.kfc.oman:id/et_search_address")
	WebElement Locationsearchbox;
	
	@FindBy(id="com.kfc.oman:id/tv_country")
	WebElement City1stsuggesstion;
	
//	@FindBy(id="com.kfc.oman:id/rb_pickup")
//	WebElement LocationScreenPickupoption;
//
//	@FindBy(id="com.kfc.oman:id/rb_pickup_pickup")
//	WebElement LocationScreenPickupStore;

	@FindBy(xpath="//android.view.ViewGroup[@resource-id='com.kfc.oman:id/et_city_auto']/android.view.ViewGroup/android.widget.EditText[@resource-id='com.kfc.oman:id/et_auto_complete']")
	WebElement LocationScreenPickupStoreCity;

//	@FindBy(id="com.kfc.oman:id/v_state_anchor")
//	WebElement LocationScreenPickupStoreCitySelect;
	
	@FindBy(xpath="//android.view.ViewGroup[@resource-id='com.kfc.oman:id/et_store_auto']/android.view.ViewGroup/android.widget.EditText[@resource-id='com.kfc.oman:id/et_auto_complete']")
	WebElement LocationScreenPickupStoreState;
	
//	@FindBy(id="com.kfc.oman:id/v_city_anchor")
//	WebElement LocationScreenPickupStoreStateselect;
	

	@FindBy(id="com.kfc.oman:id/btn_pickup_proceed")
	WebElement LocationScreenProceed;
	
	@FindBy(id="com.kfc.oman:id/btn_continue")
	WebElement DeliverylocationContinue;
	
	@FindBy(id="com.kfc.oman:id/btn_confirm_location")
	WebElement ConfirmlocationDelivery;
	
	
	@FindBy(id="com.kfc.oman:id/tv_store_title")
	WebElement LocationScreenPickupStoredetails;
	
	@FindBy(id="com.kfc.oman:id/tv_name")
	WebElement CheckoutUsername;

	@FindBy(id="com.kfc.oman:id/tv_number")
	WebElement CheckoutMobilenumber;
	

//	@FindBy(id="com.kfc.oman:id/tv_pick_address")
//	WebElement CheckoutAddresstype;
	
	@FindBy(id="com.kfc.oman:id/tv_address_tag")
	WebElement CheckoutAddresstag;
	
	@FindBy(id="com.kfc.oman:id/tv_address")
	WebElement CheckoutStorename;
	
	@FindBy(id="com.kfc.oman:id/tv_total_amount")
	WebElement CheckoutTotalAmount;

	@FindBy(id="com.kfc.oman:id/tv_make_payment")
	WebElement CheckoutPaymentwidget;
	
	@FindBy(xpath="//android.widget.LinearLayout[@class='android.widget.LinearLayout'][1]/android.widget.RadioButton")
	WebElement PaymentwidgetCard;
	
	@FindBy(xpath="//android.widget.LinearLayout[@class='android.widget.LinearLayout'][2]")
	WebElement PaymentwidgetClicktoPay;
	
	@FindBy(xpath="//android.widget.LinearLayout[@class='android.widget.LinearLayout'][3]")
	WebElement PaymentwidgetCOD;
	
	@FindBy(id="com.kfc.oman:id/btn_cancel")
	WebElement PaymentwidgetCancel;
	
	@FindBy(id="com.kfc.oman:id/btn_payment")
	WebElement PaymentMakepayment;
	
	@FindBy(id="com.kfc.oman:id/cb_save_payment")
	WebElement PaymentSaveCheck;
	
	@FindBy(id="com.kfc.oman:id/iv_home")
	WebElement ThanyouscreenHomeBtn;
	
	@FindBy(id="com.kfc.oman:id/tv_status")
	WebElement ThanyouscreenOrderstatus;
	
	
	@FindBy(id="com.kfc.oman:id/tv_grand_total_price")
	WebElement ThanyouscreenTotalPrice;
	
	@FindBy(id="com.kfc.oman:id/tv_store_name")
	WebElement ThanyouscreenStoreName;
	
	@FindBy(id="CardNumber")
	WebElement NooNpayCarNumber;
	
	@FindBy(id="ExpirationDate")
	WebElement Expirationdate;
	
	@FindBy(id="CvvNumber")
	WebElement NooNpayCvvNumber;
	
	@FindBy(id="btnInternalSubmit")
	WebElement NooNpayPaywithcard;
	
	
	@FindBy(id="com.kfc.oman:id/iv_back")
	WebElement NooNpayBackBtn;
	
	
	@FindBy(id="com.kfc.oman:id/tv_cl_selected_payment_option")
	WebElement CheckoutOtherPaymentOptions;
	
	@FindBy(id="com.kfc.oman:id/tv_logout")
	WebElement profileLogout;
	
	@FindBy(id="com.kfc.oman:id/iv_settings")
	WebElement profilesettings;

	@FindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For One\"]")
	WebElement MenuForOne;
	
	
	@FindBy(xpath="//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/container'][2]")
	WebElement GmailAccount2;
	
	@FindBy(xpath="//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/container'][1]")
	WebElement GmailAccount1;
	
	@FindBy(xpath="//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/container'][3]")
	WebElement GmailAccount3;
	
	
	@FindBy(id="com.kfc.oman:id/btn_proceed")
	WebElement Switchaccountproceed;
	
	@FindBy(id="com.kfc.oman:id/btn_change_location")
	WebElement Homelocationwidgetselect;

	@FindBy(id="com.kfc.oman:id/rb_delivery")
	WebElement LocationscreenDeleiverySelect;
	
	@FindBy(id="com.kfc.oman:id/et_building_name")
	WebElement LocationScreenBuildingname;
	
	@FindBy(id="com.kfc.oman:id/et_flat_no")
	WebElement LocationScreenFlatno;
	
	@FindBy(id="com.kfc.oman:id/rb_home")
	WebElement LocationScreentagsHome;
	
	@FindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For Sharing\"]")
	WebElement MenuForsharing;
	
	@FindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Sides & Desserts\"]")
	WebElement MenuSidesandDesserts;

	@FindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Beverages\"]")
	WebElement Menubeverages;

	@FindBy(id="com.kfc.oman:id/v_state_anchor")
	WebElement LocationScreenCityselect;

	@FindBy(id="com.kfc.oman:id/tv_delivery_instructions")
	WebElement LocationScreenCarhopDeliveryinstructions;
	
	@FindBy(id="com.kfc.oman:id/tv_delete_coupon")
	WebElement CartscreenDeletecoupon;
	
//	@FindBy(id="com.kfc.oman:id/tv_current_loc")
//	WebElement Locationscreensavedaddress;

	@FindBy(id="com.kfc.oman:id/btn_explore_menu")
	WebElement CancelTransactionCancel;
	
	@FindBy(id="com.kfc.oman:id/tv_dismiss")
	WebElement CanceltransactionOK;
	
	@FindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[1]/android.view.ViewGroup/android.widget.ImageView[@resource-id='com.kfc.oman:id/iv_tab_image']")
	WebElement HomescreenDelivery;
	
	@FindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[2]/android.view.ViewGroup/android.widget.ImageView[@resource-id='com.kfc.oman:id/iv_tab_image']")
	WebElement HomescreenCarhop;
	
	@FindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[3]/android.view.ViewGroup/android.widget.ImageView[@resource-id='com.kfc.oman:id/iv_tab_image']")
	WebElement HomescreenPickup;
	
	@FindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[4]/android.view.ViewGroup/android.widget.ImageView[@resource-id='com.kfc.oman:id/iv_tab_image']")
	WebElement HomescreenDinein;
	
	@FindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[5]/android.view.ViewGroup/android.widget.ImageView[@resource-id='com.kfc.oman:id/iv_tab_image']")
	WebElement HomescreenDrivethrough;


	@FindBy(id="com.kfc.oman:id/btn_positive")
	WebElement CartInvalidCouponcodeProceed;
	
	@FindBy(id="com.kfc.oman:id/btn_negative")
	WebElement CartInvalidCouponcodeReviewCart;
	
	@FindBy(id="com.kfc.oman:id/tv_dialog_header")
	WebElement CartInvalidCouponcodeHeading;

	@FindBy(id="com.kfc.oman:id/tv_dialog_msg")
	WebElement CartInvalidCouponcodeMessages;
	
	@FindBy(id="com.kfc.oman:id/v_state_anchor")
	WebElement LocationCitySelect;
	
	@FindBy(id="com.kfc.oman:id/v_city_anchor")
	WebElement Locationstoreselect;
	
	@FindBy(id="com.kfc.oman:id/tv_header")
	WebElement StoreofflineMsgHeadertext;
	
	@FindBy(id="com.kfc.oman:id/tv_msg")
	WebElement StoreofflineMsgtext;
	
	@FindBy(id="com.kfc.oman:id/tv_dismiss")
	WebElement StoreofflineDismiss;
	
	@FindBy(id="com.kfc.oman:id/btn_explore_menu")
	WebElement StoreofflineChange;
	
	@FindBy(id="com.kfc.oman:id/tv_retry")
	WebElement CheckoutErrorretry;
	
	@FindBy(id="com.kfc.oman:id/tv_snackbar_msg")
	WebElement CheckouterrorMessage;
	
	@FindBy(id="com.kfc.oman:id/tv_cancel")
	WebElement CheckoutErrorCancel;

	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_side_menu_name'][1]")
	WebElement SidemenuTrackorder;
	
	@FindBy(id="com.kfc.oman:id/tv_current_loc")
	WebElement SavedaddressCurrentlocation;
	
	@FindBy(id="com.kfc.oman:id/iv_add_quantity")
	WebElement CartAddQuantity;

	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_side_menu_name'][5]")
	WebElement SidemenuFeedback;
	
	@FindBy(id="com.kfc.oman:id/tv_toolbar_title")
	WebElement FeedbackScreenTitle;

	@FindBy(id="com.kfc.oman:id/tv_rating_msg")
	WebElement RatingTitle;

	
	@FindBy(id="com.kfc.oman:id/rating_bar")
	WebElement Ratingstar;

	
	@FindBy(id="com.kfc.oman:id/tv_reason_header")
	WebElement FeedbackreasonTitle;

	
	@FindBy(id="com.kfc.oman:id/tv_select_reason")
	WebElement Reasonplaceholder;

	@FindBy(id="com.kfc.oman:id/iv_drop_down_state")
	WebElement Reasondropdown;
	
	@FindBy(xpath="//android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView[@resource-id='com.kfc.oman:id/tv_reason']")
	WebElement Feedback_Reason_Payments;
	
	@FindBy(xpath="//android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.kfc.oman:id/tv_reason']")
	WebElement Feedback_Reason_Offers;
	
	@FindBy(xpath="//android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView[@resource-id='com.kfc.oman:id/tv_reason']")
	WebElement Feedback_Reason_Location;
	
	@FindBy(xpath="//android.widget.ListView/android.widget.LinearLayout[4]/android.widget.TextView[@resource-id='com.kfc.oman:id/tv_reason']")
	WebElement Feedback_Reason_Menu;
	
	@FindBy(xpath="//android.widget.ListView/android.widget.LinearLayout[5]/android.widget.TextView[@resource-id='com.kfc.oman:id/tv_reason']")
	WebElement Feedback_Reason_Other;
	
	@FindBy(id="com.kfc.oman:id/et_description")
	WebElement ReasonDescription;

	@FindBy(id="com.kfc.oman:id/btn_send")
	WebElement FeedbackSubmit;

	@FindBy(id="com.kfc.oman:id/tv_language")
	WebElement HomesideMenu_ArabicLanguage;

	@FindBy(id="com.kfc.oman:id/tv_country_name")
	WebElement HomesideMenu_Changecountry;
	

	@FindBy(id="com.kfc.oman:id/tv_title")
	WebElement ChangeCountryWidgetTitle;
	
	@FindBy(id="com.kfc.oman:id/tv_des")
	WebElement ChangeCountrywidget_Description;

	@FindBy(xpath="//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[@resource-id='com.kfc.oman:id/tv_title']")
	WebElement HomeScreen_ExploremenuText;
	
	@FindBy(xpath="//android.view.ViewGroup/android.view.View[@resource-id='com.kfc.oman:id/v']")
	WebElement HomeScreen_Tap;
	

	
	@FindBy(id="com.kfc.oman:id/design_bottom_sheet")
	WebElement ChangeCountryWidget;
	
	@FindBy(id="com.kfc.oman:id/btn_confirm")
	WebElement ChangeCountryWidgetSubmit;

	@FindBy(id="com.kfc.oman:id/iv_drop_down_state")
	WebElement FeedbackReasonDropdown;
	
	@FindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@resource-id='com.kfc.oman:id/tv_country']")
	WebElement ChangecountryWidget_UAE;
	
	@FindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@resource-id='com.kfc.oman:id/tv_country']")
	WebElement ChangecountryWidget_KSA;
	
	@FindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@resource-id='com.kfc.oman:id/tv_country']")
	WebElement ChangecountryWidget_KWT;
	
	@FindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@resource-id='com.kfc.oman:id/tv_country']")
	WebElement ChangecountryWidget_EGT;
	
	

	@FindBy(id="com.kfc.oman:id/bt_cancel")
	WebElement EditprofileCancelbtn;
	

	@FindBy(id="com.kfc.oman:id/bt_save")
	WebElement EditprofileSavebtn;
	
	@FindBy(id="com.kfc.oman:id/tv_edit_profile")
	WebElement EditProfile;

	@FindBy(id="com.kfc.oman:id/tv_add_new_number")
	WebElement profileAddnewnumber;
	
	@FindBy(id="com.kfc.oman:id/et_order_id")
	WebElement TrackorderOrderNo;
	
	@FindBy(id="com.kfc.oman:id/btn_submit")
	WebElement TrackorderSubmit;
	
	@FindBy(id="com.kfc.oman:id/et_country_code")
	WebElement TrackorderCountrycode;
	

	
	@FindBy(id="com.kfc.oman:id/tv_phone")
	WebElement profilephonenumber;
	

	@FindBy(id="com.kfc.oman:id/et_name")
	WebElement profileusername;



	
    public SanityRuncases()
	{
		PageFactory.initElements(driver, this);
	}

    
    public void GuestUser_Createcart() throws InterruptedException, IOException {
		
//		click(Changecountry);
//		click(ChangecountryBottomCountryKSA);
//		click(Changecountrydone);
		
		click(SkipLogin);
		click(Allowlocation);
		swipeToBottom();
		click(HomeBannerHamburgerMenu);
		click(SidemenuExploremenu);
	//	click(MenuAddtocartP1);
		click(MenuAddtocartP2);
		click(MenuP1Favourite);
		click(MenuP2Favourite);
	}
	public void Guest_ViewCart_Couponapplied() throws InterruptedException {
		click(MenuViewcart);
		gettext(Cartwidgetpricedisplayed);
		swipeToBottom();
		click(CartApplycoupon);
		try {
		gettext(CartCouponcode);
		click(CartCouponcodeApplyC1);
		Thread.sleep(3000);
		gettext(CartCouponcodedescription);
		}catch (Exception e) {
			System.out.println("No Promotion/Coupon Code Present");
			// TODO: handle exception
			back();
		}
		gettext(Cartwidgetpricedisplayed);
		swipeToBottom();

		click(MenuViewcart);
	try {
			gettext(CartInvalidCouponcodeHeading);
			gettext(CartInvalidCouponcodeMessages);
			click(CartInvalidCouponcodeProceed);
		//	click(MenuViewcart);

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Valid Coupon code");
			
		}
 		Thread.sleep(2000);
	}
	
	public void GuestUser_Pickuplocation_profile() throws InterruptedException
	{
		
		click(HomescreenPickup);
		click(LocationScreenPickupStoreCity);
		type(LocationScreenPickupStoreCity, "Sharj");
		click(LocationCitySelect);
		
	//	click(LocationScreenPickupStoreCity);
		click(LocationScreenPickupStoreState);
		type(LocationScreenPickupStoreState, "KFC-Test");
		click(Locationstoreselect);
		gettext(LocationScreenPickupStoredetails);
		click(LocationScreenProceed);
		
		type(Createprofilename, "Testing Auto");
		type(Createprofilemobilenumber, "510000017");
		type(Createprofileemail, "testAuto@yopmail.com");
		back();
		click(Createprofilesave);
		click(OTPBox1);
		type(OTPBox1, "1");
		click(OTPBox2);
		type(OTPBox2, "2");
		click(OTPBox3);
		type(OTPBox3, "1");
		click(OTPBox4);
		type(OTPBox4, "2");
		click(VerifyOTP);
	}
	
	public void GuestUser_Order() throws InterruptedException {
		
		try {
			
			gettext(CheckouterrorMessage);
			click(CheckoutErrorretry);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		gettext(CheckoutUsername);
		gettext(CheckoutMobilenumber);
		gettext(CheckoutAddresstag);
	//	gettext(CheckoutAddresstype);
		gettext(CheckoutTotalAmount);
		Thread.sleep(3000);
		click(CheckoutPaymentwidget);
		click(PaymentwidgetCard);
		click(PaymentMakepayment);
		try {
		gettext(StoreofflineMsgHeadertext);
		gettext(StoreofflineMsgtext);
		click(StoreofflineDismiss);
//		click(StoreofflineChange);	
//		click(LocationScreenPickupStoreCity);
//		type(LocationScreenPickupStoreCity, "Sharj");
//		click(LocationCitySelect);
//		
//	//	click(LocationScreenPickupStoreCity);
//		click(LocationScreenPickupStoreState);
//		type(LocationScreenPickupStoreState, "KFC-Test");
//		click(Locationstoreselect);
//		gettext(LocationScreenPickupStoredetails);
//		click(LocationScreenProceed);
//		click(PaymentMakepayment);	
//		click(NooNpayBackBtn);
//		click(CanceltransactionOK);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Store is Happy to serve you");
			Thread.sleep(3000);
			click(NooNpayBackBtn);
			click(CanceltransactionOK);
			click(CheckoutOtherPaymentOptions);
			click(PaymentwidgetCOD);
			click(PaymentMakepayment);

		}
		Thread.sleep(5000);
	
		gettext(ThanyouscreenOrderstatus);
	//	gettext(ThanyouscreenStoreName);
	//	gettext(ThanyouscreenTotalPrice);
		click(ThanyouscreenHomeBtn);
			
//				    back();
//					back();					
//					back();
//					back();
			Thread.sleep(2000);
			
	}

	public void Registereduser_createcart() throws InterruptedException {
		
		click(HomeBannerHamburgerMenu);
		click(SidemenuExploremenu);
	//	click(MenuAddtocartP1);
		click(MenuAddtocartP2);
		click(MenuP1Favourite);
		click(MenuP2Favourite);
		click(MenuViewcart);
	//	gettext(Cartwidgetpricedisplayed);
		click(CartApplycoupon);
		try {
		gettext(CartCouponcode);
		try {
		click(CartCouponcodeApplyC1);
		Thread.sleep(3000);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("MOV for Promotion not fulfilled");
		}
		gettext(CartCouponcodedescription);
		}catch (Exception e) {
			System.out.println("No Promotion/Coupon Code Present");
			// TODO: handle exception
			back();
		}
		gettext(Cartwidgetpricedisplayed);

		click(MenuViewcart);


		try {
			gettext(CartInvalidCouponcodeHeading);
			gettext(CartInvalidCouponcodeMessages);
			click(CartInvalidCouponcodeProceed);
		//	click(MenuViewcart);

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Valid Coupon code");
			
		}
 		Thread.sleep(2000);

	}
	public void Registereduser_Order() throws InterruptedException {
	try {
			
			gettext(CheckouterrorMessage);
			click(CheckoutErrorretry);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		gettext(CheckoutUsername);
		gettext(CheckoutMobilenumber);
		gettext(CheckoutAddresstag);
	//	gettext(CheckoutAddresstype);
		gettext(CheckoutTotalAmount);
		Thread.sleep(2000);
		click(CheckoutOtherPaymentOptions);
		click(PaymentwidgetCard);
		click(PaymentMakepayment);
		Thread.sleep(5000);
		click(NooNpayBackBtn);
		click(CanceltransactionOK);
		Thread.sleep(3000);
		click(CheckoutOtherPaymentOptions);
		click(PaymentwidgetCOD);
		click(PaymentMakepayment);
		
			gettext(ThanyouscreenOrderstatus);
//			gettext(ThanyouscreenStoreName);
//			gettext(ThanyouscreenTotalPrice);
			click(ThanyouscreenHomeBtn);
			
			
//				    back();
//				    back();					
//					back();
//					back();
			
			
	}


		public void FBuser_createcart() throws InterruptedException {
			
			click(HomeBannerHamburgerMenu);
			click(profilesettings);
			click(profileLogout);
			click(FacebookLogin);
			try {
			type(SocialLoginAddprofilemobilenumber, "510000017");
			click(Createprofilesave);
			try {
				click(Switchaccountproceed);
				}catch(Exception e) {
					
					System.out.println("No switch account Pop up present");
				}
			click(OTPBox1);
			type(OTPBox1, "1");
			click(OTPBox2);
			type(OTPBox2, "2");
			click(OTPBox3);
			type(OTPBox3, "1");
			click(OTPBox4);
			type(OTPBox4, "2");
			click(VerifyOTP); 
			}catch(Exception e) {
				
				System.out.println("Profile already created");
			}
			
			click(HomeBannerHamburgerMenu);
			click(SidemenuExploremenu);
	//		click(MenuAddtocartP1);
			click(MenuAddtocartP2);
			click(MenuP1Favourite);
			click(MenuP2Favourite);
		}
		public void Viewcart_Applycoupon() throws InterruptedException {
			click(MenuViewcart);

			Thread.sleep(2000);
		//	gettext(Cartwidgetpricedisplayed);
			click(CartApplycoupon);
			try {
			gettext(CartCouponcode);
			click(CartCouponcodeApplyC1);
			Thread.sleep(3000);
			gettext(CartCouponcodedescription);
			}catch (Exception e) {
				System.out.println("No Promotion/Coupon Code Present");
				// TODO: handle exception
				back();
			}
			gettext(Cartwidgetpricedisplayed);

			click(MenuViewcart);
			try {
				gettext(CartInvalidCouponcodeHeading);
				gettext(CartInvalidCouponcodeMessages);
				click(CartInvalidCouponcodeProceed);
			//	click(MenuViewcart);

			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Valid Coupon code");
				
			}
	 		Thread.sleep(2000);

		}
		public void Addlocation() throws InterruptedException {
			Thread.sleep(2000);
			try {
				click(SavedaddressCurrentlocation);
			}catch (Exception e) {
				System.out.println("No saved Addresses present");
				// TODO: handle exception
			}
			click(HomescreenPickup);
			click(LocationScreenPickupStoreCity);
			type(LocationScreenPickupStoreCity, "Sharj");
			click(LocationCitySelect);
			click(LocationScreenPickupStoreState);
			type(LocationScreenPickupStoreState, "KFC-Test");
			click(Locationstoreselect);
			gettext(LocationScreenPickupStoredetails);
			click(LocationScreenProceed);
		}
		public void FBUser_order() throws InterruptedException {
			try {
				
				gettext(CheckouterrorMessage);
				click(CheckoutErrorretry);
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			gettext(CheckoutUsername);
			gettext(CheckoutMobilenumber);
			gettext(CheckoutAddresstag);
		//	gettext(CheckoutAddresstype);
			gettext(CheckoutTotalAmount);
			click(CheckoutOtherPaymentOptions);
			click(PaymentwidgetCard);
			click(PaymentMakepayment);
			Thread.sleep(5000);
			click(NooNpayBackBtn);
			click(CanceltransactionOK);
			Thread.sleep(3000);
			click(CheckoutOtherPaymentOptions);
			click(PaymentwidgetCOD);
			click(PaymentMakepayment);
			
			gettext(ThanyouscreenOrderstatus);
	//		gettext(ThanyouscreenStoreName);
	//		gettext(ThanyouscreenTotalPrice);
			click(ThanyouscreenHomeBtn);
			
			
//				    back();
//					back();					
//					back();
//					back();
				
			
		}

		
		public void GoogleUser_createcart() throws InterruptedException {
			
			click(HomeBannerHamburgerMenu);
			click(profilesettings);
			click(profileLogout);
			click(GoogleLogin);
			try {
				
				click(GmailAccount2);
			}catch(Exception e) {
				click(GmailAccount1);
				
			}
			type(SocialLoginAddprofilemobilenumber, "510000017");
			click(Createprofilesave);
			try {
			click(Switchaccountproceed);
			}catch(Exception e) {
				
				System.out.println("No switch account Pop up present");
			}
			
			
			click(OTPBox1);
			type(OTPBox1, "1");
			click(OTPBox2);
			type(OTPBox2, "2");
			click(OTPBox3);
			type(OTPBox3, "1");
			click(OTPBox4);
			type(OTPBox4, "2");
			click(VerifyOTP);
			click(HomeBannerHamburgerMenu);
			click(SidemenuExploremenu);
			click(MenuAddtocartP2);
			click(MenuP1Favourite);
			click(MenuP2Favourite);
		}
		public void Viewcart_couponapplied() throws InterruptedException {
			click(MenuViewcart);
		//	gettext(Cartwidgetpricedisplayed);
			click(CartApplycoupon);
			try {
			gettext(CartCouponcode);
			click(CartCouponcodeApplyC1);
			Thread.sleep(3000);
			gettext(CartCouponcodedescription);
			}catch (Exception e) {
				System.out.println("No Promotion/Coupon Code Present");
				// TODO: handle exception
				back();
			}
			gettext(Cartwidgetpricedisplayed);

			click(MenuViewcart);


			try {
				gettext(CartInvalidCouponcodeHeading);
				gettext(CartInvalidCouponcodeMessages);
				click(CartInvalidCouponcodeProceed);
			//	click(MenuViewcart);

			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Valid Coupon code");
				
			}
	 		Thread.sleep(2000);

}
		public void GoogleUser_Addlocation() {
//			try {
//				click(Locationscreensavedaddress);
//			}catch(Exception e) {
//				System.out.println("No saved Address present");
//		}
			click(HomescreenPickup);
			click(LocationScreenPickupStoreCity);
			type(LocationScreenPickupStoreCity, "Sharj");
			click(LocationCitySelect);
			click(LocationScreenPickupStoreState);
			type(LocationScreenPickupStoreState, "KFC-Test ");
			click(Locationstoreselect);
			gettext(LocationScreenPickupStoredetails);
			click(LocationScreenProceed);
		}
		public void GoogleUser_Order() throws InterruptedException {
			
			try {
				
				gettext(CheckouterrorMessage);
				click(CheckoutErrorretry);
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			gettext(CheckoutUsername);
			gettext(CheckoutMobilenumber);
			gettext(CheckoutAddresstag);
	//		gettext(CheckoutAddresstype);
			gettext(CheckoutTotalAmount);
			click(CheckoutOtherPaymentOptions);
			click(PaymentwidgetCard);
			click(PaymentMakepayment);
			Thread.sleep(5000);
			click(NooNpayBackBtn);
			click(CanceltransactionOK);
			Thread.sleep(3000);
			click(CheckoutOtherPaymentOptions);
			click(PaymentwidgetCOD);
			click(PaymentMakepayment);
			gettext(ThanyouscreenOrderstatus);
	//		gettext(ThanyouscreenStoreName);
	//		gettext(ThanyouscreenTotalPrice);
			click(ThanyouscreenHomeBtn);
		
//				    back();
//					back();					
//					back();
//					back();
			
		}

		public void Feedback() {
			click(HomeBannerHamburgerMenu);
			click(SidemenuFeedback);
			gettext(FeedbackScreenTitle);
			gettext(FeedbackreasonTitle);
			click(Ratingstar);
			gettext(RatingTitle);
			click(FeedbackReasonDropdown);
			
			
		}
	
public void UserProfile() throws InterruptedException {
			
			
			click(HomeBannerHamburgerMenu);
			click(profilesettings);
			click(EditProfile);
			click(profileusername);
			type(profileusername, "QA Auto");
			back();
			click(EditprofileSavebtn);
			back();
		}
		
		public void Trackorder() throws InterruptedException, IOException{
			click(HomeBannerHamburgerMenu);
			click(SidemenuTrackorder);
		//	gettext(TrackorderCountrycode);
			click(MobileNumber);
			type(MobileNumber, "510000017");
			click(TrackorderOrderNo);
			type(TrackorderOrderNo, "UAE-58735693");
			click(TrackorderSubmit);
			captureScreenShots();
			back();
			back();
			
		}


		public void Language() throws IOException {
			
			
			click(HomeBannerHamburgerMenu);
			click(SidemenuTrackorder);
			click(ArabicLanguage);
			captureScreenShots();
			click(HomeBannerHamburgerMenu);
			click(EnglishLanguage);
			
		}

		public void Changecountry() {
			
			click(HomeBannerHamburgerMenu);
			click(CountryDropdown);
			click(ChangecountryWidget_KSA);
			click(ChangeCountryWidgetSubmit);
		}


}
