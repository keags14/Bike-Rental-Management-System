<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Bike Rental Management System</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<%@include file = "header.jsp" %>

<%@include file = "history.jsp" %>

<%@include file = "people.jsp" %>

<em>Welcome ${username}</em>
<section id="search" class="section">
    <header class="imageheader"></header>
    <div class="container">
        <h2 class="headline">Search Products</h2>
        <form action="search" method="get">
            <label class="card-title">Search your product</label>
            <input type="search" name="search">
            <input type="submit" value="Search">
        </form>
    </div>
</section><!-- guarantee -->

<%@include file = "footer.jsp" %>
</body>
</html>
