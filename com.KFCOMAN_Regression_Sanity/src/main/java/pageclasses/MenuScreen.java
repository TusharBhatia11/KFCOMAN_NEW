package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuScreen {

	@FindBy(id="Deals")
	WebElement MenuDeals;
	
	@FindBy(id="For Ones")
	WebElement MenuForOne;
	
	@FindBy(id="For Sharing")
	WebElement MenuForsharing;
	
	@FindBy(id="Sides & Desserts")
	WebElement MenuSidesandDesserts;

	@FindBy(id="Beverages")
	WebElement Menubeverages;

	@FindBy(id="My Favorites")
	WebElement MenuMyfavorites;

	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[@resource-id='com.kfc.oman:id/tv_add_to_cart']")
	WebElement MenuAddtocartP1;


	@FindBy(id="com.kfc.oman:id/cl_view_cart")
	WebElement MenuViewcart;
	

	@FindBy(id="com.kfc.oman:id/iv_search")
	WebElement MenuSearch;
	

	@FindBy(id="com.kfc.oman:id/et_search")
	WebElement Menusearchbar;
	

	@FindBy(id="//android.widget.FrameLayout[@resource-id='com.kfc.oman:id/fl_fav']")
	WebElement MenuFavourite;
	

	@FindBy(id="com.kfc.oman:id/tv_customize")
	WebElement MenuCustomise;
	

	@FindBy(id="com.kfc.oman:id/tv_edit")
	WebElement MenuEditcustomisation;



















}
