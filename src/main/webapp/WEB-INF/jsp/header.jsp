<%-- 
    Document   : header
    Created on : 14-Aug-2020, 00:43:38
    Author     : Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<header id="home" class="header">
    <nav class="nav" role="navigation">
        <div class="container nav-elements">
            <div class="branding">
                <a href="#home"><img src="../images/BikeRentalManagementSystemLogo.svg" alt="Logo - Bike Rental Management System"></a>
            </div><!-- branding -->
            <ul class="navbar">
                <li><a href="/home"><spring:message code="label.home"/></a></li>
                <li><a href="/goToLogin"><spring:message code="label.login"/></a></li>
                <li><a href="/goToSearch"><spring:message code="label.search"/></a></li>
                <li><a href="">add products</a></li>
                <li><a href="">manage products</a></li>
                <li><a href="/redirectToLinkedIn"><spring:message code="label.linkedin"/></a></li>
            </ul><!-- navbar -->
        </div><!-- container nav-elements -->
    </nav>
    <div class="container tagline">
        <h1 class="headline">Our Mission</h1>
        <p>We support and encourage <em>active and healthy</em> lifestyles, by offering <em>ethically sourced</em> and <em>eco-friendly</em> products for <em>everyone</em> to use.</p>
    </div><!-- container tagline -->
</header><!-- #home -->
