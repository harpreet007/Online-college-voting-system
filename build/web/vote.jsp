<%-- 
    Document   : vote
    Created on : Mar 21, 2018, 12:16:31 AM
    Author     : harpreet
--%>

<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="VOTE.MyVote"%>
<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
  <title>My first bootstrap</title>
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
<body>
   
 


<!-- Navbar is here-->
 <nav class="navbar navbar-default  navbar-fixed-top" style="background-color: ;">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
              <span class="icon-bar"></span>
               <span class="icon-bar"></span>
              <span class="icon-bar"></span> 
            </button>
           <span class="navbar-text white-text" id="New" style="font-size: 30px ;color: white;">
            <img src="mnnit.png" width="50" height="50" alt="">
            College Voting System
          </span>
        
      </div>
   
  </div>
</nav>
 

<!-- Complaint registration Form  is here-->

<div class="container" style="padding-top: 150px; float: left;">
    <div class="col-md-10"> 
      
   
    <form action="voteDone" method="post" class="form-horizontal control-form col-md-12" data-toggle="validator" role="form">
        <%
        String newId= (String) session.getAttribute("id");
        //out.println(newId);
        
        
        Random rand = new Random();
        String r = String.format("%04d", rand.nextInt(10000));
        session.setAttribute("R", r);
        
      %>
    

         <div class="form-group ">
         <div class=" col-md-offset-6 col-md-4">

        <label for="inputNam" name="preet">Your OTP Is : <%out.println(r); %></label>
        <input  id="inputName" type="text" class="form-control" name="otp" placeholder="Please enter OTP" required  >
      </div>
      </div>
      <br>
      
     

      <div class="form-group ">
         <div class=" col-md-offset-6 col-md-4">

        <label for="inputName">Please Select Your Choice</label>
         <select class="form-control" name="vote" required  >
          <option value="">None</option>
           <%
           MyVote db=new MyVote();
           Connection con=db.getCon();
           try{
               Statement stmt=con.createStatement();
               ResultSet rs=stmt.executeQuery("select Cankey from candidate");
               while(rs.next()){
                   
                   String ch=(String) rs.getString("Cankey");
                   out.println(ch);
                     
        %>
          <option ><%out.println(ch);%></option>
          <% }
           }catch (Exception ex) {
                
            }%>           
        </select> 
      </div>
      </div>
     
     

      
       <br>

    
      
      <div class="form-group">
        <div class="col-md-offset-6 col-md-6">
              <button type="submit" onclick="loadFrame(this)" class="btn btn-success col-md-4" ><strong>Vote</strong> </button>
             
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






