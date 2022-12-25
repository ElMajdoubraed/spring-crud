<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <style>
            body{
                background-color: rgba(241, 241, 241, 0.562) !important;
            }
            .table{
            width: 100% !important;
            border-radius: 5px !important;
            outline: none !important;
            }
            thead{
                background-color: rgba(241, 241, 241) !important;
                color: black;
            }
        </style>
    </head>
    <body class="container"> 
        <div class="shadow p-3 mb-5 bg-body-tertiary rounded mt-5">
        <h3 class="text-primary">Stock :</h3>
        <table class="table table-dark table-hover mt-5">
            <thead>
                <tr>
                    <th> ID </th>
                    <th> Article name </th>
                    <th> Model  </th>
                    <th> Price  </th>
                    <th> </th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items = "${listOfvisitors}" var = "visitor">
                    <tr>
                        <td> <c:out value="${visitor.id}" /> </td>
                        <td> <c:out value="${visitor.articleName}" /> </td>
                        <td> <c:out value="${visitor.articleModel}" /> </td>
                        <td> <c:out value="${visitor.price}" /> </td>
                        <td> <a href="/editview/${visitor.id}">Edit</a></td>
                        

                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
        <a class="mb-3" href="/home">Dashboard</a>
    </body>
    </html>