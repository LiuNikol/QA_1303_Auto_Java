package schema_workers_homew6_lesson7;

public abstract class Employee {
    final String name;
    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getLastName() {
        return "";
    }
    public abstract String Position();

    public abstract String Seniority();

    public String getInfo() {
        return getName();
    }

    @Override
    public String toString() {
        return getName();
    }
}