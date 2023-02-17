package progressive.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import progressive.bdd.commons.CommonFunctions;


public class HomePage {

	CommonFunctions commons;
	WebDriver driver;

	public HomePage(WebDriver driver, CommonFunctions commons) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.commons = commons;

	}

	// @FindBy(xpath = "//p[@class='txt' and normalize-space(text())='Auto']")
	@FindBy(xpath = "(//span[text()='Auto'])[1] | //p[@class='txt' and normalize-space(text())='Auto']")
	WebElement autoElement;

	@FindBy(xpath = "//p[@class='txt' and normalize-space(text())='Auto + Home']")
	WebElement autoAndHomeElement;

	public void autoElement() throws InterruptedException {
		commons.clickElement(autoElement);
		Thread.sleep(5000);

	}
	
	public void getTitle() {
		commons.getCurrentUrl(driver);
	}

	public void autoAndHomeElement() throws InterruptedException {
		commons.clickElement(autoAndHomeElement);
		Thread.sleep(5000);

	}

	public void homePageAutoSteps( ) throws InterruptedException {
		autoElement();

	}

	public void homePageAutoAndHomeSteps() throws InterruptedException {
		autoAndHomeElement();

	}

	
}
