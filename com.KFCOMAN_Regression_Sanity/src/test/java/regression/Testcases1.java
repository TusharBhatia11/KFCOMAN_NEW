package regression;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageclasses.HomeScreen;
import pageclasses.HomeSidemenu;
import pageclasses.Onboarding;
import utils.Utility;

public class Testcases1 extends Utility{

//	Onboarding ob;
 Onboarding	ob= new Onboarding();
HomeSidemenu HSM = new HomeSidemenu();
HomeScreen HS = new HomeScreen();

	
	@BeforeTest
	public void Launchapp() throws MalformedURLException
	{
		LaunchApplication();
	}
	
@Test(priority=1)

public void TC01_Guestuser_createcart() throws InterruptedException, IOException {
	ob= new Onboarding();
	
	ob.TC01_GuestUser_createcart();
}

@Test(priority=2)

public void TC01_ViewCart_Couponapplied() throws InterruptedException {
	ob= new Onboarding();
	
	ob.TC01_ViewCart_Couponapplied();
	
}

@Test(priority=3)

public void TC01_Pickuplocation_profile() throws InterruptedException {
	
	ob= new Onboarding();
	ob.TC01_Pickuplocation_profile();
}

@Test(priority=4)

public void TC01_Order() throws InterruptedException {
	
	ob= new Onboarding();
	ob.TC01_Order();
}

@Test(priority=5)

public void TC02_Loggedinuser_createcart() throws InterruptedException {
	
	ob= new Onboarding();
	ob.TC02_Loggedinuser_createcart();
}

@Test(priority=6)

public void TC02_Order() throws InterruptedException {
	
	ob= new Onboarding();
	ob.TC02_Order();
}

@Test(priority=7)

public void TC03_FBuser_createcart() throws InterruptedException {
	
	ob= new Onboarding();
	ob.TC03_FBuser_createcart();
}

@Test(priority=8)

public void TC03_Viewcart_Applycoupon() throws InterruptedException {
	
	ob= new Onboarding();
	ob.TC03_Viewcart_Applycoupon();
}

@Test(priority=9)

public void TC03_Addlocation() throws InterruptedException {
	
	ob= new Onboarding();
	ob.TC03_Addlocation();
}

@Test(priority=10)

public void TC03_order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC03_order();
}

@Test(priority=11)

public void TC04_GoogleUser_createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC04_GoogleUser_createcart();
}

@Test(priority=12)

public void TC04_Viewcart_couponapplied() throws InterruptedException {
	ob= new Onboarding();
	ob.TC04_Viewcart_couponapplied();
}

@Test(priority=13)

public void TC04_Addlocation() throws InterruptedException {
	ob= new Onboarding();
	ob.TC04_Addlocation();
}

@Test(priority=14)

public void TC04_Order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC04_Order();
}

@Test(priority=15)
public void TC05_Guestuser_createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC05_Guestuser_createcart();
}

@Test(priority=16)
public void TC05_viewcart_couponapplied() throws InterruptedException {
	ob= new Onboarding();
	ob.TC05_viewcart_couponapplied();
}

@Test(priority=17)
public void TC05_Addlocation() throws InterruptedException {
	ob= new Onboarding();
	ob.TC05_Addlocation();
}

@Test(priority=18)
public void TC05_order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC05_order();
}

@Test(priority=19)
public void TC05_createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC05_createcart();
}

@Test(priority=20)
public void TC05_viewcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC05_viewcart();
}

@Test(priority=21)
public void TC05_order2() throws InterruptedException {
	ob= new Onboarding();
	ob.TC05_order2();
}

@Test(priority=22)
public void TC06_FBuser_createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC06_FBuser_createcart();
}

@Test(priority=23)
public void TC06_viewcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC06_viewcart();
}

@Test(priority=24)
public void TC06_Addlocation_adduser() throws InterruptedException {
	ob= new Onboarding();
	ob.TC06_Addlocation_adduser();
}

@Test(priority=25)
public void TC06_Order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC06_Order();
}

@Test(priority=26)
public void TC06_createcart2() throws InterruptedException {
	ob= new Onboarding();
	ob.TC06_createcart2();
}

@Test(priority=27)
public void TC06_viewcart2() throws InterruptedException {
	ob= new Onboarding();
	ob.TC06_viewcart2();
}

@Test(priority=28)
public void TC06_order2() throws InterruptedException {
	ob= new Onboarding();
	ob.TC06_order2();
}

@Test(priority=29)
public void TC07_GoogleUser_Createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC07_GoogleUser_Createcart();
}

@Test(priority=30)
public void TC07_viewcart_couponapplied()  throws InterruptedException {
	ob= new Onboarding();
	ob.TC07_viewcart_couponapplied();
}

@Test(priority=31)
public void TC07_Addlocation_Adduser() throws InterruptedException {
	ob= new Onboarding();
	ob.TC07_Addlocation_Adduser();
}

@Test(priority=32)
public void TC07_order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC07_order();
}

