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
     String myid=(String)request.getAttribute("comId");
     //out.println(myid);

if(myid!=null){
 out.println("<script src='sweetalert2.all.js'></script>");
                   out.println("<script src='jquery.min.js'></script>"); 
                   out.println("<script >");
                   out.println("$(document).ready(function(){");
                   out.println("swal ( 'Candidate Added Successfully' ,'Candidate ID : "+myid+"'  , 'success' );");
                
                   out.println("});");
                   out.println("</script>");
                   
}
//out.print(msg);
//out.print(myid);
myid=null;
//out.print(stu);   

%>  


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
       <!-- <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="logout.jsp">Logout</a></li>
        </ul>
            <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="ComplaintRegister.jsp">RegisterComplaint</a></li>
        </ul>
            <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="check_status.jsp">CheckStatus</a></li>
        </ul>-->
    </div>  
  </div>
</nav>
 

<!-- Complaint registration Form  is here-->

<div class="container" style="padding-top: 100px; float: left;">
  <!-- <div class="btn-group-vertical" style="float: left;">
    
    <button class="btn btn-info"  style="background-color: #0097a7;" onclick="window.location.href='ComplaintRegister.jsp'"><h4>Complaint Form</h4></button>
    <button class="btn btn-info"  style="background-color: #0097a7;" onclick="window.location.href='check_status.jsp'"><h4>Check Status</h4></button>
  </div>  --> 
   

    <div class="col-md-10"> 
      <div class="col-md-offset-3 col-md-10">
      <h2><strong>Candidate Registration Form</strong> </h2><br>
      </div>
   
    <form action="candidateReg" method="post" class="form-horizontal control-form col-md-12" data-toggle="validator" role="form">
       
    

         <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> Candidate Key:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="key" placeholder="Unique key" required  >
        </div>
      </div>

      <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> Frist Name:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="fname" placeholder="Frist Name" required  >
        </div>
      </div>

    

        
      <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> Last Name:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="lname" placeholder="Last Name" required  >
        </div>
      </div>

      <div class="form-group">
        <label for="Confrim Password" class="control-label col-md-5">Sex:</label>
       <div class="col-md-6">
          <select class="form-control" name="sex" required  >
          <option value="">None</option>
          <option >MALE</option>
          <option >FEMALE</option>
          
        </select> 
        </div>
      </div>

       
        <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> User ID:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="uid" placeholder="Valid Id Number" required  >
        </div>
      </div>

       <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> Mobile:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="mob" placeholder="Valid Mobile Number" required  >
        </div>
      </div>

        <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> Email:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="email" placeholder="Valid Email Address" required  >
        </div>
      </div>

       <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> Address:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="add" placeholder=" Address" required  >
        </div>
      </div>

       <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> Dist:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="dist" placeholder="District" required  >
        </div>
      </div>

       <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> Pin:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="pin" placeholder="Pin" required  >
        </div>
      </div>
    
      
      
      <div class="form-group">
        <div class="col-md-offset-5 col-md-10">
              <button type="submit" onclick="loadFrame(this)" class="btn btn-success col-md-3">Submit</button>
        </div>
      </div>
                                                
                                             
<br>
<br>
<br>
<br>
<br>
<br>
    </form> 
    </div>  
  </div>


  </body>
  </html>






