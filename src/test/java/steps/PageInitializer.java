package steps;

import pages.*;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AddEmployeePage addEmployeePage;
    public static EmployeeListPage employeeListPage;
    public static QualificationPage qualificationPage;
    public static void initializePageObjects(){
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        addEmployeePage = new AddEmployeePage();
        employeeListPage = new EmployeeListPage();
        qualificationPage = new QualificationPage();

    }
}
