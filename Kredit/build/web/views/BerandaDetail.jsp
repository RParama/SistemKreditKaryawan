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
            </header><br><br>
            <h1><a href="index.html">NANTINYA ADA DETAIL DISINI . . . .</a></h1>
        </div>
            
    </body>
</html>
