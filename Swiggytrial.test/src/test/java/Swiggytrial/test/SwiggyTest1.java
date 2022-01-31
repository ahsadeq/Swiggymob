package Swiggytrial.test;



import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class SwiggyTest1 extends BaseTest{

	@Test
	public void test1() throws InterruptedException {
		
		MobileElement grant_Button = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView");
		grant_Button.click();
		MobileElement allow_but = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		allow_but.click();
		Thread.sleep(10000);
		MobileElement cnfrm_loc = (MobileElement) driver.findElementById("in.swiggy.android:id/google_place_search_title_text1");
		cnfrm_loc.click();
		MobileElement turnOn_button = (MobileElement) driver.findElementById("in.swiggy.android:id/turn_on_textview");
		turnOn_button.click();
		Thread.sleep(10000);
		TouchAction touchAction = new TouchAction(driver);
		touchAction
				.press(PointOption.point(757, 1947))
				.release()
				.perform();
					
		MobileElement search_bar1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
		search_bar1.click();
		search_bar1.sendKeys("pizza hut");
		
		touchAction
		.press(PointOption.point(1000, 1910))
		.release()
		.perform();
		
		Thread.sleep(5000);
		MobileElement pizzaHut_but = (MobileElement) driver.findElementByXPath("(//android.widget.TextView[@content-desc=\"serves Pizzas\"])[1]");
		pizzaHut_but.click();
		Thread.sleep(5000);
		driver.navigate().back();
//		MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView[1]");
//		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementById("in.swiggy.android:id/menu_horizontal_recycler");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Add Item");
		el8.click();
		MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout");
		el9.click();
		MobileElement el10 = (MobileElement) driver.findElementById("in.swiggy.android:id/progressive_variants_continue_button");
		el10.click();
		MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.CheckBox");
		el11.click();
		MobileElement el12 = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Item total ₹368\"]/android.widget.TextView[2]");
		el12.click();
		MobileElement el13 = (MobileElement) driver.findElementById("in.swiggy.android:id/add_to_cart_customisation_text");
		el13.click();


	}
}
