<%@ page language="java" contentType="text/html; charset=UTF-8"
          pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Department Application</title>
</head>
<body>
<div align="center">
    <h1>Management</h1>
    <h2>
        <a href="new">Add New Department</a>
        &nbsp;
        <a href="list">List All Department</a>

    </h2>
</div>
<div align="center">
    <c:if test="${department != null}">
    <form action="update" method="post">
        </c:if>
        <c:if test="${department == null}">
        <form action="insert" method="post">
            </c:if>
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        <c:if test="${department != null}">
                            Edit Department
                        </c:if>
                        <c:if test="${department == null}">
                            Add New Department
                        </c:if>
                    </h2>
                </caption>
                <c:if test="${department != null}">
                    <input type="hidden" name="departmentId" value="<c:out value='${department.departmentId}' />" />
                </c:if>
                <tr>
                    <th>Name: </th>
                    <td>
                        <input type="text" name="nameDepartment" size="45"
                               value="<c:out value='${department.nameDepartment}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Employee NAme: </th>
                    <td>
                        <input type="text" name="nameEmployee" size="45"
                               value="<c:out value='${department.nameEmployee}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Employee Id: </th>
                    <td>
                        <input type="text" name="employeeId" size="45"
                               value="<c:out value='${department.employeeId}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save" />
                    </td>
                </tr>
                <a href="${pageContext.request.contextPath}/new">new</a>
                <a href="${pageContext.request.contextPath}/list">list</a>
            </table>
        </form>
</div>
</body>
</html>
