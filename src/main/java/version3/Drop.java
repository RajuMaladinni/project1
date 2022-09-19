package version3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop {

	public static void main(String[] args) throws InterruptedException   {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https:/www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//WebElement rr = driver.findElement(By.className("gLFyf"));
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("selenium");
		//rr.sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> m = driver.findElements(By.xpath("//ul//div[@class=\"wM6W7d\"]"));
		System.out.println(m.size());
		for(int i=0; i<=m.size(); i++) {
			System.out.println(m.get(i).getText());
			if(m.get(i).getText().equalsIgnoreCase("selenium grid")) {
				m.get(i).click();
			}
			
		}
			
		
	}
	
	
	}


