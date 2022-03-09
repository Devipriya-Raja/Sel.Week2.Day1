
package week2.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.get("http://leafground.com/pages/Link.html");
		WebElement elementtoHomePage = driver.findElement(By.xpath("(//a[text() = 'Go to Home Page'])[1]"));
		elementtoHomePage.click();
		driver.navigate().back();
		WebElement elementFindURL = driver.findElement(By.xpath("//a[text() = 'Find where am supposed to go without clicking me?']"));
		String findURLWithoutClick = elementFindURL.getAttribute("href");
		System.out.println(findURLWithoutClick);
		WebElement elementFindBroken = driver.findElement(By.xpath("//a[text() = 'Verify am I broken?']"));
		elementFindBroken.click();
		String currentURL = driver.getCurrentUrl();
		if(currentURL.contains("error")) {
			System.out.println("Yes .... Its a broken Page");
			driver.navigate().back();
			WebElement elementtoHomePage2 = driver.findElement(By.xpath("(//a[text() = 'Go to Home Page'])[2]"));
			elementtoHomePage2.click();
			driver.navigate().back();
			List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		      System.out.println("The number of links is " + totalLinks.size());
		      for(int i=0;i<totalLinks.size();i++){
		    	  System.out.println(i +" : "+ totalLinks.get(i).getText());
		    	  System.out.println(i +" : "+ totalLinks.get(i).getAttribute("href"));
		    	  }
		      driver.close();

}
	}
}
