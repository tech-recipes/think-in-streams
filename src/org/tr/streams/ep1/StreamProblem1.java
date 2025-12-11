package org.tr.streams.ep1;

import org.tr.streams.data.Employee;
import org.tr.streams.data.EmployeeData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProblem1 {
    /*
        Given a list of Employee objects:
        Filter and return all employees who work in the IT department and have a salary greater than 90,000.
     */
    public static void main(String[] args) {

        //for loop
        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> result = new ArrayList<>();

        for (Employee e : employees) {
            if (e.getDepartment() == Employee.Department.IT && e.getSalary() > 90000) {
                result.add(e);
            }
        }

        System.out.println(result);

        // Streams Solution

        result = employees.stream()
                .filter(e -> Employee.Department.IT.equals(e.getDepartment()) && e.getSalary() > 90000)
                .toList();

        System.out.println(result);

    }


}
