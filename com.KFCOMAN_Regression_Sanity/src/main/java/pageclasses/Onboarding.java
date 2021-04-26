 package pageclasses;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;


public class Onboarding extends Utility{

	
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
	
	
	@FindBy(id="com.kfc.oman:id/tv_skip_login")
	WebElement SkipLoginBHR;
	
	@FindBy(id="com.kfc.oman:id/iv_menu")
	WebElement HomesidemenuBHR;
	

	
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
	
	@FindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[2]/android.view.ViewGroup/android.widget.ImageView[@resource-id='com.kfc.oman:id/iv_tab_image']")
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
	
	@FindBy(id="com.kfc.oman:id/tv_dialog_header")
	WebElement MakeMealHeading;
	
	@FindBy(id="com.kfc.oman:id/tv_dialog_sub_header")
	WebElement MakeMealSubHeading;
	
	@FindBy(id="com.kfc.oman:id/tv_dialog_header")
	WebElement MakeMealHeader;
	
	
	@FindBy(id="com.kfc.oman:id/cb_do_not_ask")
	WebElement MakeMealDontaskagain;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[@resource-id='com.kfc.oman:id/stepper_view'][1]")
	WebElement MakeAMealAdd;
	
	


	
    public Onboarding()
	{
		PageFactory.initElements(driver, this);
	}

