<%-- 
    Document   : officer.jsp
    Created on : Apr 10, 2018, 9:52:15 AM
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
        			College Voting System
    			</span>
    	</div>
    	<div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="beauty.html">Logout</a></li>
        </ul>
         <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="addvoter.html">Add voter</a></li>
        </ul>
   			
		</div>	
	</div>
</nav>

<!-- Complaint registration Form  is here-->

<div class="container" style="padding-top: 100px; float: left;">
  
	
	
	 <div class="col-md-10" style="float: right">
     	<table class="table table-hover" style="float: right;">
     		<thead>
			<tr>
			     <th>Complaint_ID</th>
				<th>Stu_ID</th>
			
				<th>Department</th>
				<th>Course</th>
				
				<th>Complaint     </th>
				<th>Complaint_Date     </th>
				
				
			</tr>
			</thead>
			<tbody>
			<tr>
			     <td>2017/CSED/0001</td>
				 <td>206CA10</td>
				   <td>CSED</td>
				    <td>MCA</td>
				      <td>this is inform you to please issue my  marksheet as soon as possible.</td>
				       <td>2017/10/01</td>
				      
				         <td><button class="btn btn-info btn-xs btn-success" style="background-color: green;">Reply</button></td>
				         <td><button class="btn btn-info btn-xs" style="background-color: #0097a7;">Reply</button></td>
				
			</tr>
			<tr>
			     <td>2017/CSED/0001</td>
				 <td>206CA10</td>
				   <td>CSED</td>
				    <td>MCA</td>
				      <td>this is inform you to please issue my  marksheet as soon as possible.</td>
				       <td>2017/10/01</td>
				      
				         <td><button class="btn btn-info btn-xs" style="background-color: #0097a7;">Reply</button></td>
				         <td><button class="btn btn-info btn-xs" style="background-color: #0097a7;">Reply</button></td>
				
			</tr>
			<tr>
			     <td>2017/CSED/0001</td>
				 <td>206CA10</td>
				   <td>CSED</td>
				    <td>MCA</td>
				      <td>this is inform you to please issue my  marksheet as soon as possible.</td>
				       <td>2017/10/01</td>
				      
				         <td><button class="btn btn-info btn-xs" style="background-color: #0097a7;">Reply</button></td>
				         <td><button class="btn btn-info btn-xs" style="background-color: #0097a7;">Reply</button></td>
				
			</tr>
			</tbody>
		</table> 
 		</div>
   
 	</div>
 
		
<br>
<br><br><br><br><br>


</body>
</html 

