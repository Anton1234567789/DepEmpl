package com.s3k3l3v.department.entity;

import java.io.Serializable;

public class Department implements Serializable{
    private int departmentId;
    private String nameDepartment;
    private String nameEmployee;
    private int employeeId;

    public Department(int departmentId, String nameDepartment, String nameEmployee, int employeeId) {
        this.departmentId = departmentId;
        this.nameDepartment = nameDepartment;
        this.nameEmployee = nameEmployee;
        this.employeeId = employeeId;
    }

    public Department(String nameDepartment, String nameEmployee, int employeeId) {
        this.nameDepartment = nameDepartment;
        this.nameEmployee = nameEmployee;
        this.employeeId = employeeId;
    }

    public Department() {
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", nameDepartment='" + nameDepartment + '\'' +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
