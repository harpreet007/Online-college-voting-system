package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class voterregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<\n");
      out.write("<head>\n");
      out.write("  <title>Addvoter</title>\n");
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
      out.write("<body style=\"background: url(); background-size: 100% 100%\">\n");
      out.write(" ");

     String myid=(String)request.getAttribute("comId");
     out.println(myid);

if(myid!=null){
 out.println("<script src='sweetalert2.all.js'></script>");
                   out.println("<script src='jquery.min.js'></script>"); 
                   out.println("<script >");
                   out.println("$(document).ready(function(){");
                   out.println("swal ( 'voter Added Successfully' ,'Candidate ID : "+myid+"'  , 'success' );");
                
                   out.println("});");
                   out.println("</script>");
                   
}
//out.print(msg);
//out.print(myid);
myid=null;
//out.print(stu);   


      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Navbar is here-->\n");
      out.write("  <nav class=\"navbar navbar-default  navbar-fixed-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("               <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span> \n");
      out.write("            </button>\n");
      out.write("          \n");
      out.write("        <span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px ;color: white;\">\n");
      out.write("            <img src=\"mnnit.png\" width=\"50\" height=\"50\" alt=\"\">\n");
      out.write("              Online Voting System\n");
      out.write("          </span>\n");
      out.write("      </div>\n");
      out.write("      <!--<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"ComplaintRegister.jsp\">RegisterComplaint</a></li>\n");
      out.write("        </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"check_status.jsp\">CheckStatus</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>  -->\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!-- Complaint registration Form  is here-->\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-top: 100px; float: left;\">\n");
      out.write("  <!-- <div class=\"btn-group-vertical\" style=\"float: left;\">\n");
      out.write("    \n");
      out.write("    <button class=\"btn btn-info\"  style=\"background-color: #0097a7;\" onclick=\"window.location.href='ComplaintRegister.jsp'\"><h4>Complaint Form</h4></button>\n");
      out.write("    <button class=\"btn btn-info\"  style=\"background-color: #0097a7;\" onclick=\"window.location.href='check_status.jsp'\"><h4>Check Status</h4></button>\n");
      out.write("  </div>  --> \n");
      out.write("   \n");
      out.write("\n");
      out.write("    <div class=\"col-md-10\"> \n");
      out.write("      <div class=\"col-md-offset-3 col-md-10\">\n");
      out.write("      <h2><strong>Voter Registration Form</strong> </h2><br>\n");
      out.write("      </div>\n");
      out.write("   \n");
      out.write("    <form action=\"voterReg\" method=\"post\" class=\"form-horizontal control-form col-md-12\" data-toggle=\"validator\" role=\"form\">\n");
      out.write("       \n");
      out.write("    \n");
      out.write("\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> Frist Name:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"fname\" placeholder=\"Frist Name\" required  >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("     <!-- <div class=\"form-group\">\n");
      out.write("    <label for=\"inputName\" class=\"control-label col-md-1\">Name</label>\n");
      out.write("    <div class=\"col-md-12\"><input type=\"text\" class=\"form-control\" id=\"inputName\" name=\"stu\" placeholder=\"student ID\" required></div>\n");
      out.write("  </div>-->\n");
      out.write("\n");
      out.write("        \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> Last Name:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"lname\" placeholder=\"Last Name\" required  >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-md-5\">Sex:</label>\n");
      out.write("       <div class=\"col-md-6\">\n");
      out.write("          <select class=\"form-control\" name=\"sex\" required  >\n");
      out.write("          <option value=\"\">None</option>\n");
      out.write("          <option >MALE</option>\n");
      out.write("          <option >FEMALE</option>\n");
      out.write("          \n");
      out.write("        </select> \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> User ID:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"uid\" placeholder=\"Valid Id Number\" required  >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> Mobile:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"mob\" placeholder=\"Valid Mobile Number\" required  >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> Email:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"email\" placeholder=\"Valid Email Address\" required  >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> Address:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"add\" placeholder=\" Address\" required  >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> Dist:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"dist\" placeholder=\"District\" required  >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> Pin:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"pin\" placeholder=\"Pin\" required  >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      \n");
      out.write("            \n");
      out.write("      \n");
      out.write(" \n");
      out.write("\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <div class=\"col-md-offset-5 col-md-10\">\n");
      out.write("              <button type=\"submit\" onclick=\"loadFrame(this)\" class=\"btn btn-success col-md-3\">Submit</button>\n");
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
