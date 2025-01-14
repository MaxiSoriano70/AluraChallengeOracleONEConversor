<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversor</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body class="container">
	<div class="title text-center py-1">
		<h1>Conversores - Maximiliano Soriano</h1>
	</div>
	<div class="row mx-5">

		<div class="col ml-5" style="width: 18rem;">
			<img
				src="https://brandemia.org/sites/default/files/inline/images/origen_simbolos_moneda.jpg"
				class="card-img-top" alt="img-conversor-de-monedas">
			<div class="card-body">
				<h2>Conversor de moneda</h2>
				<p class="card-text">Quieres saber cuantos Dolares, Euros,
					Libras y Yenes tienes en pesos Argentinos</p>
				<a href="entrada?accion=IndexConversorMoneda" class="btn btn-primary">Ir a Conversor de Moneda</a>
			</div>
		</div>

		<div class="col ml-5" style="width: 18rem;">
			<img
				src="https://img.freepik.com/vector-premium/termometros-celsius-fahrenheit_476141-669.jpg?w=2000"
				class="card-img-top" alt="img-conversor-de-monedas">
			<div class="card-body">
				<h2>Conversor celsius a fahrenheit</h2>
				<p class="card-text">Quieres convertir grados celsius a
					fahrenheit.</p>
				<a href="entrada?accion=IndexConversorTemperatura" class="btn btn-primary">Ir a Conversor celsius a
					fahrenheit</a>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>
