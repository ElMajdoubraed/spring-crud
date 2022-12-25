<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <style>
            .table{
            width: 100% !important;
            }
            thead{
                background-color: blanchedalmond;
            }
            table, th, td {
            align-items: center;
            color: #71AbAC;
            border: 1px solid black;
            outline: none !important;
            }

            th, td {
            padding: 10px;
            }
        </style>
    </head>
    <body> 
        <h1>List of All visitors!</h1>
        <table class="table">
            <thead>
                <tr>
                    <th> ID </th>
                    <th> First Name </th>
                    <th> Last Name </th>
                    <th> Invitation Number </th>
                    <th> Update</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items = "${listOfvisitors}" var = "visitor">
                    <tr>
                        <td> <c:out value="${visitor.id}" /> </td>
                        <td> <c:out value="${visitor.firstName}" /> </td>
                        <td> <c:out value="${visitor.lastName}" /> </td>
                        <td> <c:out value="${visitor.invitationNumber}" /> </td>
                        <td> <a href="/editview/${visitor.id}">Edit</a></td>
                        

                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="/visitorwelcomescreen">Welcome Page</a>
    </body>
    </html>