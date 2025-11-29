package org.tr.streams.data;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        return Arrays.asList(

                new Employee(1, "John Miller",
                        Employee.Department.IT,
                        Employee.Role.ENGINEER,
                        95000, 29,
                        Employee.EmploymentType.FULL_TIME,
                        Employee.Location.NEW_YORK,
                        true),

                new Employee(2, "Emma Johnson",
                        Employee.Department.HR,
                        Employee.Role.MANAGER,
                        110000, 34,
                        Employee.EmploymentType.FULL_TIME,
                        Employee.Location.LONDON,
                        true),

                new Employee(3, "Liam Brown",
                        Employee.Department.FINANCE,
                        Employee.Role.ANALYST,
                        72000, 41,
                        Employee.EmploymentType.FULL_TIME,
                        Employee.Location.BERLIN,
                        true),

                new Employee(4, "Olivia Davis",
                        Employee.Department.IT,
                        Employee.Role.LEAD,
                        125000, 27,
                        Employee.EmploymentType.CONTRACT,
                        Employee.Location.SYDNEY,
                        true),

                new Employee(5, "Noah Wilson",
                        Employee.Department.SALES,
                        Employee.Role.MANAGER,
                        85000, 38,
                        Employee.EmploymentType.FULL_TIME,
                        Employee.Location.TOKYO,
                        true),

                new Employee(6, "Ava Martinez",
                        Employee.Department.IT,
                        Employee.Role.ENGINEER,
                        88000, 25,
                        Employee.EmploymentType.INTERN,
                        Employee.Location.NEW_YORK,
                        true),

                new Employee(7, "William Taylor",
                        Employee.Department.FINANCE,
                        Employee.Role.DIRECTOR,
                        180000, 45,
                        Employee.EmploymentType.FULL_TIME,
                        Employee.Location.LONDON,
                        false),

                new Employee(8, "Sophia Anderson",
                        Employee.Department.MARKETING,
                        Employee.Role.MANAGER,
                        97000, 30,
                        Employee.EmploymentType.FULL_TIME,
                        Employee.Location.BERLIN,
                        true),

                new Employee(9, "James Thomas",
                        Employee.Department.SALES,
                        Employee.Role.ANALYST,
                        62000, 35,
                        Employee.EmploymentType.CONTRACT,
                        Employee.Location.SYDNEY,
                        true),

                new Employee(10, "Mia Jackson",
                        Employee.Department.MARKETING,
                        Employee.Role.ENGINEER,
                        68000, 28,
                        Employee.EmploymentType.FULL_TIME,
                        Employee.Location.TOKYO,
                        true)
        );
    }
}
