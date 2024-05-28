package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//Constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Calendar")
	private WebElement calendarLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement logoutButton;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;

	public WebElement getCalendarLink() {
		return calendarLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}
	
}
