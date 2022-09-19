package version3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException  {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https:/www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement em = driver.findElement(By.id("email"));
		WebElement ed = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		WebElement es = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		
		em.sendKeys("Sanju");
		ed.sendKeys("123458");
		
//		File w = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File s = new File("C:\\Users\\Admin\\Desktop\\New folder\\Fb.jpg");
//		FileHandler.copy(w, new File("C:\\Users\\Admin\\Desktop\\New folder\\Fb.jpg"));
		

		
		takeSreenshot(em, "Email");
		takeSreenshot(ed, "Password");
		takeSreenshot(es, "Login Button");
		driver.quit();
		
	}
	
	public static void takeSreenshot(WebElement element, String Filename) throws IOException {
		File sc = element.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\Admin\\Desktop\\New folder\\"+ Filename +".jpg");
		FileHandler.copy(sc, dst);
	
	}

}
