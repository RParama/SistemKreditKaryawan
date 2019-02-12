<%-- 
    Document   : UpdateEmployee
    Created on : Feb 12, 2019, 8:54:00 AM
    Author     : gandol
--%>

<%@page import="models.Employee"%>
<%@page import="daos.FunctionDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    FunctionDAO fdao = new FunctionDAO();
    String nik = "", name = "", hp = "", mail = "", usr = "", pass = "", sts = "", isDel = "";
    Long salary = new Long(0);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Karyawan</title>
        <link rel="stylesheet" type="text/css" href="../style/form.css">
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

                    //NIK
                    nik = employee.getNik();
                    //Name
                    if (employee.getName() != null) {
                        name = employee.getName();
                    } else {
                        name = "";
                    }
                    //HP
                    if (employee.getPhoneNumber() != null) {
                        hp = employee.getPhoneNumber();
                    } else {
                        hp = "";
                    }
                    //Email
                    if (employee.getEmail() != null) {
                        mail = employee.getEmail();
                    } else {
                        mail = "";
                    }
                    //Username
                    if (employee.getUsername() != null) {
                        usr = employee.getUsername();
                    } else {
                        usr = "";
                    }
                    //Password
                    if (employee.getPassword() != null) {
                        pass = employee.getPassword();
                    } else {
                        pass = "";
                    }
                    //Salary
                    if (employee.getSalary() != 0) {
                        salary = employee.getSalary();
                    } else {
                        salary = new Long(0);
                    }
                    //Status
                    if (employee.getStatus() != null) {
                        sts = employee.getStatus();
                    } else {
                        sts = "";
                    }
                    //isDelete
                    if (employee.getIsDelete() != null) {
                        isDel = employee.getIsDelete();
                    } else {
                        isDel = "";
                    }

                }
//                if (session.getAttribute("message") != null) {
//                    out.println(session.getAttribute("message"));
//                }
            %>

            <section id="main-content">
                <div id="featured">
                    <h3>Edit Data Karyawan</h3>
                </div> 
                <hr/>

                <div id="latest">
                    <form action="../Insert" method="post">                        
                        <input type="hidden" name="nik" value="<%= nik%>">

                        <label for="name">Nama</label>
                        <input type="text" name="nama" value="<%= name%>">

                        <label for="name">Telepon</label>
                        <input type="text" name="hp" value="<%= hp%>">

                        <label for="name">Email</label>
                        <input type="text" name="mail" value="<%= mail%>">
                        <input type="hidden" name="usr" value="<%= usr%>">
                        <input type="hidden" name="pass" value="<%= pass%>">                        

                        <label for="name">Gaji</label>
                        <input type="text" name="gaji" value="<%= salary%>">                       
                        <input type="hidden" name="sts" value="<%= sts%>">                       

                        <label for="name">Status Kerja</label>
                        <select name="isDel">
                            <%
                                if (isDel.equals("1")) {
                            %>
                            <option value="1">Aktif</option>
                            <option value="0">Tidak Aktif</option>
                            <%
                            } else {
                            %>
                            <option value="0">Tidak Aktif</option>
                            <option value="1">Aktif</option>
                            <%
                                }
                            %>
                        </select>

                        <input type="submit" value="Edit">
                    </form>
                </div>

                <hr/>
                <footer>
                    <p>&copy; 2019 - Sistem Kredit Karyawan</p>
                </footer>
                </body>
                </html>
