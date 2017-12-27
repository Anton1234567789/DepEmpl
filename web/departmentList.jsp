<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Department Application</title>
</head>
<body>
<div align="center">
    <h1>Dep Management</h1>
    <h2>
        <a href="new">Add New Department</a>
        &nbsp;&nbsp;&nbsp;
        <a href="list">List All Department</a>

    </h2>
</div>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Department</h2></caption>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Price</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="department" items="${listDepartment}">
            <tr>
                <td><c:out value="${department.departmentId}" /></td>
                <td><c:out value="${department.nameDepartment}" /></td>
                <td><c:out value="${department.nameEmployee}" /></td>
                <td><c:out value="${department.employeeId}" /></td>
                <td>
                    <a href="edit?id=<c:out value='${department.departmentId}' />">Edit</a>
                    &nbsp;&nbsp;
                    <a href="delete?id=<c:out value='${department.departmentId}' />">Delete</a>                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
