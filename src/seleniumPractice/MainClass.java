package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class MainClass extends BaseLib{

//	WebDriver driver = BaseLib.driver;
	public void MainClass()
		{
			this.driver = BaseLib.driver;
		}
		@Test
		public void test()               //          //ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']
		 {
			  //String main = "//div[@id='block_top_menu']";
 				String main ="//a[@class='sf-with-ul' and (@title='Women' or @title='Dresses')]|(//a[contains(text(),'T-shirts')])[2]";
			 // String main = "//a[@class='sf-with-ul']";
				List<WebElement> target = driver.findElements(By.xpath(main));
				System.out.println(target.size());
				for(int i=0;i<target.size();i++)
				{
					WebElement singleTarget = target.get(i);
					Actions act = new Actions(driver);
					act.moveToElement(singleTarget).perform();
					System.out.println(singleTarget.getText());
					List<WebElement> innerList = driver.findElements(By.xpath("//ul[contains(@class,'submenu-container clearfix first-in-line-xs')]"));
					System.out.println(innerList.size());
					for(int j=0;j<innerList.size();j++)
						{
							WebElement subList = innerList.get(j);
							System.out.println(subList.getText());
						}System.out.println("-------------------------------"); 
		
				}
		 }
}
