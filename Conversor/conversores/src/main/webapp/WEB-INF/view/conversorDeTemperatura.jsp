<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,com.maxisoriano.conversores.modelo.MonedaExtranjera"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversor de temperatura</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body class="container">
	<div class="title text-center py-3">
		<h1>Conversor de Temperatura</h1>
	</div>
	<div class="container-md my-3">
		<form action="${ linkEntradaServlet}" method="post">
		<input type="hidden" name="accion" value="CalcularValorDeTemperatura"/>
			<div class="mb-3">
				<label for="formMonto" class="form-label">Temperatura
				</label> <input type="number" min="0" step="0.05" class="form-control" id="formMonto"
					placeholder="Grados a convertir" name="temperatura" required>
			</div>
			<div class="mb-3">
				<label for="formMoneda" class="form-label">Convertir a</label> <input
					class="form-control" list="datalistOptions" id="formMoneda"
					placeholder="Seleecione el modo en el que quiere convertir la temperatura" name="convetir" required>
				<datalist id="datalistOptions">
					<option value="Fahrenheit a Celsius">
					<option value="Celsius a Fahrenheit">
				</datalist>
			</div>
			<button type="submit" class="btn btn-success">Calcular</button>
		</form>
	</div>
	
	<a href="entrada?accion=Index" class="btn btn-primary my-3">volver
		al menu principal</a>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>