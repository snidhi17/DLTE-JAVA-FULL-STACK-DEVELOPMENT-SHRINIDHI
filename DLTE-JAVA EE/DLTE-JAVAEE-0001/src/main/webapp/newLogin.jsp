<%--
  Created by IntelliJ IDEA.
  User: xxshervs
  Date: 3/20/2023
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcoming New Customer</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<style>
    #frm{
        box-shadow: 1px 1px 50px skyblue;
    }
    span{
        color: red;
    }
</style>
</head>
<body>
<%
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
    if(session.getAttribute("banker")!=null){
%>
<div class="container text-info mt-2">
    <div class="alert alert-info rounded-5" id="frm">
        <div class="row justify-content-center">
            <h2>${requestScope.information}</h2>
            <h1 class="text-center text-info">New Customer</h1>
            <form action="newlogin" method="post" name="newone" class="col-lg-8 col-sm-12 rounded-5 p-5">
                <div class="row justify-content-between">
                    <div class="col-lg-6 col-sm-12">
                        <label>Customer ID
                            <span id="errname"></span>
                        </label>
                        <input type="text" name="acc_holder" placeholder="Customer Id" class="form-control"/>
                    </div>
                    <div class="col-lg-6 col-sm-12">
                        <label>Customer Balance</label>
                        <input type="text" name="acc_bal" placeholder="Balance" class="form-control"/>
                    </div>
                </div>
                <div class="form group">
                    <label>Customer Password
                        <span id="errpin"></span>
                    </label>
                    <input type="password" name="passcode" placeholder="Customer Password Number" class="form-control"/>
                </div>
                <div class="row justify-content-between">
                    <div class="col-lg-6 col-sm-12">
                        <label>Customer Name</label>
                        <input type="text" name="name" placeholder="Name" class="form-control"/>
                    </div>
                <div class="row justify-content-around mt-3">
                    <input class="col-1 btn btn-outline-info" type="submit" value="Add">
                    <input class="col-1 btn btn-outline-dark" type="reset" value="Cancel">
                </div>
            </form>
        </div>
    </div>
</div>
<a href="logout">Logout</a>
<%}
else{
    response.sendRedirect("index.jsp");
}%>
</body>
</html>