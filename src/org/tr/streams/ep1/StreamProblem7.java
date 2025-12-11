package org.tr.streams.ep1;

import org.tr.streams.data.Employee;
import org.tr.streams.data.EmployeeData;

import java.util.*;

public class StreamProblem7 {
    // Get distinct location names as strings like "LONDON", "NEW_YORK" etc.

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        Set<String> locationSet = new LinkedHashSet<>();

        for (Employee e : employees) {
            String locationName = e.getLocation().name(); // enum name
            locationSet.add(locationName);
        }

        List<String> locations = new ArrayList<>(locationSet);

        System.out.println(locations);

        // Distinct location names as strings like "LONDON", "NEW_YORK" etc..
        locations = employees.stream()
                            .map(Employee::getLocation)
                            .map(Enum::name)
                            .distinct()
                            .toList();

        System.out.println(locations);
    }
}
