package sel.seltest;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App {
	
	@Test
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.setProperty("webdriver.chrome.driver", "//usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		
		
		chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("http://localhost:3001");
        
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.name("login")).sendKeys("edureka");
		driver.findElement(By.name("password")).sendKeys("edureka");
		driver.findElement(By.name("click")).click();
		driver.quit();
		
	}

}
