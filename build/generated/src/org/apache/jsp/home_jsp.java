package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS\\bootstrap.css\">\n");
      out.write("        <script  src=\"CSS\\jquery.js\"></script>\n");
      out.write("        <script  src=\"CSS\\bootstrap.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: url(); background-size: 100% 100%\">\n");
      out.write("        <!-- Navbar is here-->\n");
      out.write(" <nav class=\"navbar navbar-default  navbar-fixed-top\">\n");
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
      out.write("             Online Voting System\n");
      out.write("          </span>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"adminLogin.jsp\">Admin Login</a></li>\n");
      out.write("        </ul>\n");
      out.write("            <!--<ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"ComplaintRegister.jsp\">RegisterComplaint</a></li>\n");
      out.write("        </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"check_status.jsp\">CheckStatus</a></li>\n");
      out.write("        </ul>-->\n");
      out.write("    </div>  \n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("        <!--Login start here-->\n");
      out.write("        <div class=\"container\" style=\"padding-top: 300px; float: left;\">\n");
      out.write("    <div class=\"col-md-10\"> \n");
      out.write("      \n");
      out.write("   \n");
      out.write("    <form action=\"sendOtp\" method=\"post\" class=\"form-horizontal control-form col-md-12\" data-toggle=\"validator\" role=\"form\">\n");
      out.write("       \n");
      out.write("    \n");
      out.write("\n");
      out.write("         <div class=\"form-group \">\n");
      out.write("         <div class=\"col-md-offset-12 col-md-4\">\n");
      out.write("        <input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"id\" placeholder=\"User ID\" required  >\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("        \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <div class=\"col-md-offset-12 col-md-4\">\n");
      out.write("              <button type=\"submit\" onclick=\"loadFrame(this)\" class=\"btn btn-success col-md-4\"  \"><strong>Proceed</strong> </button>\n");
      out.write("              <div>\n");
      out.write("             <a href=\"voterregistration.jsp\">  New user Register Here</a></div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("               \n");
      out.write("              </form>\n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
