package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wrongVoter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("  <title>Addcandidate</title>\n");
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
      out.write("    \n");
      out.write(" ");

     String myid=null;
     //out.println(myid);

if(myid==null){
 out.println("<script src='sweetalert2.all.js'></script>");
                   out.println("<script src='jquery.min.js'></script>"); 
                   out.println("<script >");
                   out.println("$(document).ready(function(){");
                   out.println("swal ( 'You are unregistared user' ,'Please Registration First'  , 'error' );");
                
                   out.println("});");
                   out.println("</script>");
}
//out.print(msg);
//out.print(myid);
myid=null;



      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Navbar is here-->\n");
      out.write(" \n");
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
