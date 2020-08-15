<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Bike Rental Management System</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<header id="home" class="header">
		<nav class="nav" role="navigation">
			<div class="container nav-elements">
				<div class="branding">
					<a href="#home"><img src="images/BikeRentalManagementSystemLogo.svg"
						alt="Logo - Bike Rental Management System"></a>
				</div>
				<!-- branding -->
				<ul class="navbar">
					<li><a href="/home">home</a></li>
					<li><a href="/goToLogin">search</a></li>
					<li><a href="/redirectToLinkedIn">linkedIn</a></li>
				</ul>
				<!-- navbar -->
			</div>
			<!-- container nav-elements -->
		</nav>
		<!-- <div class="container tagline">
    <h1 class="headline">Our Mission</h1>
    <p>We support and encourage <em>active and healthy</em> lifestyles, by offering <em>ethically sourced</em> and <em>eco-friendly</em> nutritional products for the <em>performance-driven</em> athlete.</p>
  </div>container tagline -->
	</header>
	<!-- #home -->

        <span class="success">${dataSaved}</span>
   	<section id="login" class="section">
		<div class="container tagline">
			<em>LOGIN USER</em>
			<form:form action="/login" method="post" modelAttribute="login">
				<label>Username</label> <form:input type="text" path="username"/><br />
                                <label>Password</label> <form:input type="password" path="password"/><br />
			     <input type="submit" value="Login">
			</form:form>
			 <a class="card-title" href="/goToRegistration">Register new user? Click here</a>
		</div>
	</section>
	<!-- #products -->

	<%@include file = "footer.jsp" %>

</body>
</html>