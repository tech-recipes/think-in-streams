package org.tr.streams.ep1;

import org.tr.streams.data.Employee;
import org.tr.streams.data.EmployeeData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamProblem6 {

    //Get the names of the 5 youngest active employees, as a list of strings.

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> filtered = new ArrayList<>();

        // filter active
        for (Employee e : employees) {
            if (e.isActive()) {
                filtered.add(e);
            }
        }

        // sort by age ascending
        filtered.sort(Comparator.comparingInt(Employee::getAge));

        // limit 5
        List<Employee> youngest5 = new ArrayList<>();
        int count = 0;
        for (Employee e : filtered) {
            if (count == 5) break;
            youngest5.add(e);
            count++;
        }

        // map to names
        List<String> names = new ArrayList<>();
        for (Employee e : youngest5) {
            names.add(e.getName());
        }

        //print
        for (String name : names) {
            System.out.println(name);
        }
        // Streams version - 5 youngest active employees , as a list of strings

        names = employees.stream()
                .filter(Employee::isActive)
                .sorted(Comparator.comparing(Employee::getAge))
                .limit(5)
                .map(Employee::getName)
                .toList();


        //print
        System.out.println(" ----- ");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
