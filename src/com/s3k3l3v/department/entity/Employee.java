package com.s3k3l3v.department.entity;

import java.sql.Date;

/**
 * Created by Антон on 27.12.2017.
 */
public class Employee {

    private int employeeId;
    private String nameEmployee;
    private double salaryEmployee;
    private Date dateOfAdoption;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public Date getDateOfAdoption() {
        return dateOfAdoption;
    }

    public void setDateOfAdoption(Date dateOfAdoption) {
        this.dateOfAdoption = dateOfAdoption;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", salaryEmployee=" + salaryEmployee +
                ", dateOfAdoption=" + dateOfAdoption +
                '}';
    }
}
