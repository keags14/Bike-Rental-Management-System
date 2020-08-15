<%-- 
    Document   : navbar
    Created on : 14-Aug-2020, 21:26:05
    Author     : Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
--%>

<p class="lead">Shop Name</p>




<div class="list-group">


	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name}</a>
	</c:forEach>

	 
</div>
