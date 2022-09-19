package version3;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pratices1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disbale-notifictions");
	WebDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in/");
//	Dimension d1 = driver.manage().window().getSize();
//	System.out.println(d1.height);
//	System.out.println(d1.width);
	
	
	
	Dimension d = new Dimension(900,500);
	driver.manage().window().setSize(d);
//	System.out.println(driver.manage().window().getSize().height);
//	System.out.println(driver.manage().window().getSize().width);
	
//	Point p = new Point(100,100);
//	driver.manage().window().setPosition(p);
	
	Point p = driver.manage().window().getPosition();
	System.out.println(p.getX());
	System.out.println(p.getY());
	
	
	
	
	
	
	
	
//	WebElement w = driver.findElement(By.id("twotabsearchtextbox"));
//	w.sendKeys("iphone");
//	
//	 File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	 File d = new File("C:\\Users\\Admin\\Desktop\\New folder\\amz.jpg");
//	 FileHandler.copy(s, d);
	 
//	File src = w.getScreenshotAs(OutputType.FILE);
//	FileHandler.copy(src, new File("C:\\Users\\Admin\\Desktop\\New folder\\fb.png"));
	
	
	 
//	WebDriverWait m=new WebDriverWait(driver,3);
//	m.until(ExpectedConditions.visibilityOf(w));
//
//	 for(int i=0; i<3; i++) {
//		 w.sendKeys(Keys.ARROW_DOWN);
//		 
//	 }
//	w.sendKeys(Keys.ENTER);
//	

	
	
	}

}
