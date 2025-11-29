package org.tr.streams.ep1;
import org.tr.streams.data.Employee;
import org.tr.streams.data.EmployeeData;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StreamProblem3 {
    /*
        Get a list of all distinct departments present in the company.
     */
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        Set<Employee.Department> deptSet = new LinkedHashSet<>(); // preserves insertion order

        for (Employee e : employees) {
            deptSet.add(e.getDepartment());
        }
        List<Employee.Department> departments = new ArrayList<>(deptSet);
        System.out.println(departments);


        departments = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .toList();

        System.out.println(departments);

    }

}
