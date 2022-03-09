package week2.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractswithCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				WebDriverManager.chromedriver().setup(); 
				ChromeDriver driver=new ChromeDriver(); 
				driver.get("http://leafground.com/pages/checkbox.html");
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//Select the languages that you know?
				driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input")).click();
				System.out.println("Java is selected");
				//Confirm Selenium is checked
				boolean selected = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input")).isSelected();
				System.out.println("Is selected ?: " + selected);
				//DeSelect only checked
				boolean NotSelectedCheckbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input")).isSelected();
				System.out.println("Not Selected Checkbox Is selected ?: "+ NotSelectedCheckbox);
				WebElement IamSelected = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
				boolean selected2 = IamSelected.isSelected();
				System.out.println("I am Selected checkbox Is selected ? : "+selected2);
				if(selected2==true) {
					IamSelected.click();
					selected2 = IamSelected.isSelected();
					System.out.println("I am Selected checkbox Is selected ? : "+selected2);
				}
				

				
				
				List<WebElement> allCheck = driver.findElements(By.xpath("//*[@id='contentblock']/section/div[4]/div"));
				int lenList = allCheck.size();
				System.out.println(lenList);
				
				for (int i = 1; i <=lenList  ; i++) {
					driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/div["+i+"]/input")).click();
				}
				System.out.println("Checked box completed");
				//driver.close();
				
			}

	}


