package progressive.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive.bdd.commons.CommonFunctions;
import progressive.bdd.utils.AutoData;

public class BirthdatePage {
	WebDriver driver;
	CommonFunctions commons;

	public BirthdatePage(WebDriver driver, CommonFunctions commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;

	}

	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_FirstName")
	WebElement firstNameElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_MiddleInitial")
	WebElement miElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_LastName")
	WebElement lastNameElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_DateOfBirth")
	WebElement dobElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_MailingAddress")
	WebElement addressElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_ApartmentUnit")
	WebElement aptNoElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_City")
	WebElement cityNameElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_ZipCode")
	WebElement zipCodeElement;
	@FindBy(xpath = "//button[text()='Okay, start my quote.']")
	WebElement startMyQuoteElement;
	
	public void getTitle() {
		commons.getCurrentUrl(driver);
	}

	public void inputFirstName(String firstName) {
		commons.inputValues(firstNameElement, firstName);
	}

	public void inputMi(String miName) {
		commons.inputValues(miElement, miName);

	}

	public void inputLastName(String lastName) {
		commons.inputValues(lastNameElement, lastName);

	}

	public void inputDob(String dob) {
		commons.inputValues(dobElement, dob);

	}

	public void inputAddress(String address) {
		commons.inputValues(addressElement, address);

	}

	public void inputAptNo(String apt) {
		commons.inputValues(aptNoElement, apt);
	}

	public void inputCityName(String cityName) {
		commons.inputValues(cityNameElement, cityName);
	}

	public void inputZipCode(String zipCode) {
		commons.clear(zipCodeElement);
		commons.inputValues(zipCodeElement, zipCode);
	}

	public void clickOkayMyQuote() {
		commons.clickElement(startMyQuoteElement);
	}

	public void autoBirthdatePageStep(String firstName, String miName, String lastName, String dob, String address,
			String aptNo, String cityName, String zipCode) {
		getTitle();
		inputFirstName(firstName);
		inputMi(miName);
		inputLastName(lastName);
		inputDob(dob);
		inputAddress(address);
		inputAptNo(aptNo);
		inputCityName(cityName);
		inputZipCode(zipCode);
		clickOkayMyQuote();
		inputAddress(address);
		inputAptNo(aptNo);
		inputCityName(cityName);
		clickOkayMyQuote();

	}
	
	
	public void autoAndHomebirthdatePageStep(String firstName, String miName, String lastName, String dob, String address,
			String aptNo, String cityName, String zipCode) {
		inputFirstName(firstName);
		inputMi(miName);
		inputLastName(lastName);
		inputDob(dob);
		inputAddress(address);
		inputAptNo(aptNo);
		inputCityName(cityName);
		inputZipCode(zipCode);
		clickOkayMyQuote();
		inputAddress(address);
		inputAptNo(aptNo);
		inputCityName(cityName);
		clickOkayMyQuote();
		
	}
	
	public void autoAndHomebirthdatePageStep(AutoData autoData) {
		inputFirstName(autoData.getFirstName());
		inputMi(autoData.getMiName());
		inputLastName(autoData.getLastName());
		inputDob(autoData.getDob());
		inputAddress(autoData.getAddress());
		inputAptNo(autoData.getAptNo());
		inputCityName(autoData.getCityName());
		inputZipCode(autoData.getZipCode());
		clickOkayMyQuote();
		inputAddress(autoData.getAddress());
		inputAptNo(autoData.getAptNo());
		inputCityName(autoData.getCityName());
		clickOkayMyQuote();
		
	}

	public void getTitle(String string) {
		
	}


}
