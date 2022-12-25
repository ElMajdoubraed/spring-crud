<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<head>
    <title>Edit article Information</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        .div-center{
            margin: auto;
            width: 50%;
        }
        table, th, td {
        border: 1px solid black;
        }
        th, td {
        padding: 10px;
        }
        body{
            background-color: rgba(241, 241, 241, 0.562);
        }
    </style>
</head>
<body class="container">
    <div class="div-center mt-5">
        <h3 class="mt-5 text-primary">Update article.</h3>
            <div role="alert">
                <form:errors class="text-danger" path="aSingleVisitorObject.*"/>
            </div>
    <!-- The difference between a new register and update is to get object.id, instead of object. -->
    <form:form action="/edit/${aSingleVisitorObject.id}" method="POST" modelAttribute="aSingleVisitorObject">
        <div class="form-group">
            <form:label path="articleName">Article name</form:label>
            <form:input path="articleName" class="form-control w-100" placeholder="Article name"/>
            <small class="form-text text-muted">Article name is required.</small>
        </div>
            
            
        <div class="form-group">
            <form:label path="articleModel">Article Model</form:label>
            <form:input path="articleModel" class="form-control w-100" placeholder="Model"/>
            <small class="form-text text-muted">Article model is required.</small>
        </div>

        <div class="form-group">
            <form:label path="price">Price</form:label>
            <form:input type="number" path="price" class="form-control w-100" placeholder="Price"/>
            <small class="form-text text-muted">Price must be greater than 0.</small>
        </div>

        <input type="submit" class="w-100 btn btn-primary" value="Update Article"/>
    </form:form>
    <br>
    <form action="/remove/${aSingleVisitorObject.id}" method="POST">
        <input class="btn btn-danger w-100" type="submit" value="Delete Article"/>
    </form>
    <br>
    <a href="/home">Dashboard</a>

</body>
</html>