package schema_workers_homew6_lesson7;

public class AutomationEngineer extends Employee {
    final String LastName;

    public AutomationEngineer(String name, String lastName) {
        super(name);
        LastName = lastName;
    }
    @Override
    public String getLastName() {
        return LastName;
    }
    @Override
    public String Position() {
        return "Automation Engineer";
    }
    @Override
    public String Seniority() {
        return "Senior";
    }
}