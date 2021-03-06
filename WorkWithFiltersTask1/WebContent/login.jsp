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
	                
	                <form action="auth" method="post">
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">Email</label>
					    <div class="col-4">
					      <input type="email" class="form-control" name = "email">
					    </div>
					  </div>
					  <div class="form-group row">
					    <label class="col-2 offset-3 col-form-label">Password</label>
					    <div class="col-4">
					      <input type="password" class="form-control" name = "password">
					    </div>
					  </div>
					 					  					  
					  <div class="form-group row">
					    <div class="col-6 offset-3">
					      <input type="submit" class = "btn btn-primary float-right" value = "SIGN IN">
					    </div>
					  </div>
	                </form>
	                <br>
 	
                </section>
            </div>
        </div>

    </div>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>
