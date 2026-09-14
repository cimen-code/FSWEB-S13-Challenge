package org.example;
import org.example.enums.Plan;
public class Main {
    public static void main(String[] args) {
    runApp();
}
    public static void runApp() {
    Healthplan healthplan = new Healthplan(1, "A Sigorta", Plan.BASIC);

    String[] healthPlans = new String[2];
    healthPlans[0] = healthplan.getName();

    Employee employee = new Employee(
            1,
            "John Doe",
            "jd@test.com",
            "1234",
            healthPlans
    );

    String[] developerNames = new String[2];
    developerNames[0] = employee.getFullName();

    Company company = new Company(
            1,
            "Workintech",
            1000,
            developerNames
    );

    System.out.println(healthplan);
    System.out.println(employee);
    System.out.println(company);
}
}