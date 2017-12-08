import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	@FindBy(xpath = ".//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")
	public static WebElement email;

	// username
	@FindBy(id = ("identifierId"))
	public static WebElement user;
	// click next
	@FindBy(className = ("CwaK9"))
	public static WebElement press;
	// sendkeys 2
	@FindBy(xpath = (".//*[@id='password']/div[1]/div/div[1]/input"))
	public static WebElement sendb;
	// click2
	@FindBy(className = ("CwaK9"))
	public static WebElement click2;
	// actualerror
	@FindBy(xpath = (".//div[@class='dEOOab RxsGPe'][1]"))
	public static WebElement actualerr;
	// expected
	@FindBy(xpath = (".//*[@class='dEOOab RxsGPe']"))
	public static WebElement expected;

	public void OpenBrowse() {
		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);
	}

	public void OpenGmail() {

		driver.get("https://www.google.com/gmail/about/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void CloseBrowse() {
		driver.quit();

	}

	public void EnterEmail(String a) throws InterruptedException {
		// driver.findElement(By.xpath(".//a[@class='gmail-nav__nav-link
		// gmail-nav__nav-link__sign-in']")).click();
		email.click();
		// driver.findElement(By.id("identifierId")).sendKeys(a);
		user.sendKeys(a);
		// driver.findElement(By.className("CwaK9")).click();
		press.click();
		Thread.sleep(4000);

	}

	public void EnterPassword(String b) throws InterruptedException {

		// driver.findElement(By.xpath(".//input[@type='password'
		// and@aria-label='Enter your password']")).sendKeys(b);
		sendb.sendKeys(b);
		// driver.findElement(By.className("CwaK9")).click();

		click2.click();
		Thread.sleep(2000);

	}

	public String ReadEmailError() throws InterruptedException {
		String ActualError = actualerr.getText();// driver.findElement(By.xpath(".//div[@class='dEOOab
													// RxsGPe'][1]")).getText();
		System.out.println(ActualError);
		Thread.sleep(2000);
		return ActualError;

	}

	public String ReadPasswordError() throws InterruptedException {
		String ActualError = expected.getText();// driver.findElement(By.xpath(".//*[@class='dEOOab
												// RxsGPe']")).getText();
		System.out.println(ActualError);
		Thread.sleep(2000);
		return ActualError;

	}

}
