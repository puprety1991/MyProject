package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class EmployeeListPage extends CommonMethods {
    @FindBy(id = "empsearch_id")
    public WebElement empIdFieldText;

    @FindBy(id = "searchBtn")
    public WebElement searchButton;
    @FindBy(xpath = "//*[@id='resultTable']/tbody/tr/td[2]")
    public List<WebElement> listOfEmpId;

    @FindBy(xpath = "(//*[text()='Next'])[2]")
    public WebElement nextPage;

    @FindBy(xpath = "(//*[text()='Qualifications'])[2]")
    public WebElement qualificationOption;

    @FindBy(xpath = "//*[@id='addSkill']")
    public WebElement addSkill;

    @FindBy(xpath = "//*[@id='skill_code']")
    public WebElement dropDownSkills;

    @FindBy(xpath = "//*[@id='skill_years_of_exp']")
    public WebElement skillYOE;

    @FindBy(xpath = "//*[@id='skill_comments']")
    public WebElement skillComment;

    @FindBy(xpath = "//*[@id='btnSkillSave']")
    public WebElement btnSkillSave;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    public List<WebElement> skillEmpList;






    public EmployeeListPage(){
        PageFactory.initElements(driver,this);
    }
}
