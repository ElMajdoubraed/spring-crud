<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <style>
            body{
                background-color: rgba(241, 241, 241, 0.562);
            }
        </style>
    </head>
    <body class="container"> 
        <h1 class="text-primary text-center mt-5 mb-3"> Welcome to Dashboard !</h1>

        <div class="row mt-5">
            <div class="col-6">
                <h3 class="mb-3">
                    <a class="btn btn-primary stretched-link w-100" href="/registrationviewpage">To Add article please click here</a>
                </h3>
            </div>
            
            <div class="col-6">
                <h3>
                  <a class="btn btn-primary stretched-link w-100" href="/visitor">To view all articles, please click here!</a>
                </h3>
            </div>

            <div class="col-12">
                <a class="btn btn-secondary stretched-link w-100" href="/logout">Logout</a>
            </div>
        </div>

        
    </body>
</html>