<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="UTF-8">
<title>Bike Rental Management System</title>
	<link rel="stylesheet" href="/css/style.css"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

	<%@include file = "header.jsp" %>

	<section id="registration" class="section">
	 <div class="container tagline">
	 <em>Register User</em><br/>
    		 <form:form method="post" action="/registeruser" modelAttribute="newuser">
    			<label>Username</label> <form:input path="username" type="text" /><form:errors path="username" cssClass="error"/><br/>
    			<label>Password</label> <form:input path="password" type="password" /><form:errors path="password" cssClass="error"/><br/>
    			<label>First Name</label> <form:input path="firstName" type="text" /><form:errors path="firstName" cssClass="error"/><br/>
    			<label>Last Name</label> <form:input path="lastName" type="text" /><br/>
    			<label>What do you want to do? </label> 
				<form:radiobutton path="activity" id="activity" value="sport"/>Play a Sport?
				<form:radiobutton path="activity" id="activity" value="gym"/>Hit the Gym?<br/>
                                <form:errors path="activity" cssClass="error"/><br/>
    			<label>Date of birth</label>
    			<form:input path="dateOfBirth" type="date" />
                        <form:errors path="dateOfBirth" cssClass="error"/>
                        <br/>
    			<label>Gender</label>
    			<form:select path="gender" items="${genderItems}"/>
    			<br/>
    			<input type="submit" value="Submit" id="submit">
    		</form:form>
		</div>
	</section>
        
	<%@include file = "footer.jsp" %>

</body>
</html>