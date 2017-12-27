package com.s3k3l3v.department.entity;

import java.io.Serializable;

public class Department implements Serializable{
    private int departmentId;
    private String nameDepartment;
    private String nameEmployee;
    private int employee_id;

    public Department(int departmentId, String nameDepartment, String nameEmployee, int employee_id) {
        this.departmentId = departmentId;
        this.nameDepartment = nameDepartment;
        this.nameEmployee = nameEmployee;
        this.employee_id = employee_id;
    }

    public Department(String nameDepartment, String nameEmployee, int employee_id) {
        this.nameDepartment = nameDepartment;
        this.nameEmployee = nameEmployee;
        this.employee_id = employee_id;
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

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", nameDepartment='" + nameDepartment + '\'' +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", employee_id=" + employee_id +
                '}';
    }
}
