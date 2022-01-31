package Swiggytrial.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class BaseTest {

	AndroidDriver driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:platformVersion", "7.1.1");
		desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
		desiredCapabilities.setCapability("appium:appPackage", "in.swiggy.android");
		desiredCapabilities.setCapability("appium:appActivity", "in.swiggy.android.activities.HomeActivity");
		
		URL remoteUrl = new URL("http://host.docker.internal:4723/wd/hub");
		driver = new AndroidDriver(remoteUrl, desiredCapabilities);

		// add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void tearDown() throws Throwable{
		Thread.sleep(10000);
		driver.quit();
	}

	public MobileElement getByClass(String _className) {
		
		return (MobileElement) driver.findElement(By.className(_className));
	}
	
	public List<MobileElement> getAllByClass(String _className) {
		
		return driver.findElements(By.className(_className));
	}
	
	public MobileElement getByText(String _text) {
		
		String xpath="//*[@text='"+_text+"']";
		return (MobileElement) driver.findElement(By.xpath(xpath));
	}
	
	public void swipeUpScreen() {
		
		int height= driver.manage().window().getSize().getHeight();
		//System.out.println("height Y="+ height); //2148  => 2140
		int width= driver.manage().window().getSize().getWidth();
		//System.out.println("width X="+ width);
		
		TouchAction touchAction = new TouchAction(driver);
		
		int adjustedHeight= height-20;
		int adjustedWidth= width /2;
	
		// System.out.println("scrolling from x="+adjustedWidth+", y="+adjustedHeight);
		// System.out.println("to x="+adjustedWidth+", y="+100);
		
		touchAction
			.press(PointOption.point(adjustedWidth,adjustedHeight))
			.moveTo(PointOption.point(adjustedWidth,100))
			.release()
			.perform();
		
	}
	
}



