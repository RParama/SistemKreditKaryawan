package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import daos.FunctionDAO;
import tools.NewHibernateUtil;
import org.hibernate.SessionFactory;
import controllers.GeneralController;
import models.Employee;
import java.util.List;

public final class Beranda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    FunctionDAO fdao = new FunctionDAO();
    String nik = "", name = "", hp = "";

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../style/table.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../style/reset.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../style/style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../style/media-queries.css\" />\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:700,400,400italic,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"home\">\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <header>\n");
      out.write("                <h1><a href=\"index.html\">SISTEM KREDIT</a></h1>\n");
      out.write("                <h2></h2>\n");
      out.write("                <!--<h2>Nyekrip <span>-</span> Web Tutorial Indonesia</h2> -->\n");
      out.write("                <nav>\n");
      out.write("                    <a href=\"#\">Karyawan</a>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </nav>\t\n");
      out.write("            </header>\n");
      out.write("            ");

                if (session.getAttribute("update") != null) {
                    Employee employee = (Employee) session.getAttribute("update");
                    nik = employee.getNik();
                    name = employee.getName();
                    hp = employee.getPhoneNumber();
                }
                if (session.getAttribute("message") != null) {
                    out.println(session.getAttribute("message"));
                }
            
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"latest\">\n");
      out.write("                <selection class=\"center-col\">\n");
      out.write("                    ----------------------------------------------\n");
      out.write("                    <table border=\"1\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>No</th>\n");
      out.write("                                <th>NIK</th>\n");
      out.write("                                <th>Nama</th>\n");
      out.write("                                <th>Telepon</th>\n");
      out.write("                                <th>Email</th>\n");
      out.write("                                <th>Gaji</th>\n");
      out.write("                                <th>Status</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        ");

                            int nn = 1;
                            for (Employee e : fdao.function(new Employee(), 3, "", "")) {
                        
      out.write("      \n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(nn++);
      out.write("</td>\n");
      out.write("                                ");
 if (e.getNik() != null) {
                                        out.print("<td>" + e.getNik());
                                    } else {
                                        out.print("<td>0");
                                    }
                                
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                ");
 if (e.getName() != null) {
                                        out.print("<td>" + e.getName());
                                    } else {
                                        out.print("<td>0");
                                    }
                                
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                ");
 if (e.getPhoneNumber() != null) {
                                        out.print("<td>" + e.getPhoneNumber());
                                    } else {
                                        out.print("<td>0");
                                    }
                                
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                ");
 if (e.getEmail() != null) {
                                        out.print("<td>" + e.getEmail());
                                    } else {
                                        out.print("<td>-");
                                    }
                                
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                ");
 if (e.getSalary() != null) {
                                        out.print("<td>" + e.getSalary());
                                    } else {
                                        out.print("<td>-");
                                    }
                                
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                ");
 if (e.getStatus() != null) {
                                        if (e.getStatus().equals("1")) {
                                            out.print("<td>Tetap");
                                        } else {
                                            out.print("<td>Kontrak");
                                        }
                                    } else {
                                        out.print("<td>-");
                                    }
                                
      out.write("\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td><a href=\"../Update?id=");
      out.print( e.getNik());
      out.write("\">Edit</a></td>\n");
      out.write("                                <td><a href=\"../Delete?id=");
      out.print( e.getNik());
      out.write("\">Hapus</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    ");

                        //                session.removeAttribute("message");
                    
      out.write("\n");
      out.write("                </selection>\n");
      out.write("<!--                <form action=\"../Insert\" method=\"post\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>NIK</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"nik\" value=\"");
      out.print( nik);
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nama</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"nama\" value=\"");
      out.print( name);
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Telepon</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"hp\" value=\"");
      out.print( hp);
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"Simpan\"></td>\n");
      out.write("                            <td><input type=\"reset\" value=\"Reset\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
