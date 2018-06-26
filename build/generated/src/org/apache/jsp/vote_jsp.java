package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import VOTE.MyVote;
import java.util.Random;

public final class vote_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>My first bootstrap</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"CSS\\bootstrap.css\">\n");
      out.write("  <script  src=\"CSS\\jquery.js\"></script>\n");
      out.write("  <script  src=\"CSS\\bootstrap.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      <!-- <script src='sweetalert2.all.js'></script>\n");
      out.write("                 <script src='jquery.min.js'></script>\n");
      out.write("              <script>\n");
      out.write("                   $(document).ready(function(){\n");
      out.write("                  swal ( 'Oops' , 'Something went wrong!' , 'error' );\n");
      out.write("                  });\n");
      out.write("                  </script>-->\n");
      out.write("        \n");
      out.write("       \n");
      out.write("                  \n");
      out.write("</head>  \n");
      out.write("<body>\n");
      out.write("   \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Navbar is here-->\n");
      out.write(" <nav class=\"navbar navbar-default  navbar-fixed-top\" style=\"background-color: ;\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("               <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span> \n");
      out.write("            </button>\n");
      out.write("           <span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px ;color: white;\">\n");
      out.write("            <img src=\"mnnit.png\" width=\"50\" height=\"50\" alt=\"\">\n");
      out.write("            College Voting System\n");
      out.write("          </span>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!-- Complaint registration Form  is here-->\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-top: 150px; float: left;\">\n");
      out.write("    <div class=\"col-md-10\"> \n");
      out.write("      \n");
      out.write("   \n");
      out.write("    <form action=\"voteDone\" method=\"post\" class=\"form-horizontal control-form col-md-12\" data-toggle=\"validator\" role=\"form\">\n");
      out.write("        ");

        String newId= (String) session.getAttribute("id");
        //out.println(newId);
        
        
        Random rand = new Random();
        String r = String.format("%04d", rand.nextInt(10000));
        session.setAttribute("R", r);
        
      
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("         <div class=\"form-group \">\n");
      out.write("         <div class=\" col-md-offset-6 col-md-4\">\n");
      out.write("\n");
      out.write("        <label for=\"inputNam\" name=\"preet\">Your OTP Is : ");
out.println(r); 
      out.write("</label>\n");
      out.write("        <input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"otp\" placeholder=\"Please enter OTP\" required  >\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("     \n");
      out.write("\n");
      out.write("      <div class=\"form-group \">\n");
      out.write("         <div class=\" col-md-offset-6 col-md-4\">\n");
      out.write("\n");
      out.write("        <label for=\"inputName\">Please Select Your Choice</label>\n");
      out.write("         <select class=\"form-control\" name=\"vote\" required  >\n");
      out.write("          <option value=\"\">None</option>\n");
      out.write("           ");

           MyVote db=new MyVote();
           Connection con=db.getCon();
           try{
               Statement stmt=con.createStatement();
               ResultSet rs=stmt.executeQuery("select Cankey from candidate");
               while(rs.next()){
                   
                   String ch=(String) rs.getString("Cankey");
                   out.println(ch);
                     
        
      out.write("\n");
      out.write("          <option >");
out.println(ch);
      out.write("</option>\n");
      out.write("          ");
 }
           }catch (Exception ex) {
                
            }
      out.write("           \n");
      out.write("        </select> \n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("\n");
      out.write("      \n");
      out.write("       <br>\n");
      out.write("\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <div class=\"col-md-offset-6 col-md-6\">\n");
      out.write("              <button type=\"submit\" onclick=\"loadFrame(this)\" class=\"btn btn-success col-md-4\" ><strong>Vote</strong> </button>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("                                                \n");
      out.write("                                             \n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("    </form> \n");
      out.write("    </div>  \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("  </html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
