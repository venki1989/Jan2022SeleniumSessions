package seleniumsessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getWindowHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentWindow =driver.getWindowHandle();
		List<WebElement> linkList=driver.findElements(By.xpath("//div[@id='social-icons']/a"));
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext())
		{
			String element =it.next();
		   driver.switchTo().window(element);
		   System.out.println(driver.getTitle());
		}
        		

	}

}
