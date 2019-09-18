package seleniumWebDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//1Lunch Google Chrome browser, you need 2 steps;
			// step 1 is to set system property to the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Be Job Ready\\eclipse-workspace\\software\\chromedriver.exe");
		
		//Step 2 is to create a driver object / instance of a driver
		
		WebDriver driver = new ChromeDriver();
		
		//2"Type https://login.yahoo.com/m?.intl=uk into the address bar and enter"
		
		//use the driver instance to open the url
				driver.get("https://login.yahoo.com/m?.intl=uk");
				driver.manage().window().maximize();
		//3 Enter username or email address and click next
				// find the webelement to interact with
		driver.findElement(By.name("username")).sendKeys("training.selenium@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		//Enter password and click sign in
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("1Testingelearn#");
		driver.findElement(By.id("login-signin")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("uh-mail-link")).click();
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File scs = sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scs, new File("./Screenshots/yahooInbox.png"));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String proof = driver.findElement(By.xpath("//*[@id=\"ybar\"]/div[3]/div[1]/div/label/span")).getText();
		System.out.println("The test ran and the username of the yahoo mail is " + proof);
		
		//close browser
		driver.close();
	}

}
