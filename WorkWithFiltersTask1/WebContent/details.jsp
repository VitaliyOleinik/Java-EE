<%@page import="com.dto.Students"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
    <title>Students</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

    <div class="container">

        <div class="row">
			
			<%@include file="navbar.jsp" %>			
			
        </div>
        <div class="row mt-5">
            <div class="col-12 mt-5">
                <section>
                	<%
                		String success = request.getParameter("success");
                		
                		if(success!=null){
                	%>
                	<div class="alert alert-success" role="alert">
					  Student edited successfully
					</div>
                	<%
                		}
                	%>
	                <%
	                	Students student = (Students)request.getAttribute("student");
	                	if(student!=null){
	                %>
	                <form action="save" method="post" id = "student_form">
					  <input type = "hidden" name="id" value="<%=student.getId()%>">
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">Name</label>
					    <div class="col-4">
					      <input type="text" class="form-control" name = "name" value="<%=student.getName()%>">
					    </div>
					  </div>
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">Surname</label>
					    <div class="col-4">
					      <input type="text" class="form-control" name = "surname" value="<%=student.getSurname()%>">
					    </div>
					  </div>
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">GPA</label>
					    <div class="col-4">
					      <input type="text" class="form-control" name = "gpa" value="<%=student.getGpa()%>">
					    </div>
					  </div>
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">Group</label>
					    <div class="col-4">
					      <input type="text" class="form-control" name = "group" value="<%=student.getGroupName()%>">
					    </div>
					  </div>
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">ENT Points</label>
					    <div class="col-4">
					      <input type="text" class="form-control" name = "ent" value="<%=student.getEnt()%>">
					    </div>
					  </div>					  					  
					  <div class="form-group row">
					    <div class="col-6 offset-3">
					      <input type="button" class = "btn btn-danger" onclick = "deleteStudent()" value="DELETE"></button>
					      <input type="submit" class = "btn btn-primary float-right" value = "SAVE STUDENT">
					    </div>
					  </div>
	                </form>
	                <br>
	                
	                <%
	                	}
	                %>
	      
                	             	
                </section>
            </div>
        </div>

    </div>
	<script type="text/javascript">
		function deleteStudent(){
			var conf = confirm("Are you sure?");
			if(conf){
				
				document.getElementById("student_form").action = "delete";
				document.getElementById("student_form").submit();
				
			}
		}
	</script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>
