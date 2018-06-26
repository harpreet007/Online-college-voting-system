<%-- 
    Document   : result
    Created on : Apr 13, 2018, 2:11:57 PM
    Author     : harpreet
--%>

<%@page import="VOTE.MyVote"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        			Online Voting System
    			</span>
    	</div>
    	<div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="logout.jsp">Logout</a></li>
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
			     <th>Condidate_ID</th>
				<th>total_Vote</th>
			</tr>
			</thead>
                          <%   
                           try{
                       // String com=(String)session.getAttribute("id");  
           // out.print(com)
                    MyVote db=new MyVote();
                    Connection con=db.getCon();
                    int n=0;
                        
             Statement stmt=con.createStatement();
             ResultSet rs1=stmt.executeQuery("select Cankey, Tvote from total_vote where Cankey='BJP' or Cankey='BSP'" );
             
            
             while( rs1.next()){
                 n++;
                 String num=Integer.toString(n);
                 String can = (String) rs1.getString("Cankey");
                 String vote= rs1.getString("Tvote");
                 
                %>
			<tbody>
			<tr>
			     <td><%out.println(can);%></td>
				 <td><%out.println(vote);%></td>
			</tr>
			
			</tbody>
                       <%
           
          }
         }catch(Exception e){}
        
        %>
		</table> 
 		</div>
   
 	</div>
 
		
<br>
<br><br><br><br><br>


</body>
</html 
