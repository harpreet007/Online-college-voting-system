/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VOTE;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author harpreet
 */
@WebServlet(name = "loginAdmin", urlPatterns = {"/loginAdmin"})
public class loginAdmin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           String user=request.getParameter("user");
            String id=request.getParameter("id"); 
            String pass=request.getParameter("pass");
            
            out.println(user);
            out.println(id);
            out.println(pass);
            
            MyVote db=new MyVote();
           Connection con=db.getCon();
           try{
               
                out.println(user);
            out.println(id);
            out.println(pass);
            
               Statement stmt=con.createStatement();
               ResultSet rs1=stmt.executeQuery("select Admin, AdminId,Pass from admin where Admin='"+user+"'and AdminId='"+id+"'and Pass='"+pass+"'");
               HttpSession session=request.getSession();
                   session.setAttribute("id",id );
               if(rs1.next()){
                   if(user.equals("ADMIN"))
                   response.sendRedirect("adminpage.jsp");
                   else
                   response.sendRedirect("officer.jsp");
                   
               }else{
                   out.println("Wrong user");
               }
           }catch (SQLException ex) {
            Logger.getLogger(loginAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(loginAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(loginAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
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
