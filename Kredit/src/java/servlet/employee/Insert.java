/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.employee;

import controllers.ControllerInterface;
import controllers.GeneralController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Employee;
import org.hibernate.SessionFactory;
import tools.NewHibernateUtil;

/**
 *
 * @author gandol
 */
@WebServlet(name = "Insert", urlPatterns = {"/Insert"})
public class Insert extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String nik = request.getParameter("nik");
        String name = request.getParameter("nama");
        String hp = request.getParameter("hp");
        String email = "";
        String user = "";
        String pass = "";
        Long salary = null;
        String status  = "";
        String isdel   = "";        
        
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
        
        try (PrintWriter out = response.getWriter()) {
            SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
            ControllerInterface<Employee> ci = new GeneralController(sessionFactory);
            Employee e = new Employee(nik, name, hp, email, user, pass, salary, status, isdel);
            String message = "Gagal";
            if (ci.saveOrEdit(e)) {
                message = "Berhasil";
            }
            session.setAttribute("message", message);
            response.sendRedirect("views/Beranda.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
