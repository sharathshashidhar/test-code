package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitDemo {

	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "C:\\P4\\UTF\\UTF\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");

		// maximized the browser window

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("Email"));



		// entering username

		username.sendKeys("asdf@gmail.com");

		driver.findElement(By.id("next")).click();

		// entering password

		driver.findElement(By.id("Passwd")).sendKeys("password");



		// clicking signin button

		driver.findElement(By.id("signIn")).click();



		// explicit wait - to wait for the compose button to be click-able

		WebDriverWait wait = new WebDriverWait(driver,30);



		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

		// click on the compose button as soon as the "compose" button is visible

		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		System.out.println("Done");
		
		try {Thread.sleep(20000);} catch (InterruptedException e) {e.printStackTrace();}
		
		driver.close();
		driver.quit();
	}

	
	
}
