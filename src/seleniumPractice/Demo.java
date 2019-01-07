package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "./exeFiles/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement RingDrpDwn = driver.findElement(By.xpath("//a[text()='Rings ']"));
		WebElement DiamondRingClk = driver.findElement(By.xpath("//div[text()='Popular Ring Types ']/..//a[text()='Diamond']"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act = new Actions(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		act.moveToElement(RingDrpDwn).perform();
		act.click(DiamondRingClk).perform();
	}

}



