package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="container_tasks")
	private WebElement taskButton;
	
	@FindBy(xpath="//a[text()='Logout']")
	 WebElement logutButton;

	public WebElement getTaskButton() {
		return taskButton;
	}

	public WebElement getLogutButton() {
		return logutButton;
	}
	
	public void clickOnTaskButton()
	{
		taskButton.click();
		
	}
	public void logoutAction()
	{
		logutButton.click();	
	}
	

				
		
	}
	


