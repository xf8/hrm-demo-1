/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dayatang.hrm.organisation.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.dayatang.domain.AbstractEntity;

/**
 *
 * @author yyang
 */
@Entity
public class EmployeeArchieve extends AbstractEntity {
    
    
    private Employee employee;

    @OneToOne
    @JoinColumn(name = "employee_id")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String[] businessKeys() {
        return new String[] {"employee"};
    }
    
}
