package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class AddingSkillsSteps extends CommonMethods {
     String name;
     String description;
    @When("Admin clicks on Admin")
    public void admin_clicks_on_admin() {
        click(dashboardPage.adminOption);
    }
    @When("Admin clicks on Qualification")
    public void admin_clicks_on_qualification() {
        click(dashboardPage.qualificationOption);
    }
    @When("Admin selects skills option")
    public void admin_selects_skills_option() {
        click(qualificationPage.skillOption);
    }
    @When("Admin clicks on add button")
    public void admin_clicks_on_add_button() {
        click(qualificationPage.addButton);
    }
    @When("Admin enters the {string} and {string}")
    public void admin_enters_the_and(String name, String description) {
        this.name = name;
        this.description = description;
        sendToText(qualificationPage.skillNameField,name);
        sendToText(qualificationPage.skillDescriptionField, description);
    }
    @When("Admin clicks on save Button")
    public void admin_clicks_on_save_button() {
        click(qualificationPage.saveButton);
    }
    @Then("Admin verifies it")
    public void admin_verifies_it() {
       for(WebElement skill: qualificationPage.savedSkills){
           String actual = skill.getText();
           if(actual.equals(name)){
               assertionEqual(actual,name);
               break;
           }
        }
       for(WebElement skillDescription: qualificationPage.savedSkillDescription){
           if(description.equals(skillDescription.getText())){
               assertionEqual(skillDescription.getText(),description);
               break;
           }
       }


    }
}
