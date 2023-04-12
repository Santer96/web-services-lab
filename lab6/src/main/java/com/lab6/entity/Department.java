package com.lab6.entity;

import com.lab6.visitor.Visitor;

import java.util.List;

public class Department implements Element {

    private final List<Employee> employees;

    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
