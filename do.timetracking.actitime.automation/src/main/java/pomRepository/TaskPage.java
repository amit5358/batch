package pomRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage {
	
	
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newCustomerButton;
	
	@FindBy(xpath="//input[@class=\"inputFieldWithPlaceholder newNameField inputNameField\"]")
	private WebElement customerNameTextField;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private	WebElement discriptionTextField;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerTextField;

	public WebElement getAddNewButton() {
		return addNewButton;
	}

	public WebElement getNewCustomerButton() {
		return newCustomerButton;
	}

	public WebElement getCustomerNameTextField() {
		return customerNameTextField;
	}

	public WebElement getDiscriptionTextField() {
		return discriptionTextField;
	}

	public WebElement getCreateCustomerTextField() {
		return createCustomerTextField;
	}
	
	
	public void createCustomerAction(String customerName,String discription)
	{
		addNewButton.click();
		newCustomerButton.click();
		customerNameTextField.sendKeys(customerName);
		discriptionTextField.sendKeys(discription);
		createCustomerTextField.click();
		
		
	}

}
