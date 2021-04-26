package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class HomeScreen extends Utility{
	
	
	
	@FindBy(id="com.kfc.oman:id/btn_change_location")
	WebElement Homelocationwidgetselect;
	
	@FindBy(id="com.kfc.oman:id/iv_menu")
	WebElement HomeBannerHamburgerMenu;
	
	@FindBy(id="com.kfc.oman:id/tv_one")
	WebElement HomeExploremenuDeals;
	
	@FindBy(id="com.kfc.oman:id/tv_two")
	WebElement HomeExploremenuForone;

	@FindBy(id="com.kfc.oman:id/tv_three")
	WebElement HomeExploremenuForSharing;

	@FindBy(id="com.kfc.oman:id/tv_four")
	WebElement HomeExploremenuSidesandDeserts;

	@FindBy(id="com.kfc.oman:id/tv_five")
	WebElement HomeExploremenuBeverages;
	
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
	
	@FindBy(xpath="//android.view.ViewGroup[@resource-id='com.kfc.oman:id/cl_image_container'][1]")
	WebElement HomescreenBanner1;
	
	@FindBy(xpath="//android.view.ViewGroup[@resource-id='com.kfc.oman:id/cl_image_container'][2]")
	WebElement HomescreenBanner2;
	
	@FindBy(xpath="//android.view.ViewGroup[@resource-id='com.kfc.oman:id/et_city_auto']/android.view.ViewGroup/android.widget.EditText[@resource-id='com.kfc.oman:id/et_auto_complete']")
	WebElement LocationScreenPickupStoreCity;

	@FindBy(id="com.kfc.oman:id/v_state_anchor")
	WebElement LocationScreenPickupStoreCitySelect;
	
	@FindBy(xpath="//android.view.ViewGroup[@resource-id='com.kfc.oman:id/et_store_auto']/android.view.ViewGroup/android.widget.EditText[@resource-id='com.kfc.oman:id/et_auto_complete']")
	WebElement LocationScreenPickupStoreState;
	
	@FindBy(id="com.kfc.oman:id/v_city_anchor")
	WebElement LocationScreenPickupStoreStateselect;
	

	@FindBy(id="com.kfc.oman:id/btn_pickup_proceed")
	WebElement LocationScreenProceed;
	
	@FindBy(id="com.kfc.oman:id/tv_store_title")
	WebElement LocationScreenPickupStoredetails;
	
	@FindBy(id="com.kfc.oman:id/v_state_anchor")
	WebElement LocationCitySelect;
	
	@FindBy(id="com.kfc.oman:id/v_city_anchor")
	WebElement Locationstoreselect;
	
	@FindBy(id="com.kfc.oman:id/tv_delivery_instructions")
	WebElement CarhopCardetails;
	

	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_side_menu_name'][4]")
	WebElement SidemenuExploremenu;
	
	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[@resource-id='com.kfc.oman:id/tv_add_to_cart']")
	WebElement MenuAddtocartP1;
	
	@FindBy(xpath="//android.view.ViewGroup[2]/android.view.ViewGroup[@resource-id='com.kfc.oman:id/tv_add_to_cart']")
	WebElement MenuAddtocartP2;
	
	@FindBy(id="com.kfc.oman:id/cl_view_cart")
	WebElement MenuViewcart;
	
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.oman:id/tv_price']")
	WebElement Cartwidgetpricedisplayed;
	
	
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
	
	
	@FindBy(id="com.kfc.oman:id/tv_name")
	WebElement CheckoutUsername;
	
	@FindBy(id="com.kfc.oman:id/btn_explore_menu")
	WebElement CancelTransactionCancel;
	
	@FindBy(id="com.kfc.oman:id/tv_dismiss")
	WebElement CanceltransactionOK;
	
	 public HomeScreen()
		{
			PageFactory.initElements(driver, this);
		}
	
	public void TC24_CarhopOrder() throws InterruptedException{
		click(HomescreenCarhop);
		click(LocationScreenPickupStoreCity);
		type(LocationScreenPickupStoreCity, "Sharj");
		click(LocationCitySelect);
		
		click(LocationScreenPickupStoreCity);
		click(LocationScreenPickupStoreState);
		type(LocationScreenPickupStoreState, "KFC-Test");
		click(Locationstoreselect);
		swipeToBottom();
		swipeToBottom();
		type(CarhopCardetails, "Test");
		click(LocationScreenProceed);
		click(SidemenuExploremenu);
		click(MenuAddtocartP1);
		click(MenuViewcart);
		gettext(Cartwidgetpricedisplayed);
		click(MenuViewcart);
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
//		click(CheckoutOtherPaymentOptions);
//		click(PaymentwidgetCard);
//		click(PaymentMakepayment);
//		Thread.sleep(5000);
//		click(NooNpayBackBtn);
//		click(CanceltransactionOK);
//		Thread.sleep(3000);
//		click(CheckoutOtherPaymentOptions);
//		click(PaymentwidgetCOD);
//		click(PaymentMakepayment);
//		gettext(ThanyouscreenOrderstatus);
////	gettext(ThanyouscreenStoreName);
////	gettext(ThanyouscreenTotalPrice);
//		click(ThanyouscreenHomeBtn);
		
		back();
		back();
		back();
		back();
		
	}
	
	public void TC24_DineInOrder() throws InterruptedException{
		click(HomescreenDinein);
		click(LocationScreenPickupStoreCity);
		type(LocationScreenPickupStoreCity, "Sharj");
		click(LocationCitySelect);
		
	//	click(LocationScreenPickupStoreCity);
		click(LocationScreenPickupStoreState);
		type(LocationScreenPickupStoreState, "KFC-Test");
		click(Locationstoreselect);
		swipeToBottom();
		swipeToBottom();
		type(CarhopCardetails, "Test");
		click(LocationScreenProceed);
		click(SidemenuExploremenu);
		click(MenuAddtocartP1);
		click(MenuViewcart);
		gettext(Cartwidgetpricedisplayed);
		click(MenuViewcart);
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
//		click(CheckoutOtherPaymentOptions);
//		click(PaymentwidgetCard);
//		click(PaymentMakepayment);
//		Thread.sleep(5000);
//		click(NooNpayBackBtn);
//		click(CanceltransactionOK);
//		Thread.sleep(3000);
//		click(CheckoutOtherPaymentOptions);
//		click(PaymentwidgetCOD);
//		click(PaymentMakepayment);
//		gettext(ThanyouscreenOrderstatus);
////			gettext(ThanyouscreenStoreName);
////			gettext(ThanyouscreenTotalPrice);
//		click(ThanyouscreenHomeBtn);
	}

	public void TC24_DriveThroughOrder(){
		click(HomescreenDrivethrough);
		click(LocationScreenPickupStoreCity);
		type(LocationScreenPickupStoreCity, "Sharj");
		click(LocationCitySelect);
		
	//	click(LocationScreenPickupStoreCity);
		click(LocationScreenPickupStoreState);
		type(LocationScreenPickupStoreState, "Buhai");
		click(Locationstoreselect);
		click(LocationScreenProceed);
		
	}
}