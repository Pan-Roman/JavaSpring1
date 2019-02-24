<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>

<html>
    <head>
        <title>Product list</title>
    </head>
    <body>
        <h1>Products llist</h1>
        <c:forEach var="product" items="${products}">
            <li>${product.title} ${product.cost}р.</li>
        </c:forEach>
    </body>
</html>
