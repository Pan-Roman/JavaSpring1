<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE HTML>

<html>
    <head>
        <title>Product</title>
    </head>
    <body>
        <h1>Product</h1>
            <p>Product ID: ${product.id}</p>
            <p>Product Title: ${product.title}</p>
            <p>Product Price: $${product.cost}</p>
    </body>
</html>
