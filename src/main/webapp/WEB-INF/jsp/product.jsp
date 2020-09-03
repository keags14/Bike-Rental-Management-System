<%-- 
    Document   : product
    Created on : 13-Aug-2020, 04:37:51
    Author     : Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
--%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Bike Rental Management System</title>
        <link rel="stylesheet" href="../css/style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%@include file = "header.jsp" %>
        
        <c:if test="${!empty(product)}">
            <section class="section">
                <div class="productContainerItem">
                    <form action="/show">
                    <img id="pic1" src="../${product.imagePath}">
                        <em>Product Details</em><br />
                        <em>ID: </em><input type="text" name="productid" value="${product.id}" readonly><br />
                        <em>Name: </em><input type="text" name="name" value="${product.name}" readonly><br />
                        <em>Description: </em><input type="text" name="description" value="${product.description}" readonly><br />
                        <em>Rental Price (per minute)</em><input type="text" name="priceperminute" value="${product.pricePerMinute}" readonly><br />
                        <input type="submit" value="add to basket">
                    </form>
                </div>

            </section>
        </c:if>
        
        <%@include file = "footer.jsp" %><!-- #footer -->
    </body>
</html>