@Test(priority=33)
public void TC07_createcart2_viewcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC07_createcart2_viewcart();
}

@Test(priority=34)
public void TC07_order2() throws InterruptedException {
	ob= new Onboarding();
	ob.TC07_order2();
}

@Test(priority=35)
public void TC08_guestuser_createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC08_guestuser_createcart();
}

@Test(priority=36)
public void TC08_viewcart_couponapplied() throws InterruptedException {
	ob= new Onboarding();
	ob.TC08_viewcart_couponapplied();
}

@Test(priority=37)
public void TC08_Adduser() throws InterruptedException {
	ob= new Onboarding();
	ob.TC08_Adduser();
}

@Test(priority=38)
public void TC08_order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC08_order();
}

@Test(priority=39)
public void TC09_loggedinuser_createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC09_loggedinuser_createcart();
}

@Test(priority=40)
public void TC09_cart_couponapplied() throws InterruptedException {
	ob= new Onboarding();
	ob.TC09_cart_couponapplied();
}

@Test(priority=41)
public void TC09_order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC09_order();
}

@Test(priority=42)
public void TC10_FBuser() throws InterruptedException {
	ob= new Onboarding();
	ob.TC10_FBuser();
}

@Test(priority=43)
public void TC10_Addlocationdelivery() throws InterruptedException {
	ob= new Onboarding();
	ob.TC10_Addlocationdelivery();
}

@Test(priority=44)
public void TC10_createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC10_createcart();
}

@Test(priority=45)
public void TC10_cart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC10_cart();

}

@Test(priority=46)
public void TC10_order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC10_order();
}

@Test(priority=47)
public void TC11_googleuser_() throws InterruptedException {
	ob= new Onboarding();
	ob.TC11_googleuser_();
}

@Test(priority=48)
public void TC11_AddDeliveryaddress() throws InterruptedException {
	ob= new Onboarding();
	ob.TC11_AddDeliveryaddress();
}

@Test(priority=49)
public void TC11_createcart_viewcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC11_createcart_viewcart();
}

@Test(priority=50)
public void TC11_Checkout_order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC11_Checkout_order();
}

@Test(priority=51)
public void TC12_guestuser_createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC12_guestuser_createcart();
}

@Test(priority=52)
public void TC12_cart_nocouponapplied_Addaddress_Adduser() throws InterruptedException {
	ob= new Onboarding();
	ob.TC12_cart_nocouponapplied_Addaddress_Adduser();
}

@Test(priority=53)
public void TC12_order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC12_order();
}

@Test(priority=54)
public void TC13_registereduser_createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC13_registereduser_createcart();
}

@Test(priority=55)
public void TC13_cart_nocopoun_order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC13_cart_nocopoun_order();
}

@Test(priority=56)
public void TC14_FBuser_AddAddress() throws InterruptedException {
	ob= new Onboarding();
	ob.TC14_FBuser_AddAddress();
}

@Test(priority=57)
public void TC14_createcart_viewcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC14_createcart_viewcart();
}

@Test(priority=58)
public void TC14_order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC14_order();
}

@Test(priority=59)
public void TC20_carhop_addstore() throws InterruptedException {
	ob= new Onboarding();
	ob.TC20_carhop_addstore();
}

@Test(priority=60)
public void TC20_createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC20_createcart();
}

@Test(priority=61)
public void TC20_cart_couponapplied() throws InterruptedException {
	ob= new Onboarding();
	ob.TC20_cart_couponapplied();
}


@Test(priority=62)
public void TC20_order() throws InterruptedException {
	ob= new Onboarding();
	ob.TC20_order();
	}



@Test(priority=63)
public void TC22_registereduser_createcart() throws InterruptedException {
	ob= new Onboarding();
	ob.TC22_registereduser_createcart();
	}


@Test(priority=64)
public void TC22_cart_carhopaddress() throws InterruptedException {
	ob= new Onboarding();
	ob.TC22_cart_carhopaddress();
	}


@Test(priority=65)
public void TC22_order()  throws InterruptedException {
	ob= new Onboarding();
	ob.TC22_order();
	}

@Test(priority=66)
public void TC23_Userprofile()  throws InterruptedException {
	HSM = new HomeSidemenu();
	HSM.TC23_UserProfile();
	}

@Test(priority=67)
public void TC23_Trackorder()  throws InterruptedException {
	HSM = new HomeSidemenu();
	HSM.TC23_Trackorder();
	
}

@Test(priority=68)
public void TC24_Carhop()  throws InterruptedException {
	HS = new HomeScreen();
	HS.TC24_CarhopOrder();
	
}


@Test(priority=69)
public void TC24_Dinein()  throws InterruptedException {
	HS = new HomeScreen();
	HS.TC24_DineInOrder();
	
}


@Test(priority=70)
public void TC24_Drivethrough()  throws InterruptedException {
	HS = new HomeScreen();
	HS.TC24_DriveThroughOrder();
	
}


@AfterTest

public void test() {
	
	driver.quit();
  }

}
	
	

