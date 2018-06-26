/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VOTE;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hsqldb.StatementSet;
import static org.omg.CORBA.AnySeqHelper.insert;

/**
 *
 * @author harpreet
 */
@WebServlet(name = "voterReg", urlPatterns = {"/voterReg"})
public class voterReg extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           String fname=request.getParameter("fname");
            String lname=request.getParameter("lname"); 
            String sex=request.getParameter("sex");
             String uid=request.getParameter("uid");
              String mob=request.getParameter("mob");
               String email=request.getParameter("email"); 
               String add=request.getParameter("add");
                String dist=request.getParameter("dist");
                 String pin=request.getParameter("pin");
                 
                 
                 out.println(fname);
                  out.println(lname);
                   out.println(sex);
                    out.println(uid);
                     out.println(mob); out.println(email);
                      out.println(add);
                       out.println(dist);
                        out.println(pin);
                        
                        MyVote db=new MyVote();
                        Connection con=db.getCon();
                        try{
                            Statement stmt=con.createStatement();
                           // out.println("Hello frineds");
                            
                         stmt.executeUpdate("insert into voter(Fname,Lname,sex,UserId,Mobile,Email,Address,Dist,Pin)values('"+fname+"','"+lname+"','"+sex+"','"+uid+"','"+mob+"','"+email+"','"+add+"','"+dist+"','"+pin+"')");
                            request.setAttribute("comId", uid);
                       request.getRequestDispatcher("voterregistration.jsp").forward(request, response);                                           
                            
                        }catch (SQLException ex) {
            Logger.getLogger(voterReg.class.getName()).log(Level.SEVERE, null, ex);
        }
                       
                     
                   
            
        } catch (SQLException ex) {
            Logger.getLogger(voterReg.class.getName()).log(Level.SEVERE, null, ex);
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
