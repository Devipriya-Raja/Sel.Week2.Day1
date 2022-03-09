package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractswithButtons {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement elementClickToHomePage = driver.findElement(By.xpath("//div/button[text()='Go to Home Page']"));
		elementClickToHomePage.click();
		driver.navigate().back();
		WebElement elementFindPosition = driver.findElement(By.xpath("//button[@id='position']"));
	    Point positionofButton = elementFindPosition.getLocation();
	    System.out.println(positionofButton);
		WebElement elementFindColour = driver.findElement(By.xpath("//button[@id='color']"));
		String colourofButton = elementFindColour.getCssValue("background-color");
		System.out.println(colourofButton);
		WebElement elementFindSize = driver.findElement(By.xpath("//button[@id='size']"));
		Dimension sizeofButton = elementFindSize.getSize();
		System.out.println(sizeofButton);
		
	}

}
