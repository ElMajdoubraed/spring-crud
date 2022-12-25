<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<head>
    <title>Edit Visitor's Information</title>
</head>
<body>
    <h1>Please make corrections!</h1>
    <p>
        <form:errors path="aSingleVisitorObject.*"/>
    </p>
    <!-- The difference between a new register and update is to get object.id, instead of object. -->
    <form:form action="/edit/${aSingleVisitorObject.id}" method="POST" modelAttribute="aSingleVisitorObject">
        
        <p>
            <form:label path="firstName">First Name </form:label>
            <!-- <form:errors path="firstName"/> -->
            <form:input path="firstName" />
        </p>
        <p>
            <form:label path="lastName">Last Name </form:label>
            <!-- <form:errors path="lastName"/> -->
            <form:input path="lastName" />
        </p>
        <p>
            <form:label path="invitationNumber">Inviation Number</form:label>
            <!-- <form:errors path="invitationNumber"/> -->
            <form:input type="number" path="invitationNumber" />
        </p>
        <input type="submit" value="Register Visitor"/>
    </form:form>
    <br>
    <form action="/remove/${aSingleVisitorObject.id}" method="POST">
        <input type="submit" value="delete"/>
    </form>
    <br>
    <a href="/visitorwelcomescreen">Welcome Page</a>

</body>
</html>