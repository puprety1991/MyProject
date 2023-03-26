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
    @FindBy(xpath = "//*[@id='resultTable']/tbody/tr")
    public List<WebElement> listOfRows;


    public EmployeeListPage(){
        PageFactory.initElements(driver,this);
    }
}
