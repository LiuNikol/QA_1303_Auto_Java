package schema_workers_homew6_lesson7;

public class main {
    public static void main(String[] args) {
        JavaDeveloper javaDev = new JavaDeveloper("Tom");
        AngularDeveloper angularDev = new AngularDeveloper("Bill");
        AutomationEngineer autoTester = new AutomationEngineer("Misha", "Aksani");
        ManualTestEngineer manualTester = new ManualTestEngineer("John", "Smith");
        Manager manager = new Manager("William", "Underwood");

        manager.setTeamMembers(javaDev, angularDev, autoTester, manualTester);

        printInfo(javaDev);
        printInfo(angularDev);
        printInfo(autoTester);
        printInfo(manualTester);
        printInfo(manager);
    }

    private static void printInfo(Employee employee) {
        System.out.println(employee.getInfo() + " "+ employee.getLastName() + " is a " + employee.Seniority() + " " + employee.Position());
    }

}
