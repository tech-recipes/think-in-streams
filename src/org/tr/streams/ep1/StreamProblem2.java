package org.tr.streams.ep1;

import org.tr.streams.data.Employee;
import org.tr.streams.data.EmployeeData;

import java.util.ArrayList;
import java.util.List;

public class StreamProblem2 {

    private static List<String> nameList;

    /*
            Get the names of all IT employees earning more than 90,000, as a List<String>.
         */
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();
        List<String> names = new ArrayList<>();

        for (Employee e : employees) {
            if (e.getDepartment() == Employee.Department.IT &&
                    e.getSalary() > 90_000) {
                names.add(e.getName());
            }
        }

        System.out.println(names);

        nameList = employees.stream()
                        .filter(e -> Employee.Department.IT.equals(e.getDepartment()) && e.getSalary() > 90_000)
                        .map(Employee::getName)
                        .toList(); // collect(Collectors.toList())


        System.out.println(nameList);

    }
}
