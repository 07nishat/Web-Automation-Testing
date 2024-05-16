package automationfirst;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TitleAndUrL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Driver Initialization
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//window & Link
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		
		//Verify Title
		
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		//System.out.println(ActualTitle);
		
		//If Else check
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Title match");
		}
		else {
			System.out.println("Not Match");
		}
		
		//verify title Using Assertion
		
		Assert.assertEquals(ActualTitle, ExpectedTitle,"Condition True" );
		
		
		
		
		//Verify URL
		
				String ExpectedUrl = "https://www.saucedemo.com/";
				String ActualUrl = driver.getCurrentUrl();
				//System.out.println(ActualUrl);
				
				//If Else check
				
				if(ActualUrl.equals(ExpectedUrl)) {
					System.out.println("URL match");
				}
				else {
					System.out.println("URL Not Match");
				}
				
				//verify URL Using Assertion
				Assert.assertEquals(ActualUrl, ExpectedUrl,"Condition True" );
				
				
	}

}
