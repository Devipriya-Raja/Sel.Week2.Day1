package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement elementCreate = driver.findElement(By.xpath("//form/div/a[text()='Create New Account']"));
		elementCreate.click();
		WebElement elementFirstName = driver.findElement(By.xpath("//div/input[@name='firstname']"));
		elementFirstName.sendKeys("Devi");
		WebElement elementLastName = driver.findElement(By.xpath("//div/input[@name='lastname']"));
		elementLastName.sendKeys("Priya");
		WebElement elementEmail = driver.findElement(By.xpath("//div/input[@name='reg_email__']"));
		elementEmail.sendKeys("devi12anbu@gmail.com");
		WebElement elementEmailReg = driver.findElement(By.xpath("//div/input[@name='reg_email_confirmation__']"));
		elementEmailReg.sendKeys("devi12anbu@gmail.com");
		WebElement elementPassword = driver.findElement(By.xpath("//div/input[@id='password_step_input']"));
		elementPassword.sendKeys("D1234567890");
		WebElement elementBday = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(elementBday);
		day.selectByValue("7");
		WebElement elementBmonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(elementBmonth);
		month.selectByVisibleText("Feb");
		WebElement elementByear = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(elementByear);
		year.selectByIndex(22);
		WebElement elementGender = driver.findElement(By.xpath("//span/label[text()='Female']"));
		elementGender.click();
		
		
		
		
		
	}

}
