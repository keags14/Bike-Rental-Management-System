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
                    <form>
                    <img id="pic1" src="../${product.imagePath}">
                        <em>Product Details</em>
                        <em>ID: </em><input type="text" name="product" value="${product.id}"><br />
                        <em>Name: </em><input type="text" name="product" value="${product.name}"><br />
                        <em>Description: </em><input type="text" name="product" value="${product.description}"><br />
                        <em>Rental Price (per minute)</em><input type="text" name="product" value="${product.pricePerMinute}"><br />
                        <input type="submit" value="Rent">
                    </form>
                </div>

            </section>
        </c:if>
        
        <%@include file = "footer.jsp" %><!-- #footer -->
    </body>
</html>
