<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE HTML>

<html>
    <head>
        <title>Product list</title>
    </head>
    <body>
        <h1>Products llist</h1>
        <c:forEach var="product" items="${products}">
            <li>${product.title} price: $ ${product.cost}</li>
        </c:forEach>
    </body>
</html>
