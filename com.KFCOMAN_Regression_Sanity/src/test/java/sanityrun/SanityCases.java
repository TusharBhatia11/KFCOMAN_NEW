package sanityrun;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageclasses.HomeScreen;
import pageclasses.HomeSidemenu;
import pageclasses.Onboarding;
import sanity.SanityRuncases;
import utils.Utility;

public class SanityCases extends Utility {
	

//	Onboarding ob;
SanityRuncases SR = new SanityRuncases();
	

	@BeforeTest
	public void Launchapp() throws MalformedURLException
	{
		LaunchApplication();
	}
	
	@Test(priority = 1)
	
	public void GuestUser_Createcart() throws InterruptedException, IOException {
		SR = new SanityRuncases();
		SR.GuestUser_Createcart();
	}

@Test(priority = 2)
	
	public void Guest_ViewCart_Couponapplied() throws InterruptedException {
		SR = new SanityRuncases();
		SR.Guest_ViewCart_Couponapplied();
	}

@Test(priority = 3)

public void GuestUser_Pickuplocation_profile() throws InterruptedException {
	SR = new SanityRuncases();
	SR.GuestUser_Pickuplocation_profile();
}

@Test(priority = 4)

public void GuestUser_Order() throws InterruptedException {
	SR = new SanityRuncases();
	SR.GuestUser_Order();
}

@Test(priority = 5)

public void Registereduser_createcart() throws InterruptedException {
	SR = new SanityRuncases();
	SR.Registereduser_createcart();
}

@Test(priority = 6)

public void Registereduser_Order() throws InterruptedException {
	SR = new SanityRuncases();
	SR.Registereduser_Order();
}

@Test(priority = 7)

public void FBuser_createcart() throws InterruptedException {
	SR = new SanityRuncases();
	SR.FBuser_createcart();
}

@Test(priority = 8)

public void Viewcart_Applycoupon() throws InterruptedException {
	SR = new SanityRuncases();
	SR.Viewcart_Applycoupon();
}

@Test(priority = 9)

public void Addlocation() throws InterruptedException {
	SR = new SanityRuncases();
	SR.Addlocation();
}

@Test(priority = 10)

public void FBUser_order() throws InterruptedException {
	SR = new SanityRuncases();
	SR.FBUser_order();
}

@Test(priority = 11)

public void GoogleUser_createcart() throws InterruptedException {
	SR = new SanityRuncases();
	SR.GoogleUser_createcart();
}

@Test(priority = 12)

public void Viewcart_couponapplied() throws InterruptedException {
	SR = new SanityRuncases();
	SR.Viewcart_couponapplied();
}

@Test(priority = 13)

public void GoogleUser_Order() throws InterruptedException {
	SR = new SanityRuncases();
	SR.GoogleUser_Order();
}

@Test(priority = 14)

public void Feedback() throws InterruptedException {
	SR = new SanityRuncases();
	SR.Feedback();
}

@Test(priority = 15)

public void UserProfile() throws InterruptedException {
	SR = new SanityRuncases();
	SR.UserProfile();
}

@Test(priority = 16)

public void Trackorder() throws InterruptedException, IOException {
	SR = new SanityRuncases();
	SR.Trackorder();
}

@Test(priority = 17)

public void Language() throws InterruptedException, IOException {
	SR = new SanityRuncases();
	SR.Language();
}

//@Test(priority = 18)
//
//public void Changecountry() throws InterruptedException {
//	SR = new SanityRuncases();
//	SR.Changecountry();
// }


}
