<%-- 
    Document   : LoanEmployee
    Created on : Feb 11, 2019, 4:19:49 PM
    Author     : SAMSUNG
--%>

<%@page import="tools.NewHibernateUtil"%>
<%@page import="controllers.Controller"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="models.Loan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employees Loan</title>
    </head>
    <body>
        <h1>Employees Loan</h1>
        <div>
            <% SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
                Controller<Loan> lcon = new Controller(sessionFactory);%>
            <table border = 1>
                <thead>
                    <tr>
                        <th style = "text-align: center">No</th>
                        <th>ID</th>
                        <th>NIK</th>
                        <th>Admin</th>
                        <th>Nominal</th>
                        <th>Loan Duration</th>
                        <th>Monthly Payment</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <% int i = 1;
                                for (Loan loan : lcon.getAll(new Loan())) {%> 
                    <tr>
                        <td style="text-align: center"><%= i%></td>
                        <td><%= loan.getId()%></td>
                        <td><%= loan.getNik().getName() %></td>
                        <td><%= loan.getAdmin().getName() %></td>
                        <td><%= loan.getNominal()%></td>
                        <td><%= loan.getLoanDuration()%></td>
                        <td><%= loan.getMonthlyPayment()%></td>
                        <td><%= loan.getStatus()%></td>
                    </tr>
                    <% i++;
                            }%>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
