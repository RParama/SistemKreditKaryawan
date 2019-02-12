<%-- 
    Document   : Beranda
    Created on : Feb 11, 2019, 1:03:05 PM
    Author     : gandol
--%>

<%@page import="models.Loan"%>
<%@page import="daos.DAO"%>
<%@page import="daos.FunctionDAO"%>
<%@page import="tools.NewHibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="controllers.GeneralController"%>
<%@page import="models.Employee"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
    FunctionDAO fdao = new FunctionDAO();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pinjaman</title>
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
                    <a href="Beranda.jsp">Karyawan</a>
                    <a href="#">Pinjaman</a>
                    <a href="#">Angsuran</a>
                    <div class="clearfix"></div>
                </nav>	
            </header>

            <div id="latest">
                <selection class="center-col">
                    <p>Pinjaman</p><br>    
                    <table>
<!--                        <thead>-->
                            <tr>
                                <th>No</th>
                                <th>NIK</th>
                                <th>Nama</th>
                                <th>Admin</th>
                                <th>Nominal</th>
                                <th>Angsuran</th>
                                <th>Tenor</th>
                                <th>Status Pinjaman</th>
                            </tr>
<!--                        </thead>-->
                        <%
                            int nn = 1;
//                            for (Loan e : fdao.function(new Loan(), 3, "", ""))) {
                            for (Loan e : fdao.function(new Loan(), 3, "", "")) {
                                    
                        %>      
<!--                        <tbody>-->
                            <tr>
                                <td><%=nn++%></td>
                                <% if (e.getNik() != null) {
                                        out.print("<td>" + e.getNik().getNik());
                                    } else {
                                        out.print("<td>0");
                                    }
                                %>
                                </td>
                                <% if (e.getNik() != null) {
                                        out.print("<td>" + e.getNik().getName());
                                    } else {
                                        out.print("<td>0");
                                    }
                                %>
                                </td>
                                <% if (e.getAdmin() != null) {
                                        out.print("<td>" + e.getAdmin().getName());
                                    } else {
                                        out.print("<td>0");
                                    }
                                %>
                                </td>
                                <% if (e.getNominal() != 0) {
                                        out.print("<td>" + e.getNominal());
                                    } else {
                                        out.print("<td>0");
                                    }
                                %>
                                </td>
                                <% if (e.getMonthlyPayment()!= 0) {
                                        out.print("<td>" + e.getMonthlyPayment());
                                    } else {
                                        out.print("<td>0");
                                    }
                                %>
                                </td>
                                <% if (e.getLoanDuration()!= 0) {
                                        out.print("<td>" + e.getLoanDuration());
                                    } else {
                                        out.print("<td>0");
                                    }
                                %>
                                </td>
                                <% if (e.getStatus() != null) {
                                        out.print("<td>" + e.getStatus());
                                    } else {
                                        out.print("<td>-");
                                    }
                                %>
                                </td>
                                
                                <td><a style="color: #6666ff" href="../Update?id=<%= e.getNik()%>">Edit</a></td>
                                <td><a style="color: #6666ff" href="BerandaDetail.jsp">Detail</a></td>
<!--                                <td><a href="../Delete?id=">Hapus</a></td>-->
                            </tr>
<!--                        </tbody>-->
                        <%
                            }
                        %>

                    </table>
                    <%
                        //                session.removeAttribute("message");
                    %>
                </selection>
<!--                <form action="../Insert" method="post">
                    <table>
                        <tr>
                            <td>NIK</td>
                            <td>:</td>
                            <td><input type="text" name="nik"></td>
                        </tr>
                        <tr>
                            <td>Nama</td>
                            <td>:</td>
                            <td><input type="text" name="nama">"></td>
                        </tr>
                        <tr>
                            <td>Telepon</td>
                            <td>:</td>
                            <td><input type="text" name="hp">"></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Simpan"></td>
                            <td><input type="reset" value="Reset"></td>
                        </tr>
                    </table>
                </form>-->
            </div>
                <hr/>
                    <footer>
                        <p>&copy; 2019 - Sistem Kredit Karyawan</p>
                    </footer>
        </div>
    </body>
</html>
