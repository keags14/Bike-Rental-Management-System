<%-- 
    Document   : header
    Created on : 14-Aug-2020, 00:43:38
    Author     : Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<header id="home" class="header">
    <nav class="nav" role="navigation">
        <div class="container nav-elements">
            <div class="branding">
                <a href="#home"><img src="../images/BikeRentalManagementSystemLogo.svg" alt="Logo - Bike Rental Management System"></a>
            </div><!-- branding -->
                <ul class="navbar">
                        <li><a href="/home"><spring:message code="label.home"/></a></li>
                        <li><a href="/goToLogin"><spring:message code="label.login"/></a></li>
                        
                    <li><a href="/goToSearch"><spring:message code="label.rent"/></a></li>
                    
                    <li><a href="/show">cart</a></li>
                    <li><a href="/logout">logout</a></li>
                    
                    <li><div class="dropdown">
                          <a href="#" onclick="myFunction()" class="dropbtn">manage products</a>
                          <div id="myDropdown" class="dropdown-content">
                            <a href="#addproducts">Add products</a>
                            <a href="#editproducts">Edit Products</a>
                            <a href="#deleteproducts">Delete Products</a>
                          </div>
                        </div>
                    </li>
                    
                    <li><a href="/redirectToLinkedIn"><spring:message code="label.linkedin"/></a></li>
                </ul><!-- navbar -->
        </div><!-- container nav-elements -->
    </nav>
    <div class="container tagline">
        <h1 class="headline">Our Mission</h1>
        <p>We support and encourage <em>active and healthy</em> lifestyles, by offering <em>ethically sourced</em> and <em>eco-friendly</em> products for <em>everyone</em> to use.</p>
    </div><!-- container tagline -->
</header><!-- #home -->
<script>
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>
