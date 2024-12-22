package SeleniumFrameworkUdemy.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class ProductCatalogue {

	WebDriver driver;

	public ProductCatalogue(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//List<WebElement>  = driver.findElements(By.cssSelector(".mb-3"));
	
	@FindBy(css = ".mb-3")
	List<WebElement> products;


}
