package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("//label[contains(text(),'home')]/following-sibling::img")).click();
		if(driver.getTitle().contains("TestLeaf - Selenium Playground")) { System.out.println("Page navigated to Home page");
		driver.navigate().back();
		}
		
		WebElement brokenImage = driver.findElement(By.xpath("//label[contains(text(),'Broken')]/following-sibling::img"));
		if (brokenImage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println(brokenImage.getAttribute("outerHTML") + " is broken.");
		     
		}
		

	  
	  /* driver.findElement(By.xpath("//label[contains(text(),'Keyboard')]/following-sibling::img")).sendKeys(Keys.ENTER);
	  if(driver.getTitle().contains("TestLeaf - Selenium Playground")) { System.out.println("Page navigated to Home page");
		driver.navigate().back();
		}*/
	  
	  WebElement lastLink= driver.findElement(By.xpath("//label[contains(text(),'Keyboard')]/following-sibling::img"));
	  Actions action = new Actions(driver);
	  action.moveToElement(lastLink).click().build().perform();
	  
	  if(driver.getTitle().contains("TestLeaf - Selenium Playground")) { System.out.println("Page navigated to Home page");
	  
		driver.navigate().back();
		}
	else {System.out.println("Page not navigated");}
	
	}
	}


