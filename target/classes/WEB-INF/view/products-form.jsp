<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>

<html>
    <head>
        <title>Product form</title>
    </head>
    <body>
        <h1>Products form</h1>
        <form:form action="addProduct" modelAttribute="product">
            Title: <form:input path="title" />
            <br>
            Cost: <form:input path="cost" />
            <br>
            <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>
