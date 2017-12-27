package com.s3k3l3v.department.dao;

import com.s3k3l3v.department.entity.Department;
import com.s3k3l3v.department.util.DBManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {

    private DBManager dbManager = new DBManager();

    private static final String SQL_INSERT_DEPARTMENT = "INSERT INTO departments (name_department, name_employee, employee_id)" +
            "VALUES(?,?,?)";

    private static final String SQL_DELETE_DEPARTMEMT = "DELETE FROM departments WHERE " +
            "department_id = ?";

    private static final String SQL_GET_ALL_DEPARTMENT = "SELECT * FROM departments";

    public boolean insertDepartment(Department department){
        boolean res = false;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            connection = dbManager.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT_DEPARTMENT);

            int k = 1;

            preparedStatement.setString(k++, department.getNameDepartment());
            preparedStatement.setString(k++, department.getNameEmployee());
            preparedStatement.setInt(k++, department.getEmployee_id());

            if (preparedStatement.executeUpdate() > 0){
                if (rs.next()){
                    department.setDepartmentId(rs.getInt(1));
                    res = true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }

    public void delteDepartment(int depId){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            connection = dbManager.getConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE_DEPARTMEMT);
            preparedStatement.setInt(1, depId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Department> getAllDepartment(){
        List<Department> departments = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            connection = dbManager.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(SQL_GET_ALL_DEPARTMENT);
            while (rs.next()){
                Department department = new Department();
                department.setDepartmentId(rs.getInt("departments_id"));
                department.setNameDepartment(rs.getString("name_department"));
                department.setNameEmployee(rs.getString("name_employee"));
                department.setEmployee_id(rs.getInt("employee_id"));
                departments.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departments;
    }
}
