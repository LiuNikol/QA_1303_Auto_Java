package schema_workers_homew6_lesson7;

import java.util.Arrays;

public class Manager extends Employee{
    final String LastName;
    Employee[] team;
    public Manager(String name, String lastName) {
        super(name);
        LastName = lastName;
    }
    @Override
    public String getLastName() {
        return LastName;
    }
    public Employee[] getTeam() {
        return team;
    }
    public void setTeam(Employee[] team) {
        this.team = team;
    }

    @Override
    public String Position() {
        return "Manager and has a team of " + team.length +" members " + Arrays.toString(team);
    }

    @Override
    public String Seniority() {
        return "Senior";
    }
    public void setTeamMembers(Employee... employees){
        team = employees;
    }

    public String getInfo(){
        return getName();
    }
}