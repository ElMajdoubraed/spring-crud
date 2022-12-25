<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <style>
            table, th, td {
            border: 1px solid black;
            }
            th, td {
            padding: 10px;
            }
        </style>
    </head>
    <body class="container"> 
        <h1 class="mt-5 text-primary">Please register yourself.</h1>
            <div role="alert">
                <form:errors class="text-danger" path="visitorObject.*"/>
              </div>
        
        <form:form action="/register" method="POST" modelAttribute="visitorObject" class="col-6">
            <div class="form-group">
                <form:label path="firstName">First Name </form:label>
                <!-- <form:errors path="firstName"/> -->
                <form:input path="firstName" class="form-control w-100" placeholder="First name"/>
                <small class="form-text text-muted">First name is required.</small>
            </div>
                
                
            <div class="form-group">
                <form:label path="lastName">Last Name </form:label>
                <!-- <form:errors path="firstName"/> -->
                <form:input path="lastName" class="form-control w-100" placeholder="Last name"/>
                <small class="form-text text-muted">Last name is required.</small>
            </div>

            <div class="form-group">
                <form:label path="invitationNumber">Inviation Number</form:label>
                <!-- <form:errors path="firstName"/> -->
                <form:input type="number" path="invitationNumber" class="form-control w-100" placeholder="Last name"/>
                <small class="form-text text-muted">Inviation Number must be greater than or equal to 4.</small>
            </div>

            <input type="submit" class="w-100 btn btn-primary" value="Register Visitor"/>
        </form:form>
        <br>
        <a href="/visitorwelcomescreen">Welcome Page</a>

    </body>
    </html>