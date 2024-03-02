package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import utilities.SeleniumMethods;

public class LeavePageObjects extends SeleniumMethods {
	private SoftAssert softAssert;

	public LeavePageObjects(WebDriver driver) {
		
		super(driver);
		
		softAssert = new SoftAssert();
	}

	private By leaveTab = By.xpath("(//a[@class='oxd-main-menu-item'])[3]");
	private By myleaveTab = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[2]");

	private By selectFromDate = By.xpath("(//div[@class='oxd-date-input'])[1]//input");
	private By selectToDate = By.xpath("(//div[@class='oxd-date-input'])[2]//input");
	private By removeTag = By.xpath(
			"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[1]/i");
	private By selectLeaveStatusDropdown = By
			.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	private By selectStatus = By.xpath(
			"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]/span");
	private By selectLeaveType = By.xpath(
			"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[4]/span");
	private By selectTypeDropdown = By.xpath(
			"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]");
	private By clickOnSearch = By.xpath("//button[@type='submit']");
	//private By erroeMessage = By.xpath("//span[text()='To date should be after from date']");
	
	//Remove leave status tags
	
	private By pendingApproval = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[3]/i");
	private By cancelled = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[2]/i");
	private By schedule = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[4]/i");
	private By taken = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[5]/i");
	private By rejected = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[1]/i");
	
	//error message in date
	
	private By toErrorMessage = By.xpath("(//div[@class='oxd-grid-item oxd-grid-item--gutters'])[2]//span");
	private By fromErrorMessage = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters'][1]//span");
	
	
	

	public void click_Leave_Tab() {
		clickOn(leaveTab);

	}

	public void click_Myleave_Tab() {
		clickOn(myleaveTab);

	}

	public void enter_Data(String fromdate, String todate) {
		clearOn(selectFromDate);
		sendKeys(selectFromDate, fromdate);

		clearOn(selectToDate);
		sendKeys(selectToDate, todate);

	}
	
//	public void assertErrorMessage(String expectedErrorMessage) {
//		
//		 String actualToErrorMessage = getText(toErrorMessage);
//		 String actualFromErrorMesage = getText(fromErrorMessage);
//		 
//		 softAssert.assertEquals(actualToErrorMessage, expectedErrorMessage, "Error message does not match");
//		 softAssert.assertEquals(actualFromErrorMesage, expectedErrorMessage, "Error message does not match");
//		
//	}
	
	public void remove_tag() {
		
		clickOn(pendingApproval);
		clickOn(cancelled);
		clickOn(schedule);
		clickOn(taken);
		clickOn(rejected);
	}

	public void select_status() {
		clickOn(removeTag);
		clickOn(selectLeaveStatusDropdown);
		clickOn(selectStatus);
		clickOn(selectTypeDropdown);
		clickOn(selectLeaveType);

	}

	public void click_Search() {
		clickOn(clickOnSearch);
	}

}
