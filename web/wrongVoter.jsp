<%-- 
    Document   : addcandidate
    Created on : Mar 21, 2018, 12:30:12 AM
    Author     : harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
  <title>Addcandidate</title>
  <link rel="stylesheet" href="CSS\bootstrap.css">
  <script  src="CSS\jquery.js"></script>
  <script  src="CSS\bootstrap.js"></script>
        
        
      <!-- <script src='sweetalert2.all.js'></script>
                 <script src='jquery.min.js'></script>
              <script>
                   $(document).ready(function(){
                  swal ( 'Oops' , 'Something went wrong!' , 'error' );
                  });
                  </script>-->
        
       
                  
</head>  
<body style="background: url(); background-size: 100% 100%">
    
 <%
     String myid=null;
     //out.println(myid);

if(myid==null){
 out.println("<script src='sweetalert2.all.js'></script>");
                   out.println("<script src='jquery.min.js'></script>"); 
                   out.println("<script >");
                   out.println("$(document).ready(function(){");
                   out.println("swal ( 'You are unregistered user' ,'Please Registration First'  , 'error' );");
                
                   out.println("});");
                   out.println("</script>");
}
//out.print(msg);
//out.print(myid);


%>  


<!-- Navbar is here-->
 


  </body>
  </html>






