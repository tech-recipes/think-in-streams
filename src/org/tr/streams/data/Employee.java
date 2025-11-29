package org.tr.streams.data;

public class Employee {

    public enum Department {
        IT, HR, FINANCE, SALES, MARKETING, OPERATIONS
    }

    public enum Role {
        ENGINEER, MANAGER, ANALYST, LEAD, DIRECTOR, INTERN
    }

    public enum EmploymentType {
        FULL_TIME, CONTRACT, INTERN
    }

    public enum Location {
        NEW_YORK, LONDON, BERLIN, SYDNEY, TOKYO
    }

    private int id;
    private String name;
    private Department department;
    private Role role;
    private double salary;
    private int age;
    private EmploymentType employmentType;
    private Location location;
    private boolean active;

    public Employee(int id, String name,
                    Department department,
                    Role role,
                    double salary,
                    int age,
                    EmploymentType employmentType,
                    Location location,
                    boolean active) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.salary = salary;
        this.age = age;
        this.employmentType = employmentType;
        this.location = location;
        this.active = active;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public Department getDepartment() { return department; }
    public Role getRole() { return role; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public EmploymentType getEmploymentType() { return employmentType; }
    public Location getLocation() { return location; }
    public boolean isActive() { return active; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", role=" + role +
                ", salary=" + salary +
                ", age=" + age +
                ", employmentType=" + employmentType +
                ", location=" + location +
                ", active=" + active +
                '}';
    }
}
