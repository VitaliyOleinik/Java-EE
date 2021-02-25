<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<%@include file="nav.jsp"%>
<div class="container mt-5">

    <div class="row">

        <div class="col-6 offset-3">
            <%
                String error = request.getParameter("error");

                if(error!=null){

            %>
            <div class="alert alert-danger" role="alert">
                Authentication error
            </div>
            <%
                }

            %>
            <form action="auth" method="post">
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label col-form-label-sm">Login</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control form-control-sm" placeholder="login" name="user_login">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Password</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" placeholder="password" name="user_password">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <input type="submit" value="SIGN IN" class="btn btn-primary">
                    </div>
                </div>
            </form>

        </div>

    </div>

</div>



</body>
</html>