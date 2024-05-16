package automationfirst;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;

public class RailshebaLoginTest {

	public static void main(String[] args) {
		
		//Driver Initialization
		
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver();
				
				//window & Link
				
				driver.get("https://eticket.railway.gov.bd/login");
				driver.manage().window().maximize();
				
				//automate railway login

				driver.findElement(By.id("mobile_number")).sendKeys("01709165956");
				driver.findElement(By.id("password")).sendKeys("*railway808#");
				driver.findElement(By.className("login-form-submit-btn")).click();
	}

}
