package org.tr.streams.ep1;
import org.tr.streams.data.Employee;
import org.tr.streams.data.EmployeeData;

import java.util.*;

public class StreamProblem4 {

    //Find the top 3 highest-paid IT employees and return them as a list.

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> itEmployees = new ArrayList<>();

        // filter IT
        for (Employee e : employees) {
            if (e.getDepartment() == Employee.Department.IT) {
                itEmployees.add(e);
            }
        }

        // sort by salary descending
        itEmployees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        // limit to top 3
        List<Employee> top3 = new ArrayList<>();
        int count = 0;
        for (Employee e : itEmployees) {
            if (count == 3) break;
            top3.add(e);
            count++;
        }
        System.out.println(top3);
        // Stream filter -> sort -> limit -> toList() Java 16+ collect(Collectors.toList())

        top3 = employees.stream()
                        .filter(e -> Employee.Department.IT.equals(e.getDepartment()))
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .limit(3)
                        .toList();

        System.out.println(top3);

    }
}
