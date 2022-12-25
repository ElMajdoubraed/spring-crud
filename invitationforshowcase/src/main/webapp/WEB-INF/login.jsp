<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <style>
            .div-center{
                margin: auto;
                width: 50%;
            }
            a{
                color: white !important;
                cursor: pointer;
            }
            .xl-rounded{
                border-radius: 25px !important;
            }
            span {
                padding: 7px !important;
                border-radius: 15px !important;
            }
            body{
                background-color: rgba(241, 241, 241, 0.562);
            }
        </style>
    </head>
    <body class="container"> 

        <div class="row mt-5">
            <div class="col-6 mt-5 mb-5 rounded">
                <img class="w-100 mt-5" src='<c:url value="https://swiver.io/wp-content/uploads/2021/03/hero-stock-1024x578.png"></c:url>' />    
            </div>
            <div class="col-6 mt-5">
                <h1 class="text-primary text-center mt-5">Login !</h1>
                <div class="div-center">
                    <div class="mt-5">
                        <form:form action="/login" modelAttribute="visitorObject" method="POST" class="w-100">
                            <div class="form-group">
                                <form:label path="email">Email</form:label>
                                <form:input required="required" type="email" path="email" class="form-control w-100" placeholder="Email"/>
                                <small class="form-text text-muted">Email is required.</small>
                            </div>
                                
                                
                            <div class="form-group">
                                <form:label path="password">Password</form:label>
                                <form:input required="required" type="password" path="password" class="form-control w-100" placeholder="Password"/>
                                <small class="form-text text-muted">Password is required.</small>
                            </div>
                            <input type="submit" class="w-100 btn btn-primary xl-rounded" value="Login"/>
                          </form:form>
                    </div>
                </div>
                
            </div>
        </div>

        
    </body>
</html>