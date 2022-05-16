package objects;

import commons.CommonActions;

public class ZipCode {

	public ZipCode(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@name='ZipCode'])[1]")
	WebElement zipCodeInputElement;
	@FindBy(xpath = "(//input[@name='qsButton'])[1]")
	WebElement getQuoteBtnElement;
	@FindBy(id = "zipCode_overlay_subproducts")
	WebElement altZipCodeElement;
	@FindBy(id = "qsButton_overlay_subproducts")
	WebElement altGetQuoteBtnElement;
	
	
	public void inputZipCode(CommonActions commonActions, String value) {
		if(whichUrl(commonActions).equalsIgnoreCase("https://www.progressive.com/#s")) {
			commonActions.inputText(altZipCodeElement, value);
		}else {
			commonActions.inputText(zipCodeInputElement, value);
		}
	}
	
	public void clickQuoteBtn(CommonActions commonActions) {
		if(whichUrl(commonActions).equalsIgnoreCase("https://www.progressive.com/#s")) {
			commonActions.click(altGetQuoteBtnElement);
		}else {
			commonActions.click(getQuoteBtnElement);
		}
	}
	
	private String whichUrl(CommonActions commonActions) {
		return commonActions.getUrl();
	}
}
