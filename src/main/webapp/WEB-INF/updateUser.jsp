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
		<c:url value="/user/update" context="/springbootProject" var="urlform"/>
			<form:form method="post" action="${urlform}" modelAttribute="formUser" class="col-md-5 p-5 shadow-sm mb-5 bg-body rounded mx-auto">
				<h1 class="bg-black p-4 rounded text-center text-light h3">Springboot Project</h1>
				<p class="bg-light p-4 rounded text-center h3">Modifiez vos Informations</p>
				<div class="mb-3">
					<form:label path="nom" for="inputName" class="form-label">Nom</form:label> 
					<form:input path="nom" type="text" class="form-control" id="inputName" value="${isConnected.nom}"/>
					<form:errors path="nom" class="text-danger small" />
				</div>
				<div class="mb-3">
					<form:label path="prenom" for="inputFirstName" class="form-label">Prénom</form:label> 
					<form:input path="prenom" type="text" class="form-control" id="inputFirstName" value="${isConnected.prenom}"/>
					<form:errors path="prenom" class="text-danger small" />
				</div>
				<div class="mb-3">
					<form:label path="email" for="inputEmail" class="form-label">Email</form:label> 
					<form:input path="email" type="email" class="form-control" id="inputEmail"  value="${isConnected.email}"/>
					<form:errors path="email" class="text-danger small" />
				</div>
				<div class="mb-3">
					<form:label path="dateNaissance" for="inputBirthDate" class="form-label">Date de naissance</form:label> 
					<form:input path="dateNaissance" type="date" class="form-control" id="inputBirthDate" value="${isConnected.dateNaissance}"/>
					<form:errors path="dateNaissance" class="text-danger small" />
				</div>
				<div class="mb-3">
					<form:label path="telephone" for="inputPhone" class="form-label">Téléphone</form:label> 
					<form:input path="telephone" type="text" class="form-control" id="inputBirthDate" value="${isConnected.telephone}"/>
					<form:errors path="telephone" class="text-danger small" />
				</div>
				<div class="d-flex justify-content-center flex-column my-4">
					<button type="submit" class="btn btn-primary mb-3">Envoyer les modifications</button>
					<a role="button" class="btn btn-secondary text-center" href='<c:url value="/home/" context="/springbootProject"/>'>Retour à l'accueil</a>
				</div>			
			</form:form>
		</div>
	</main>
<c:import url="footer.jsp" />