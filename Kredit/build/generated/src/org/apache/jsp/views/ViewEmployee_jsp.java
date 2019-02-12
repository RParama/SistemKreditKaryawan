package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.hibernate.SessionFactory;
import java.util.List;
import models.Employee;
import tools.NewHibernateUtil;
import controllers.Controller;

public final class ViewEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Employees Data</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Employees Data</h1>\n");
      out.write("        <div>\n");
      out.write("            ");
 SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
                Controller<Employee> econ = new Controller(sessionFactory);
      out.write("\n");
      out.write("            <table border = 1>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"text-align: center\">No</th>\n");
      out.write("                        <th>NIK</th>\n");
      out.write("                        <th>Nama</th>\n");
      out.write("                        <th>No Hp</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Gaji</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        ");
 int i = 1;
                                for (Employee emp : econ.getAll(new Employee())) {
      out.write(" \n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"text-align: center\">");
      out.print( i);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( emp.getNik());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( emp.getName());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( emp.getPhoneNumber());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( emp.getEmail());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( emp.getSalary());
      out.write("</td>\n");
      out.write("                        <td><a href= \"LoanEmployee.jsp\">Details</a>\n");
      out.write("                            <a href=\"../EditData?nik=");
      out.print( emp.getNik());
      out.write("\" class=\"btn btn-outline-primary btn-sm\">Edit</a> \n");
      out.write("                            <a href=\"../DeleteData?nik=");
      out.print( emp.getNik());
      out.write("\"class=\"btn btn-outline-danger btn-sm\">Delete</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 i++;
                            }
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
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
