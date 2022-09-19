package version3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		WebElement ele = driver.findElement(By.xpath("//a[@title=\"Facebook\"]"));
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		
//		jse.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(7000);
//		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
//		jse.executeScript("scroll(0,1000)");
//		jse.executeScript("scroll(1000,0)");
		
		jse.executeScript("arguments[0].scrollIntoView()",ele);
	}

}
