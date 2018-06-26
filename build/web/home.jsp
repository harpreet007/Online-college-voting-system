<%-- 
    Document   : home.jsp
    Created on : Apr 12, 2018, 10:00:26 PM
    Author     : harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="CSS\bootstrap.css">
        <script  src="CSS\jquery.js"></script>
        <script  src="CSS\bootstrap.js"></script>
    </head>
    <body style="background: url(); background-size: 100% 100%">
        <!-- Navbar is here-->
 <nav class="navbar navbar-default  navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
              <span class="icon-bar"></span>
               <span class="icon-bar"></span>
              <span class="icon-bar"></span> 
            </button>
          
        <span class="navbar-text white-text" id="New" style="font-size: 30px ;color: white;">
            <img src="mnnit.png" width="50" height="50" alt="">
             Online Voting System
          </span>
      </div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="adminLogin.jsp">Admin Login</a></li>
        </ul>
            <!--<ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="ComplaintRegister.jsp">RegisterComplaint</a></li>
        </ul>
            <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="check_status.jsp">CheckStatus</a></li>
        </ul>-->
    </div>  
  </div>
</nav>
        
        <!--Login start here-->
        <div class="container" style="padding-top: 300px; float: left;">
    <div class="col-md-10"> 
      
   
    <form action="sendOtp" method="post" class="form-horizontal control-form col-md-12" data-toggle="validator" role="form">
       
    

         <div class="form-group ">
         <div class="col-md-offset-12 col-md-4">
        <input  id="inputName" type="text" class="form-control" name="id" placeholder="User ID" required  >
      </div>
      </div>

   
        
        <div class="form-group">
        <div class="col-md-offset-12 col-md-4">
              <button type="submit" onclick="loadFrame(this)" class="btn btn-success col-md-4"  "><strong>Proceed</strong> </button>
              <div>
             <a href="voterregistration.jsp">  New user Register Here</a></div>
      
      
               
              </form>
    
        </div>
      </div>
        
        
        
    </body>
</html>
