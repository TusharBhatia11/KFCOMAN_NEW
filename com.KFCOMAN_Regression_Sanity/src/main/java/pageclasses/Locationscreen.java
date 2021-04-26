package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locationscreen {

	@FindBy(id="com.kfc.oman:id/et_search_address")
	WebElement Locationsearchbox;
	
	@FindBy(id="com.kfc.oman:id/et_building_name")
	WebElement LocationScreenBuildingname;
	
	@FindBy(id="com.kfc.oman:id/et_flat_no")
	WebElement LocationScreenFlatno;
	
	@FindBy(id="com.kfc.oman:id/rb_home")
	WebElement LocationScreentagsHome;
	
	
	@FindBy(id="com.kfc.oman:id/rb_office")
	WebElement LocationScreentagsOffice;
	
	@FindBy(id="com.kfc.oman:id/rb_other")
	WebElement LocationScreentagsother;
	
	@FindBy(id="com.kfc.oman:id/rb_hotel")
	WebElement LocationScreentagsHotel;

	@FindBy(id="com.kfc.oman:id/btn_confirm_location")
	WebElement LocationScreenconfirmlocation;
	
	@FindBy(id="com.kfc.oman:id/rb_pickup")
	WebElement LocationScreenPickupoption;
	
	@FindBy(id="com.kfc.oman:id/rb_pickup_carhop")
	WebElement LocationScreenPickupCarhop;
	
	@FindBy(id="com.kfc.oman:id/tv_state")
	WebElement LocationScreenPickupStoreCity;
	
	@FindBy(id="com.kfc.oman:id/v_state_anchor")
	WebElement LocationScreenCityselect;
	
	@FindBy(id="com.kfc.oman:id/tv_delivery_instructions")
	WebElement LocationScreenCarhopDeliveryinstructions;
	


	

	
	
}
