package test10;

import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tempo extends Calculator
{     
    public static void main(String[] args) throws InterruptedException, MalformedURLException
    {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
	    driver.get("http://clm.seliselocal.com/login");
	    driver.manage().window().maximize();
	    WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.elementToBeClickable(By.id("mat-input-0")));
	    firstResult.click();
	    driver.findElement(By.id("mat-input-0")).sendKeys("automateProjectManager@yopmail.com");
	    driver.findElement(By.id("mat-select-value-1")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#mat-option-0 > .mat-option-text")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector(".submit-button")).submit();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("CLMTestPass2023");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".mat-raised-button")).click();
	    WebElement secondResult = new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".nav-item:nth-child(5) .nav-link-title")));
	    Thread.sleep(2000);
	    secondResult.click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".pb-24:nth-child(2) .no-img-card")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".add-button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("SiteName")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("SiteName")).sendKeys("nainee");
	    Thread.sleep(1000);
	    driver.findElement(By.id("google-autoComplete")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("google-autoComplete")).sendKeys("Dhaka");
	    Thread.sleep(1000);
	    driver.findElements(By.cssSelector(".pac-item")).get(0).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("StreetName")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("StreetName")).sendKeys("Test street");
	    Thread.sleep(1000);
	    driver.findElement(By.id("StreetNo")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("StreetNo")).sendKeys("10");
	    Thread.sleep(1000);
	    driver.findElement(By.id("Zip")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("Zip")).sendKeys("1206");
	    Thread.sleep(1000);
	    driver.findElement(By.id("ContactPersonName")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("ContactPersonName")).sendKeys("Test Name");
	    Thread.sleep(1000);
	    driver.findElement(By.id("ContactPersonEmail")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("ContactPersonEmail")).sendKeys("Test@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("ContactPersonPhone")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("ContactPersonPhone")).sendKeys("01478963214");
	    Thread.sleep(1000);
	    driver.findElement(By.id("mat-input-13")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(4) > .mat-calendar-body-cell-container:nth-child(1) .mat-calendar-body-cell-content")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("mat-input-14")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"mat-datepicker-2\"]/mat-calendar-header/div/div/button[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"mat-datepicker-2\"]/div/mat-multi-year-view/table/tbody/tr[6]/td[3]/button/div[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"mat-datepicker-2\"]/div/mat-year-view/table/tbody/tr[2]/td[4]/button/div[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"mat-datepicker-2\"]/div/mat-month-view/table/tbody/tr[4]/td[2]/button/div[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/span[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"container-3\"]/content/app-projects/div/app-projects-sites-form/div/div[2]/form/div/button[2]/span[1]")).click();
	    Thread.sleep(500);
	}
}