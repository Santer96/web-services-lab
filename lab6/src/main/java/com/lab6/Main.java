package com.lab6;

import com.lab6.entity.Company;
import com.lab6.entity.Department;
import com.lab6.entity.Employee;
import com.lab6.visitor.SalaryCounterVisitor;
import com.lab6.visitor.Visitor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee employeeA1 = new Employee("Worker", 800);
        Employee employeeA2 = new Employee("Manager", 1500);
        Employee employeeA3 = new Employee("Boss", 5000);

        Employee employeeB1 = new Employee("Scientist", 2300);
        Employee employeeB2 = new Employee("Guinea Pig", 300);

        Department departmentA = new Department(Arrays.asList(employeeA1, employeeA2, employeeA3));
        Department departmentB = new Department(Arrays.asList(employeeB1, employeeB2));

        Company company = new Company(Arrays.asList(departmentA, departmentB));
        Visitor salaryCounterVisitor = new SalaryCounterVisitor();

        departmentA.accept(salaryCounterVisitor);
//        Salary across department = 7300

        departmentB.accept(salaryCounterVisitor);
//        Salary across department = 2600

        company.accept(salaryCounterVisitor);
//        Salary across company = 9900
    }
}
