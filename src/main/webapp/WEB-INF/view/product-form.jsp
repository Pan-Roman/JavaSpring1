<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE HTML>

<html>
    <head>
        <title>Product form</title>
    </head>
    <body>
        <h1>Products form Тестовый привет</h1>
        <form:form action="addProduct" modelAttribute="product">
            ID: <form:input path="id" />
            <br>
            Title: <form:input path="title" />
            <br>
            Cost: <form:input path="cost" />
            <br>
            <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>
