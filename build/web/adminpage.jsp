<%-- 
    Document   : adminpage
    Created on : Mar 21, 2018, 12:40:43 AM
    Author     : harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title>admin</title>
	<link rel="stylesheet" href="CSS/bootstrap.css">
	<script  src="CSS/jquery.js"></script>
	<script  src="CSS/bootstrap.js"></script>	
	<style type="CSS/text/css">
		
	</style>
		
</head>  
 
<body data-spy="scroll" data-target=".navbar" >
<!-- Navbar is here-->
	<nav class="navbar navbar-default navbar-fixed-top" >
		<div class="container">
			<div class="navbar-header">
		 		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        			<span class="icon-bar"></span>
       				 <span class="icon-bar"></span>
        			<span class="icon-bar"></span> 
      			</button>
					
				<span class="navbar-text white-text" id="New" style="font-size: 30px">
    				<img src="mnnit.png" width="50" height="50" alt="">
        			Online Voting System
    			</span>
    	</div>
    	<div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="logout.jsp">Logout</a></li>
        </ul>
         <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="addcandidate.jsp">Add Candidate</a></li>
        </ul>

        <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="result.jsp">Result</a></li>
        </ul>
   			
		</div>	
	</div>
</nav>

<!-- Complaint registration Form  is here-->

<div class="container" style="padding-top: 100px; float: left;">
  
	
	
	<div class="col-md-10"> 
      <div class="col-md-offset-3 col-md-10">
      <h2><strong>Add New Officer</strong> </h2><br>
      </div>
   
    <form action="Admin" method="post" class="form-horizontal control-form col-md-12"data-toggle="validator" role="form">
       
    
      <div class="form-group">
        <label for="Confrim Password" class="control-label col-md-5">Department:</label>
       <div class="col-md-6">
                                <select class="form-control" name="dep" required >
                                        <option value="">Select Department</option>    
                                        <option>OFFICER</option>
                                        </select> 
        </div>
      </div>


         <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> User ID:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="log" required >
        </div>
      </div>
        
      <div class="form-group">
        <label for="intputPassword" class="control-label col-md-5"> User Password:</label>
        <div class="col-md-6"><input  id="Password" type="Password" class="form-control" name="pass" required >
        </div>
      </div>
        
         <div class="form-group">
        <label for="intputPassword" class="control-label col-md-5"> Questions:</label>
         <div class="col-md-6">
                                <select class="form-control" name="dep" required >
                                        <option value="">Select Question</option>    
                                        <option>What is your mother tonuge</option>
                                        <option>What is you pet name</option>
                                        <option>Your frist school name</option>
                                        <option>Your favourite colour </option>
                                       
                                        </select> 
        </div>
      </div>

       <div class="form-group">
        <label for="intputPassword" class="control-label col-md-5"> Your Answer:</label>
        <div class="col-md-6"><input  id="Password" type="Password" class="form-control" name="pass" required >
        </div>
      </div>
                    
        <div class="form-group">
          <div class="col-md-offset-5 col-md-10">
            <button type="submit" onclick="loadFrame(this)" class="btn btn-success col-md-3"  ">Submit</button>
            </div>
        </div>
                                                
                                             
   </form> 
    </div>  
   
 
 
		
<br>
<br><br><br><br><br>


</body>
</html 
  
 
