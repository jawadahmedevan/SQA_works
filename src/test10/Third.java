package test10;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third extends Calculator
{     
    public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://ssfdemo.innovatorslab.net/app/login");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 5000)");
		driver.findElement(By.name("app_username")).click();
		driver.findElement(By.name("app_username")).sendKeys("100");
		driver.findElement(By.name("app_password")).click();
		driver.findElement(By.name("app_password")).sendKeys("12345");
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.linkText("Groups")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[3]/button")).click();
		Thread.sleep(550);
		driver.findElement(By.cssSelector(".customSelectInputFieldDefault")).click();
		Thread.sleep(600);
		driver.findElement(By.cssSelector(".customSelectDropdownItem:nth-child(2)")).click();
		Thread.sleep(600);
		driver.findElement(By.cssSelector(".instructionTextAreaBackground")).click();
		Thread.sleep(600);
		driver.findElement(By.cssSelector(".instructionTextAreaBackground")).sendKeys(Float.toString(hello));
		Thread.sleep(600);
		driver.findElement(By.cssSelector(".submitBtn")).click();
		Thread.sleep(600);
		driver.findElement(By.cssSelector(".modalDashboardOkBtn")).click();
		Thread.sleep(900);
		driver.close();
	}
}