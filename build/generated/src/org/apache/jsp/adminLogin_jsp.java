package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>My first bootstrap</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"CSS/bootstrap.css\">\n");
      out.write("\t<script  src=\"CSS/jquery.js\"></script>\n");
      out.write("\t<script  src=\"CSS/bootstrap.js\"></script>\t\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t\n");
      out.write("\t</style>\n");
      out.write("\t\t\n");
      out.write("</head>  \n");
      out.write(" \n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" style=\"background-color: white;\" >\n");
      out.write("<!-- Navbar is here-->\n");
      out.write("\t<nav class=\"navbar navbar-default  navbar-fixed-top\" >\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t \t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        \t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("       \t\t\t\t <span class=\"icon-bar\"></span>\n");
      out.write("        \t\t\t<span class=\"icon-bar\"></span> \n");
      out.write("      \t\t\t</button>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t<span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px\">\n");
      out.write("    \t\t\t\tOnline Voting System\n");
      out.write("    \t\t\t</span>\n");
      out.write("    \t</div>\n");
      out.write("    \t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("        <!--<ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"beauty.html\">Logout</a></li>\n");
      out.write("        </ul>-->\n");
      out.write("   \t\t\t\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<!-- Complaint registration Form  is here-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-top: 100px; float: left;\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <div class=\"col-md-10\"> \n");
      out.write("      <div class=\"col-md-offset-3 col-md-10\">\n");
      out.write("      <h2><strong>User Login Here</strong> </h2><br>\n");
      out.write("      </div>\n");
      out.write("   \n");
      out.write("    <form action=\"loginAdmin\" method=\"post\" class=\"form-horizontal control-form col-md-12\"data-toggle=\"validator\" role=\"form\">\n");
      out.write("       \n");
      out.write("    \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"Confrim Password\" class=\"control-label col-md-5\">Department:</label>\n");
      out.write("       <div class=\"col-md-6\">\n");
      out.write("                                <select class=\"form-control\" name=\"user\" required >\n");
      out.write("                                        <option value=\"\">Select User</option>    \n");
      out.write("                                        <option>ADMIN</option>\n");
      out.write("                                        <option>OPERATER</option>\n");
      out.write("                                        </select> \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> User ID:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"id\" required >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"intputPassword\" class=\"control-label col-md-5\"> User Password:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"Password\" type=\"Password\" class=\"form-control\" name=\"pass\" required >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("                    \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <div class=\"col-md-offset-5 col-md-10\">\n");
      out.write("            <button type=\"submit\" onclick=\"loadFrame(this)\" class=\"btn btn-success col-md-3\"  \">Submit</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                                                \n");
      out.write("                                             \n");
      out.write("   </form> \n");
      out.write("    </div>  \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br><br><br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html \n");
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
