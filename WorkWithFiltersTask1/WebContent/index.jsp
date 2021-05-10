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
	                
	                <form action="addstudent" method="post">
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">Name</label>
					    <div class="col-4">
					      <input type="text" class="form-control" name = "name">
					    </div>
					  </div>
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">Surname</label>
					    <div class="col-4">
					      <input type="text" class="form-control" name = "surname">
					    </div>
					  </div>
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">GPA</label>
					    <div class="col-4">
					      <input type="text" class="form-control" name = "gpa">
					    </div>
					  </div>
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">Group</label>
					    <div class="col-4">
					      <input type="text" class="form-control" name = "group">
					    </div>
					  </div>
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">ENT Points</label>
					    <div class="col-4">
					      <input type="text" class="form-control" name = "ent">
					    </div>
					  </div>					  					  
					  <div class="form-group row">
					    <div class="col-6 offset-3">
					      <input type="submit" class = "btn btn-primary float-right" value = "ADD STUDENT">
					    </div>
					  </div>
	                </form>
	                <br>
	                
	                <table class="table table-hover">
					  <thead>
					    <tr>
					      <th scope="col">#</th>
					      <th scope="col">Name</th>
					      <th scope="col">Surname</th>
					      <th scope="col">Details</th>
					    </tr>
					  </thead>
					  <tbody>
	          			<%
		                
		                	ArrayList<Students> students = (ArrayList<Students>)request.getAttribute("stList");
		                	
			                if(students!=null){
			                	for(Students st : students){
			                		
			            %>
							<tr>
						      <th scope="row"><%=st.getId() %></th>
						      <td><%=st.getName() %></td>
						      <td><%=st.getSurname() %></td>
						      <td><a href = "details?id=<%=st.getId() %>" class = "btn btn-primary btn-sm">DETAILS</a></td>
						    </tr>		            
			            <%
			                		
			                	}
			                }
		                
		                %>
				  </tbody>
				</table>
	      
                	             	
                </section>
            </div>
        </div>

    </div>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>
