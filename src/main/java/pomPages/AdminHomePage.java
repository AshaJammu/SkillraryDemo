package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
    //Declaration
	@FindBy(xpath = "//span[text()='SkillRary Admin']")
	private WebElement adminIcon;
	
	@FindBy(xpath = "//span[text()='Users']")
	private WebElement usersTab;
	
	@FindBy(xpath = "//span[text()='Courses']")
	private WebElement coursesTab;
	
	@FindBy(xpath = "//span[text()='Course List']")
	private WebElement courseListLink;
	
	@FindBy(xpath = "//span[text()='Category']")
	private WebElement categoryLink;
	
	@FindBy(xpath = "//span[text()='Sign out']")
	private WebElement  signOutLink;
	
	//Initialization
	public AdminHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public String getAdminIcon() {
		return adminIcon.getText();
		
	}
	public void clickUsersTab() {
		usersTab.click();
	}
	public void clickCoursesTab() {
		coursesTab.click();
	}
	public void clickCourseListLink() {
		courseListLink.click();
	}
	public void clickCategoryLink() {
		categoryLink.click();
	}
	public void signOutofApp() {
		adminIcon.click();
		signOutLink.click();
	}
}