	public void TC01_GuestUser_createcart() throws InterruptedException, IOException {
		
//		click(Changecountry);
//		click(ChangecountryBottomCountryKSA);
//		click(Changecountrydone);
		
		click(SkipLoginBHR);
		click(Allowlocation);
		click(HomesidemenuBHR);
		click(HomeBannerHamburgerMenu);
		click(SidemenuExploremenu);
	//	click(MenuAddtocartP1);
		click(MenuAddtocartP2);	
		try {
			gettext(MakeMealHeader);
			click(MakeAMealAdd);
			click(Switchaccountproceed);
		}catch (Exception e) {
	System.out.println("Addons Not Present");
		}
		
		click(MenuP1Favourite);
		click(MenuP2Favourite);
	}
	public void TC01_ViewCart_Couponapplied() throws InterruptedException {
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
	
	public void TC01_Pickuplocation_profile() throws InterruptedException
	{
		
		click(HomescreenPickup);
		click(LocationScreenPickupStoreCity);
		type(LocationScreenPickupStoreCity, "Bahr");
		click(LocationCitySelect);
		
	//	click(LocationScreenPickupStoreCity);
		click(LocationScreenPickupStoreState);
		type(LocationScreenPickupStoreState, "KFC-Test");
		click(Locationstoreselect);
		gettext(LocationScreenPickupStoredetails);
		click(LocationScreenProceed);
		
		type(Createprofilename, "Testing Auto");
		type(Createprofilemobilenumber, "33669900");
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
	
	public void TC01_Order() throws InterruptedException {
		
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
//		type(LocationScreenPickupStoreCity, "Bahr");
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

	public void TC02_Loggedinuser_createcart() throws InterruptedException {
		
		click(HomeBannerHamburgerMenu);
		click(SidemenuExploremenu);
	//	click(MenuAddtocartP1);
		click(MenuAddtocartP2);
		try {
			gettext(MakeMealHeader);
			click(MakeAMealAdd);
			click(Switchaccountproceed);
			}catch (Exception e) {
	System.out.println("Addons Not Present");
		}
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
	public void TC02_Order() throws InterruptedException {
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


		public void TC03_FBuser_createcart() throws InterruptedException {
			
			click(HomeBannerHamburgerMenu);
			click(profilesettings);
			click(profileLogout);
			click(FacebookLogin);
			try {
			type(SocialLoginAddprofilemobilenumber, "33669900");
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
			try {
				gettext(MakeMealHeader);
				click(MakeAMealAdd);
				click(Switchaccountproceed);
			}catch (Exception e) {
		System.out.println("Addons Not Present");
			}
			click(MenuP1Favourite);
			click(MenuP2Favourite);
		}
		public void TC03_Viewcart_Applycoupon() throws InterruptedException {
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
		public void TC03_Addlocation() throws InterruptedException {
			Thread.sleep(2000);
			try {
				click(SavedaddressCurrentlocation);
			}catch (Exception e) {
				System.out.println("No saved Addresses present");
				// TODO: handle exception
			}
			click(HomescreenPickup);
			click(LocationScreenPickupStoreCity);
			type(LocationScreenPickupStoreCity, "Bahr");
			click(LocationCitySelect);
			click(LocationScreenPickupStoreState);
			type(LocationScreenPickupStoreState, "KFC-Test");
			click(Locationstoreselect);
			gettext(LocationScreenPickupStoredetails);
			click(LocationScreenProceed);
		}
		public void TC03_order() throws InterruptedException {
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

		
		public void TC04_GoogleUser_createcart() throws InterruptedException {
			
			click(HomeBannerHamburgerMenu);
			click(profilesettings);
			click(profileLogout);
			click(GoogleLogin);
			try {
				
				click(GmailAccount2);
			}catch(Exception e) {
				click(GmailAccount1);
				
			}
			type(SocialLoginAddprofilemobilenumber, "33669900");
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
			try {
				gettext(MakeMealHeader);
				click(MakeAMealAdd);
				click(Switchaccountproceed);
			}catch (Exception e) {
		System.out.println("Addons Not Present");
			}
			click(MenuP1Favourite);
			click(MenuP2Favourite);
		}
		public void TC04_Viewcart_couponapplied() throws InterruptedException {
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
		public void TC04_Addlocation() {
			try {
				click(SavedaddressCurrentlocation);
			}catch (Exception e) {
				System.out.println("No saved Addresses present");
				// TODO: handle exception
			}
			click(HomescreenPickup);
			click(LocationScreenPickupStoreCity);
			type(LocationScreenPickupStoreCity, "Bahr");
			click(LocationCitySelect);
			click(LocationScreenPickupStoreState);
			type(LocationScreenPickupStoreState, "KFC-Test ");
			click(Locationstoreselect);
			gettext(LocationScreenPickupStoredetails);
			click(LocationScreenProceed);
		}
		public void TC04_Order() throws InterruptedException {
			
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


		public void TC05_Guestuser_createcart() throws InterruptedException {
			
			click(HomeBannerHamburgerMenu);
			click(profilesettings);
			click(profileLogout);
			click(SkipLogin_continue);
			click(HomeBannerHamburgerMenu);
			click(SidemenuExploremenu);
			click(MenuForOne);
			click(MenuAddtocartP2);	
			try {
				gettext(MakeMealHeader);
				click(MakeAMealAdd);
				click(Switchaccountproceed);
			}catch (Exception e) {
		System.out.println("Addons Not Present");
			}
		}
		public void TC05_viewcart_couponapplied() throws InterruptedException {
			click(MenuViewcart);
			click(CartAddQuantity);
			swipeToBottom();
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
			swipeToBottom();
			swipeToBottom();
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
		public void TC05_Addlocation() throws InterruptedException {
			
			click(HomescreenPickup);
			click(LocationScreenPickupStoreCity);
			type(LocationScreenPickupStoreCity, "Bahr");
			click(LocationCitySelect);
			click(LocationScreenPickupStoreState);
			type(LocationScreenPickupStoreState, "KFC-Test ");
			click(Locationstoreselect);
			gettext(LocationScreenPickupStoredetails);
			click(LocationScreenProceed);
			
			type(Createprofilename, "Testing Auto");
			type(Createprofilemobilenumber, "33669900");
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
		public void TC05_order() throws InterruptedException {
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
		public void TC05_createcart() {
			click(HomeBannerHamburgerMenu);
			click(SidemenuExploremenu);
			click(MenuForOne);
			click(MenuAddtocartP3);
			try {
				gettext(MakeMealHeader);
				click(MakeAMealAdd);
				click(Switchaccountproceed);
			}catch (Exception e) {
		System.out.println("Addons Not Present");
			}
			click(MenuViewcart);
			click(CartAddQuantity);
			swipeToBottom();
			swipeToBottom();
		}
		public void TC05_viewcart() throws InterruptedException {
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
		public void TC05_order2() throws InterruptedException {
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
		
		public void TC06_FBuser_createcart() throws InterruptedException {
		
			click(HomeBannerHamburgerMenu);
			click(profilesettings);
			click(profileLogout);
			click(FacebookLogin);
			try {
				type(SocialLoginAddprofilemobilenumber, "33669900");
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
			click(MenuForOne);
			click(MenuAddtocartP1);
			try {
				gettext(MakeMealHeader);
				click(MakeAMealAdd);
				click(Switchaccountproceed);
			}catch (Exception e) {
		System.out.println("Addons Not Present");
			}
			click(MenuViewcart);
			
		}
		public void TC06_viewcart() throws InterruptedException {
			click(CartAddQuantity);
			swipeToBottom();
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
			swipeToBottom();
			swipeToBottom();
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
		public void TC06_Addlocation_adduser() throws InterruptedException {
			click(HomescreenPickup);
			click(LocationScreenPickupStoreCity);
			type(LocationScreenPickupStoreCity, "Bahr");
			click(LocationCitySelect);
			click(LocationScreenPickupStoreState);
			type(LocationScreenPickupStoreState, "KFC-Test ");
			click(Locationstoreselect);
			gettext(LocationScreenPickupStoredetails);
			click(LocationScreenProceed);
			
//			type(Createprofilename, "Testing Auto");
//			type(Createprofilemobilenumber, "33669900");
//			type(Createprofileemail, "testAuto@yopmail.com");
//			back();
//			click(Createprofilesave);
//			click(OTPBox1);
//			type(OTPBox1, "1");
//			click(OTPBox2);
//			type(OTPBox2, "2");
//			click(OTPBox3);
//			type(OTPBox3, "1");
//			click(OTPBox4);
//			type(OTPBox4, "2");
//			click(VerifyOTP);
		}
		public void TC06_Order() throws InterruptedException {
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
			
//			back();
//			back();
//			back();
//			back();
		
		}
		public void TC06_createcart2() {
			
			click(HomeBannerHamburgerMenu);
			click(SidemenuExploremenu);
			click(MenuForOne);
		//	click(MenuAddtocartP1);
			click(MenuAddtocartP2);
			try {
				gettext(MakeMealHeader);
				click(MakeAMealAdd);
				click(Switchaccountproceed);
			}catch (Exception e) {
		System.out.println("Addons Not Present");
			}
		//	click(MenuAddtocartP3);
			click(MenuP1Favourite);
			click(MenuViewcart);
		}
		public void TC06_viewcart2() throws InterruptedException {
			click(CartApplycoupon);
			try {
			gettext(CartCouponcode);
			click(CartCouponcodeApplyC1);
			Thread.sleep(3000);
			gettext(CartCouponcodedescription);
			}catch (Exception e) {
				System.out.println("No Promotion/Coupon Code Present");
				back();
				// TODO: handle exception
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
		public void TC06_order2() throws InterruptedException {
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

			//      back();
//					back();					
//					back();
//					back();
	}

		public void TC07_GoogleUser_Createcart() throws InterruptedException {
			
			click(HomeBannerHamburgerMenu);
			click(profilesettings);
			click(profileLogout);
			click(GoogleLogin);
			try {
				
				click(GmailAccount2);
			}catch(Exception e) {
				click(GmailAccount1);
				
			}
			type(SocialLoginAddprofilemobilenumber, "33669900");
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
			click(MenuForOne);
			click(MenuAddtocartP1);
			try {
				gettext(MakeMealHeader);
				click(MakeAMealAdd);
				click(Switchaccountproceed);
			}catch (Exception e) {
		System.out.println("Addons Not Present");
			}
		//	click(MenuAddtocartP2);
		//	click(MenuAddtocartP3);
			click(MenuP1Favourite);
			click(MenuViewcart);
		}
		public void TC07_viewcart_couponapplied() throws InterruptedException {
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
		public void TC07_Addlocation_Adduser() throws InterruptedException {
			click(HomescreenPickup);
			click(LocationScreenPickupStoreCity);
			type(LocationScreenPickupStoreCity, "Bahr");
			click(LocationCitySelect);
			click(LocationScreenPickupStoreState);
			type(LocationScreenPickupStoreState, "KFC-Test ");
			click(Locationstoreselect);
			gettext(LocationScreenPickupStoredetails);
			click(LocationScreenProceed);
			
//			type(Createprofilename, "Testing Auto");
//			type(Createprofilemobilenumber, "33669900");
//			type(Createprofileemail, "testAuto@yopmail.com");
//			back();
//			click(Createprofilesave);
//			click(OTPBox1);
//			type(OTPBox1, "1");
//			click(OTPBox2);
//			type(OTPBox2, "2");
//			click(OTPBox3);
//			type(OTPBox3, "1");
//			click(OTPBox4);
//			type(OTPBox4, "2");
//			click(VerifyOTP);
		}
		public void TC07_order() throws InterruptedException {
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
					Thread.sleep(2000);
		}
		public void TC07_createcart2_viewcart() throws InterruptedException {
			click(HomeBannerHamburgerMenu);
			click(SidemenuExploremenu);
			click(MenuForOne);
			click(MenuAddtocartP3);
			try {
				gettext(MakeMealHeader);
				click(MakeAMealAdd);
				click(Switchaccountproceed);
			}catch (Exception e) {
		System.out.println("Addons Not Present");
			}
			click(MenuP1Favourite);
			click(MenuViewcart);
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
		public void TC07_order2() throws InterruptedException {
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
			
//			back();
//     		back();					
//     		back();
//     		back();
  			
	}

		public void TC08_guestuser_createcart() throws InterruptedException {
			
			click(HomeBannerHamburgerMenu);
			click(profilesettings);
			click(profileLogout);
			click(SkipLogin_continue);
			click(HomescreenDelivery);
			try {
				click(SavedaddressCurrentlocation);
			}catch (Exception e) {
				System.out.println("No saved Addresses present");
				// TODO: handle exception
			}
		//	click(LocationscreenDeleiverySelect);
			type(Locationsearchbox, "Bahr");
			Thread.sleep(2000);
			click(SidemenuTrackorder);
			Thread.sleep(2000);
			click(ConfirmlocationDelivery);
			type(LocationScreenBuildingname, "B12");
			type(LocationScreenFlatno, "B12");
			back();
			click(DeliverylocationContinue);
			click(HomeBannerHamburgerMenu);
			click(SidemenuExploremenu);
			click(MenuForsharing);
			click(MenuAddtocartP1);
			try {
				gettext(MakeMealHeader);
				click(MakeAMealAdd);
				click(Switchaccountproceed);
			}catch (Exception e) {
		System.out.println("Addons Not Present");
			}
			click(MenuViewcart);
			click(CartAddQuantity);
		}
		public void TC08_viewcart_couponapplied() throws InterruptedException {
			swipeToBottom();
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
		public void TC08_Adduser() throws InterruptedException {
			type(Createprofilename, "Testing Auto");
			type(Createprofilemobilenumber, "33669900");
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
		public void TC08_order() throws InterruptedException {
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
//			click(CheckoutOtherPaymentOptions);
//			click(PaymentwidgetCard);
//			click(PaymentMakepayment);
//			Thread.sleep(5000);
//			click(NooNpayBackBtn);
//			click(CanceltransactionOK);
//			Thread.sleep(3000);
//			click(CheckoutOtherPaymentOptions);
//			click(PaymentwidgetCOD);
//				click(PaymentMakepayment);
//			gettext(ThanyouscreenOrderstatus);
////			gettext(ThanyouscreenStoreName);
////			gettext(ThanyouscreenTotalPrice);
//			click(ThanyouscreenHomeBtn);
			
			back();
     		back();					
     		back();
     		back();
     }
		
		public void TC09_loggedinuser_createcart() throws InterruptedException {
			
			click(HomeBannerHamburgerMenu);
			click(SidemenuExploremenu);
			click(MenuForsharing);
			click(MenuSidesandDesserts);
			click(MenuAddtocartP1);
			try {
				gettext(MakeMealHeader);
				click(MakeAMealAdd);
				click(Switchaccountproceed);
			}catch (Exception e) {
		System.out.println("Addons Not Present");
			}
			click(MenuViewcart);
			click(CartAddQuantity);
		}
		public void TC09_cart_couponapplied() throws InterruptedException {
			swipeToBottom();
			swipeToBottom();
			click(CartApplycoupon);
			swipeToBottom();
			try {
			gettext(CartCouponcode);
			click(CartCouponcodeApplyC1);
			Thread.sleep(3000);
			gettext(CartCouponcodedescription);
			}catch (Exception e) {
				System.out.println("No Promotion/Coupon Code Present");
				// TODO: handle exception
			}
			swipeToBottom();
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
		public void TC09_order() throws InterruptedException {
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
//			click(CheckoutOtherPaymentOptions);
//			click(PaymentwidgetCard);
//			click(PaymentMakepayment);
//			Thread.sleep(5000);
//			click(NooNpayBackBtn);
//			click(CanceltransactionOK);
//			Thread.sleep(3000);
//			click(CheckoutOtherPaymentOptions);
//			click(PaymentwidgetCOD);
//				click(PaymentMakepayment);
//			gettext(ThanyouscreenOrderstatus);
//			gettext(ThanyouscreenStoreName);
//		gettext(ThanyouscreenTotalPrice);
		//	click(ThanyouscreenHomeBtn);
			
			back();
     		back();					
     		back();
     		back();
			
		}


			public void TC10_FBuser() throws InterruptedException {
				
				click(HomeBannerHamburgerMenu);
				click(profilesettings);
				click(profileLogout);
				click(FacebookLogin);
				try {
					type(SocialLoginAddprofilemobilenumber, "33669900");
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
					
			}
				public void TC10_Addlocationdelivery() throws InterruptedException {
					
				click(HomescreenDelivery);
				try {
					click(SavedaddressCurrentlocation);
				}catch (Exception e) {
					System.out.println("No saved Addresses present");
					// TODO: handle exception
				}
				type(Locationsearchbox, "Bahr");
				Thread.sleep(2000);
				click(SidemenuTrackorder);
				Thread.sleep(2000);
				click(ConfirmlocationDelivery);
				type(LocationScreenBuildingname, "B12");
				type(LocationScreenFlatno, "B12");
				back();
				click(DeliverylocationContinue);
				
				}
				public void TC10_createcart() {
				click(HomeBannerHamburgerMenu);
				click(SidemenuExploremenu);
				click(MenuAddtocartP1);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(MenuP1Favourite);
				click(MenuP2Favourite);
				click(MenuForOne);
				click(MenuAddtocartP1);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(MenuForsharing);
				click(MenuAddtocartP1);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(MenuSidesandDesserts);
				click(MenuAddtocartP1);
				click(MenuViewcart);
				}
				public void TC10_cart() throws InterruptedException {
			//	gettext(Cartwidgetpricedisplayed);
//				click(CartApplycoupon);
//				try {
//				gettext(CartCouponcode);
//				click(CartCouponcodeApplyC1);
//				Thread.sleep(3000);
//				gettext(CartCouponcodedescription);
//				}catch (Exception e) {
//					System.out.println("No Promotion/Coupon Code Present");
//					// TODO: handle exception
//					back();
//				}
				gettext(Cartwidgetpricedisplayed);
				click(MenuViewcart);
				}
				public void TC10_order() throws InterruptedException
				{	
					try {
						
						gettext(CheckouterrorMessage);
						click(CheckoutErrorretry);
						
					}catch (Exception e) {
						// TODO: handle exception
					}
				gettext(CheckoutUsername);
				gettext(CheckoutMobilenumber);
				gettext(CheckoutAddresstag);
	//			gettext(CheckoutAddresstype);
				gettext(CheckoutTotalAmount);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCard);
//				click(PaymentMakepayment);
//				Thread.sleep(5000);
//				click(NooNpayBackBtn);
//				click(CanceltransactionOK);
//				Thread.sleep(3000);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCOD);
//				click(PaymentMakepayment);
//				gettext(ThanyouscreenOrderstatus);
////				gettext(ThanyouscreenStoreName);
////				gettext(ThanyouscreenTotalPrice);
//				click(ThanyouscreenHomeBtn);
			
				back();
				back();
				back();
				back();
			}
			
			public void TC11_googleuser_() throws InterruptedException {
				
				click(HomeBannerHamburgerMenu);
				click(profilesettings);
				click(profileLogout);
				click(GoogleLogin);
			
				try {
					
					click(GmailAccount2);
					
				}catch(Exception e) {
					click(GmailAccount1);
					
				}
				type(SocialLoginAddprofilemobilenumber, "33669900");
				click(Createprofilesave);
				try {
				click(Switchaccountproceed);
				}catch(Exception e) {
					
					System.out.println("No switch account Pop up present");
				}
				type(SocialLoginAddprofilemobilenumber, "33669900");
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
			
			public void TC11_AddDeliveryaddress() throws InterruptedException 
			{
				click(HomescreenDelivery);
				try {
					click(SavedaddressCurrentlocation);
				}catch (Exception e) {
					System.out.println("No saved Addresses present");
					// TODO: handle exception
				}
				type(Locationsearchbox, "Bahr");
				Thread.sleep(2000);
				click(SidemenuTrackorder);
				Thread.sleep(2000);
				click(ConfirmlocationDelivery);
				type(LocationScreenBuildingname, "B12");
				type(LocationScreenFlatno, "B12");
				back();
				click(DeliverylocationContinue);
			Thread.sleep(2000);
			}
				
			public void TC11_createcart_viewcart() throws InterruptedException {
				
				click(HomeBannerHamburgerMenu);
				click(SidemenuExploremenu);
				click(MenuAddtocartP1);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(MenuP1Favourite);
				click(MenuP2Favourite);
				click(MenuForOne);
				click(MenuForsharing);
				click(MenuSidesandDesserts);
				click(Menubeverages);
				click(MenuAddtocartP1);
				click(MenuViewcart);
				click(CartAddQuantity);
				click(CartAddQuantity);
				gettext(Cartwidgetpricedisplayed);
				click(MenuViewcart);
			}
			public void TC11_Checkout_order() throws InterruptedException {
				try {
					
					gettext(CheckouterrorMessage);
					click(CheckoutErrorretry);
					
				}catch (Exception e) {
					// TODO: handle exception
				}
				gettext(CheckoutUsername);
				gettext(CheckoutMobilenumber);
				gettext(CheckoutAddresstag);
	//			gettext(CheckoutAddresstype);
				gettext(CheckoutTotalAmount);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCard);
//				click(PaymentMakepayment);
//				Thread.sleep(5000);
//				click(NooNpayBackBtn);
//				click(CanceltransactionOK);
//				Thread.sleep(3000);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCOD);
//				click(PaymentMakepayment);
//				gettext(ThanyouscreenOrderstatus);
//				gettext(ThanyouscreenStoreName);
//				gettext(ThanyouscreenTotalPrice);
//				click(ThanyouscreenHomeBtn);
			
				back();
				back();
				back();
				back();
				
			}

			public void TC12_guestuser_createcart() throws InterruptedException {
				
				click(HomeBannerHamburgerMenu);
				click(profilesettings);
				click(profileLogout);
				click(SkipLogin_continue);
				
				click(HomeBannerHamburgerMenu);
				click(SidemenuExploremenu);
				click(MenuAddtocartP1);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(MenuP1Favourite);
				click(MenuP2Favourite);
				click(MenuForOne);
				click(MenuForsharing);
				click(MenuAddtocartP3);
				click(MenuSidesandDesserts);
				click(MenuAddtocartP1);
				click(MenuViewcart);
				Thread.sleep(2000);
				swipeToBottom();
				swipeToBottom();
			}
			public void TC12_cart_nocouponapplied_Addaddress_Adduser() throws InterruptedException {
				//	gettext(Cartwidgetpricedisplayed);

				gettext(Cartwidgetpricedisplayed);
				click(MenuViewcart);
				type(Locationsearchbox, "Bahr");
				Thread.sleep(2000);
				click(SidemenuTrackorder);
				Thread.sleep(2000);
				click(ConfirmlocationDelivery);
				try {
					click(SavedaddressCurrentlocation);
				}catch (Exception e) {
					System.out.println("No saved Addresses present");
					// TODO: handle exception
				}
				type(LocationScreenBuildingname, "B12");
				type(LocationScreenFlatno, "B12");
				back();
				
				click(DeliverylocationContinue);
				type(Createprofilename, "Testing Auto");
				type(Createprofilemobilenumber, "33669900");
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
			public void TC12_order() throws InterruptedException {
				try {
					
					gettext(CheckouterrorMessage);
					click(CheckoutErrorretry);
					
				}catch (Exception e) {
					// TODO: handle exception
				}
				gettext(CheckoutUsername);
				gettext(CheckoutMobilenumber);
				gettext(CheckoutAddresstag);
	//			gettext(CheckoutAddresstype);
				gettext(CheckoutTotalAmount);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCard);
//				click(PaymentMakepayment);
//				Thread.sleep(5000);
//				click(NooNpayBackBtn);
//				click(CanceltransactionOK);
//				Thread.sleep(3000);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCOD);
//				click(PaymentMakepayment);
//				gettext(ThanyouscreenOrderstatus);
////				gettext(ThanyouscreenStoreName);
////				gettext(ThanyouscreenTotalPrice);
//				click(ThanyouscreenHomeBtn);
					
						    back();
							back();					
							back();
							back();
			}

			public void TC13_registereduser_createcart() throws InterruptedException {
				
				click(HomeBannerHamburgerMenu);
				click(SidemenuExploremenu);
				click(MenuAddtocartP1);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(MenuP1Favourite);
				click(MenuP2Favourite);
				click(MenuForOne);
				click(MenuAddtocartP1);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(MenuForsharing);
				click(MenuAddtocartP1);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(Menubeverages);
				click(MenuAddtocartP1);
				click(MenuViewcart);
			}
			public void TC13_cart_nocopoun_order() throws InterruptedException {
			//	gettext(Cartwidgetpricedisplayed);
				gettext(Cartwidgetpricedisplayed);
				click(MenuViewcart);
				gettext(CheckoutUsername);
				gettext(CheckoutMobilenumber);
				gettext(CheckoutAddresstag);
		//		gettext(CheckoutAddresstype);
				gettext(CheckoutTotalAmount);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCard);
//				click(PaymentMakepayment);
//				Thread.sleep(5000);
//				click(NooNpayBackBtn);
//				click(CanceltransactionOK);
//				Thread.sleep(3000);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCOD);
//				click(PaymentMakepayment);
//				gettext(ThanyouscreenOrderstatus);
////				gettext(ThanyouscreenStoreName);
////				gettext(ThanyouscreenTotalPrice);
//				click(ThanyouscreenHomeBtn);
					
						    back();
							back();					
							back();
							back();
				}
			
			public void TC14_FBuser_AddAddress() throws InterruptedException {
				
				click(HomeBannerHamburgerMenu);
				click(profilesettings);
				click(profileLogout);
				click(FacebookLogin);
				try {
					type(SocialLoginAddprofilemobilenumber, "33669900");
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
					
				click(HomescreenDelivery);
				try {
					click(SavedaddressCurrentlocation);
				}catch (Exception e) {
					System.out.println("No saved Addresses present");
					// TODO: handle exception
				}
				type(Locationsearchbox, "Bahr");
				Thread.sleep(2000);
				click(SidemenuTrackorder);
				Thread.sleep(2000);
				click(ConfirmlocationDelivery);
				type(LocationScreenBuildingname, "B12");
				type(LocationScreenFlatno, "B12");
				back();
				click(DeliverylocationContinue);
			}
			public void TC14_createcart_viewcart() {
				click(HomeBannerHamburgerMenu);
				click(SidemenuExploremenu);
				click(MenuForOne);
				click(MenuAddtocartP1);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(MenuAddtocartP2);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(MenuViewcart);
			//	gettext(Cartwidgetpricedisplayed);
				
				gettext(Cartwidgetpricedisplayed);
				click(MenuViewcart);
			}
			public void TC14_order() throws InterruptedException {
				try {
					
					gettext(CheckouterrorMessage);
					click(CheckoutErrorretry);
					
				}catch (Exception e) {
					// TODO: handle exception
				}
				gettext(CheckoutUsername);
				gettext(CheckoutMobilenumber);
				gettext(CheckoutAddresstag);
	//			gettext(CheckoutAddresstype);
				gettext(CheckoutTotalAmount);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCard);
//				click(PaymentMakepayment);
//				Thread.sleep(5000);
//				click(NooNpayBackBtn);
//				click(CanceltransactionOK);
//				Thread.sleep(3000);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCOD);
//				click(PaymentMakepayment);
//				gettext(ThanyouscreenOrderstatus);
////				gettext(ThanyouscreenStoreName);
////				gettext(ThanyouscreenTotalPrice);
//				click(ThanyouscreenHomeBtn);
			
				back();
				back();
				back();
				back();			
			}

			public void TC20_carhop_addstore() throws InterruptedException {
				
				click(HomescreenCarhop);
				type(LocationScreenPickupStoreCity, "Bahr");
				click(LocationCitySelect);
				click(LocationScreenPickupStoreState);
				type(LocationScreenPickupStoreState, "KFC");
				click(Locationstoreselect);
				swipeToBottom();
				type(LocationScreenCarhopDeliveryinstructions, "Blue toyota");
			click(LocationScreenProceed);
			}
			public void TC20_createcart() 
			{
				click(HomeBannerHamburgerMenu);
				click(SidemenuExploremenu);
				click(MenuForOne);
				click(MenuForsharing);
				click(MenuSidesandDesserts);
				click(Menubeverages);
				click(MenuAddtocartP1);
				click(MenuViewcart);
				click(CartAddQuantity);
				click(CartAddQuantity);
			}
			public void TC20_cart_couponapplied() throws InterruptedException {
				swipeToBottom();
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
			public void TC20_order() throws InterruptedException {
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
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCard);
//				click(PaymentMakepayment);
//				Thread.sleep(5000);
//				click(NooNpayBackBtn);
//				click(CanceltransactionOK);
//				Thread.sleep(3000);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCOD);
//				click(PaymentMakepayment);
//				gettext(ThanyouscreenOrderstatus);
////				gettext(ThanyouscreenStoreName);
////				gettext(ThanyouscreenTotalPrice);
//				click(ThanyouscreenHomeBtn);
					
						    back();
							back();					
							back();
							back();
				
			}

			public void TC22_registereduser_createcart() throws InterruptedException {
				
				click(HomeBannerHamburgerMenu);
				click(SidemenuExploremenu);
				click(MenuAddtocartP1);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(MenuP1Favourite);
				click(MenuP2Favourite);
				click(MenuForOne);
				click(MenuAddtocartP1);
				try {
					gettext(MakeMealHeader);
					click(MakeAMealAdd);
					click(Switchaccountproceed);
				}catch (Exception e) {
			System.out.println("Addons Not Present");
				}
				click(MenuViewcart);
			
				
			}
			public void TC22_cart_carhopaddress() throws InterruptedException {
				swipeToBottom();
				swipeToBottom();
				swipeToBottom();
				click(CartApplycoupon);
//				swipeToBottom();
//				swipeToBottom();
//				swipeToBottom();
				try {
				gettext(CartCouponcode);
				click(CartCouponcodeApplyC1);
				Thread.sleep(3000);
				gettext(CartCouponcodedescription);
				}catch (Exception e) {
					System.out.println("No Promotion/Coupon Code Present");
					// TODO: handle exception
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
			public void TC22_order() throws InterruptedException {
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
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCard);
//				click(PaymentMakepayment);
//				Thread.sleep(5000);
//				click(NooNpayBackBtn);
//				click(CanceltransactionOK);
//				Thread.sleep(3000);
//				click(CheckoutOtherPaymentOptions);
//				click(PaymentwidgetCOD);
//				click(PaymentMakepayment);
//				gettext(ThanyouscreenOrderstatus);
//	//			gettext(ThanyouscreenStoreName);
//	//			gettext(ThanyouscreenTotalPrice);
//				click(ThanyouscreenHomeBtn);
					
						    back();
							back();					
							back();
							back();
			}







}
