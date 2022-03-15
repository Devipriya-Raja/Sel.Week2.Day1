package week2.day2.assignments;


	
	
	
import java.time.Duration;
	import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class DeleteLead {
		

			public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			String userName = "Demosalesmanager";
			String pwd ="crmsfa";
			String url ="http://leaftaps.com/opentaps/control/login";
			
			driver.get(url);
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			
			driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			
			
			driver.findElement(By.linkText("Leads")).click();
			
			
			
			
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			
			
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1");
			
			
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			boolean staleElement = true; 

			while(staleElement){

			  try{

				  WebElement firstLead =driver.findElement(By.xpath("(//div[text()='Lead ID']//following::a[@class='linktext'])[1]"));
				  String firstLeadId= firstLead.getText();
				  firstLead.click();
				  
			     staleElement = false;
			/*FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(5))
			.pollingEvery(Duration.ofSeconds(2))
			.ignoring(StaleElementReferenceException.class);
			
			 
			WebElement firstLead= wait.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver driver ) {
					
				return driver.findElement(By.xpath("(//div[text()='Lead ID']//following::a[@class='linktext'])[1]"));
			}
			});*/
			
			driver.findElement(By.xpath("//a[text()='Delete']")).click();
			
					
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			
			
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLeadId);
			
		
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			//Verify message "No records to display" in the Lead List. 
			String errMsg= driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
			System.out.println(errMsg);
			
			List<WebElement> errmsgElements = driver.findElements(By.xpath("//div[@class='x-paging-info']"));
			if(errmsgElements.size()>0)System.out.println("I confirm that "+firstLeadId+"is deleted");
			else System.out.println("Deletion of id "+firstLeadId+"is not successful");
			
			if(errMsg.contains("No records")) System.out.println("I confirm that "+firstLeadId+"is deleted");
			else System.out.println("Deletion of id "+firstLeadId+"is not successful");
			
			 for (int i=0;i<errmsgElements.size();i++) {
			System.out.println(errmsgElements.get(i).getText());}
			
			
			
			
			} catch(StaleElementReferenceException e){

			    staleElement = true;

			  }

		}
			driver.close();
			}
	}

	
