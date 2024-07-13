package mypack.assessment1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChromeNew {
	WebDriver driver;
	@Parameters("browser")
	// Test to select Browser
	public void selectBrower(String browser) {
		// if browser is Chrome
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Applications\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        driver = new ChromeDriver(options);
        } else {
            System.out.println("Unsupported browser. Please choose 'chrome' or 'firefox'.");
            System.exit(0);
        }
		driver.get("https://www.coursera.org/");	
	}
	@Test(priority=0)
	// Test to maximize window
	public void maxScreen() {
		driver.manage().window().maximize();
		driver.quit();	
	}
	@Test(priority=1)
	public void testSearch() throws InterruptedException {
		driver.manage().window().maximize();
		//Finding search box using xpath
		WebElement ser=driver.findElement(By.xpath("//input[@placeholder='What do you want to learn?']"));
		//Seraching selenium courses in searchbox
        ser.sendKeys("Search for a Course");
		WebElement btn = driver.findElement(By.xpath("//button[@class='nostyle search-button']//div[@class='magnifier-wrapper']"));
		btn.click();        
        driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "D:\\Applications\\chromedriver-win64\\chromedriver.exe");

        // Create ChromeOptions object to maximize window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);       
        driver.get("https://www.coursera.org");
        WebElement loginLink = driver.findElement(By.id("email"));
        loginLink.isDisplayed();
        loginLink.isEnabled();
        loginLink.sendKeys("example@email.com");
        WebElement password = driver.findElement(By.id("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("password");
        WebElement button = driver.findElement(By.id("recaptcha-login-redesign"));
        button.isDisplayed();
        button.isEnabled();
        button.click();
        driver.quit();
        ChromeNew obj= new ChromeNew();
        obj.selectBrower(null);
        obj.maxScreen();
        obj.testSearch();
    }
}
