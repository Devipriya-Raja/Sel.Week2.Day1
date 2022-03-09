package week2.day2.assignments;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractswithListBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select drop1 = new Select(dropDown1);
		String firstSelect = drop1.getFirstSelectedOption().getText();
		System.out.println(firstSelect);
        drop1.selectByIndex(1);
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		//dropDown2.sendKeys("Selenium");
		Select drop2= new Select(dropDown2);
		drop2.selectByVisibleText("Appium");
		
		WebElement dropDown3 = driver.findElement(By.name("dropdown3"));
		Select drop3 = new Select(dropDown3);
		drop3.selectByValue("3");
		
		WebElement dropDown4 = driver.findElement(By.className("dropdown"));
		Select drop4 = new Select(dropDown4);
		List<WebElement> options = drop4.getOptions();
		System.out.println(options.size());
		
		WebElement dropDown5 =driver.findElement(By.xpath("(//div[@class='example'])[5]/select"));
		dropDown5.sendKeys("UFT/QTP");
		//Listbox selection using Select class
		WebElement Listbox = driver.findElement(By.xpath("//div[@class = 'example'][6]/select"));
		Select Listdrop = new Select(Listbox);
		Listdrop.selectByValue("2");
		Listdrop.selectByValue("4");
		Listdrop.deselectAll();
		Listdrop.selectByIndex(1);
		System.out.println("Drop down Assignment completed");
		//driver.close();
		
		
	}
	}


