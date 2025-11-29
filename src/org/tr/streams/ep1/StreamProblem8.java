package org.tr.streams.ep1;

import org.tr.streams.data.Employee;
import org.tr.streams.data.EmployeeData;

import java.util.*;

public class StreamProblem8 {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        int count = 0;

        for (Employee e : employees) {
            if (e.getEmploymentType() == Employee.EmploymentType.CONTRACT &&
                    e.getLocation() == Employee.Location.TOKYO) {
                count++;
            }
        }

        System.out.println("Number of contract employees in TOKYO: " + count);

        //Your Streams version: filter(...) → count().

    }
}
