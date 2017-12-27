package com.s3k3l3v.department.controller;


import com.s3k3l3v.department.dao.DepartmentDAO;
import com.s3k3l3v.department.entity.Department;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DepartmentController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    private DepartmentDAO departmentDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getServletPath();

        switch (action){
            case "/new":
                showNewForm(req, resp);
                break;
            case "/insert":
                insertDepartment(req, resp);
                break;
//            case "/delete":
//                deleteBook(request, response);
//                break;
//            case "/edit":
//                showEditForm(request, response);
//                break;
//            case "/update":
//                updateBook(request, response);
//                break;
            default:
                listBook(req, resp);
                break;
        }
//        ServletOutputStream out = resp.getOutputStream();
//
//        out.println("<html>");
//        out.println("<head><title>Hello Servlet</title></head>");
//
//        out.println("<body>");
//        out.println("<h3>Hello World</h3>");
//        out.println("This is my first Servlet");
//        out.println("</body>");
//        out.println("<html>");
    }

    private void listBook(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List<Department> departments = departmentDAO.getAllDepartment();
            req.setAttribute("listDepartment", departments);
            RequestDispatcher rb = req.getRequestDispatcher("departmentList.jsp");
            rb.forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void insertDepartment(HttpServletRequest req, HttpServletResponse resp) {
        String nameDepartment = req.getParameter("name_department");
        String nameEmployee = req.getParameter("name_employee");
        int idEmployee = Integer.parseInt(req.getParameter("employee_id"));

        Department department = new Department(nameDepartment,nameEmployee, idEmployee);

        departmentDAO.insertDepartment(department);
        try {
            resp.sendRedirect("list");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void showNewForm(HttpServletRequest req, HttpServletResponse resp) {
        try {
            RequestDispatcher rd = req.getRequestDispatcher("departmentForm.jsp");
            rd.forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
