
import static org.junit.Assert.*;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {
	WebDriver driver;
	LoginPage ob = new LoginPage();
	DataFile op = new DataFile();

	@Before
	public void setUpBeforeClass() throws Exception {
		ob.OpenBrowse();
		ob.OpenGmail();

	}

	@After
	public void tearDownAfterClass() throws Exception {
		ob.CloseBrowse();
	}

	@Test
	public void loginWithWrongPassword() throws InterruptedException {
		ob.EnterEmail(op.ValidEmail);
		ob.EnterPassword(op.invalidpassword);
		Assert.assertEquals(ob.ReadPasswordError(), op.PasswordError);
	}

	@Test
	public void loginWithWrongEmail() throws InterruptedException {
		ob.EnterEmail(op.invalidEmail);

		// driver.findElement(By.xpath(".//input[@type='password'
		// and@aria-label='Enter your password']"))
		// .sendKeys("eminem");
		// driver.findElement(By.className("CwaK9")).click();
		// Thread.sleep(2000);

		Assert.assertEquals(ob.ReadEmailError(), op.EmailError);

	}

}
