package org.tr.streams.ep1;

import org.tr.streams.data.Employee;
import org.tr.streams.data.EmployeeData;

import java.util.ArrayList;
import java.util.List;

public class StreamProblem5 {

    /*
        Return the second “page” of active employees, with page size = 3.
        That means: skip first 3 active employees, then take next 3 active employees.
     */

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> activeEmployees = new ArrayList<>();

// first filter active employees
        for (Employee e : employees) {
            if (e.isActive()) {
                activeEmployees.add(e);
            }
        }

// page calculation: pageIndex = 1 (second page), pageSize = 3
        int pageIndex = 1;
        int pageSize = 3;
        int fromIndex = pageIndex * pageSize;          // 1 * 3 = 3
        int toIndex = Math.min(fromIndex + pageSize, activeEmployees.size());

// handle edge case where fromIndex is beyond size
        List<Employee> page = new ArrayList<>();
        if (fromIndex < activeEmployees.size()) {
            for (int i = fromIndex; i < toIndex; i++) {
                page.add(activeEmployees.get(i));
            }
        }

// print
        for (Employee e : page) {
            System.out.println(e);
        }
        // Your Streams version: filter(isActive) → skip(3) → limit(3) → toList().
        activeEmployees = employees.stream()
                .filter(Employee::isActive)
                .skip(3)
                .limit(3)
                .toList();

        System.out.println(activeEmployees);

    }
}
