            <%@page import="com.dto.Users"%>
<nav class="navbar fixed-top navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="index">Twitter</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    	<ul class="navbar-nav mr-auto">
                    		<%
                    		
                    			Users userData = (Users)request.getAttribute("userData");
                    			
                    			if(userData!=null){
                    		
                    		%>
		                        <li class="nav-item">
		                            <a class="nav-link" href="index"><%=userData.getFullName() %></span></a>
		                        </li>
		                        <li class="nav-item">
		                        	<a class="nav-link" href="logout">Logout</span></a>
		                        </li>                   		
                    		<%
                    			}else{
                    		%>
		                        <li class="nav-item">
		                            <a class="nav-link" href="index">Students</span></a>
		                        </li>
		                        <li class="nav-item">
		                        	<a class="nav-link" href="register">Register</span></a>
		                        </li>
		                        <li class="nav-item">
		                        	<a class="nav-link" href="login">Login</span></a>
		                        </li>
	                        <%
                    			}
	                        %>
                    	</ul>                   
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </nav>