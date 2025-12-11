package org.tr.streams.ep1;

import org.tr.streams.data.Employee;
import org.tr.streams.data.EmployeeData;

import java.util.*;

public class StreamProblem8 {
    // Number of full time employees
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        int count = 0;

        for (Employee e : employees) {
            if (e.getEmploymentType() == Employee.EmploymentType.FULL_TIME) {
                count++;
            }
        }

        System.out.println("Number of full time employees: " + count);
        //Stream code

        long streamCount = employees.stream()
                .filter(e -> Employee.EmploymentType.FULL_TIME.equals(e.getEmploymentType()))
                .count();

        System.out.println("Stream Number of full time employees: " + streamCount);

    }
}
