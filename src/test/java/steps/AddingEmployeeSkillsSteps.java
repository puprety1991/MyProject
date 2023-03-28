package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class AddingEmployeeSkillsSteps extends CommonMethods {
    String skill;
    @When("Admin clicks on employee list")
    public void admin_clicks_on_employee_list() {
      click(dashboardPage.employeeListOption);
    }

    @When("Admin clicks on employee id {string}")
    public void admin_clicks_on_employee_id(String empId) {
      employeeIdSearch(employeeListPage.listOfEmpId,empId, employeeListPage.nextPage);
    }
    @When("Admin clicks on Qualification option")
    public void admin_clicks_on_qualification_option() {
        click(employeeListPage.qualificationOption);
    }
    @When("Admin clicks on skills add button")
    public void admin_clicks_on_skills_add_button() {
        click(employeeListPage.addSkill);
    }


    @When("Admin verify the drop down is enabled and select the value {string}")
    public void admin_verify_the_drop_down_is_enabled_and_select_the_value(String skill) {
        this.skill= skill;
        if(employeeListPage.dropDownSkills.isEnabled()){
            dropDown(employeeListPage.dropDownSkills, skill);
        }
    }
    @When("Admin verify experience textbox and comments text box and enter the values {string} and {string}")
    public void admin_verify_experience_textbox_and_comments_text_box_and_enter_the_values_and(String exp, String comments) {
        if(employeeListPage.skillYOE.isEnabled() && employeeListPage.skillComment.isEnabled() ){
            sendToText(employeeListPage.skillYOE,exp);
            sendToText(employeeListPage.skillComment,comments);
        }
    }

    @When("admin click on save button")
    public void admin_click_on_save_button() {
        click(employeeListPage.btnSkillSave);
    }
    @Then("Admin verifies entered data")
    public void admin_verifies_entered_data() {
        for(WebElement skillName:employeeListPage.skillEmpList){
            if(skillName.getText().equals(skill)){
                assertionEqual(skillName.getText(),skill);
                break;
            }

        }
    }
}
