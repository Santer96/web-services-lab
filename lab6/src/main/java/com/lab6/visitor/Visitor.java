package com.lab6.visitor;

import com.lab6.entity.Company;
import com.lab6.entity.Department;

public interface Visitor {
    void visit(Company company);
    void visit(Department department);
}
