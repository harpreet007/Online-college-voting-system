<%-- 
    Document   : adminLogin
    Created on : Mar 21, 2018, 12:22:18 AM
    Author     : harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title>My first bootstrap</title>
	<link rel="stylesheet" href="CSS/bootstrap.css">
	<script  src="CSS/jquery.js"></script>
	<script  src="CSS/bootstrap.js"></script>	
	<style type="text/css">
		
	</style>
		
</head>  
 
<body data-spy="scroll" data-target=".navbar" style="background-color: white;" >
<!-- Navbar is here-->
	<nav class="navbar navbar-default  navbar-fixed-top" >
		<div class="container">
			<div class="navbar-header">
		 		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        			<span class="icon-bar"></span>
       				 <span class="icon-bar"></span>
        			<span class="icon-bar"></span> 
      			</button>
					
				<span class="navbar-text white-text" id="New" style="font-size: 30px">
    				Online Voting System
    			</span>
    	</div>
    	<div class="collapse navbar-collapse" id="myNavbar">
        <!--<ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="beauty.html">Logout</a></li>
        </ul>-->
   			
		</div>	
	</div>
</nav>

	

<!-- Complaint registration Form  is here-->


<div class="container" style="padding-top: 100px; float: left;">
  

    <div class="col-md-10"> 
      <div class="col-md-offset-3 col-md-10">
      <h2><strong>User Login Here</strong> </h2><br>
      </div>
   
    <form action="loginAdmin" method="post" class="form-horizontal control-form col-md-12"data-toggle="validator" role="form">
       
    
      <div class="form-group">
        <label for="Confrim Password" class="control-label col-md-5">Department:</label>
       <div class="col-md-6">
                                <select class="form-control" name="user" required >
                                        <option value="">Select User</option>    
                                        <option>ADMIN</option>
                                        <option>OPERATER</option>
                                        </select> 
        </div>
      </div>


         <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> User ID:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="id" required >
        </div>
      </div>
        
      <div class="form-group">
        <label for="intputPassword" class="control-label col-md-5"> User Password:</label>
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
  </div>

<br>
<br><br><br><br><br>


</body>
</html 

