<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<c:url value="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" context="/springbootProject" var="urlBootstrap" />
<link rel="stylesheet" href="${urlBootstrap}">

<link rel="stylesheet" href="../assets/css/style.css" type="text/css">

<title><c:out
		value='${empty param.titre?"Spring Boot Project":param.titre}' /></title>
</head>
<body>
	<main>
		<div class="container my-5">
		<c:url value="/adresse/updateF" context="/springbootProject" var="urlform"/>
			<form:form method="post" action="${urlform}" modelAttribute="formAdresse" class="col-md-5 p-5 shadow-sm mb-5 bg-body rounded mx-auto">
				<h1 class="bg-black p-4 rounded text-center text-light h3">Springboot Project</h1>
				<p class="bg-light p-4 rounded text-center h3">Modifiez l'adresse</p>
				<form:input format="hidden"/>
				<div class="row">
					<div class="mb-3 col-md-3">
						<form:label path="numero"  class="form-label">N°</form:label> 
						<form:input path="numero" type="text" class="form-control"/>
						<form:errors path="numero" class="text-danger small" />
					</div>
					<div class="mb-3 col-md-9">
						<form:label path="rue" class="form-label">Rue</form:label> 
						<form:input path="rue" type="text" class="form-control"/>
						<form:errors path="rue" class="text-danger small" />
					</div>
				</div>
				<div class="row">
					<div class="mb-3 col-md-4">					
						<form:label path="codePostal" class="form-label">Code Postal</form:label> 
						<form:input path="codePostal" type="text" class="form-control"/>
						<form:errors path="codePostal" class="text-danger small" />
					</div>
					<div class="mb-3 col-md-8">					
						<form:label path="ville" class="form-label">Ville</form:label> 
						<form:input path="ville" type="text" class="form-control"/>	
						<form:errors path="ville" class="text-danger small" />				
					</div>
				</div>
				<div class="d-flex justify-content-center flex-column my-4">
					<button type="submit" class="btn btn-primary mb-3">Envoyer</button>
					<a role="button" class="btn btn-secondary text-center" href='<c:url value="/home/" context="/springbootProject"/>'>Retour à l'accueil</a>
				</div>			
			</form:form>
		</div>
	</main>
<c:import url="footer.jsp" />