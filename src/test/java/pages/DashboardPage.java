package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy(xpath = "//a[text()='Welcome Admin']")
    public WebElement welcomeText;

    @FindBy(xpath = "//*[text()='PIM']")
    public WebElement pimOption;

    @FindBy(xpath = "//*[@id='menu_pim_addEmployee']")
    public WebElement addEmployeeOption;

    @FindBy(id = "menu_pim_viewEmployeeList")
    public WebElement employeeListOption;

    @FindBy(xpath = "//*[text()='Admin']")
    public WebElement adminOption;

    @FindBy(xpath = "//*[text()='Qualifications']")
    public WebElement qualificationOption;




    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }
}
