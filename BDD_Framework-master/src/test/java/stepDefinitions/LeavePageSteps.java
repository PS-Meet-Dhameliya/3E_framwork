package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.mongodb.diagnostics.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LeavePageObjects;
import utilities.BaseClass;

public class LeavePageSteps {

	WebDriver driver;
	Properties prop;

//	Logger logger;
	public LeavePageSteps() {

		this.driver = BaseClass.getDriver();
		this.prop = BaseClass.getProperties();
//		this.logger=BaseClass.getLogger();
	}

	LeavePageObjects leavePageObjects;

	@Given("I am on the dashboard page")
	public void i_am_on_the_dashboard_page() {
		leavePageObjects = new LeavePageObjects(driver);
	
	}

	@When("I click on the Leave tab")
	public void i_click_on_the_leave_tab() {
		leavePageObjects.click_Leave_Tab();
	}

	@When("I click on the My Leave option")
	public void i_click_on_the_my_leave_option() {
		leavePageObjects.click_Myleave_Tab();
	}

	@Then("I should see the My Leave List page")
	public void i_should_see_the_my_leave_list_page() {
		// leavePageObjects.verify_Myleave_Tab();
		System.out.println();
	}

	@When("I fill out the Serach Leave form with valid data")
	public void i_fill_out_the_serach_leave_form_with_valid_data() {
		//leavePageObjects.enter_Data("2022-01-01", "2024-11-02");
	//	leavePageObjects.select_status();
	leavePageObjects.enter_Data(prop.getProperty("fromdate"), prop.getProperty("todate"));
		leavePageObjects.select_status();
		
	}

	@When("Click on Search button")
	public void click_on_Search_button() {
		leavePageObjects.click_Search();
	}

	@Then("I should see the leave records")
	public void i_should_see_the_leave_records() {
		System.out.println();
	}
	
	
	 @When("I Enter a From date of {string} and To date of {string} from the date picker")
	    public void i_enter_from_and_to_dates(String from_date, String to_date) {
		 leavePageObjects.enter_Data(from_date , to_date);
	    }

	    @Then("I should see the enterd date range")
	    public void i_should_see_the_entered_date_range() {
	    	System.out.println();
	    }
	    
	    @When("I Enter invalid input From date of {string} and To date of {string} from the date picker")
	    public void i_enter_invalid_input_from_date_and_to_date_from_the_date_picker(String ifrom_Date, String ito_Date) {
	        leavePageObjects.enter_Data(ifrom_Date , ito_Date);
	        
	    }

	    @Then("I should see an error message")
	    public void i_should_see_an_error_message() {
	    	//leavePageObjects.assertErrorMessage("expectedErrorMessage");
	    	System.out.println();
	    }
	    
	    @When("I not select any leave status")
	    public void i_not_select_any_leave_status() {
	    	leavePageObjects.enter_Data(prop.getProperty("fromdate"), prop.getProperty("todate"));
	    	leavePageObjects.remove_tag();
	    	
	    	
	    	
	    	
	    }

	    @Then("I should get an error  message.")
	    public void i_should_get_an_error_message() {
	    	leavePageObjects.click_Search();
	    	
	    }

}
