package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class QualificationPage extends CommonMethods {
    @FindBy(xpath = "//*[text()='Skills']")
    public WebElement skillOption;

    @FindBy(id = "btnAdd")
    public WebElement addOption;

    @FindBy(id = "skill_name")
    public WebElement skillNameField;

    @FindBy(id = "skill_description")
    public WebElement skillDescriptionField;

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    public List<WebElement> savedSkills;

    @FindBy(xpath = "//table/tbody/tr/td[3]")
    public List<WebElement> savedSkillDescription;





    public QualificationPage(){
        PageFactory.initElements(driver,this);
    }

}
