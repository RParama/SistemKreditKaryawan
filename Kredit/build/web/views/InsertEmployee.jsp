<%-- 
    Document   : InsertEmployee
    Created on : Feb 11, 2019, 9:15:11 PM
    Author     : diostwn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <nav>
                    <a href="#">Karyawan</a>
                    <div class="clearfix"></div>
                </nav>	
            </header>

            <section id="main-content">
                <div id="featured">
                    <h3>Tambah Data Karyawan</h3>
                </div> 
                <hr/>

                <div id="latest">
                    <form action="/action_page.php">
                        <label for="nik">NIK</label>
                        <input type="text" id="nik" name="nik" placeholder="NIK">

                        <label for="name">Nama</label>
                        <input type="text" id="name" name="name" placeholder="Nama Lengkap">

                        <label for="name">Telepon</label>
                        <input type="text" id="telepon" name="telepon" placeholder="Nomor Telepon">

                        <label for="name">Email</label>
                        <input type="text" id="name" name="name" placeholder="Email">      
                        <input type="submit" value="Tambah">
                    </form>
                </div>

                <hr/>
                <footer>
                    <p>&copy; 2019 - Sistem Kredit Karyawan</p>
                </footer>
                </body>
                </html>
