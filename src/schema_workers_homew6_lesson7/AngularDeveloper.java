package schema_workers_homew6_lesson7;

 public class AngularDeveloper extends Employee {
        public AngularDeveloper(String name) {
            super(name);
        }
        @Override
        public String Position() {
            return "Angular Developer";
        }
        @Override
        public String Seniority() {
            return "Middle";
        }
    }
