<%-- 
    Document   : ViewData
    Created on : Feb 11, 2019, 1:21:37 PM
    Author     : SAMSUNG
--%>

<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.List"%>
<%@page import="models.Employee" %>
<%@page import="tools.NewHibernateUtil" %>
<%@page import="controllers.Controller" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employees Data</title>
    </head>
    <body>
        <h1>Employees Data</h1>
        <div>
            <% SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
                Controller<Employee> econ = new Controller(sessionFactory);%>
            <table border = 1>
                <thead>
                    <tr>
                        <th style="text-align: center">No</th>
                        <th>NIK</th>
                        <th>Nama</th>
                        <th>No Hp</th>
                        <th>Email</th>
                        <th>Gaji</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <% int i = 1;
                                for (Employee emp : econ.getAll(new Employee())) {%> 
                    <tr>
                        <td style="text-align: center"><%= i%></td>
                        <td><%= emp.getNik()%></td>
                        <td><%= emp.getName()%></td>
                        <td><%= emp.getPhoneNumber()%></td>
                        <td><%= emp.getEmail()%></td>
                        <td><%= emp.getSalary()%></td>
                        <td><a href= "LoanEmployee.jsp">Details</a>
                            <a href="../EditEmployee?nik=<%= emp.getNik()%>" class="btn btn-outline-primary btn-sm">Edit</a> 
                            <a href="../DeleteEmployee?nik=<%= emp.getNik()%>"class="btn btn-outline-danger btn-sm">Delete</a></td>
                    </tr>
                    <% i++;
                            }%>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
