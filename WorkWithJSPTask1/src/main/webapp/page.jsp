<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="?">My Site</a>

        <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item active">
                    <a class="nav-link" href="page.jsp">Login <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="users.jsp">Users</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Disabled</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
    <div class="container">
        <div class="row mt-5">
            <div class="col-6 offset-3">

                <form action="/index" method="post">
                    <input type="submit" value="SEND">
                </form>

                <form action="/index" method="get">
                    NAME : <input type="text" name="user_name">
                    AGE :
                    <select name="user_age">
                        <%

                            for(int i=1;i<100;i++){
                        %>
                            <option value="<%=i%>" ><%=i%> years</option>
                        <%
                            }

                        %>
                    </select>

                    <input type="submit" value="SEND TO GET">
                </form>

                <form action="/index" method="post">
                    Name : <input type="text" name="user_name">
                    Country :
                    <select name="country">
                        <option value="Kazakhstan">KAZ</option>
                        <option value="Russia">RUS</option>
                        <option value="Kyrgyzstan">KG</option>
                        <option value="USA">US</option>
                    </select>
                    <input type="submit" value="SEND">
                </form>

                <form>
                    <div class="form-group row">
                        <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-sm-10">
                            <button type="submit" class="btn btn-primary">Sign in</button>
                        </div>
                    </div>
                </form>

            </div>
        </div>
        <div class="row">
            <div class="col-6">


            </div>
            <div class="col-6">


            </div>
        </div>
    </div>

</body>
</html>
