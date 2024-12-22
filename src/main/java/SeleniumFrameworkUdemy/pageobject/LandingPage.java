package SeleniumFrameworkUdemy.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "userEmail")
	WebElement userEmail;

	@FindBy(id = "userPassword")
	WebElement Password;

	@FindBy(id = "login")
	WebElement submit;

	public void loginApplication(String email, String password) {
		userEmail.sendKeys(email);
		Password.sendKeys(password);
		submit.click();

	}

	public void goTo() {

		driver.get("https://rahulshettyacademy.com/client");
	}

}
