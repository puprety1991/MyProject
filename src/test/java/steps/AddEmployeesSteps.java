package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelReader;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddEmployeesSteps extends CommonMethods {
    String empId;
    @When("admin clicks on PIM option")
    public void admin_clicks_on_pim_option() {
        click(dashboardPage.pimOption);

    }

    @When("admin clicks on add Employee Option")
    public void admin_clicks_on_add_employee_option() {
        click(dashboardPage.addEmployeeOption);

    }
    @When("admin add multiple employees from excel using {string}")
    public void admin_add_multiple_employees_from_excel_using(String sheetName) {

        List<Map<String, String>> employeesFromExcelFile = ExcelReader.excelListIntoMap(Constants.TESTDATA_FILEPATH, sheetName);
        Iterator<Map<String, String>> iterator = employeesFromExcelFile.iterator();
        while (iterator.hasNext()){
            Map<String,String>employee = iterator.next();
            sendToText(addEmployeePage.firstNameField,employee.get("FirstName"));
            sendToText(addEmployeePage.middleNameField,employee.get("MiddleName"));
            sendToText(addEmployeePage.lastNameField,employee.get("LastName"));
            empId = getAttribute(addEmployeePage.employeeIdField,"value");
            System.out.println(empId);
            sendToText(addEmployeePage.photographField,employee.get("Photograph"));
            if(!addEmployeePage.checkBox.isSelected()){
                click(addEmployeePage.checkBox);
            }
            sendToText(addEmployeePage.userNameField,employee.get("Username"));
            sendToText(addEmployeePage.passwordField,employee.get("Password"));
            sendToText(addEmployeePage.rePasswordField,employee.get("ConfirmPassword"));
            dropDown(addEmployeePage.statusField,1);
            click(addEmployeePage.saveButton);
        }
    }
    @Then("admin verifies it")
    public void admin_verifies_it() {
        click(dashboardPage.employeeListOption);
        sendToText(employeeListPage.empIdFieldText,empId);
        click(employeeListPage.searchButton);


    }
}
