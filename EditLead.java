package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				WebElement elementUsername = driver.findElement(By.id("username"));
				elementUsername.sendKeys("Demosalesmanager");
				WebElement elementPassword = driver.findElement(By.id("password"));
				elementPassword.sendKeys("crmsfa");
				WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
				elementLogin.click();
				WebElement elementCrmlink = driver.findElement(By.linkText("CRM/SFA"));
				elementCrmlink.click();
				WebElement elementLeadsTab = driver.findElement(By.linkText("Leads"));
				elementLeadsTab.click();
				WebElement elementMyLeadsTab = driver.findElement(By.linkText("My Leads"));
				elementMyLeadsTab.click();
				WebElement elementCreateLeadsTab = driver.findElement(By.linkText("Create Lead"));
				elementCreateLeadsTab.click();
				WebElement elementCompany = driver.findElement(By.id("createLeadForm_companyName"));
				elementCompany.sendKeys("Hexa Tech");
				WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
				elementFirstName.sendKeys("DEVIPRIYA");
				WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
				elementLastName.sendKeys("RAJA");
				WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
				elementFirstNameLocal.sendKeys("DEVIPRIYAR");
				WebElement elementDepartment = driver.findElement(By.name("departmentName"));
				elementDepartment.sendKeys("Electronics Marketing");
				WebElement elementDescription = driver.findElement(By.name("description"));
				elementDescription.sendKeys("Electronics Products Fast Selling Techniques");
				WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
				elementEmail.sendKeys("devi12anbu@gmail.com");
				
				WebElement elementStateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select state = new Select(elementStateDropdown);
				state.selectByVisibleText("New York");
				
				WebElement elementSubmitLeadsTab = driver.findElement(By.name("submitButton"));
				elementSubmitLeadsTab.click();
				
				WebElement elementEditButton = driver.findElement(By.linkText("Edit"));
				elementEditButton.click();
				
				WebElement elementEditDescription = driver.findElement(By.id("updateLeadForm_description"));
				elementEditDescription.clear();
				
				WebElement elementImpNote = driver.findElement(By.id("updateLeadForm_importantNote"));
				elementImpNote.sendKeys("Editing Lead Info");
				WebElement elementUpdateButton = driver.findElement(By.name("submitButton"));
				elementUpdateButton.click();

				System.out.println("The Title is "+ driver.getTitle());
}
	}



