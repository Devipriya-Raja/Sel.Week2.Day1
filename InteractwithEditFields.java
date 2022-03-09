package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithEditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/Edit.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			
			WebElement elementEmail = driver.findElement(By.xpath("//input[@id='email']"));
			elementEmail.sendKeys("devi12anbu@gmail.com");
			
			WebElement elementAppend = driver.findElement(By.xpath("//input[@value='Append ']"));
			elementAppend.sendKeys(Keys.END);
			elementAppend.sendKeys("Done");
			
			WebElement elementEnterDefaultText = driver.findElement(By.xpath("//input[@name='username']"));
			String defaultText = elementEnterDefaultText.getAttribute("value");
			System.out.println(defaultText);
			elementEnterDefaultText.clear();
			elementEnterDefaultText.sendKeys(defaultText);
			
			WebElement elementClearMe = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
			elementClearMe.clear();
			
			
			WebElement elementisDisabled = driver.findElement(By.xpath("//input[@disabled='true']"));
			boolean enabled = elementisDisabled.isEnabled();
			if (enabled == false)
				System.out.println("The button is disabled");
			
			
			
			
	}

}
