package test10;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.util.concurrent.ThreadLocalRandom;

public class Calculator extends Initiate
{
	protected static float hello = ThreadLocalRandom.current().nextInt(0, 1000);
	
    static void sanitytest() throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "db08637f");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability("appPackage", "com.dsinnovators.ssfcommunication.demo");
		dc.setCapability("appActivity", "com.dsinnovators.ssfcommunication.ui.start.StartActivity");
		dc.setCapability("noReset", true);
		dc.setCapability("automationName", "UiAutomator2");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AppiumDriver driver = new AppiumDriver(url, dc);
		Thread.sleep(3000);
		WebElement five = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/authPass"));
		five.sendKeys("12345");
		Thread.sleep(3000);
		WebElement six = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/btnLogin"));
		six.click();
		Thread.sleep(5000);
		WebElement seven = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Chat\"]"));
		seven.click();
		Thread.sleep(3000);
		WebElement eight = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout"));
		eight.click();
		Thread.sleep(3000);
		WebElement nine = driver
				.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
		nine.click();
		Thread.sleep(3000);
		WebElement another = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Chat\"]"));
		another.click();
		Thread.sleep(3000);
		WebElement ten = driver
				.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Instant Broadcast\"]"));
		ten.click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/instructionFilterBtn"));
		ele.click();
		Thread.sleep(3000);
		WebElement twe = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
		twe.click();
		Thread.sleep(1000);
		WebElement thi = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Chat\"]"));
		thi.click();
		Thread.sleep(1000);
		WebElement fourt = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"));
		fourt.click();
		Thread.sleep(1000);
		WebElement fift = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		fift.click();
		Thread.sleep(500);
		WebElement sixt = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/inputField"));
		sixt.click();
		Thread.sleep(1000);
		Thread.sleep(100);
		sixt.sendKeys("Hello-1");
		Thread.sleep(600);
		WebElement sevent = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ImageButton"));
		sevent.click();
		Thread.sleep(600);
		WebElement eightt = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/backBtn"));
		eightt.click();
		Thread.sleep(600); //
		WebElement ninet = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/more_option"));
		ninet.click();
		Thread.sleep(600);
		WebElement twent = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/title"));
		twent.click();
		Thread.sleep(600);
		WebElement twent1 = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/search"));
		twent1.click();
		Thread.sleep(1500);
		WebElement twent2 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		twent2.click();
		Thread.sleep(600);
		WebElement twent3 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[2]"));
		twent3.click();
		Thread.sleep(600);
		WebElement twent4 = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/fab"));
		twent4.click();
		Thread.sleep(600);
		WebElement twent5 = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/group_name"));
		twent5.click();
		Thread.sleep(500);
		twent5.sendKeys("Automated group: " + ThreadLocalRandom.current().nextInt(0, 1000));
		Thread.sleep(500);
		WebElement twent6 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView"));
		twent6.click();
		Thread.sleep(3500);
		System.out.println("Test Passed");
		Thread.sleep(1500);
		System.out.println("Exiting Driver now; Good Bye");
		Thread.sleep(1500);
		driver.quit();
	}

	static void logintest() throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "db08637f");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability("appPackage", "com.dsinnovators.ssfcommunication.demo");
		dc.setCapability("appActivity", "com.dsinnovators.ssfcommunication.ui.start.StartActivity");
		dc.setCapability("noReset", true);
		dc.setCapability("automationName", "UiAutomator2");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AppiumDriver driver = new AppiumDriver(url, dc);
		Thread.sleep(3000);
		WebElement five = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/authPass"));
		five.sendKeys("12345");
		Thread.sleep(3000);
		WebElement six = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/btnLogin"));
		six.click();
		Thread.sleep(2500);
		System.out.println("Test Passed");
		Thread.sleep(1500);
		System.out.println("Exiting Driver now; Good Bye");
		Thread.sleep(1500);
		driver.quit();
	}

	static void chattest() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "db08637f");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability("appPackage", "com.dsinnovators.ssfcommunication.demo");
		dc.setCapability("appActivity", "com.dsinnovators.ssfcommunication.ui.start.StartActivity");
		dc.setCapability("noReset", true);
		dc.setCapability("automationName", "UiAutomator2");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AppiumDriver driver = new AppiumDriver(url, dc);
		Thread.sleep(1500);
		WebElement five = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/authPass"));
		five.sendKeys("12345");
		Thread.sleep(3000);
		WebElement six = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/btnLogin"));
		six.click();
		Thread.sleep(2500);
		WebElement thi = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Chat\"]"));
		thi.click();
		Thread.sleep(1500);
		WebElement fourt = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"));
		fourt.click();
		Thread.sleep(1000);
		WebElement fift = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		fift.click();
		Thread.sleep(500);
		System.out.println("Sending a plain text");
		WebElement sixt = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/inputField"));
		sixt.click();
		Thread.sleep(1000);
		sixt.sendKeys("Hello-1");
		Thread.sleep(1500);
		WebElement sevent = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ImageButton"));
		sevent.click();
		Thread.sleep(800);
		System.out.println("Sending plain text successful");
		Thread.sleep(800);
		System.out.println("Sending a link with preview");
		sixt.click();
		Thread.sleep(500);
		sixt.sendKeys("https://youtu.be/u9BQhXf4yQc");
		Thread.sleep(4000);
		sevent.click();
		Thread.sleep(800);
		System.out.println("Sending link with preview successful");
		Thread.sleep(800);
		System.out.println("Sending an image");
		WebElement nine=driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/filepickerPlusBtn"));
		nine.click();
		Thread.sleep(500);
		WebElement ten=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]"));
		ten.click();
		Thread.sleep(500);
		WebElement eleven=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]"));
		eleven.click();
		Thread.sleep(500);
		WebElement twelve=driver.findElement(By.id("android:id/button1"));
		twelve.click();
		Thread.sleep(800);
		System.out.println("Sending image successful");
		Thread.sleep(800);
		System.out.println("Sending a video");
		Thread.sleep(500);
		nine.click();
		Thread.sleep(1000);
		WebElement tent=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]"));
		tent.click();
		Thread.sleep(500);
		WebElement thirteen=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.CompoundButton[2]"));
		thirteen.click();
		Thread.sleep(500);
		WebElement fourteen=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]"));
		fourteen.click();
		Thread.sleep(500);
		WebElement twelvet=driver.findElement(By.id("android:id/button1"));
		twelvet.click();
		Thread.sleep(2000);
		System.out.println("Sending video successful");
		Thread.sleep(800);
		System.out.println("Sending a document");
		Thread.sleep(500);
		nine.click();
		Thread.sleep(1000);
		WebElement fifteen=driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/documentTxt"));
		fifteen.click();
		Thread.sleep(800);
		WebElement sixteen=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.CompoundButton[4]"));
		sixteen.click();
		Thread.sleep(800);
		WebElement seventeen=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
		seventeen.click();
		Thread.sleep(800);
		WebElement eighteen=driver.findElement(By.id("android:id/button1"));
		eighteen.click();
		Thread.sleep(800);
		System.out.println("Sending document successful");
		Thread.sleep(4500);
		WebElement eightt = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/backBtn"));
		eightt.click();
		Thread.sleep(1500);
		System.out.println("Test Passed");
		Thread.sleep(1500);
		System.out.println("Exiting Driver now; Good Bye");
		Thread.sleep(1500);
		driver.quit();
		
	}

	static void groupcreatetest() throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "db08637f");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability("appPackage", "com.dsinnovators.ssfcommunication.demo");
		dc.setCapability("appActivity", "com.dsinnovators.ssfcommunication.ui.start.StartActivity");
		dc.setCapability("noReset", true);
		dc.setCapability("automationName", "UiAutomator2");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AppiumDriver(url, dc);
		Thread.sleep(3000);
		WebElement five = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/authPass"));
		five.sendKeys("12345");
		Thread.sleep(3000);
		WebElement six = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/btnLogin"));
		six.click();
		Thread.sleep(2500);
		WebElement thi = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Chat\"]"));
		thi.click();
		Thread.sleep(1500);
		WebElement ninet = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/more_option"));
		ninet.click();
		Thread.sleep(600);
		WebElement twent = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/title"));
		twent.click();
		Thread.sleep(600);
		WebElement twent1 = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/search"));
		twent1.click();
		Thread.sleep(1500);
		WebElement twent2 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		twent2.click();
		Thread.sleep(600);
		WebElement twent3 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[2]"));
		twent3.click();
		Thread.sleep(600);
		WebElement twent4 = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/fab"));
		twent4.click();
		Thread.sleep(600);
		WebElement twent5 = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/group_name"));
		twent5.click();
		Thread.sleep(500);
		twent5.sendKeys("Automated group: " + ThreadLocalRandom.current().nextInt(0, 1000));
		Thread.sleep(500);
		WebElement twent6 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView"));
		twent6.click();
		Thread.sleep(1500); /////
		WebElement twent55 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		twent55.click();
		Thread.sleep(1200);
		System.out.println("Sending a plain text");
		WebElement sixt = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/inputField"));
		sixt.click();
		Thread.sleep(1000);
		sixt.sendKeys("Hello-1");
		Thread.sleep(1500);
		WebElement sevent = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ImageButton"));
		sevent.click();
		Thread.sleep(800);
		System.out.println("Sending plain text successful");
		Thread.sleep(800);
		System.out.println("Sending a link with preview");
		sixt.click();
		Thread.sleep(500);
		sixt.sendKeys("https://youtu.be/u9BQhXf4yQc");
		Thread.sleep(4000);
		sevent.click();
		Thread.sleep(800);
		System.out.println("Sending link with preview successful");
		Thread.sleep(800);
		System.out.println("Sending an image");
		WebElement nine=driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/filepickerPlusBtn"));
		nine.click();
		Thread.sleep(500);
		WebElement ten=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]"));
		ten.click();
		Thread.sleep(500);
		WebElement eleven=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]"));
		eleven.click();
		Thread.sleep(500);
		WebElement twelve=driver.findElement(By.id("android:id/button1"));
		twelve.click();
		Thread.sleep(800);
		System.out.println("Sending image successful");
		Thread.sleep(800);
		System.out.println("Sending a video");
		Thread.sleep(500);
		nine.click();
		Thread.sleep(1000);
		WebElement tent=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]"));
		tent.click();
		Thread.sleep(500);
		WebElement thirteen=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.CompoundButton[2]"));
		thirteen.click();
		Thread.sleep(500);
		WebElement fourteen=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]"));
		fourteen.click();
		Thread.sleep(500);
		WebElement twelvet=driver.findElement(By.id("android:id/button1"));
		twelvet.click();
		Thread.sleep(2000);
		System.out.println("Sending video successful");
		Thread.sleep(800);
		System.out.println("Sending a document");
		Thread.sleep(500);
		nine.click();
		Thread.sleep(1000);
		WebElement fifteen=driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/documentTxt"));
		fifteen.click();
		Thread.sleep(800);
		WebElement sixteen=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.CompoundButton[4]"));
		sixteen.click();
		Thread.sleep(800);
		WebElement seventeen=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
		seventeen.click();
		Thread.sleep(800);
		WebElement eighteen=driver.findElement(By.id("android:id/button1"));
		eighteen.click();
		Thread.sleep(800);
		System.out.println("Sending document successful");
		Thread.sleep(4500);
		WebElement eightt = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		eightt.click();
		Thread.sleep(700);
		System.out.println("Test Passed");
		Thread.sleep(700);
		System.out.println("Exiting Driver now; Good Bye");
		Thread.sleep(1500);
		driver.quit();
	}

	static void broadcasttest() throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "db08637f");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability("appPackage", "com.dsinnovators.ssfcommunication.demo");
		dc.setCapability("appActivity", "com.dsinnovators.ssfcommunication.ui.start.StartActivity");
		dc.setCapability("noReset", true);
		dc.setCapability("automationName", "UiAutomator2");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AppiumDriver driver = new AppiumDriver(url, dc);
		Thread.sleep(3000);
		WebElement five = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/authPass"));
		five.sendKeys("12345");
		Thread.sleep(3000);
		WebElement six = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/btnLogin"));
		six.click();
		Thread.sleep(500);
		Third.main(null);
		System.out.println("Back to the mobile app");
		Thread.sleep(10000);
		WebElement seven = driver
				.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Group Broadcast\"]"));
		seven.click();
		Thread.sleep(6000);
		WebElement eight = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]"));
		Thread.sleep(1000);
		String nine = eight.getText();
		if (String.valueOf(nine).equalsIgnoreCase(String.valueOf(hello)))
		{
			System.out.println(
					"Instant broadcast catched from browser. Got a match with the original broadcast. Test Passed. Exiting driver in 3 seconds");
			Thread.sleep(3000);
			driver.quit();
		} 
		else 
		{
			System.out.println("Instant broadcast was not retreived. Test Failed. Exiting driver in 3 seconds");
			Thread.sleep(3000);
			driver.quit();
		}

	}
	static void mybroadcasttest() throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "db08637f");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability("appPackage", "com.dsinnovators.ssfcommunication.demo");
		dc.setCapability("appActivity", "com.dsinnovators.ssfcommunication.ui.start.StartActivity");
		dc.setCapability("noReset", true);
		dc.setCapability("automationName", "UiAutomator2");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AppiumDriver driver = new AppiumDriver(url, dc);
		Thread.sleep(3000);
		WebElement five = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/authPass"));
		five.sendKeys("12345");
		Thread.sleep(1000);
		WebElement six = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/btnLogin"));
		six.click();
		Thread.sleep(500);
		System.out.println("Initiating web version to throw a broadcast");
		Fourth.main(null);
		System.out.println("Back to the mobile app");
		Thread.sleep(10000);
		WebElement seven = driver
				.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Group Broadcast\"]"));
		seven.click();
		Thread.sleep(6000);
		WebElement eight = driver
				.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/instructionFilterBtn"));
		eight.click();
		Thread.sleep(800);
		WebElement nine = driver
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
		nine.click();
		Thread.sleep(800);
		WebElement ten = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/messageMD"));
		String eleven = ten.getText();
		if (String.valueOf(eleven).equalsIgnoreCase(String.valueOf(groupbr)))
		{
			System.out.println(
					"My broadcast catched from browser. Got a match with the original broadcast. Test Passed. Exiting driver in 3 seconds");
			Thread.sleep(3000);
			driver.quit();
		} 
		else 
		{
			System.out.println("My broadcast was not retreived. Test Failed. Exiting driver in 3 seconds");
			Thread.sleep(3000);
			driver.quit();
		}

	}
	
	static void dummydatainsertion() throws MalformedURLException, InterruptedException
	{
		String st1= "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		String st2="Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\r\n"
				+ "\r\n"
				+ "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.";
		String st3="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
		String st4="There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.";
		String st5="\"But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?\"";
		String st6="\"At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.\"";
		String st7="\"On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pains.\"";
		String st8="done";
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "db08637f");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability("appPackage", "com.dsinnovators.ssfcommunication.demo");
		dc.setCapability("appActivity", "com.dsinnovators.ssfcommunication.ui.start.StartActivity");
		dc.setCapability("noReset", true);
		dc.setCapability("automationName", "UiAutomator2");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AppiumDriver driver = new AppiumDriver(url, dc);
		Thread.sleep(3000);
		WebElement five = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/authPass"));
		five.sendKeys("12345");
		Thread.sleep(3000);
		WebElement six = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/btnLogin"));
		six.click();
		Thread.sleep(2500);
		WebElement thi = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Chat\"]"));
		thi.click();
		Thread.sleep(1500);
		WebElement fourt = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"));
		fourt.click();
		Thread.sleep(1000);
		WebElement fift = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		fift.click();
		Thread.sleep(500);
		WebElement sixt = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/inputField"));
		sixt.click();
		Thread.sleep(1000);
		sixt.sendKeys(st1);
		Thread.sleep(1500);
		WebElement sevent = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ImageButton"));
		sevent.click();
		Thread.sleep(800);
		sixt.sendKeys(st2);
		Thread.sleep(800);
		sevent.click();
		Thread.sleep(800);
		sixt.sendKeys(st3);
		Thread.sleep(800);
		sevent.click();
		Thread.sleep(800);
		sixt.sendKeys(st4);
		Thread.sleep(800);
		sevent.click();
		Thread.sleep(800);
		sixt.sendKeys(st5);
		Thread.sleep(800);
		sevent.click();
		Thread.sleep(800);
		sixt.sendKeys(st6);
		Thread.sleep(800);
		sevent.click();
		Thread.sleep(800);
		sixt.sendKeys(st7);
		Thread.sleep(800);
		sevent.click();
		Thread.sleep(800);
		sixt.sendKeys(st8);
		Thread.sleep(800);
		sevent.click();
		Thread.sleep(1000);
		WebElement eightt = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/backBtn"));
		eightt.click();
		Thread.sleep(1500);
		System.out.println("Dummy data inserted from lipsum.com");
		Thread.sleep(1500);
		System.out.println("Exiting Driver now.");
		Thread.sleep(1500);
		driver.quit();
	}
	static void passchange() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "db08637f");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability("appPackage", "com.dsinnovators.ssfcommunication.demo");
		dc.setCapability("appActivity", "com.dsinnovators.ssfcommunication.ui.start.StartActivity");
		dc.setCapability("noReset", true);
		dc.setCapability("automationName", "UiAutomator2");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AppiumDriver driver = new AppiumDriver(url, dc);
		Thread.sleep(3000);
		WebElement five = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/authPass"));
		five.sendKeys("12345");
		Thread.sleep(3000);
		WebElement six = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/btnLogin"));
		six.click();
		Thread.sleep(2500);
		WebElement seven = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
		seven.click();
		Thread.sleep(500);
		WebElement eight = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/placeholder3"));
		eight.click();
		Thread.sleep(500);
		WebElement nine = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/changePass"));
		nine.click();
		Thread.sleep(500);
		WebElement ten = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/edtPassword"));
		ten.sendKeys("12345");
		Thread.sleep(1000);
		WebElement eleven = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/btnNext"));
		eleven.click();
		Thread.sleep(2500);
		WebElement twelve = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/edtNewPassword"));
		twelve.sendKeys("12345");
		Thread.sleep(500);
		WebElement thirteen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.EditText"));
		thirteen.sendKeys("12345");
		Thread.sleep(400);
		WebElement fourteen = driver.findElement(By.id("com.dsinnovators.ssfcommunication.demo:id/btnPassChange"));
		fourteen.click();
		Thread.sleep(2500);
		System.out.println("Password change done, New password is: 12345 . Going back to homepage");
		Thread.sleep(500);
		WebElement fifteen = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		fifteen.click();
		Thread.sleep(2000);
		System.out.println("Test Passed");
		Thread.sleep(700);
		System.out.println("Exiting Driver now.");
		Thread.sleep(1500);
		driver.quit();
	}
}