<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Bike Rental Management System</title>
<link rel="stylesheet" href="css/style.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<%@include file = "header.jsp" %>

	<section id="search" class="section">
		<header class="imageheader"></header>
		<div class="container">
			<h2 class="headline">Search Products</h2>
			<form action="/search" method="get">
				<label class="card-title">Search your product</label>
				 <input path="search" name="search" value="">
			    <input type="submit" value="Search">
			</form>
		</div>
	</section>
	<c:if test="${!empty(products)}">
    		<section id="products" class="section">
                <c:forEach var="product" items="${products}">
                    
                        <div class="productContainer">

                            <a href="product/${product.name}">
                                <div class="productContainerItem">
                                        <img id="pic1" src="${product.imagePath}">

                                            <input path="product" type="text" name="product" value="${product.name}">

                                        <br />
                                </div>
                            </a>

                </c:forEach>
            		</div>
                    
            </section>
            </c:if>

	<%@include file = "history.jsp" %>

	<%@include file = "people.jsp" %>

	<%@include file = "footer.jsp" %>

</body>
</html>