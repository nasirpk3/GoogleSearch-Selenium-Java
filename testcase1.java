import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anonymous\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		String baseurl = "https://www.google.com";
		String ExpectedUrl = "https://www.selenium.dev/";
		String ActualUrl = "";
		
		Driver.get(baseurl);
	    
		Driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
		
		//Driver.findElement(By.xpath("(//input[@value='Google Search']")).sendKeys("Selenium");
		//WebElement element = Driver.findElement(By.xpath("(//input[@value='Google Search']"));
		//element.sendKeys(Keys.RETURN);
		
		Driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a")).click();
		ActualUrl = Driver.getCurrentUrl();
	
	    if(ActualUrl.contentEquals(ExpectedUrl))
	    {
	    	System.out.println("Test Passed");
	    }
	    else
	    {
	    	System.out.println("Test Failed");
	    }
	    
	   Driver.close();

	}

}
