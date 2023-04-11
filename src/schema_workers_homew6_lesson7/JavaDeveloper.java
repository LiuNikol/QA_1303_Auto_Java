package schema_workers_homew6_lesson7;

public class JavaDeveloper extends Employee {

    public JavaDeveloper(String name) {
        super(name);
    }

    @Override
    public String Position() {
        return "Java Developer";
    }

    @Override
    public String Seniority() {
        return "Senior";
    }
}
