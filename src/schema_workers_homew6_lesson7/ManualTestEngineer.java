package schema_workers_homew6_lesson7;

public class ManualTestEngineer extends Employee{
    final String LastName;

    public ManualTestEngineer (String name, String lastName) {
        super(name);
        LastName = lastName;
    }
    @Override
    public String getLastName() {
        return LastName;
    }
    @Override
    public String Position() {
        return "ManualTestEngineer";
    }
    @Override
    public String Seniority() {
        return "Senior";
    }
}


