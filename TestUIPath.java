package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUIPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://acme-test.uipath.com/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com"); 
			driver.findElement(By.name("password")).sendKeys("leaf@12"); 
			driver.findElement(By.xpath("//button[@class= 'btn btn-primary']")).click();
			String pageTitle = driver.getTitle();
			System.out.println("The title of the page is "+pageTitle);
			driver.findElement(By.xpath("//a[text()= 'Log Out']")).click();
			driver.close();
	}

}
