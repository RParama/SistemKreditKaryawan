<%-- 
    Document   : Beranda
    Created on : Feb 11, 2019, 1:03:05 PM
    Author     : gandol
--%>

<%@page import="daos.FunctionDAO"%>
<%@page import="tools.NewHibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="controllers.GeneralController"%>
<%@page import="models.Employee"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    FunctionDAO fdao = new FunctionDAO();
    String nik = "", name = "", hp = "", email = "", gaji = "";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="../style/table.css">
        <link rel="stylesheet" type="text/css" href="../style/reset.css" />
        <link rel="stylesheet" type="text/css" href="../style/style.css" />
        <link rel="stylesheet" type="text/css" href="../style/media-queries.css" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:700,400,400italic,700italic' rel='stylesheet' type='text/css'>
    </head>
    <body id="home">
        <div id="wrapper">
            <header>
                <h1><a href="index.html">SISTEM KREDIT</a></h1>
                <h2></h2>
                <!--<h2>Nyekrip <span>-</span> Web Tutorial Indonesia</h2> -->
                <nav>
                    <a href="#">Karyawan</a>
                    <div class="clearfix"></div>
                </nav>	
            </header>
            <%
                if (session.getAttribute("update") != null) {
                    Employee employee = (Employee) session.getAttribute("update");
                    nik = employee.getNik();
                    name = employee.getName();
                    hp = employee.getPhoneNumber();
                }
                if (session.getAttribute("message") != null) {
                    out.println(session.getAttribute("message"));
                }
            %>

            <div id="latest">
                <selection class="center-col">
                    <table border="1">
                        <thead>
                            <tr>
                                <th style="text-align: center">No</th>
                                <th style="text-align: center">NIK</th>
                                <th style="text-align: center">Nama</th>
                                <th style="text-align: center">Telepon</th>
                                <th style="text-align: center">Email</th>
                                <th style="text-align: center">Gaji</th>
                                <th style="text-align: center">Status</th>
                            </tr>
                        </thead>
                        <%
                            int nn = 1;
                            for (Employee e : fdao.function(new Employee(), 3, "", "")) {
                        %>      
                        <tbody>
                            <tr>
                                <td><%=nn++%></td>
                                <% if (e.getNik() != null) {
                                        out.print("<td>" + e.getNik());
                                    } else {
                                        out.print("<td>0");
                                    }
                                %>
                                </td>
                                <% if (e.getName() != null) {
                                        out.print("<td>" + e.getName());
                                    } else {
                                        out.print("<td>0");
                                    }
                                %>
                                </td>
                                <% if (e.getPhoneNumber() != null) {
                                        out.print("<td>" + e.getPhoneNumber());
                                    } else {
                                        out.print("<td>0");
                                    }
                                %>
                                </td>
                                <% if (e.getEmail() != null) {
                                        out.print("<td>" + e.getEmail());
                                    } else {
                                        out.print("<td>-");
                                    }
                                %>
                                </td>
                                <% if (e.getSalary() != null) {
                                        out.print("<td>" + e.getSalary());
                                    } else {
                                        out.print("<td>-");
                                    }
                                %>
                                </td>
                                <% if (e.getStatus() != null) {
                                        if (e.getStatus().equals("1")) {
                                            out.print("<td>Tetap");
                                        } else {
                                            out.print("<td>Kontrak");
                                        }
                                    } else {
                                        out.print("<td>-");
                                    }
                                %>
                                </td>

                                <td><a href="../Update?id=<%= e.getNik()%>">Edit</a></td>
                                <td><a href="../Delete?id=<%= e.getNik()%>">Hapus</a></td>
                            </tr>
                        </tbody>
                        <%
                            }
                        %>

                    </table>
                    <%
                        //                session.removeAttribute("message");
                    %>
                </selection>
                <form action="../Insert" method="post">
                    <table>
                        <tr>
                            <td>NIK</td>
                            <td>:</td>
                            <td><input type="text" name="nik" value="<%= nik%>"></td>
                        </tr>
                        <tr>
                            <td>Nama</td>
                            <td>:</td>
                            <td><input type="text" name="nama" value="<%= name%>"></td>
                        </tr>
                        <tr>
                            <td>Telepon</td>
                            <td>:</td>
                            <td><input type="text" name="hp" value="<%= hp%>"></td>
                        </tr>
                        <tr>
                            <td>Email</td>
                            <td>:</td>
                            <td><input type="text" name="hp" value="<%= email%>"></td>
                        </tr>
                        <tr>
                        <tr>
                            <td>Gaji</td>
                            <td>:</td>
                            <td><input type="text" name="hp" value="<%= gaji%>"></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Simpan"></td>
                            <td><input type="reset" value="Reset"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
