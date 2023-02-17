package progressive.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;
import progressive.bdd.commons.CommonFunctions;

public class AutoPage {
	WebDriver driver;
	CommonFunctions commons;

	public AutoPage(WebDriver driver, CommonFunctions commons) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.commons = commons;

	}

	@FindBy(id = "quote-title")
	WebElement titlElement;

	@FindBy(xpath = "//input[@id='zipCode_overlay']")
	WebElement zipCodElement;

	@FindBy(xpath = "(//button[@data-action='AU+H'])[1]")
	WebElement homeButtonElement;
	
	@FindBy(xpath = "(//button[@data-action='AU+C'])[1]")
	WebElement condoButtonElement;

	@FindBy(xpath = "//input[@id='qsButton_overlay']")
	WebElement getAQuotElement;

	public void getTitle(String expected) {
		assertEquals(commons.getText(titlElement), expected);

	}

	public void getCurrentUrl(String expectedUrl) {
		assertEquals(expectedUrl, commons.getCurrentUrl(driver));

	}

	public void inputZipCode(String value) {
		commons.inputValues(zipCodElement, value);
	}

	public void clickHomeButton() {
		commons.clickElement(homeButtonElement);
	}
	
	public void clickCondoButton() {
		commons.clickElement(condoButtonElement);
	}

	public void clickGetAQuote() {
		commons.clickElement(getAQuotElement);

	}

	public void aboutPSteps(String expected, String expectedUrl, String value) {
		getTitle(expected);
		getCurrentUrl(expectedUrl);
		inputZipCode(value);
		clickHomeButton();
		clickGetAQuote();

	}
	
	public void aboutCondoSteps(String expected, String expectedUrl, String value) {
		getTitle(expected);
		getCurrentUrl(expectedUrl);
		inputZipCode(value);
		clickCondoButton();
		clickGetAQuote();

	}
	

}
