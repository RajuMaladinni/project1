package version3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autotest1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		 driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("iphone 11 Pro"+Keys.ENTER);
		 Thread.sleep(3000);
//		List<WebElement> ele = driver.findElements(By.xpath("//a[@class=\"_3izBDY\"]"));
//		 
//		System.out.println(ele.size());
//		for(int i=0; i<ele.size();i++) {
//			System.out.println(ele.get(i).getText());
//			if(ele.get(i).getText().equals("iphone 11 pro")) {
//				ele.get(i).click();
//			}
//		}
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
		Thread.sleep(2000);
		e.click();
//		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
//		w.until(ExpectedConditions.visibilityOf(e));
		Thread.sleep(2000);
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		WebElement src = driver.findElement(By.xpath("//label[@for=\"BUY_WITH_EXCHANGE\"]"));
		File ss = src.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss,new File("C:\\Users\\Admin\\Desktop\\New folder\\New folder\\iphone.png"));
		Thread.sleep(3000);
		WebElement apple = driver.findElement(By.xpath("//div[@class=\"_1bEAQy _2iN8uD _312yBx\"]"));
		Thread.sleep(2000);
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",apple);
		
	}
}
