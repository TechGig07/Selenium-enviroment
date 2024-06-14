import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver-win64/chromedriver.exe");
	
	        
	        try {
	            // Navigate to Salesforce login page
	            driver.get("https://login.salesforce.com/");
	            
	            // Find elements and perform actions
	            WebElement username = driver.findElement(By.id("username"));
	            WebElement password = driver.findElement(By.id("password"));
	            WebElement loginButton = driver.findElement(By.id("Login"));
	            
	            // Enter credentials
	            username.sendKeys("gopal.salesforcedeveloper@gmail.com"); 
	            password.sendKeys("Patil@11"); 
	            // Click login button
	            loginButton.click();
	            driver.getTitle();
	           System.out.println(driver.getTitle());
	            // Add a simple check (example: checking the page title)
	            String expectedTitle = "Lightning Experience";
	            String actualTitle = driver.getTitle();
	            
	            if (expectedTitle.equals(actualTitle)) {
	                System.out.println("Login test passed.");
	            } else {
	                System.out.println("Login test failed.");
	            }
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}	


