/**
 * 
 */
package seleniumWebDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Caroline
 *
 */
public class ArgosAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",  "C:\\Users\\Caroline\\eclipse-workspace\\Software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://www.argos.co.uk/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/a")).click();
		//click shop
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[2]/div/nav/ul/li[3]/a/span/span")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//select technology
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[2]/div/nav/ul/li[3]/ul/li[1]/ul/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//select Mobile Phones and accessories
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[4]/div[1]/div[1]/ul/li[1]/a/span")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Select sim free phones
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[4]/div[1]/div[1]/ul/li[1]/a/span")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Click Apple
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div/div/ul/li[1]/label")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//select any apple device of your choice 
		driver.findElement(By.cssSelector("div.ac-product-card:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//add to basket
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div[2]/section[2]/section/div[5]/div[2]/button/span/span")).click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		//write a code to take the screenshot
		TakesScreenshot sc = ((TakesScreenshot)driver);
			File scs = sc.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scs, new File("./Screenshots/argosApplePhone.png"));

						
			//close browser
			//driver.close();
			
			
	}

}
