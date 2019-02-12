package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InsertEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../style/form.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../style/reset.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../style/style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../style/media-queries.css\" />\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:700,400,400italic,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"home\">\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <header>\n");
      out.write("                <h1><a href=\"index.html\">SISTEM KREDIT</a></h1>\n");
      out.write("                <h2></h2>\n");
      out.write("                <!--<h2>Nyekrip <span>-</span> Web Tutorial Indonesia</h2> -->\n");
      out.write("                <nav>\n");
      out.write("                    <a href=\"#\">Karyawan</a>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </nav>\t\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <section id=\"main-content\">\n");
      out.write("                <div id=\"featured\">\n");
      out.write("                    <h3>Tambah Data Karyawan</h3>\n");
      out.write("                </div> \n");
      out.write("                <hr/>\n");
      out.write("\n");
      out.write("                <div id=\"latest\">\n");
      out.write("                    <form action=\"/action_page.php\">\n");
      out.write("                        <label for=\"nik\">NIK</label>\n");
      out.write("                        <input type=\"text\" id=\"nik\" name=\"nik\" placeholder=\"NIK\">\n");
      out.write("                        \n");
      out.write("                        <label for=\"name\">Nama</label>\n");
      out.write("                        <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Nama Lengkap\">\n");
      out.write("                        \n");
      out.write("                        <label for=\"name\">Telepon</label>\n");
      out.write("                        <input type=\"text\" id=\"telepon\" name=\"telepon\" placeholder=\"Nomor Telepon\">\n");
      out.write("                        \n");
      out.write("                        <label for=\"name\">Email</label>\n");
      out.write("                        <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Email\">                       \n");
      out.write("\n");
      out.write("<!--                        <label for=\"country\">Country</label>\n");
      out.write("                        <select id=\"country\" name=\"country\">\n");
      out.write("                            <option value=\"australia\">Australia</option>\n");
      out.write("                            <option value=\"canada\">Canada</option>\n");
      out.write("                            <option value=\"usa\">USA</option>\n");
      out.write("                        </select>-->\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" value=\"Tambah\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <hr/>\n");
      out.write("                <footer>\n");
      out.write("                    <p>&copy; 2019 - Sistem Kredit Karyawan</p>\n");
      out.write("                </footer>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
